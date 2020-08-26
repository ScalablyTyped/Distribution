package typings.iron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HMacResult extends js.Object {
  var digest: String = js.native
  var salt: String = js.native
}

object HMacResult {
  @scala.inline
  def apply(digest: String, salt: String): HMacResult = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[HMacResult]
  }
  @scala.inline
  implicit class HMacResultOps[Self <: HMacResult] (val x: Self) extends AnyVal {
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
    def setDigest(value: String): Self = this.set("digest", value.asInstanceOf[js.Any])
    @scala.inline
    def setSalt(value: String): Self = this.set("salt", value.asInstanceOf[js.Any])
  }
  
}

