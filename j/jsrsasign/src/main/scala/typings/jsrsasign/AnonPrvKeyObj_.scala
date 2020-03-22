package typings.jsrsasign

import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrvKeyObj_ extends js.Object {
  var prvKeyObj: RSAKey
  var pubKeyObj: RSAKey
}

object AnonPrvKeyObj_ {
  @scala.inline
  def apply(prvKeyObj: RSAKey, pubKeyObj: RSAKey): AnonPrvKeyObj_ = {
    val __obj = js.Dynamic.literal(prvKeyObj = prvKeyObj.asInstanceOf[js.Any], pubKeyObj = pubKeyObj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrvKeyObj_]
  }
}

