package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structured response of a single validation unit.
  */
@js.native
trait SchemaLintResult extends StObject {
  
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
  implicit class SchemaLintResultMutableBuilder[Self <: SchemaLintResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingOrdinal(value: Double): Self = StObject.set(x, "bindingOrdinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingOrdinalUndefined: Self = StObject.set(x, "bindingOrdinal", js.undefined)
    
    @scala.inline
    def setDebugMessage(value: String): Self = StObject.set(x, "debugMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugMessageUndefined: Self = StObject.set(x, "debugMessage", js.undefined)
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLocationOffset(value: Double): Self = StObject.set(x, "locationOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationOffsetUndefined: Self = StObject.set(x, "locationOffset", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setValidationUnitName(value: String): Self = StObject.set(x, "validationUnitName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationUnitNameUndefined: Self = StObject.set(x, "validationUnitName", js.undefined)
  }
}
