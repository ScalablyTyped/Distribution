package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: Any
  
  var draft: js.UndefOr[String] = js.undefined
  
  var fallback: js.UndefOr[Boolean] = js.undefined
  
  var mapboxGLGeocoderVersion: js.UndefOr[String] = js.undefined
  
  var mapboxGLVersion: js.UndefOr[String] = js.undefined
  
  var ownerId: js.UndefOr[String] = js.undefined
  
  var scrollZoom: js.UndefOr[Boolean] = js.undefined
  
  var styleId: String
  
  var title: js.UndefOr[Boolean] = js.undefined
}
object Config {
  
  inline def apply(config: Any, styleId: String): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDraft(value: String): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setMapboxGLGeocoderVersion(value: String): Self = StObject.set(x, "mapboxGLGeocoderVersion", value.asInstanceOf[js.Any])
    
    inline def setMapboxGLGeocoderVersionUndefined: Self = StObject.set(x, "mapboxGLGeocoderVersion", js.undefined)
    
    inline def setMapboxGLVersion(value: String): Self = StObject.set(x, "mapboxGLVersion", value.asInstanceOf[js.Any])
    
    inline def setMapboxGLVersionUndefined: Self = StObject.set(x, "mapboxGLVersion", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    
    inline def setScrollZoom(value: Boolean): Self = StObject.set(x, "scrollZoom", value.asInstanceOf[js.Any])
    
    inline def setScrollZoomUndefined: Self = StObject.set(x, "scrollZoom", js.undefined)
    
    inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
