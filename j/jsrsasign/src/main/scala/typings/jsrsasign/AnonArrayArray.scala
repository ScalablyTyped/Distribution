package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrayArray extends js.Object {
  var array: js.Array[ObjectIdentifierParam | HexParam | NameParam]
}

object AnonArrayArray {
  @scala.inline
  def apply(array: js.Array[ObjectIdentifierParam | HexParam | NameParam]): AnonArrayArray = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArrayArray]
  }
}

