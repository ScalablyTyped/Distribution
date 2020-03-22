package typings.jsrsasign

import typings.jsrsasign.jsrsasignStrings.gen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.StringParam & {  type ? :'gen'} */
trait StringParamtypegen extends js.Object {
  var str: String
  var `type`: js.UndefOr[gen] = js.undefined
}

object StringParamtypegen {
  @scala.inline
  def apply(str: String, `type`: gen = null): StringParamtypegen = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringParamtypegen]
  }
}

