package typings.hapiBoom.mod.unauthorized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MissingAuth extends js.Object {
  /**
    * Indicate whether the 401 unauthorized error is due to missing credentials (vs. invalid)
    */
  var isMissing: Boolean = js.native
}

object MissingAuth {
  @scala.inline
  def apply(isMissing: Boolean): MissingAuth = {
    val __obj = js.Dynamic.literal(isMissing = isMissing.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingAuth]
  }
  @scala.inline
  implicit class MissingAuthOps[Self <: MissingAuth] (val x: Self) extends AnyVal {
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
    def setIsMissing(value: Boolean): Self = this.set("isMissing", value.asInstanceOf[js.Any])
  }
  
}

