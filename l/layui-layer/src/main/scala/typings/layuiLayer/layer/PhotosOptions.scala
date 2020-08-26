package typings.layuiLayer.layer

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhotosOptions extends Options {
  var photos: PhotosData | Selector = js.native
  /**
    * 切换图片时触发
    * @param pic
    * @param layero
    */
  var tab: js.UndefOr[js.Function2[/* pic */ PhotosDataItem, /* layero */ JQuery[HTMLElement], Unit]] = js.native
}

object PhotosOptions {
  @scala.inline
  def apply(photos: PhotosData | Selector): PhotosOptions = {
    val __obj = js.Dynamic.literal(photos = photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotosOptions]
  }
  @scala.inline
  implicit class PhotosOptionsOps[Self <: PhotosOptions] (val x: Self) extends AnyVal {
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
    def setPhotos(value: PhotosData | Selector): Self = this.set("photos", value.asInstanceOf[js.Any])
    @scala.inline
    def setTab(value: (/* pic */ PhotosDataItem, /* layero */ JQuery[HTMLElement]) => Unit): Self = this.set("tab", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
  }
  
}

