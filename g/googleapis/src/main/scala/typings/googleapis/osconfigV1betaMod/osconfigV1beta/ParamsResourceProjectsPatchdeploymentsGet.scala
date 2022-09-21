package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsPatchdeploymentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the patch deployment in the form `projects/x/patchDeployments/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsPatchdeploymentsGet {
  
  inline def apply(): ParamsResourceProjectsPatchdeploymentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsPatchdeploymentsGet]
  }
  
  extension [Self <: ParamsResourceProjectsPatchdeploymentsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
