package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrayHexParam extends js.Object {
  var array: js.Array[ObjectIdentifierParam | HexParam | NameParam]
}

object AnonArrayHexParam {
  @scala.inline
  def apply(array: js.Array[ObjectIdentifierParam | HexParam | NameParam]): AnonArrayHexParam = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArrayHexParam]
  }
}

