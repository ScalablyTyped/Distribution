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
    
    @scala.inline
    def apply(latitute: Double, longitude: Double, radius: Double): Circle = {
      val __obj = js.Dynamic.literal(latitute = latitute.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[Circle]
    }
    
    @scala.inline
    implicit class CircleMutableBuilder[Self <: Circle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    }
  }
  
  trait Coordinate extends StObject {
    
    var latitute: Double
    
    var longitude: Double
  }
  object Coordinate {
    
    @scala.inline
    def apply(latitute: Double, longitude: Double): Coordinate = {
      val __obj = js.Dynamic.literal(latitute = latitute.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordinate]
    }
    
    @scala.inline
    implicit class CoordinateMutableBuilder[Self <: Coordinate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatitute(value: Double): Self = StObject.set(x, "latitute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait DistanceOptions extends StObject {
    
    var bufferZoneWidth: Double
  }
  object DistanceOptions {
    
    @scala.inline
    def apply(bufferZoneWidth: Double): DistanceOptions = {
      val __obj = js.Dynamic.literal(bufferZoneWidth = bufferZoneWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistanceOptions]
    }
    
    @scala.inline
    implicit class DistanceOptionsMutableBuilder[Self <: DistanceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferZoneWidth(value: Double): Self = StObject.set(x, "bufferZoneWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait InsideOutsideOptions extends StObject {
    
    /**
      * confidenceLevel can be 'low', 'medium', 'high'
      */
    var confidenceLevel: String
  }
  object InsideOutsideOptions {
    
    @scala.inline
    def apply(confidenceLevel: String): InsideOutsideOptions = {
      val __obj = js.Dynamic.literal(confidenceLevel = confidenceLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsideOutsideOptions]
    }
    
    @scala.inline
    implicit class InsideOutsideOptionsMutableBuilder[Self <: InsideOutsideOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfidenceLevel(value: String): Self = StObject.set(x, "confidenceLevel", value.asInstanceOf[js.Any])
    }
  }
}
