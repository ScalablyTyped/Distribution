package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountStatusAccountLevelIssue extends js.Object {
  /**
    * Country for which this issue is reported.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The destination the issue applies to.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * Additional details about the issue.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * The URL of a web page to help resolving this issue.
    */
  var documentation: js.UndefOr[String] = js.native
  /**
    * Issue identifier.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Severity of the issue.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * Short description of the issue.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaAccountStatusAccountLevelIssue {
  @scala.inline
  def apply(
    country: String = null,
    destination: String = null,
    detail: String = null,
    documentation: String = null,
    id: String = null,
    severity: String = null,
    title: String = null
  ): SchemaAccountStatusAccountLevelIssue = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountStatusAccountLevelIssue]
  }
}

