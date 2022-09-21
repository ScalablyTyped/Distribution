package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsWorkforcepoolsProvidersOperationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the operation resource.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsWorkforcepoolsProvidersOperationsGet {
  
  inline def apply(): ParamsResourceLocationsWorkforcepoolsProvidersOperationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsWorkforcepoolsProvidersOperationsGet]
  }
  
  extension [Self <: ParamsResourceLocationsWorkforcepoolsProvidersOperationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
