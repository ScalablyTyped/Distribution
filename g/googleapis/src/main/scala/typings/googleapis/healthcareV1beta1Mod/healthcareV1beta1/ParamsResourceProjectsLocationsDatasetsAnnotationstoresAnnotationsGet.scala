package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the Annotation to retrieve.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
