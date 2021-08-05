package typings.layuiSrc.layui

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerPhotosOptions
  extends StObject
     with LayerOptions {
  
  var photos: LayerPhotosData | String
  
  var tab: js.UndefOr[
    js.Function2[/* pic */ LayerPhotosDataItem, /* layero */ JQuery[HTMLElement], Unit]
  ] = js.undefined
}
object LayerPhotosOptions {
  
  inline def apply(photos: LayerPhotosData | String): LayerPhotosOptions = {
    val __obj = js.Dynamic.literal(photos = photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerPhotosOptions]
  }
  
  extension [Self <: LayerPhotosOptions](x: Self) {
    
    inline def setPhotos(value: LayerPhotosData | String): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setTab(value: (/* pic */ LayerPhotosDataItem, /* layero */ JQuery[HTMLElement]) => Unit): Self = StObject.set(x, "tab", js.Any.fromFunction2(value))
    
    inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
  }
}
