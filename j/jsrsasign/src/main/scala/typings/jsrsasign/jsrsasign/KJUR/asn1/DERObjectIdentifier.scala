package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for ASN.1 DER ObjectIdentifier
  * @param params associative array of parameters (ex. {'oid': '2.5.4.5'})
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - oid - specify initial ASN.1 value(V) by a oid string (ex. 2.5.4.13)
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  *
  * NOTE: 'params' can be omitted.
  */
@js.native
trait DERObjectIdentifier extends ASN1Object {
  /**
    * set value by a hexadecimal string
    * @param newHexString hexadecimal value of OID bytes
    */
  def setValueHex(newHexString: String): Unit = js.native
  /**
    * set value by a OID name
    * @param oidName OID name (ex. 'serverAuth')
    * @description
    * OID name shall be defined in 'KJUR.asn1.x509.OID.name2oidList'.
    * Otherwise raise error.
    * @example
    * o = new KJUR.asn1.DERObjectIdentifier();
    * o.setValueName("serverAuth");
    */
  def setValueName(oidName: String): Unit = js.native
  /**
    * set value by a OID string
    * @param oidString OID string (ex. 2.5.4.13)
    * @example
    * o = new KJUR.asn1.DERObjectIdentifier();
    * o.setValueOidString("2.5.4.13");
    */
  def setValueOidString(oidString: String): Unit = js.native
}

object DERObjectIdentifier {
  @scala.inline
  def apply(
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setValueHex: String => Unit,
    setValueName: String => Unit,
    setValueOidString: String => Unit
  ): DERObjectIdentifier = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setValueHex = js.Any.fromFunction1(setValueHex), setValueName = js.Any.fromFunction1(setValueName), setValueOidString = js.Any.fromFunction1(setValueOidString))
    __obj.asInstanceOf[DERObjectIdentifier]
  }
  @scala.inline
  implicit class DERObjectIdentifierOps[Self <: DERObjectIdentifier] (val x: Self) extends AnyVal {
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
    def setSetValueHex(value: String => Unit): Self = this.set("setValueHex", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValueName(value: String => Unit): Self = this.set("setValueName", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValueOidString(value: String => Unit): Self = this.set("setValueOidString", js.Any.fromFunction1(value))
  }
  
}

