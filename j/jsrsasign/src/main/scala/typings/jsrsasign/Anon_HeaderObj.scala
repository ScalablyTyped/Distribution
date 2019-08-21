package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeaderObj extends js.Object {
  var headerObj: Anon_AlgTyp
  var headerPP: Anon_AlgTyp
  var sigHex: String
}

object Anon_HeaderObj {
  @scala.inline
  def apply(headerObj: Anon_AlgTyp, headerPP: Anon_AlgTyp, sigHex: String): Anon_HeaderObj = {
    val __obj = js.Dynamic.literal(headerObj = headerObj, headerPP = headerPP, sigHex = sigHex)
  
    __obj.asInstanceOf[Anon_HeaderObj]
  }
}

