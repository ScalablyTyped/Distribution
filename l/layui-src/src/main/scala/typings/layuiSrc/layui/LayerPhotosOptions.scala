package typings.layuiSrc.layui

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerPhotosOptions extends LayerOptions {
  
  var photos: LayerPhotosData | String = js.native
  
  var tab: js.UndefOr[
    js.Function2[/* pic */ LayerPhotosDataItem, /* layero */ JQuery[HTMLElement], Unit]
  ] = js.native
}
object LayerPhotosOptions {
  
  @scala.inline
  def apply(photos: LayerPhotosData | String): LayerPhotosOptions = {
    val __obj = js.Dynamic.literal(photos = photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerPhotosOptions]
  }
  
  @scala.inline
  implicit class LayerPhotosOptionsOps[Self <: LayerPhotosOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPhotos(value: LayerPhotosData | String): Self = this.set("photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: (/* pic */ LayerPhotosDataItem, /* layero */ JQuery[HTMLElement]) => Unit): Self = this.set("tab", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
  }
}
