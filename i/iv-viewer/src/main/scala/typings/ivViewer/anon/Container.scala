package typings.ivViewer.anon

import typings.ivViewer.mod.IVImage
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  var container: Element | Null = js.native
  var domElement: Element | Null = js.native
  var hiResImageSrc: IVImage = js.native
  var imageSrc: IVImage = js.native
}

object Container {
  @scala.inline
  def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
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
    def setHiResImageSrc(value: IVImage): Self = this.set("hiResImageSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def setHiResImageSrcNull: Self = this.set("hiResImageSrc", null)
    @scala.inline
    def setImageSrc(value: IVImage): Self = this.set("imageSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageSrcNull: Self = this.set("imageSrc", null)
  }
  
}

