package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsWorkforcepoolsProvidersKeysOperationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the operation resource.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsWorkforcepoolsProvidersKeysOperationsGet {
  
  inline def apply(): ParamsResourceLocationsWorkforcepoolsProvidersKeysOperationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsWorkforcepoolsProvidersKeysOperationsGet]
  }
  
  extension [Self <: ParamsResourceLocationsWorkforcepoolsProvidersKeysOperationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
