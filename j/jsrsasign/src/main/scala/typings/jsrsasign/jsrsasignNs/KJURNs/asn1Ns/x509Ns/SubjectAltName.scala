package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.x509Ns

import typings.jsrsasign.Anon_CriticalBooleanOptional
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ArrayParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SubjectAltName ASN.1 structure class
  * @param params associative array of parameters
  * @see KJUR.asn1.x509.GeneralNames
  * @see KJUR.asn1.x509.GeneralName
  * @description
  * This class provides X.509v3 SubjectAltName extension.
  * ```
  * id-ce-subjectAltName OBJECT IDENTIFIER ::=  { id-ce 17 }
  * SubjectAltName ::= GeneralNames
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
  * e1 = new KJUR.asn1.x509.SubjectAltName({
  *   critical: true,
  *   array: [{uri: 'http://aaa.com/'}, {uri: 'http://bbb.com/'}]
  * });
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.SubjectAltName")
@js.native
class SubjectAltName () extends Extension {
  def this(params: ArrayParam[UriParam] with Anon_CriticalBooleanOptional) = this()
  def getExtnValueHex(): String = js.native
  def setNameArray(paramsArray: js.Array[UriParam]): Unit = js.native
}

