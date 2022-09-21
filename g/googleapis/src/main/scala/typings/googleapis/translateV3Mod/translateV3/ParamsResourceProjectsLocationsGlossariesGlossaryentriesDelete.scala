package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlossariesGlossaryentriesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the glossary entry to delete
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGlossariesGlossaryentriesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsGlossariesGlossaryentriesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlossariesGlossaryentriesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlossariesGlossaryentriesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
