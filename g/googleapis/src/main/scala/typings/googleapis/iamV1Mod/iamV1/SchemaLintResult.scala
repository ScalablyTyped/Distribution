package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structured response of a single validation unit.
  */
@js.native
trait SchemaLintResult extends js.Object {
  /**
    * 0-based index ordinality of the binding in the input object associated
    * with this result. This field is populated only if the input object to
    * lint is of type google.iam.v1.Policy, which can comprise more than one
    * binding. It is set to -1 if the result is not associated with any
    * particular binding and only targets the policy as a whole, such as
    * results about policy size violations.
    */
  var bindingOrdinal: js.UndefOr[Double] = js.native
  /**
    * Human readable debug message associated with the issue.
    */
  var debugMessage: js.UndefOr[String] = js.native
  /**
    * The name of the field for which this lint result is about.  For nested
    * messages, `field_name` consists of names of the embedded fields separated
    * by period character. The top-level qualifier is the input object to lint
    * in the request. For instance, if the lint request is on a
    * google.iam.v1.Policy and this lint result is about a condition expression
    * of one of the input policy bindings, the field would be populated as
    * `policy.bindings.condition.expression`.  This field does not identify the
    * ordinality of the repetitive fields (for instance bindings in a policy).
    */
  var fieldName: js.UndefOr[String] = js.native
  /**
    * The validation unit level.
    */
  var level: js.UndefOr[String] = js.native
  /**
    * 0-based character position of problematic construct within the object
    * identified by `field_name`. Currently, this is populated only for
    * condition expression.
    */
  var locationOffset: js.UndefOr[Double] = js.native
  /**
    * The validation unit severity.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * The validation unit name, for instance
    * “lintValidationUnits/ConditionComplexityCheck”.
    */
  var validationUnitName: js.UndefOr[String] = js.native
}

object SchemaLintResult {
  @scala.inline
  def apply(): SchemaLintResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLintResult]
  }
  @scala.inline
  implicit class SchemaLintResultOps[Self <: SchemaLintResult] (val x: Self) extends AnyVal {
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
    def setBindingOrdinal(value: Double): Self = this.set("bindingOrdinal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindingOrdinal: Self = this.set("bindingOrdinal", js.undefined)
    @scala.inline
    def setDebugMessage(value: String): Self = this.set("debugMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugMessage: Self = this.set("debugMessage", js.undefined)
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setLocationOffset(value: Double): Self = this.set("locationOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationOffset: Self = this.set("locationOffset", js.undefined)
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setValidationUnitName(value: String): Self = this.set("validationUnitName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationUnitName: Self = this.set("validationUnitName", js.undefined)
  }
  
}

