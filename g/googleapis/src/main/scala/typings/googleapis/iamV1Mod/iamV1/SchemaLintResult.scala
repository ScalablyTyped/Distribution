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
  def apply(
    bindingOrdinal: js.UndefOr[Double] = js.undefined,
    debugMessage: String = null,
    fieldName: String = null,
    level: String = null,
    locationOffset: js.UndefOr[Double] = js.undefined,
    severity: String = null,
    validationUnitName: String = null
  ): SchemaLintResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bindingOrdinal)) __obj.updateDynamic("bindingOrdinal")(bindingOrdinal.get.asInstanceOf[js.Any])
    if (debugMessage != null) __obj.updateDynamic("debugMessage")(debugMessage.asInstanceOf[js.Any])
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(locationOffset)) __obj.updateDynamic("locationOffset")(locationOffset.get.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (validationUnitName != null) __obj.updateDynamic("validationUnitName")(validationUnitName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLintResult]
  }
}

