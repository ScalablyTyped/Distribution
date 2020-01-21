package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a resource with issue.
  */
@js.native
trait SchemaResourceIssue extends js.Object {
  /**
    * Describes a blocked resource issue.
    */
  var blockedResource: js.UndefOr[SchemaBlockedResource] = js.native
}

object SchemaResourceIssue {
  @scala.inline
  def apply(blockedResource: SchemaBlockedResource = null): SchemaResourceIssue = {
    val __obj = js.Dynamic.literal()
    if (blockedResource != null) __obj.updateDynamic("blockedResource")(blockedResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourceIssue]
  }
}

