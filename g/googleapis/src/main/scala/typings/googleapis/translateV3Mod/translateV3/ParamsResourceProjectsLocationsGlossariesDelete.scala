package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlossariesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the glossary to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGlossariesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsGlossariesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlossariesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlossariesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
