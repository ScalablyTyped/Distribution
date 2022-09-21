package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsAnnotationstoresDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the Annotation store to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsAnnotationstoresDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsAnnotationstoresDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsAnnotationstoresDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsAnnotationstoresDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
