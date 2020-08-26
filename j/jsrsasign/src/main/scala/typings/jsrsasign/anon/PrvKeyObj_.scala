package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrvKeyObj_ extends js.Object {
  var prvKeyObj: RSAKey = js.native
  var pubKeyObj: RSAKey = js.native
}

object PrvKeyObj_ {
  @scala.inline
  def apply(prvKeyObj: RSAKey, pubKeyObj: RSAKey): PrvKeyObj_ = {
    val __obj = js.Dynamic.literal(prvKeyObj = prvKeyObj.asInstanceOf[js.Any], pubKeyObj = pubKeyObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrvKeyObj_]
  }
  @scala.inline
  implicit class PrvKeyObj_Ops[Self <: PrvKeyObj_] (val x: Self) extends AnyVal {
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
    def setPrvKeyObj(value: RSAKey): Self = this.set("prvKeyObj", value.asInstanceOf[js.Any])
    @scala.inline
    def setPubKeyObj(value: RSAKey): Self = this.set("pubKeyObj", value.asInstanceOf[js.Any])
  }
  
}

