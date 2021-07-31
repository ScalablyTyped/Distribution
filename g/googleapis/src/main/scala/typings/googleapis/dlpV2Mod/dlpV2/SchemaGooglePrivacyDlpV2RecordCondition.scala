package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A condition for determining whether a transformation should be applied to a
  * field.
  */
trait SchemaGooglePrivacyDlpV2RecordCondition extends StObject {
  
  /**
    * An expression.
    */
  var expressions: js.UndefOr[SchemaGooglePrivacyDlpV2Expressions] = js.undefined
}
object SchemaGooglePrivacyDlpV2RecordCondition {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RecordCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordCondition]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RecordConditionMutableBuilder[Self <: SchemaGooglePrivacyDlpV2RecordCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpressions(value: SchemaGooglePrivacyDlpV2Expressions): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
  }
}
