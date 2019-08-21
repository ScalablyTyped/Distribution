package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns

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
@JSGlobal("jsrsasign.KJUR.asn1.DERObjectIdentifier")
@js.native
class DERObjectIdentifier () extends ASN1Object {
  def this(params: HexParam) = this()
  def this(params: NameParam) = this()
  def this(params: ObjectIdentifierParam) = this()
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

