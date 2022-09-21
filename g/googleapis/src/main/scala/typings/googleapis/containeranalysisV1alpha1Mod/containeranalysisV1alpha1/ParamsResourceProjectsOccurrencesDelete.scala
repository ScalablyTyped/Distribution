package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsOccurrencesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the occurrence in the form of "projects/{project_id\}/occurrences/{OCCURRENCE_ID\}"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsOccurrencesDelete {
  
  inline def apply(): ParamsResourceProjectsOccurrencesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsOccurrencesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsOccurrencesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
