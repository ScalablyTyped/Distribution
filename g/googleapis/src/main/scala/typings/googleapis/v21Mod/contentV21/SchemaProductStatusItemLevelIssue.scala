package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductStatusItemLevelIssue extends js.Object {
  /**
    * The attribute&#39;s name, if the issue is caused by a single attribute.
    */
  var attributeName: js.UndefOr[String] = js.native
  /**
    * The error code of the issue.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * A short issue description in English.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The destination the issue applies to.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * A detailed issue description in English.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * The URL of a web page to help with resolving this issue.
    */
  var documentation: js.UndefOr[String] = js.native
  /**
    * Whether the issue can be resolved by the merchant.
    */
  var resolution: js.UndefOr[String] = js.native
  /**
    * How this issue affects serving of the offer.
    */
  var servability: js.UndefOr[String] = js.native
}

object SchemaProductStatusItemLevelIssue {
  @scala.inline
  def apply(
    attributeName: String = null,
    code: String = null,
    description: String = null,
    destination: String = null,
    detail: String = null,
    documentation: String = null,
    resolution: String = null,
    servability: String = null
  ): SchemaProductStatusItemLevelIssue = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (servability != null) __obj.updateDynamic("servability")(servability.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductStatusItemLevelIssue]
  }
}

