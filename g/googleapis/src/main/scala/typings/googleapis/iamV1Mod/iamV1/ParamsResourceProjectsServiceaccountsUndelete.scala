package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsServiceaccountsUndelete
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the service account in the following format: `projects/{PROJECT_ID\}/serviceAccounts/{ACCOUNT_UNIQUE_ID\}`. Using `-` as a wildcard for the `PROJECT_ID` will infer the project from the account.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUndeleteServiceAccountRequest] = js.undefined
}
object ParamsResourceProjectsServiceaccountsUndelete {
  
  inline def apply(): ParamsResourceProjectsServiceaccountsUndelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsServiceaccountsUndelete]
  }
  
  extension [Self <: ParamsResourceProjectsServiceaccountsUndelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaUndeleteServiceAccountRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
