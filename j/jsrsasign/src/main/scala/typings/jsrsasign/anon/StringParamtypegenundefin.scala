package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasignStrings.gen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.StringParam & {  type :'gen' | undefined} */
@js.native
trait StringParamtypegenundefin extends js.Object {
  var str: String = js.native
  var `type`: js.UndefOr[gen] = js.native
}

object StringParamtypegenundefin {
  @scala.inline
  def apply(str: String): StringParamtypegenundefin = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringParamtypegenundefin]
  }
  @scala.inline
  implicit class StringParamtypegenundefinOps[Self <: StringParamtypegenundefin] (val x: Self) extends AnyVal {
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
    def setType(value: gen): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

