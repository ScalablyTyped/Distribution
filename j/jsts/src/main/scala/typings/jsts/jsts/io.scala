package typings.jsts.jsts

import typings.jsts.jsts.geom.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object io {
  
  @js.native
  trait GeoJSONReader extends StObject {
    
    /**
      * Converts a GeoJSON to its <code>Geometry</code> representation.
      *
      * @param {Object} The GeoJSON representation of the Geometry.
      * @return {jsts.geom.Geometry}
      * geometry a <code>Geometry</code> to process.
      */
    def read(geometry: js.Object): Geometry = js.native
  }
  object GeoJSONReader {
    
    @scala.inline
    def apply(read: js.Object => Geometry): GeoJSONReader = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[GeoJSONReader]
    }
    
    @scala.inline
    implicit class GeoJSONReaderMutableBuilder[Self <: GeoJSONReader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRead(value: js.Object => Geometry): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait GeoJSONWriter extends StObject {
    
    /**
      * Converts a <code>Geometry</code> to its GeoJSON representation.
      *
      * @param {jsts.geom.Geometry}
      *          geometry a <code>Geometry</code> to process.
      * @return {Object} The GeoJSON representation of the Geometry.
      */
    def write(geometry: Geometry): js.Object = js.native
  }
  object GeoJSONWriter {
    
    @scala.inline
    def apply(write: Geometry => js.Object): GeoJSONWriter = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[GeoJSONWriter]
    }
    
    @scala.inline
    implicit class GeoJSONWriterMutableBuilder[Self <: GeoJSONWriter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWrite(value: Geometry => js.Object): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OL3Parser extends StObject {
    
    def read(geometry: js.Any): Geometry = js.native
    
    def write(geometry: Geometry): js.Any = js.native
  }
  object OL3Parser {
    
    @scala.inline
    def apply(read: js.Any => Geometry, write: Geometry => js.Any): OL3Parser = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[OL3Parser]
    }
    
    @scala.inline
    implicit class OL3ParserMutableBuilder[Self <: OL3Parser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRead(value: js.Any => Geometry): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrite(value: Geometry => js.Any): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait WKTReader extends StObject {
    
    /**
      * Reads a Well-Known Text representation of a {@link Geometry}
      *
      * @param {string}
      *          wkt a <Geometry Tagged Text> string (see the OpenGIS Simple Features
      *          Specification).
      * @return {jsts.geom.Geometry} a <code>Geometry</code> read from
      *         <code>string.</code>
      */
    def read(wkt: String): Geometry = js.native
    
    def reducePrecision(geometry: Geometry): Unit = js.native
  }
  object WKTReader {
    
    @scala.inline
    def apply(read: String => Geometry, reducePrecision: Geometry => Unit): WKTReader = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), reducePrecision = js.Any.fromFunction1(reducePrecision))
      __obj.asInstanceOf[WKTReader]
    }
    
    @scala.inline
    implicit class WKTReaderMutableBuilder[Self <: WKTReader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRead(value: String => Geometry): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReducePrecision(value: Geometry => Unit): Self = StObject.set(x, "reducePrecision", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait WKTWriter extends StObject
}
