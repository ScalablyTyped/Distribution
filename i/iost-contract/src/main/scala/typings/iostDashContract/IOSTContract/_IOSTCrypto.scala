package typings.iostDashContract.IOSTContract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IOSTCrypto extends js.Object {
  def sha3(data: String): String
  def verify(algo: String, message: String, signature: String, pubkey: String): Double
}

object _IOSTCrypto {
  @scala.inline
  def apply(sha3: String => String, verify: (String, String, String, String) => Double): _IOSTCrypto = {
    val __obj = js.Dynamic.literal(sha3 = js.Any.fromFunction1(sha3), verify = js.Any.fromFunction4(verify))
  
    __obj.asInstanceOf[_IOSTCrypto]
  }
}

