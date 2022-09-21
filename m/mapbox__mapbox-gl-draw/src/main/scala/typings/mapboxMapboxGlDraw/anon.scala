package typings.mapboxMapboxGlDraw

import org.scalablytyped.runtime.StringDictionary
import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Point
import typings.mapboxMapboxGlDraw.mod.DrawCustomMode
import typings.mapboxMapboxGlDraw.mod.MapboxDrawControls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BoxSelect extends StObject {
    
    var boxSelect: js.UndefOr[Boolean] = js.undefined
    
    var clickBuffer: js.UndefOr[Double] = js.undefined
    
    var controls: js.UndefOr[MapboxDrawControls] = js.undefined
    
    var defaultMode: js.UndefOr[String] = js.undefined
    
    var displayControlsDefault: js.UndefOr[Boolean] = js.undefined
    
    var keybindings: js.UndefOr[Boolean] = js.undefined
    
    var modes: js.UndefOr[StringDictionary[DrawCustomMode[Any, Any]]] = js.undefined
    
    var styles: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var touchBuffer: js.UndefOr[Double] = js.undefined
    
    var touchEnabled: js.UndefOr[Boolean] = js.undefined
    
    var userProperties: js.UndefOr[Boolean] = js.undefined
  }
  object BoxSelect {
    
    inline def apply(): BoxSelect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxSelect]
    }
    
    extension [Self <: BoxSelect](x: Self) {
      
      inline def setBoxSelect(value: Boolean): Self = StObject.set(x, "boxSelect", value.asInstanceOf[js.Any])
      
      inline def setBoxSelectUndefined: Self = StObject.set(x, "boxSelect", js.undefined)
      
      inline def setClickBuffer(value: Double): Self = StObject.set(x, "clickBuffer", value.asInstanceOf[js.Any])
      
      inline def setClickBufferUndefined: Self = StObject.set(x, "clickBuffer", js.undefined)
      
      inline def setControls(value: MapboxDrawControls): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setDefaultMode(value: String): Self = StObject.set(x, "defaultMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultModeUndefined: Self = StObject.set(x, "defaultMode", js.undefined)
      
      inline def setDisplayControlsDefault(value: Boolean): Self = StObject.set(x, "displayControlsDefault", value.asInstanceOf[js.Any])
      
      inline def setDisplayControlsDefaultUndefined: Self = StObject.set(x, "displayControlsDefault", js.undefined)
      
      inline def setKeybindings(value: Boolean): Self = StObject.set(x, "keybindings", value.asInstanceOf[js.Any])
      
      inline def setKeybindingsUndefined: Self = StObject.set(x, "keybindings", js.undefined)
      
      inline def setModes(value: StringDictionary[DrawCustomMode[Any, Any]]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
      
      inline def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
      
      inline def setStyles(value: js.Array[js.Object]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setStylesVarargs(value: js.Object*): Self = StObject.set(x, "styles", js.Array(value*))
      
      inline def setTouchBuffer(value: Double): Self = StObject.set(x, "touchBuffer", value.asInstanceOf[js.Any])
      
      inline def setTouchBufferUndefined: Self = StObject.set(x, "touchBuffer", js.undefined)
      
      inline def setTouchEnabled(value: Boolean): Self = StObject.set(x, "touchEnabled", value.asInstanceOf[js.Any])
      
      inline def setTouchEnabledUndefined: Self = StObject.set(x, "touchEnabled", js.undefined)
      
      inline def setUserProperties(value: Boolean): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    }
  }
  
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
