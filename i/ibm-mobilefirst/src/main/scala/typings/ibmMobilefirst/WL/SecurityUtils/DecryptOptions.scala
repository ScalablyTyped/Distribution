package typings.ibmMobilefirst.WL.SecurityUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecryptOptions extends js.Object {
  var ct: String = js.native
  var key: String = js.native
  var lv: String = js.native
  var src: String = js.native
  var v: String = js.native
}

object DecryptOptions {
  @scala.inline
  def apply(ct: String, key: String, lv: String, src: String, v: String): DecryptOptions = {
    val __obj = js.Dynamic.literal(ct = ct.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], lv = lv.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptOptions]
  }
  @scala.inline
  implicit class DecryptOptionsOps[Self <: DecryptOptions] (val x: Self) extends AnyVal {
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
    def setCt(value: String): Self = this.set("ct", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLv(value: String): Self = this.set("lv", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: String): Self = this.set("v", value.asInstanceOf[js.Any])
  }
  
}

