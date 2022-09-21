package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCases extends StObject {
  
  /**
    * A list of cascading if-else conditions.
    */
  var cases: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCases {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCases]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCases](x: Self) {
    
    inline def setCases(value: js.Array[SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    inline def setCasesUndefined: Self = StObject.set(x, "cases", js.undefined)
    
    inline def setCasesVarargs(value: SchemaGoogleCloudDialogflowCxV3FulfillmentConditionalCasesCase*): Self = StObject.set(x, "cases", js.Array(value*))
  }
}
