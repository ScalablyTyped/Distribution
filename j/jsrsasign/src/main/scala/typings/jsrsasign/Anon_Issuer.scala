package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.BigIntegerParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.DERInteger
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.HexParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.IntegerParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.StringParam
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

