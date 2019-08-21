package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.x509Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GeneralNames ASN.1 structure class
  * @example
  * gns = new KJUR.asn1.x509.GeneralNames([{'uri': 'http://aaa.com/'}, {'uri': 'http://bbb.com/'}]);
  *
  * GeneralNames ::= SEQUENCE SIZE (1..MAX) OF GeneralName
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.GeneralNames")
@js.native
class GeneralNames protected () extends js.Object {
  def this(paramsArray: js.Array[UriParam]) = this()
  def getEncodedHex(): String = js.native
  /**
    * set a array of `KJUR.asn1.x509.GeneralName` parameters
    * @param paramsArray Array of `KJUR.asn1.x509.GeneralNames`
    * @example
    * gns = new KJUR.asn1.x509.GeneralNames();
    * gns.setByParamArray([{uri: 'http://aaa.com/'}, {uri: 'http://bbb.com/'}]);
    */
  def setByParamArray(paramsArray: js.Array[GeneralNameParam]): Unit = js.native
}

