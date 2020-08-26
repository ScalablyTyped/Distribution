package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remarketing List Population Rule Term.
  */
@js.native
trait SchemaListPopulationTerm extends js.Object {
  /**
    * Will be true if the term should check if the user is in the list and
    * false if the term should check if the user is not in the list. This field
    * is only relevant when type is set to LIST_MEMBERSHIP_TERM. False by
    * default.
    */
  var contains: js.UndefOr[Boolean] = js.native
  /**
    * Whether to negate the comparison result of this term during rule
    * evaluation. This field is only relevant when type is left unset or set to
    * CUSTOM_VARIABLE_TERM or REFERRER_TERM.
    */
  var negation: js.UndefOr[Boolean] = js.native
  /**
    * Comparison operator of this term. This field is only relevant when type
    * is left unset or set to CUSTOM_VARIABLE_TERM or REFERRER_TERM.
    */
  var operator: js.UndefOr[String] = js.native
  /**
    * ID of the list in question. This field is only relevant when type is set
    * to LIST_MEMBERSHIP_TERM.
    */
  var remarketingListId: js.UndefOr[String] = js.native
  /**
    * List population term type determines the applicable fields in this
    * object. If left unset or set to CUSTOM_VARIABLE_TERM, then variableName,
    * variableFriendlyName, operator, value, and negation are applicable. If
    * set to LIST_MEMBERSHIP_TERM then remarketingListId and contains are
    * applicable. If set to REFERRER_TERM then operator, value, and negation
    * are applicable.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Literal to compare the variable to. This field is only relevant when type
    * is left unset or set to CUSTOM_VARIABLE_TERM or REFERRER_TERM.
    */
  var value: js.UndefOr[String] = js.native
  /**
    * Friendly name of this term&#39;s variable. This is a read-only,
    * auto-generated field. This field is only relevant when type is left unset
    * or set to CUSTOM_VARIABLE_TERM.
    */
  var variableFriendlyName: js.UndefOr[String] = js.native
  /**
    * Name of the variable (U1, U2, etc.) being compared in this term. This
    * field is only relevant when type is set to null, CUSTOM_VARIABLE_TERM or
    * REFERRER_TERM.
    */
  var variableName: js.UndefOr[String] = js.native
}

object SchemaListPopulationTerm {
  @scala.inline
  def apply(): SchemaListPopulationTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPopulationTerm]
  }
  @scala.inline
  implicit class SchemaListPopulationTermOps[Self <: SchemaListPopulationTerm] (val x: Self) extends AnyVal {
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
    def setContains(value: Boolean): Self = this.set("contains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setNegation(value: Boolean): Self = this.set("negation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegation: Self = this.set("negation", js.undefined)
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setRemarketingListId(value: String): Self = this.set("remarketingListId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemarketingListId: Self = this.set("remarketingListId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVariableFriendlyName(value: String): Self = this.set("variableFriendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableFriendlyName: Self = this.set("variableFriendlyName", js.undefined)
    @scala.inline
    def setVariableName(value: String): Self = this.set("variableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableName: Self = this.set("variableName", js.undefined)
  }
  
}

