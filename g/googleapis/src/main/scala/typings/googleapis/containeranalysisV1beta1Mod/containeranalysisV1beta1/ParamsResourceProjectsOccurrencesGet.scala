package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsOccurrencesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsOccurrencesGet {
  
  inline def apply(): ParamsResourceProjectsOccurrencesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsOccurrencesGet]
  }
  
  extension [Self <: ParamsResourceProjectsOccurrencesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
