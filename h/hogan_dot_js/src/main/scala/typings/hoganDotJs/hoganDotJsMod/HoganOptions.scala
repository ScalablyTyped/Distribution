package typings.hoganDotJs.hoganDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoganOptions extends js.Object {
  var asString: js.UndefOr[Boolean] = js.undefined
  var delimiters: js.UndefOr[String] = js.undefined
  var disableLambda: js.UndefOr[Boolean] = js.undefined
  var sectionTags: js.UndefOr[js.Array[SectionTags]] = js.undefined
}

object HoganOptions {
  @scala.inline
  def apply(
    asString: js.UndefOr[Boolean] = js.undefined,
    delimiters: String = null,
    disableLambda: js.UndefOr[Boolean] = js.undefined,
    sectionTags: js.Array[SectionTags] = null
  ): HoganOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asString)) __obj.updateDynamic("asString")(asString)
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters)
    if (!js.isUndefined(disableLambda)) __obj.updateDynamic("disableLambda")(disableLambda)
    if (sectionTags != null) __obj.updateDynamic("sectionTags")(sectionTags)
    __obj.asInstanceOf[HoganOptions]
  }
}

