package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONFormatterOptions extends js.Object {
  var change: js.UndefOr[js.Function0[Unit]] = js.native
  var indentation: js.UndefOr[Double] = js.native
}

object JSONFormatterOptions {
  @scala.inline
  def apply(): JSONFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONFormatterOptions]
  }
  @scala.inline
  implicit class JSONFormatterOptionsOps[Self <: JSONFormatterOptions] (val x: Self) extends AnyVal {
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
    def setChange(value: () => Unit): Self = this.set("change", js.Any.fromFunction0(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setIndentation(value: Double): Self = this.set("indentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentation: Self = this.set("indentation", js.undefined)
  }
  
}

