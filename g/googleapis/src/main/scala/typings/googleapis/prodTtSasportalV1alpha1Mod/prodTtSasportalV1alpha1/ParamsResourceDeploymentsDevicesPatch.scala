package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDeploymentsDevicesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. The resource path name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSasPortalDevice] = js.undefined
  
  /**
    * Fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceDeploymentsDevicesPatch {
  
  inline def apply(): ParamsResourceDeploymentsDevicesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDeploymentsDevicesPatch]
  }
  
  extension [Self <: ParamsResourceDeploymentsDevicesPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaSasPortalDevice): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
