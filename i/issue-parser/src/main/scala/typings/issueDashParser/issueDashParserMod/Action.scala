package typings.issueDashParser.issueDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: String
  var issue: String
  var prefix: js.UndefOr[String] = js.undefined
  var raw: String
  var slug: js.UndefOr[String] = js.undefined
}

object Action {
  @scala.inline
  def apply(action: String, issue: String, raw: String, prefix: String = null, slug: String = null): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (slug != null) __obj.updateDynamic("slug")(slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

