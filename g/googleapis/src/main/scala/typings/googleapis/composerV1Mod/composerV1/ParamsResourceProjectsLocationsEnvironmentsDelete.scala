package typings.googleapis.composerV1Mod.composerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEnvironmentsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The environment to delete, in the form: "projects/{projectId\}/locations/{locationId\}/environments/{environmentId\}"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsEnvironmentsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsEnvironmentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEnvironmentsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEnvironmentsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
