package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGImageAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGImageSelector extends Selectors {
  var image: js.UndefOr[SVGImageAttributes] = js.native
}

object SVGImageSelector {
  @scala.inline
  def apply(): SVGImageSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGImageSelector]
  }
  @scala.inline
  implicit class SVGImageSelectorOps[Self <: SVGImageSelector] (val x: Self) extends AnyVal {
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
    def setImage(value: SVGImageAttributes): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
  }
  
}

