package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An expression, consisting or an operator and conditions.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Expressions extends StObject {
  
  var conditions: js.UndefOr[SchemaGooglePrivacyDlpV2Conditions] = js.native
  
  /**
    * The operator to apply to the result of conditions. Default and currently
    * only supported value is `AND`.
    */
  var logicalOperator: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2Expressions {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Expressions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Expressions]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ExpressionsMutableBuilder[Self <: SchemaGooglePrivacyDlpV2Expressions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: SchemaGooglePrivacyDlpV2Conditions): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setLogicalOperator(value: String): Self = StObject.set(x, "logicalOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalOperatorUndefined: Self = StObject.set(x, "logicalOperator", js.undefined)
  }
}
