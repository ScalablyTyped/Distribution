package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Geo {
  
  trait Circle
    extends StObject
       with Coordinate {
    
    var radius: Double
  }
  object Circle {
    
    inline def apply(latitute: Double, longitude: Double, radius: Double): Circle = {
      val __obj = js.Dynamic.literal(latitute = latitute.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[Circle]
    }
    
    extension [Self <: Circle](x: Self) {
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    }
  }
  
  trait Coordinate extends StObject {
    
    var latitute: Double
    
    var longitude: Double
  }
  object Coordinate {
    
    inline def apply(latitute: Double, longitude: Double): Coordinate = {
      val __obj = js.Dynamic.literal(latitute = latitute.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordinate]
    }
    
    extension [Self <: Coordinate](x: Self) {
      
      inline def setLatitute(value: Double): Self = StObject.set(x, "latitute", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait DistanceOptions extends StObject {
    
    var bufferZoneWidth: Double
  }
  object DistanceOptions {
    
    inline def apply(bufferZoneWidth: Double): DistanceOptions = {
      val __obj = js.Dynamic.literal(bufferZoneWidth = bufferZoneWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistanceOptions]
    }
    
    extension [Self <: DistanceOptions](x: Self) {
      
      inline def setBufferZoneWidth(value: Double): Self = StObject.set(x, "bufferZoneWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait InsideOutsideOptions extends StObject {
    
    /**
      * confidenceLevel can be 'low', 'medium', 'high'
      */
    var confidenceLevel: String
  }
  object InsideOutsideOptions {
    
    inline def apply(confidenceLevel: String): InsideOutsideOptions = {
      val __obj = js.Dynamic.literal(confidenceLevel = confidenceLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsideOutsideOptions]
    }
    
    extension [Self <: InsideOutsideOptions](x: Self) {
      
      inline def setConfidenceLevel(value: String): Self = StObject.set(x, "confidenceLevel", value.asInstanceOf[js.Any])
    }
  }
}
