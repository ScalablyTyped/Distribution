package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNodesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the node.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceNodesGet {
  
  inline def apply(): ParamsResourceNodesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNodesGet]
  }
  
  extension [Self <: ParamsResourceNodesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
