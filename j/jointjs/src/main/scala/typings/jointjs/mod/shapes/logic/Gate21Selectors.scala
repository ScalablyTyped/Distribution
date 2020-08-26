package typings.jointjs.mod.shapes.logic

import typings.jointjs.mod.attributes.SVGCircleAttributes
import typings.jointjs.mod.attributes.SVGImageAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gate21Selectors extends Selectors {
  @JSName(".body")
  var Dotbody: js.UndefOr[SVGImageAttributes] = js.native
  @JSName(".input")
  var Dotinput: js.UndefOr[SVGCircleAttributes] = js.native
  @JSName(".input1")
  var Dotinput1: js.UndefOr[SVGCircleAttributes] = js.native
  @JSName(".input2")
  var Dotinput2: js.UndefOr[SVGCircleAttributes] = js.native
  @JSName(".output")
  var Dotoutput: js.UndefOr[SVGCircleAttributes] = js.native
  var image: js.UndefOr[SVGImageAttributes] = js.native
}

object Gate21Selectors {
  @scala.inline
  def apply(): Gate21Selectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gate21Selectors]
  }
  @scala.inline
  implicit class Gate21SelectorsOps[Self <: Gate21Selectors] (val x: Self) extends AnyVal {
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
    def setDotbody(value: SVGImageAttributes): Self = this.set(".body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotbody: Self = this.set(".body", js.undefined)
    @scala.inline
    def setDotinput(value: SVGCircleAttributes): Self = this.set(".input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotinput: Self = this.set(".input", js.undefined)
    @scala.inline
    def setDotinput1(value: SVGCircleAttributes): Self = this.set(".input1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotinput1: Self = this.set(".input1", js.undefined)
    @scala.inline
    def setDotinput2(value: SVGCircleAttributes): Self = this.set(".input2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotinput2: Self = this.set(".input2", js.undefined)
    @scala.inline
    def setDotoutput(value: SVGCircleAttributes): Self = this.set(".output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotoutput: Self = this.set(".output", js.undefined)
    @scala.inline
    def setImage(value: SVGImageAttributes): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
  }
  
}

