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
  def apply(): SchemaContainerVersionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerVersionHeader]
  }
  @scala.inline
  implicit class SchemaContainerVersionHeaderOps[Self <: SchemaContainerVersionHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    @scala.inline
    def setContainerVersionId(value: String): Self = this.set("containerVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerVersionId: Self = this.set("containerVersionId", js.undefined)
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNumMacros(value: String): Self = this.set("numMacros", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumMacros: Self = this.set("numMacros", js.undefined)
    @scala.inline
    def setNumRules(value: String): Self = this.set("numRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumRules: Self = this.set("numRules", js.undefined)
    @scala.inline
    def setNumTags(value: String): Self = this.set("numTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumTags: Self = this.set("numTags", js.undefined)
    @scala.inline
    def setNumTriggers(value: String): Self = this.set("numTriggers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumTriggers: Self = this.set("numTriggers", js.undefined)
    @scala.inline
    def setNumVariables(value: String): Self = this.set("numVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumVariables: Self = this.set("numVariables", js.undefined)
  }
  
}

