package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInstallerValidate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSasPortalValidateInstallerRequest] = js.undefined
}
object ParamsResourceInstallerValidate {
  
  inline def apply(): ParamsResourceInstallerValidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstallerValidate]
  }
  
  extension [Self <: ParamsResourceInstallerValidate](x: Self) {
    
    inline def setRequestBody(value: SchemaSasPortalValidateInstallerRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
