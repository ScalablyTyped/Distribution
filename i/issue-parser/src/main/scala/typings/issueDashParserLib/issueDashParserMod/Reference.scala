package typings
package issueDashParserLib.issueDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  var issue: java.lang.String
  var prefix: js.UndefOr[java.lang.String]
  var raw: java.lang.String
  var slug: js.UndefOr[java.lang.String]
}

object Reference {
  @scala.inline
  def apply(
    issue: java.lang.String,
    raw: java.lang.String,
    prefix: java.lang.String = null,
    slug: java.lang.String = null
  ): Reference = {
    val __obj = js.Dynamic.literal(issue = issue, raw = raw)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (slug != null) __obj.updateDynamic("slug")(slug)
    __obj.asInstanceOf[Reference]
  }
}

