package typings.jsrsasign.mod.KJUR.asn1.x509

import typings.jsrsasign.anon.ArrayParamUriParamcritica
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IssuerAltName ASN.1 structure class
  * @param params associative array of parameters
  * @see KJUR.asn1.x509.GeneralNames
  * @see KJUR.asn1.x509.GeneralName
  * @description
  * This class provides X.509v3 IssuerAltName extension.
  * ```
  * id-ce-subjectAltName OBJECT IDENTIFIER ::=  { id-ce 18 }
  * IssuerAltName ::= GeneralNames
  * GeneralNames ::= SEQUENCE SIZE (1..MAX) OF GeneralName
  * GeneralName ::= CHOICE {
  *   otherName                  [0] OtherName,
  *   rfc822Name                 [1] IA5String,
  *   dNSName                    [2] IA5String,
  *   x400Address                [3] ORAddress,
  *   directoryName              [4] Name,
  *   ediPartyName               [5] EDIPartyName,
  *   uniformResourceIdentifier  [6] IA5String,
  *   iPAddress                  [7] OCTET STRING,
  *   registeredID               [8] OBJECT IDENTIFIER }
  * ```
  * @example
  * e1 = new KJUR.asn1.x509.IssuerAltName({
  *   critical: true,
  *   array: [{uri: 'http://aaa.com/'}, {uri: 'http://bbb.com/'}]
  * });
  */
@JSImport("jsrsasign", "KJUR.asn1.x509.IssuerAltName")
@js.native
class IssuerAltName ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.IssuerAltName {
  def this(params: ArrayParamUriParamcritica) = this()
  /** hexadecimal string of ASN.1 TLV length(L) */
  /* CompleteClass */
  override var hL: String = js.native
  /** hexadecimal string of ASN.1 TLV tag(T) */
  /* CompleteClass */
  override var hT: String = js.native
  /** hexadecimal string of ASN.1 TLV */
  /* CompleteClass */
  override var hTLV: String = js.native
  /** hexadecimal string of ASN.1 TLV value(V) */
  /* CompleteClass */
  override var hV: String = js.native
  /** flag whether internal data was changed */
  /* CompleteClass */
  override var isModified: String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV bytes
    * @return hexadecimal string of ASN.1 TLV
    */
  /* CompleteClass */
  override def getEncodedHex(): String = js.native
  /* CompleteClass */
  override def getExtnValueHex(): String = js.native
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
  /* CompleteClass */
  override def setNameArray(paramsArray: js.Array[UriParam]): Unit = js.native
}

