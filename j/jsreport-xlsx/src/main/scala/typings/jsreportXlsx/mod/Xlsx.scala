package typings.jsreportXlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Xlsx extends js.Object {
  var shortid: String = js.native
}

object Xlsx {
  @scala.inline
  def apply(shortid: String): Xlsx = {
    val __obj = js.Dynamic.literal(shortid = shortid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xlsx]
  }
  @scala.inline
  implicit class XlsxOps[Self <: Xlsx] (val x: Self) extends AnyVal {
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
    def setShortid(value: String): Self = this.set("shortid", value.asInstanceOf[js.Any])
  }
  
}

