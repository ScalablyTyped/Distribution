package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mobile-friendly issue.
  */
@js.native
trait SchemaMobileFriendlyIssue extends js.Object {
  /**
    * Rule violated.
    */
  var rule: js.UndefOr[String] = js.native
}

object SchemaMobileFriendlyIssue {
  @scala.inline
  def apply(rule: String = null): SchemaMobileFriendlyIssue = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMobileFriendlyIssue]
  }
}

