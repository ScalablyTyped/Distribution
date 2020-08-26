package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cakey extends js.Object {
  var cakey: js.Tuple2[String, String] = js.native
  var ext: js.UndefOr[js.Array[Extension]] = js.native
  var issue: StringParam = js.native
  var notafter: StringParam = js.native
  var sbjpubkey: String = js.native
  var serial: IntegerParam = js.native
  var sigalg: NameParam = js.native
  var sighex: String = js.native
  var subject: StringParam = js.native
}

object Cakey {
  @scala.inline
  def apply(
    cakey: js.Tuple2[String, String],
    issue: StringParam,
    notafter: StringParam,
    sbjpubkey: String,
    serial: IntegerParam,
    sigalg: NameParam,
    sighex: String,
    subject: StringParam
  ): Cakey = {
    val __obj = js.Dynamic.literal(cakey = cakey.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], notafter = notafter.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], sighex = sighex.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cakey]
  }
  @scala.inline
  implicit class CakeyOps[Self <: Cakey] (val x: Self) extends AnyVal {
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
    def setCakey(value: js.Tuple2[String, String]): Self = this.set("cakey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssue(value: StringParam): Self = this.set("issue", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotafter(value: StringParam): Self = this.set("notafter", value.asInstanceOf[js.Any])
    @scala.inline
    def setSbjpubkey(value: String): Self = this.set("sbjpubkey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerial(value: IntegerParam): Self = this.set("serial", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigalg(value: NameParam): Self = this.set("sigalg", value.asInstanceOf[js.Any])
    @scala.inline
    def setSighex(value: String): Self = this.set("sighex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: StringParam): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtVarargs(value: Extension*): Self = this.set("ext", js.Array(value :_*))
    @scala.inline
    def setExt(value: js.Array[Extension]): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
  }
  
}

