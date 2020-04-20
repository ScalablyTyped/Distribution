package typings.iostContract.IOSTContract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOSTCrypto extends js.Object {
  def sha3(data: String): String
  def verify(algo: String, message: String, signature: String, pubkey: String): Double
}

object IOSTCrypto {
  @scala.inline
  def apply(sha3: String => String, verify: (String, String, String, String) => Double): IOSTCrypto = {
    val __obj = js.Dynamic.literal(sha3 = js.Any.fromFunction1(sha3), verify = js.Any.fromFunction4(verify))
    __obj.asInstanceOf[IOSTCrypto]
  }
}

