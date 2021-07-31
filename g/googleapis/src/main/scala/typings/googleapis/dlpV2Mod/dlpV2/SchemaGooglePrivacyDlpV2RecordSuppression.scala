package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration to suppress records whose suppression conditions evaluate to
  * true.
  */
trait SchemaGooglePrivacyDlpV2RecordSuppression extends StObject {
  
  /**
    * A condition that when it evaluates to true will result in the record
    * being evaluated to be suppressed from the transformed content.
    */
  var condition: js.UndefOr[SchemaGooglePrivacyDlpV2RecordCondition] = js.undefined
}
object SchemaGooglePrivacyDlpV2RecordSuppression {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RecordSuppression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordSuppression]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RecordSuppressionMutableBuilder[Self <: SchemaGooglePrivacyDlpV2RecordSuppression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: SchemaGooglePrivacyDlpV2RecordCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
  }
}
