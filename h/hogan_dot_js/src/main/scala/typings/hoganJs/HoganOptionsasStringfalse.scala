package typings.hoganJs

import typings.hoganJs.hoganJsBooleans.`false`
import typings.hoganJs.mod.SectionTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined hogan.js.hogan.js.HoganOptions & {  asString  :false} */
trait HoganOptionsasStringfalse extends js.Object {
  var asString: js.UndefOr[Boolean with `false`] = js.undefined
  var delimiters: js.UndefOr[String] = js.undefined
  var disableLambda: js.UndefOr[Boolean] = js.undefined
  var sectionTags: js.UndefOr[js.Array[SectionTags]] = js.undefined
}

object HoganOptionsasStringfalse {
  @scala.inline
  def apply(
    asString: js.UndefOr[Boolean with `false`] = js.undefined,
    delimiters: String = null,
    disableLambda: js.UndefOr[Boolean] = js.undefined,
    sectionTags: js.Array[SectionTags] = null
  ): HoganOptionsasStringfalse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asString)) __obj.updateDynamic("asString")(asString.asInstanceOf[js.Any])
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLambda)) __obj.updateDynamic("disableLambda")(disableLambda.asInstanceOf[js.Any])
    if (sectionTags != null) __obj.updateDynamic("sectionTags")(sectionTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoganOptionsasStringfalse]
  }
}

