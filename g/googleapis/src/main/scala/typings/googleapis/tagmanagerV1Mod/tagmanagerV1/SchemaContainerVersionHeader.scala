package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Container Version Header.
  */
@js.native
trait SchemaContainerVersionHeader extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * The Container Version ID uniquely identifies the GTM Container Version.
    */
  var containerVersionId: js.UndefOr[String] = js.native
  /**
    * A value of true indicates this container version has been deleted.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * Container version display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Number of macros in the container version.
    */
  var numMacros: js.UndefOr[String] = js.native
  /**
    * Number of rules in the container version.
    */
  var numRules: js.UndefOr[String] = js.native
  /**
    * Number of tags in the container version.
    */
  var numTags: js.UndefOr[String] = js.native
  /**
    * Number of triggers in the container version.
    */
  var numTriggers: js.UndefOr[String] = js.native
  /**
    * Number of variables in the container version.
    */
  var numVariables: js.UndefOr[String] = js.native
}

object SchemaContainerVersionHeader {
  @scala.inline
  def apply(
    accountId: String = null,
    containerId: String = null,
    containerVersionId: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    numMacros: String = null,
    numRules: String = null,
    numTags: String = null,
    numTriggers: String = null,
    numVariables: String = null
  ): SchemaContainerVersionHeader = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (containerVersionId != null) __obj.updateDynamic("containerVersionId")(containerVersionId.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numMacros != null) __obj.updateDynamic("numMacros")(numMacros.asInstanceOf[js.Any])
    if (numRules != null) __obj.updateDynamic("numRules")(numRules.asInstanceOf[js.Any])
    if (numTags != null) __obj.updateDynamic("numTags")(numTags.asInstanceOf[js.Any])
    if (numTriggers != null) __obj.updateDynamic("numTriggers")(numTriggers.asInstanceOf[js.Any])
    if (numVariables != null) __obj.updateDynamic("numVariables")(numVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContainerVersionHeader]
  }
}

