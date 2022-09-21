package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsBrandsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. GCP Project number/id under which the brand is to be created. In the following format: projects/{project_number/id\}.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBrand] = js.undefined
}
object ParamsResourceProjectsBrandsCreate {
  
  inline def apply(): ParamsResourceProjectsBrandsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBrandsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsBrandsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBrand): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
