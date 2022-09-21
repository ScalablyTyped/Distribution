package typings.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCustomclassesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the custom class to retrieve. Format: `projects/{project\}/locations/{location\}/customClasses/{custom_class\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCustomclassesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsCustomclassesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCustomclassesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCustomclassesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
