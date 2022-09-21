package typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTypeprovidersGettype
  extends StObject
     with StandardParameters {
  
  /**
    * The project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the type provider type for this request.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the type provider for this request.
    */
  var typeProvider: js.UndefOr[String] = js.undefined
}
object ParamsResourceTypeprovidersGettype {
  
  inline def apply(): ParamsResourceTypeprovidersGettype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTypeprovidersGettype]
  }
  
  extension [Self <: ParamsResourceTypeprovidersGettype](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeProvider(value: String): Self = StObject.set(x, "typeProvider", value.asInstanceOf[js.Any])
    
    inline def setTypeProviderUndefined: Self = StObject.set(x, "typeProvider", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
