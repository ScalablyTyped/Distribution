package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsFetchprocessortypes
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The project of processor type to list. The available processor types may depend on the allow-listing on projects. Format: `projects/{project\}/locations/{location\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsFetchprocessortypes {
  
  inline def apply(): ParamsResourceProjectsLocationsFetchprocessortypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsFetchprocessortypes]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsFetchprocessortypes](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
