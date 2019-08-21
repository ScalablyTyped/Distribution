package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.HexParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.NameParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ObjectIdentifierParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayHexParam extends js.Object {
  var array: js.Array[ObjectIdentifierParam | HexParam | NameParam]
}

object Anon_ArrayHexParam {
  @scala.inline
  def apply(array: js.Array[ObjectIdentifierParam | HexParam | NameParam]): Anon_ArrayHexParam = {
    val __obj = js.Dynamic.literal(array = array)
  
    __obj.asInstanceOf[Anon_ArrayHexParam]
  }
}

