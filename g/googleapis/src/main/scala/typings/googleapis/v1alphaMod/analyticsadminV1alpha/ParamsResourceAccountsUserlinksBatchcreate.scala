package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsUserlinksBatchcreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The account or property that all user links in the request are for. This field is required. The parent field in the CreateUserLinkRequest messages must either be empty or match this field. Example format: accounts/1234
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksRequest] = js.undefined
}
object ParamsResourceAccountsUserlinksBatchcreate {
  
  inline def apply(): ParamsResourceAccountsUserlinksBatchcreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsUserlinksBatchcreate]
  }
  
  extension [Self <: ParamsResourceAccountsUserlinksBatchcreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
