package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AuthorityKeyIdentifier ASN.1 structure class
  * @param params associative array of parameters (ex. {'uri': 'http://a.com/', 'critical': true})
  * @description
  * ```
  * d-ce-authorityKeyIdentifier OBJECT IDENTIFIER ::=  { id-ce 35 }
  * AuthorityKeyIdentifier ::= SEQUENCE {
  *    keyIdentifier             [0] KeyIdentifier           OPTIONAL,
  *    authorityCertIssuer       [1] GeneralNames            OPTIONAL,
  *    authorityCertSerialNumber [2] CertificateSerialNumber OPTIONAL  }
  * KeyIdentifier ::= OCTET STRING
  * ```
  * @example
  * e1 = new KJUR.asn1.x509.AuthorityKeyIdentifier({
  *   critical: true,
  *   kid:    {hex: '89ab'},
  *   issuer: {str: '/C=US/CN=a'},
  *   sn:     {hex: '1234'}
  * });
  */
@js.native
trait AuthorityKeyIdentifier
  extends StObject
     with Extension {
  
  def getExtnValueHex(): String = js.native
  
  /**
    * set authorityCertIssuer value by X500Name parameter
    * @param param array of `KJUR.asn1.x509.X500Name` parameter
    * @description
    * NOTE: Automatic authorityCertIssuer name setting by an issuer
    * certificate will be supported in future version.
    */
  def setCertIssuerByParam(param: js.Array[StringParam | X500NameParam]): Unit = js.native
  
  /**
    * set authorityCertSerialNumber value by DERInteger parameter
    * @param param array of `KJUR.asn1.DERInteger` parameter
    * @description
    * NOTE: Automatic authorityCertSerialNumber setting by an issuer
    * certificate will be supported in future version.
    */
  def setCertSNByParam(): Unit = js.native
  def setCertSNByParam(param: js.Array[IntegerParam | BigIntegerParam | HexParam | Double]): Unit = js.native
  
  /**
    * set keyIdentifier value by DERInteger parameter
    * @param param array of `KJUR.asn1.DERInteger` parameter
    * @description
    * NOTE: Automatic keyIdentifier value calculation by an issuer
    * public key will be supported in future version.
    */
  def setKIDByParam(param: js.Array[IntegerParam | BigIntegerParam | HexParam | Double]): Unit = js.native
}
