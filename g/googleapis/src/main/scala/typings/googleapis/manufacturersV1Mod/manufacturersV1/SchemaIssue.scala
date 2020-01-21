package typings.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Product issue.
  */
@js.native
trait SchemaIssue extends js.Object {
  /**
    * If present, the attribute that triggered the issue. For more information
    * about attributes, see
    * https://support.google.com/manufacturers/answer/6124116.
    */
  var attribute: js.UndefOr[String] = js.native
  /**
    * Longer description of the issue focused on how to resolve it.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The destination this issue applies to.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * What needs to happen to resolve the issue.
    */
  var resolution: js.UndefOr[String] = js.native
  /**
    * The severity of the issue.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * The timestamp when this issue appeared.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * Short title describing the nature of the issue.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The server-generated type of the issue, for example,
    * “INCORRECT_TEXT_FORMATTING”, “IMAGE_NOT_SERVEABLE”, etc.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaIssue {
  @scala.inline
  def apply(
    attribute: String = null,
    description: String = null,
    destination: String = null,
    resolution: String = null,
    severity: String = null,
    timestamp: String = null,
    title: String = null,
    `type`: String = null
  ): SchemaIssue = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIssue]
  }
}

