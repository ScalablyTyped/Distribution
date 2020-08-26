package typings.ink.anon

import typings.ink.renderNodeToOutputMod.OutputTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffsetX extends js.Object {
  var offsetX: js.UndefOr[Double] = js.native
  var offsetY: js.UndefOr[Double] = js.native
  var skipStaticElements: Boolean = js.native
  var transformers: js.UndefOr[js.Array[OutputTransformer]] = js.native
}

object OffsetX {
  @scala.inline
  def apply(skipStaticElements: Boolean): OffsetX = {
    val __obj = js.Dynamic.literal(skipStaticElements = skipStaticElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetX]
  }
  @scala.inline
  implicit class OffsetXOps[Self <: OffsetX] (val x: Self) extends AnyVal {
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
    def setSkipStaticElements(value: Boolean): Self = this.set("skipStaticElements", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setTransformersVarargs(value: OutputTransformer*): Self = this.set("transformers", js.Array(value :_*))
    @scala.inline
    def setTransformers(value: js.Array[OutputTransformer]): Self = this.set("transformers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformers: Self = this.set("transformers", js.undefined)
  }
  
}

