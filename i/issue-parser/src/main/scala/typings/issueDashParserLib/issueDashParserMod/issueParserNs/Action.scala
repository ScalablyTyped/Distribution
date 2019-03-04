package typings
package issueDashParserLib.issueDashParserMod.issueParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: java.lang.String
  var issue: java.lang.String
  var prefix: js.UndefOr[java.lang.String]
  var raw: java.lang.String
  var slug: js.UndefOr[java.lang.String]
}

object Action {
  @scala.inline
  def apply(
    action: java.lang.String,
    issue: java.lang.String,
    raw: java.lang.String,
    prefix: java.lang.String = null,
    slug: java.lang.String = null
  ): Action = {
    val __obj = js.Dynamic.literal(action = action, issue = issue, raw = raw)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (slug != null) __obj.updateDynamic("slug")(slug)
    __obj.asInstanceOf[Action]
  }
}

