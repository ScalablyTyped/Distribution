package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersNodesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the node.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersNodesGet {
  
  inline def apply(): ParamsResourceCustomersNodesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersNodesGet]
  }
  
  extension [Self <: ParamsResourceCustomersNodesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
