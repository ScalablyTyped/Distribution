package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrvKeyObj_ extends js.Object {
  var prvKeyObj: RSAKey
  var pubKeyObj: RSAKey
}

object PrvKeyObj_ {
  @scala.inline
  def apply(prvKeyObj: RSAKey, pubKeyObj: RSAKey): PrvKeyObj_ = {
    val __obj = js.Dynamic.literal(prvKeyObj = prvKeyObj.asInstanceOf[js.Any], pubKeyObj = pubKeyObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrvKeyObj_]
  }
}

