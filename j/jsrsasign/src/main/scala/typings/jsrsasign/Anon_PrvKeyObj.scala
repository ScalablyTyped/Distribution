package typings.jsrsasign

import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrvKeyObj extends js.Object {
  var prvKeyObj: RSAKey
  var pubKeyObj: RSAKey
}

object Anon_PrvKeyObj {
  @scala.inline
  def apply(prvKeyObj: RSAKey, pubKeyObj: RSAKey): Anon_PrvKeyObj = {
    val __obj = js.Dynamic.literal(prvKeyObj = prvKeyObj.asInstanceOf[js.Any], pubKeyObj = pubKeyObj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PrvKeyObj]
  }
}

