package typings.jqueryRowgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryRowGridJSOptions extends js.Object {
  var itemSelector: String = js.native
  var maxMargin: js.UndefOr[Double] = js.native
  var minMargin: js.UndefOr[Double] = js.native
}

object JQueryRowGridJSOptions {
  @scala.inline
  def apply(itemSelector: String): JQueryRowGridJSOptions = {
    val __obj = js.Dynamic.literal(itemSelector = itemSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryRowGridJSOptions]
  }
  @scala.inline
  implicit class JQueryRowGridJSOptionsOps[Self <: JQueryRowGridJSOptions] (val x: Self) extends AnyVal {
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
    def setItemSelector(value: String): Self = this.set("itemSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxMargin(value: Double): Self = this.set("maxMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMargin: Self = this.set("maxMargin", js.undefined)
    @scala.inline
    def setMinMargin(value: Double): Self = this.set("minMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinMargin: Self = this.set("minMargin", js.undefined)
  }
  
}

