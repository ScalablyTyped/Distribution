package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the Annotation to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
