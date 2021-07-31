package typings.jsrsasign.global.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
class DERObjectIdentifier ()
  extends StObject
     with typings.jsrsasign.jsrsasign.KJUR.asn1.DERObjectIdentifier {
  def this(params: HexParam) = this()
  def this(params: NameParam) = this()
  def this(params: ObjectIdentifierParam) = this()
  
  /**
    * get hexadecimal string of ASN.1 TLV bytes
    * @return hexadecimal string of ASN.1 TLV
    */
  /* CompleteClass */
  override def getEncodedHex(): String = js.native
  
  /* CompleteClass */
  override def getFreshValueHex(): String = js.native
  
  /**
    * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
    * @return hexadecimal string of ASN.1 TLV length(L)
    */
  /* CompleteClass */
  override def getLengthHexFromValue(): String = js.native
  
  /**
    * get hexadecimal string of ASN.1 TLV value(V) bytes
    * @return hexadecimal string of ASN.1 TLV value(V) bytes
    */
  /* CompleteClass */
  override def getValueHex(): String = js.native
  
  /** hexadecimal string of ASN.1 TLV length(L) */
  /* CompleteClass */
  var hL: String = js.native
  
  /** hexadecimal string of ASN.1 TLV tag(T) */
  /* CompleteClass */
  var hT: String = js.native
  
  /** hexadecimal string of ASN.1 TLV */
  /* CompleteClass */
  var hTLV: String = js.native
  
  /** hexadecimal string of ASN.1 TLV value(V) */
  /* CompleteClass */
  var hV: String = js.native
  
  /** flag whether internal data was changed */
  /* CompleteClass */
  var isModified: String = js.native
  
  /**
    * set value by a hexadecimal string
    * @param newHexString hexadecimal value of OID bytes
    */
  /* CompleteClass */
  override def setValueHex(newHexString: String): Unit = js.native
  
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
  /* CompleteClass */
  override def setValueName(oidName: String): Unit = js.native
  
  /**
    * set value by a OID string
    * @param oidString OID string (ex. 2.5.4.13)
    * @example
    * o = new KJUR.asn1.DERObjectIdentifier();
    * o.setValueOidString("2.5.4.13");
    */
  /* CompleteClass */
  override def setValueOidString(oidString: String): Unit = js.native
}
