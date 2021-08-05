package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: js.Any
  
  var ownerId: js.UndefOr[String] = js.undefined
  
  var scrollZoom: js.UndefOr[Boolean] = js.undefined
  
  var styleId: String
  
  var title: js.UndefOr[Boolean] = js.undefined
}
object Config {
  
  inline def apply(config: js.Any, styleId: String): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    
    inline def setScrollZoom(value: Boolean): Self = StObject.set(x, "scrollZoom", value.asInstanceOf[js.Any])
    
    inline def setScrollZoomUndefined: Self = StObject.set(x, "scrollZoom", js.undefined)
    
    inline def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
