package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsBrandsList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. GCP Project number/id. In the following format: projects/{project_number/id\}.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsBrandsList {
  
  inline def apply(): ParamsResourceProjectsBrandsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBrandsList]
  }
  
  extension [Self <: ParamsResourceProjectsBrandsList](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
