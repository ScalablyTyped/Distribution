package typings.haversine

import typings.haversine.haversineStrings.LeftcurlybracketlatCommalngRightcurlybracket
import typings.haversine.haversineStrings.LeftcurlybracketlatCommalonRightcurlybracket
import typings.haversine.haversineStrings.`[latCommalon]`
import typings.haversine.haversineStrings.`[lonCommalat]`
import typings.haversine.haversineStrings.geojson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var format: LeftcurlybracketlatCommalonRightcurlybracket
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal(format = "{lat,lon}")
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: LeftcurlybracketlatCommalonRightcurlybracket): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    var format: LeftcurlybracketlatCommalngRightcurlybracket
  }
  object `1` {
    
    @scala.inline
    def apply(): `1` = {
      val __obj = js.Dynamic.literal(format = "{lat,lng}")
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: LeftcurlybracketlatCommalngRightcurlybracket): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2` extends StObject {
    
    var format: geojson
  }
  object `2` {
    
    @scala.inline
    def apply(): `2` = {
      val __obj = js.Dynamic.literal(format = "geojson")
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: geojson): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  trait Coordinates extends StObject {
    
    var coordinates: js.Array[Double]
  }
  object Coordinates {
    
    @scala.inline
    def apply(coordinates: js.Array[Double]): Coordinates = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordinates]
    }
    
    @scala.inline
    implicit class CoordinatesMutableBuilder[Self <: Coordinates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    }
  }
  
  trait Format extends StObject {
    
    var format: `[latCommalon]` | `[lonCommalat]`
  }
  object Format {
    
    @scala.inline
    def apply(format: `[latCommalon]` | `[lonCommalat]`): Format = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: `[latCommalon]` | `[lonCommalat]`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  trait Threshold extends StObject {
    
    var threshold: Double
  }
  object Threshold {
    
    @scala.inline
    def apply(threshold: Double): Threshold = {
      val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[Threshold]
    }
    
    @scala.inline
    implicit class ThresholdMutableBuilder[Self <: Threshold] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
}
