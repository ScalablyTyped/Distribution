package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsBranchesOperationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the operation resource.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsBranchesOperationsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsBranchesOperationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsBranchesOperationsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsBranchesOperationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
