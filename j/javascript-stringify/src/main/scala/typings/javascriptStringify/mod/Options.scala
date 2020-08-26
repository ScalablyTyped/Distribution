package typings.javascriptStringify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var maxDepth: js.UndefOr[Double] = js.native
  var maxValues: js.UndefOr[Double] = js.native
  var references: js.UndefOr[Boolean] = js.native
  var skipUndefinedProperties: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    @scala.inline
    def setMaxValues(value: Double): Self = this.set("maxValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValues: Self = this.set("maxValues", js.undefined)
    @scala.inline
    def setReferences(value: Boolean): Self = this.set("references", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
    @scala.inline
    def setSkipUndefinedProperties(value: Boolean): Self = this.set("skipUndefinedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipUndefinedProperties: Self = this.set("skipUndefinedProperties", js.undefined)
  }
  
}

