package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.StringParam & {  certissuer ? :string,   certsubject ? :string} */
trait StringParamcertissuerstri extends js.Object {
  var certissuer: js.UndefOr[String] = js.undefined
  var certsubject: js.UndefOr[String] = js.undefined
  var str: String
}

object StringParamcertissuerstri {
  @scala.inline
  def apply(str: String, certissuer: String = null, certsubject: String = null): StringParamcertissuerstri = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    if (certissuer != null) __obj.updateDynamic("certissuer")(certissuer.asInstanceOf[js.Any])
    if (certsubject != null) __obj.updateDynamic("certsubject")(certsubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringParamcertissuerstri]
  }
}

