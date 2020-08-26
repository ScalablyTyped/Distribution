package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

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
@js.native
trait GeneralNames extends js.Object {
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

object GeneralNames {
  @scala.inline
  def apply(getEncodedHex: () => String, setByParamArray: js.Array[GeneralNameParam] => Unit): GeneralNames = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), setByParamArray = js.Any.fromFunction1(setByParamArray))
    __obj.asInstanceOf[GeneralNames]
  }
  @scala.inline
  implicit class GeneralNamesOps[Self <: GeneralNames] (val x: Self) extends AnyVal {
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
    def setGetEncodedHex(value: () => String): Self = this.set("getEncodedHex", js.Any.fromFunction0(value))
    @scala.inline
    def setSetByParamArray(value: js.Array[GeneralNameParam] => Unit): Self = this.set("setByParamArray", js.Any.fromFunction1(value))
  }
  
}

