package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  var bearing: js.UndefOr[Double] = js.undefined
  
  var center: js.UndefOr[js.Array[Double]] = js.undefined
  
  var glyphs: js.UndefOr[String] = js.undefined
  
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  
  var light: js.UndefOr[Light] = js.undefined
  
  var metadata: js.UndefOr[js.Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var sources: js.UndefOr[Sources] = js.undefined
  
  var sprite: js.UndefOr[String] = js.undefined
  
  var transition: js.UndefOr[Transition] = js.undefined
  
  var version: Double
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object Style {
  
  @scala.inline
  def apply(version: Double): Style = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    @scala.inline
    def setCenter(value: js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value :_*))
    
    @scala.inline
    def setGlyphs(value: String): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphsUndefined: Self = StObject.set(x, "glyphs", js.undefined)
    
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    @scala.inline
    def setLight(value: Light): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    @scala.inline
    def setSources(value: Sources): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSprite(value: String): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
    
    @scala.inline
    def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
