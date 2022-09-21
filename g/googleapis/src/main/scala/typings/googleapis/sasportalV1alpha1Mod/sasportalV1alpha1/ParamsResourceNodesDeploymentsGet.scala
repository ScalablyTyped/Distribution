package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNodesDeploymentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the deployment.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceNodesDeploymentsGet {
  
  inline def apply(): ParamsResourceNodesDeploymentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNodesDeploymentsGet]
  }
  
  extension [Self <: ParamsResourceNodesDeploymentsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
