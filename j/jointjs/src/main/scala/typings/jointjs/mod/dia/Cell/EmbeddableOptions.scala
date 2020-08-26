package typings.jointjs.mod.dia.Cell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmbeddableOptions extends Options {
  var deep: js.UndefOr[Boolean] = js.native
}

object EmbeddableOptions {
  @scala.inline
  def apply(): EmbeddableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddableOptions]
  }
  @scala.inline
  implicit class EmbeddableOptionsOps[Self <: EmbeddableOptions] (val x: Self) extends AnyVal {
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
    def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
  }
  
}

