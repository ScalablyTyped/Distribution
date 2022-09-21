package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsLabelsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the account this label belongs to.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The id of the label to update.
    */
  var labelId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAccountLabel] = js.undefined
}
object ParamsResourceAccountsLabelsPatch {
  
  inline def apply(): ParamsResourceAccountsLabelsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsLabelsPatch]
  }
  
  extension [Self <: ParamsResourceAccountsLabelsPatch](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
    
    inline def setRequestBody(value: SchemaAccountLabel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
