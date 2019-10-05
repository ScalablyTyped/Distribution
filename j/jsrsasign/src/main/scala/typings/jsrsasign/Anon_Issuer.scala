package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.DERInteger
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Issuer extends js.Object {
  var issuer: StringParam
  var serial: DERInteger | IntegerParam | BigIntegerParam | HexParam | Double
}

object Anon_Issuer {
  @scala.inline
  def apply(issuer: StringParam, serial: DERInteger | IntegerParam | BigIntegerParam | HexParam | Double): Anon_Issuer = {
    val __obj = js.Dynamic.literal(issuer = issuer, serial = serial.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Issuer]
  }
}

