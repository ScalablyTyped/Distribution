package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ecprvhex extends js.Object {
  var ecprvhex: String
  var ecpubhex: String
}

object Ecprvhex {
  @scala.inline
  def apply(ecprvhex: String, ecpubhex: String): Ecprvhex = {
    val __obj = js.Dynamic.literal(ecprvhex = ecprvhex.asInstanceOf[js.Any], ecpubhex = ecpubhex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ecprvhex]
  }
}

