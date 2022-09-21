package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsHl7v2storesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the HL7v2 store to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsHl7v2storesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsHl7v2storesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsHl7v2storesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsHl7v2storesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
