package typings.issueDashParser.issueDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  var issue: String
  var prefix: js.UndefOr[String] = js.undefined
  var raw: String
  var slug: js.UndefOr[String] = js.undefined
}

object Reference {
  @scala.inline
  def apply(issue: String, raw: String, prefix: String = null, slug: String = null): Reference = {
    val __obj = js.Dynamic.literal(issue = issue, raw = raw)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (slug != null) __obj.updateDynamic("slug")(slug)
    __obj.asInstanceOf[Reference]
  }
}

