package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceConnectGenerateephemeralcert
  extends StObject
     with StandardParameters {
  
  /**
    * Cloud SQL instance ID. This does not include the project ID.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID of the project that contains the instance.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGenerateEphemeralCertRequest] = js.undefined
}
object ParamsResourceConnectGenerateephemeralcert {
  
  inline def apply(): ParamsResourceConnectGenerateephemeralcert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceConnectGenerateephemeralcert]
  }
  
  extension [Self <: ParamsResourceConnectGenerateephemeralcert](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRequestBody(value: SchemaGenerateEphemeralCertRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
