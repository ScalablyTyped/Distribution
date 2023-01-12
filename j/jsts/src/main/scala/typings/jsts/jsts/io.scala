package typings.jsts.jsts

import typings.jsts.jsts.geom.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object io {
  
  trait GeoJSONReader extends StObject {
    
    /**
      * Converts a GeoJSON to its <code>Geometry</code> representation.
      *
      * @param {Object} The GeoJSON representation of the Geometry.
      * @return {jsts.geom.Geometry}
      * geometry a <code>Geometry</code> to process.
      */
    def read(geometry: js.Object): Geometry
  }
  object GeoJSONReader {
    
    inline def apply(read: js.Object => Geometry): GeoJSONReader = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[GeoJSONReader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeoJSONReader] (val x: Self) extends AnyVal {
      
      inline def setRead(value: js.Object => Geometry): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    }
  }
  
  trait GeoJSONWriter extends StObject {
    
    /**
      * Converts a <code>Geometry</code> to its GeoJSON representation.
      *
      * @param {jsts.geom.Geometry}
      *          geometry a <code>Geometry</code> to process.
      * @return {Object} The GeoJSON representation of the Geometry.
      */
    def write(geometry: Geometry): js.Object
  }
  object GeoJSONWriter {
    
    inline def apply(write: Geometry => js.Object): GeoJSONWriter = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[GeoJSONWriter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeoJSONWriter] (val x: Self) extends AnyVal {
      
      inline def setWrite(value: Geometry => js.Object): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  trait OL3Parser extends StObject {
    
    def read(geometry: Any): Geometry
    
    def write(geometry: Geometry): Any
  }
  object OL3Parser {
    
    inline def apply(read: Any => Geometry, write: Geometry => Any): OL3Parser = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[OL3Parser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OL3Parser] (val x: Self) extends AnyVal {
      
      inline def setRead(value: Any => Geometry): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setWrite(value: Geometry => Any): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
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
    def read(wkt: String): Geometry
    
    def reducePrecision(geometry: Geometry): Unit
  }
  object WKTReader {
    
    inline def apply(read: String => Geometry, reducePrecision: Geometry => Unit): WKTReader = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), reducePrecision = js.Any.fromFunction1(reducePrecision))
      __obj.asInstanceOf[WKTReader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WKTReader] (val x: Self) extends AnyVal {
      
      inline def setRead(value: String => Geometry): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setReducePrecision(value: Geometry => Unit): Self = StObject.set(x, "reducePrecision", js.Any.fromFunction1(value))
    }
  }
  
  trait WKTWriter extends StObject {
    
    /**
      * Converts a <code>Geometry</code> to its Well-known Text representation.
      *
      * @param {Geometry} geometry a <code>Geometry</code> to process.
      * @return {string} a <Geometry Tagged Text> string (see the OpenGIS Simple
      *         Features Specification).
      */
    def write(geometry: Geometry): String
  }
  object WKTWriter {
    
    inline def apply(write: Geometry => String): WKTWriter = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[WKTWriter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WKTWriter] (val x: Self) extends AnyVal {
      
      inline def setWrite(value: Geometry => String): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
