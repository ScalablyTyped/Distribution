package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsServiceaccountsDisable
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the service account in the following format: `projects/{PROJECT_ID\}/serviceAccounts/{ACCOUNT\}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account. The `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDisableServiceAccountRequest] = js.undefined
}
object ParamsResourceProjectsServiceaccountsDisable {
  
  inline def apply(): ParamsResourceProjectsServiceaccountsDisable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsServiceaccountsDisable]
  }
  
  extension [Self <: ParamsResourceProjectsServiceaccountsDisable](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaDisableServiceAccountRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
