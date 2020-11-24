package typings.jsrsasign.mod.KJUR.asn1.x509

import typings.jsrsasign.anon.ArrayParamUriParamcritica
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
