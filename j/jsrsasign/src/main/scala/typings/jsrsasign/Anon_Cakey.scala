package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.IntegerParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.NameParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.StringParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.x509Ns.Extension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cakey extends js.Object {
  var cakey: js.Tuple2[String, String]
  var ext: js.UndefOr[js.Array[Extension]] = js.undefined
  var issue: StringParam
  var notafter: StringParam
  var sbjpubkey: String
  var serial: IntegerParam
  var sigalg: NameParam
  var sighex: String
  var subject: StringParam
}

object Anon_Cakey {
  @scala.inline
  def apply(
    cakey: js.Tuple2[String, String],
    issue: StringParam,
    notafter: StringParam,
    sbjpubkey: String,
    serial: IntegerParam,
    sigalg: NameParam,
    sighex: String,
    subject: StringParam,
    ext: js.Array[Extension] = null
  ): Anon_Cakey = {
    val __obj = js.Dynamic.literal(cakey = cakey, issue = issue, notafter = notafter, sbjpubkey = sbjpubkey, serial = serial, sigalg = sigalg, sighex = sighex, subject = subject)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    __obj.asInstanceOf[Anon_Cakey]
  }
}

