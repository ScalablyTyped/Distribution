package typings.jsrsasign.global.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.ExtensionParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AuthorityInfoAccess ASN.1 structure class
  * @param params associative array of parameters
  * @description
  * ```
  * id-pe OBJECT IDENTIFIER  ::=  { id-pkix 1 }
  * id-pe-authorityInfoAccess OBJECT IDENTIFIER ::= { id-pe 1 }
  * AuthorityInfoAccessSyntax  ::=
  *         SEQUENCE SIZE (1..MAX) OF AccessDescription
  * AccessDescription  ::=  SEQUENCE {
  *         accessMethod          OBJECT IDENTIFIER,
  *         accessLocation        GeneralName  }
  * id-ad OBJECT IDENTIFIER ::= { id-pkix 48 }
  * id-ad-caIssuers OBJECT IDENTIFIER ::= { id-ad 2 }
  * id-ad-ocsp OBJECT IDENTIFIER ::= { id-ad 1 }
  * ```
  * @example
  * e1 = new KJUR.asn1.x509.AuthorityInfoAccess({
  *   array: [{
  *     accessMethod:{'oid': '1.3.6.1.5.5.7.48.1'},
  *     accessLocation:{'uri': 'http://ocsp.cacert.org'}
  *   }]
  * });
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.AuthorityInfoAccess")
@js.native
class AuthorityInfoAccess ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.AuthorityInfoAccess {
  def this(params: ArrayParam[ExtensionParam]) = this()
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
  override def setAccessDescriptionArray(accessDescriptionArray: js.Array[ExtensionParam]): Unit = js.native
}

