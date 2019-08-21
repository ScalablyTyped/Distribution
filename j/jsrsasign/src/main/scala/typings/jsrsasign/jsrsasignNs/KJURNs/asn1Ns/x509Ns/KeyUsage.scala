package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.x509Ns

import typings.jsrsasign.Anon_Bin
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.HexParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.NameParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ObjectIdentifierParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * KeyUsage ASN.1 structure class
  * @param params associative array of parameters (ex. {'bin': '11', 'critical': true})
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.KeyUsage")
@js.native
class KeyUsage () extends Extension {
  def this(params: Anon_Bin) = this()
  def getExtnValueHex(): String = js.native
  def setPurposeArray(purposeArray: js.Array[ObjectIdentifierParam | HexParam | NameParam]): Unit = js.native
}

