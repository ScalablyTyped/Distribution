package typings.ipAddress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OmitSuffix extends js.Object {
  var omitSuffix: Boolean = js.native
}

object OmitSuffix {
  @scala.inline
  def apply(omitSuffix: Boolean): OmitSuffix = {
    val __obj = js.Dynamic.literal(omitSuffix = omitSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitSuffix]
  }
  @scala.inline
  implicit class OmitSuffixOps[Self <: OmitSuffix] (val x: Self) extends AnyVal {
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
    def setOmitSuffix(value: Boolean): Self = this.set("omitSuffix", value.asInstanceOf[js.Any])
  }
  
}

