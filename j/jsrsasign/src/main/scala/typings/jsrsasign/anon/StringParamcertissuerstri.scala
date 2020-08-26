package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.StringParam & {  certissuer :string | undefined,   certsubject :string | undefined} */
@js.native
trait StringParamcertissuerstri extends js.Object {
  var certissuer: js.UndefOr[String] = js.native
  var certsubject: js.UndefOr[String] = js.native
  var str: String = js.native
}

object StringParamcertissuerstri {
  @scala.inline
  def apply(str: String): StringParamcertissuerstri = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringParamcertissuerstri]
  }
  @scala.inline
  implicit class StringParamcertissuerstriOps[Self <: StringParamcertissuerstri] (val x: Self) extends AnyVal {
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
    def setStr(value: String): Self = this.set("str", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertissuer(value: String): Self = this.set("certissuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertissuer: Self = this.set("certissuer", js.undefined)
    @scala.inline
    def setCertsubject(value: String): Self = this.set("certsubject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertsubject: Self = this.set("certsubject", js.undefined)
  }
  
}

