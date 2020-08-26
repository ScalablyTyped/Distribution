package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Rule.
  */
@js.native
trait SchemaRule extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The list of conditions that make up this rule (implicit AND between
    * them).
    */
  var condition: js.UndefOr[js.Array[SchemaCondition]] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * The fingerprint of the GTM Rule as computed at storage time. This value
    * is recomputed whenever the rule is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * Rule display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User notes on how to apply this rule in the container.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * The Rule ID uniquely identifies the GTM Rule.
    */
  var ruleId: js.UndefOr[String] = js.native
}

object SchemaRule {
  @scala.inline
  def apply(): SchemaRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRule]
  }
  @scala.inline
  implicit class SchemaRuleOps[Self <: SchemaRule] (val x: Self) extends AnyVal {
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
    def setConditionVarargs(value: SchemaCondition*): Self = this.set("condition", js.Array(value :_*))
    @scala.inline
    def setCondition(value: js.Array[SchemaCondition]): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setRuleId(value: String): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleId: Self = this.set("ruleId", js.undefined)
  }
  
}

