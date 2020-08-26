package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.DERInteger
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Issuer extends js.Object {
  var issuer: StringParam = js.native
  var serial: DERInteger | IntegerParam | BigIntegerParam | HexParam | Double = js.native
}

object Issuer {
  @scala.inline
  def apply(issuer: StringParam, serial: DERInteger | IntegerParam | BigIntegerParam | HexParam | Double): Issuer = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issuer]
  }
  @scala.inline
  implicit class IssuerOps[Self <: Issuer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIssuer(value: StringParam): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerial(value: DERInteger | IntegerParam | BigIntegerParam | HexParam | Double): Self = this.set("serial", value.asInstanceOf[js.Any])
  }
  
}

