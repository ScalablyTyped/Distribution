package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsBrandsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the brand to be fetched. In the following format: projects/{project_number/id\}/brands/{brand\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsBrandsGet {
  
  inline def apply(): ParamsResourceProjectsBrandsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBrandsGet]
  }
  
  extension [Self <: ParamsResourceProjectsBrandsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
