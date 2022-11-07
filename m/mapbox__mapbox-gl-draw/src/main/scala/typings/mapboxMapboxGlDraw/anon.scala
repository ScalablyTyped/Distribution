package typings.mapboxMapboxGlDraw

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Coordpath extends StObject {
    
    var coord_path: String
    
    var feature_id: String
  }
  object Coordpath {
    
    inline def apply(coord_path: String, feature_id: String): Coordpath = {
      val __obj = js.Dynamic.literal(coord_path = coord_path.asInstanceOf[js.Any], feature_id = feature_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordpath]
    }
    
    extension [Self <: Coordpath](x: Self) {
      
      inline def setCoord_path(value: String): Self = StObject.set(x, "coord_path", value.asInstanceOf[js.Any])
      
      inline def setFeature_id(value: String): Self = StObject.set(x, "feature_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeatureId extends StObject {
    
    var featureId: String
  }
  object FeatureId {
    
    inline def apply(featureId: String): FeatureId = {
      val __obj = js.Dynamic.literal(featureId = featureId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureId]
    }
    
    extension [Self <: FeatureId](x: Self) {
      
      inline def setFeatureId(value: String): Self = StObject.set(x, "featureId", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeatureIds extends StObject {
    
    var featureIds: js.Array[String]
  }
  object FeatureIds {
    
    inline def apply(featureIds: js.Array[String]): FeatureIds = {
      val __obj = js.Dynamic.literal(featureIds = featureIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureIds]
    }
    
    extension [Self <: FeatureIds](x: Self) {
      
      inline def setFeatureIds(value: js.Array[String]): Self = StObject.set(x, "featureIds", value.asInstanceOf[js.Any])
      
      inline def setFeatureIdsVarargs(value: String*): Self = StObject.set(x, "featureIds", js.Array(value*))
    }
  }
  
  trait From extends StObject {
    
    var featureId: String
    
    var from: (Feature[Point, GeoJsonProperties]) | Point | js.Array[Double]
  }
  object From {
    
    inline def apply(featureId: String, from: (Feature[Point, GeoJsonProperties]) | Point | js.Array[Double]): From = {
      val __obj = js.Dynamic.literal(featureId = featureId.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFeatureId(value: String): Self = StObject.set(x, "featureId", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: (Feature[Point, GeoJsonProperties]) | Point | js.Array[Double]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromVarargs(value: Double*): Self = StObject.set(x, "from", js.Array(value*))
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
