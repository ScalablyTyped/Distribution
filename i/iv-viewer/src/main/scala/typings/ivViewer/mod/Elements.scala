package typings.ivViewer.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Elements extends js.Object {
  var container: Element | Null = js.native
  var domElement: Element | Null = js.native
  var image: js.UndefOr[Element | Null] = js.native
  var imageWrap: js.UndefOr[Element | Null] = js.native
  var snapHandle: js.UndefOr[Element | Null] = js.native
  var snapImage: js.UndefOr[Element | Null] = js.native
  var snapImageWrap: js.UndefOr[Element | Null] = js.native
  var snapView: js.UndefOr[Element | Null] = js.native
  var zoomHandle: js.UndefOr[Element | Null] = js.native
}

object Elements {
  @scala.inline
  def apply(): Elements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Elements]
  }
  @scala.inline
  implicit class ElementsOps[Self <: Elements] (val x: Self) extends AnyVal {
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
    def setContainer(value: Element): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    @scala.inline
    def setDomElement(value: Element): Self = this.set("domElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomElementNull: Self = this.set("domElement", null)
    @scala.inline
    def setImage(value: Element): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setImageNull: Self = this.set("image", null)
    @scala.inline
    def setImageWrap(value: Element): Self = this.set("imageWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageWrap: Self = this.set("imageWrap", js.undefined)
    @scala.inline
    def setImageWrapNull: Self = this.set("imageWrap", null)
    @scala.inline
    def setSnapHandle(value: Element): Self = this.set("snapHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapHandle: Self = this.set("snapHandle", js.undefined)
    @scala.inline
    def setSnapHandleNull: Self = this.set("snapHandle", null)
    @scala.inline
    def setSnapImage(value: Element): Self = this.set("snapImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapImage: Self = this.set("snapImage", js.undefined)
    @scala.inline
    def setSnapImageNull: Self = this.set("snapImage", null)
    @scala.inline
    def setSnapImageWrap(value: Element): Self = this.set("snapImageWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapImageWrap: Self = this.set("snapImageWrap", js.undefined)
    @scala.inline
    def setSnapImageWrapNull: Self = this.set("snapImageWrap", null)
    @scala.inline
    def setSnapView(value: Element): Self = this.set("snapView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapView: Self = this.set("snapView", js.undefined)
    @scala.inline
    def setSnapViewNull: Self = this.set("snapView", null)
    @scala.inline
    def setZoomHandle(value: Element): Self = this.set("zoomHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomHandle: Self = this.set("zoomHandle", js.undefined)
    @scala.inline
    def setZoomHandleNull: Self = this.set("zoomHandle", null)
  }
  
}

