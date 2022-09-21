package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsServiceaccountsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the service account. Use one of the following formats: * `projects/{PROJECT_ID\}/serviceAccounts/{EMAIL_ADDRESS\}` * `projects/{PROJECT_ID\}/serviceAccounts/{UNIQUE_ID\}` As an alternative, you can use the `-` wildcard character instead of the project ID: * `projects/-/serviceAccounts/{EMAIL_ADDRESS\}` * `projects/-/serviceAccounts/{UNIQUE_ID\}` When possible, avoid using the `-` wildcard character, because it can cause response messages to contain misleading error codes. For example, if you try to get the service account `projects/-/serviceAccounts/fake@example.com`, which does not exist, the response contains an HTTP `403 Forbidden` error instead of a `404 Not Found` error.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPatchServiceAccountRequest] = js.undefined
}
object ParamsResourceProjectsServiceaccountsPatch {
  
  inline def apply(): ParamsResourceProjectsServiceaccountsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsServiceaccountsPatch]
  }
  
  extension [Self <: ParamsResourceProjectsServiceaccountsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaPatchServiceAccountRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
