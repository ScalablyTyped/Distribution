package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEcprvhex extends js.Object {
  var ecprvhex: String
  var ecpubhex: String
}

object AnonEcprvhex {
  @scala.inline
  def apply(ecprvhex: String, ecpubhex: String): AnonEcprvhex = {
    val __obj = js.Dynamic.literal(ecprvhex = ecprvhex.asInstanceOf[js.Any], ecpubhex = ecpubhex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEcprvhex]
  }
}

