package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNamespacesConfigurationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the configuration to retrieve. For Cloud Run (fully managed), replace {namespace_id\} with the project ID or number.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceNamespacesConfigurationsGet {
  
  inline def apply(): ParamsResourceNamespacesConfigurationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNamespacesConfigurationsGet]
  }
  
  extension [Self <: ParamsResourceNamespacesConfigurationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
