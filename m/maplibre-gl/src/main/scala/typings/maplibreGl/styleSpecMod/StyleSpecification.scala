package typings.maplibreGl.styleSpecMod

import org.scalablytyped.runtime.StringDictionary
import typings.maplibreGl.maplibreGlNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSpecification extends StObject {
  
  var bearing: js.UndefOr[Double] = js.undefined
  
  var center: js.UndefOr[js.Array[Double]] = js.undefined
  
  var glyphs: js.UndefOr[String] = js.undefined
  
  var layers: js.Array[LayerSpecification]
  
  var light: js.UndefOr[LightSpecification] = js.undefined
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var sources: StringDictionary[SourceSpecification]
  
  var sprite: js.UndefOr[String] = js.undefined
  
  var terrain: js.UndefOr[TerrainSpecification] = js.undefined
  
  var transition: js.UndefOr[TransitionSpecification] = js.undefined
  
  var version: `8`
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object StyleSpecification {
  
  inline def apply(layers: js.Array[LayerSpecification], sources: StringDictionary[SourceSpecification]): StyleSpecification = {
    val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = 8)
    __obj.asInstanceOf[StyleSpecification]
  }
  
  extension [Self <: StyleSpecification](x: Self) {
    
    inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    inline def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    inline def setCenter(value: js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
    
    inline def setGlyphs(value: String): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
    
    inline def setGlyphsUndefined: Self = StObject.set(x, "glyphs", js.undefined)
    
    inline def setLayers(value: js.Array[LayerSpecification]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersVarargs(value: LayerSpecification*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setLight(value: LightSpecification): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setSources(value: StringDictionary[SourceSpecification]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSprite(value: String): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
    
    inline def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
    
    inline def setTerrain(value: TerrainSpecification): Self = StObject.set(x, "terrain", value.asInstanceOf[js.Any])
    
    inline def setTerrainUndefined: Self = StObject.set(x, "terrain", js.undefined)
    
    inline def setTransition(value: TransitionSpecification): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setVersion(value: `8`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
