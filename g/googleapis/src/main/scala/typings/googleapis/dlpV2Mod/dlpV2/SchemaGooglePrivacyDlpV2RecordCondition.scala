package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2RecordCondition extends StObject {
  
  /**
    * An expression.
    */
  var expressions: js.UndefOr[SchemaGooglePrivacyDlpV2Expressions] = js.undefined
}
object SchemaGooglePrivacyDlpV2RecordCondition {
  
  inline def apply(): SchemaGooglePrivacyDlpV2RecordCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordCondition]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2RecordCondition](x: Self) {
    
    inline def setExpressions(value: SchemaGooglePrivacyDlpV2Expressions): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
  }
}
