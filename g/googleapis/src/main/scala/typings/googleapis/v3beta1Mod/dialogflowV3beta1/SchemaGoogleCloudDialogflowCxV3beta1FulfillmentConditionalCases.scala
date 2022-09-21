package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1FulfillmentConditionalCases extends StObject {
  
  /**
    * A list of cascading if-else conditions.
    */
  var cases: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCase]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1FulfillmentConditionalCases {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1FulfillmentConditionalCases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1FulfillmentConditionalCases]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1FulfillmentConditionalCases](x: Self) {
    
    inline def setCases(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCase]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    inline def setCasesUndefined: Self = StObject.set(x, "cases", js.undefined)
    
    inline def setCasesVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCase*): Self = StObject.set(x, "cases", js.Array(value*))
  }
}
