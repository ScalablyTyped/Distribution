package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsOccurrencesGetnotes
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the occurrence in the form "projects/{project_id\}/occurrences/{OCCURRENCE_ID\}"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsOccurrencesGetnotes {
  
  inline def apply(): ParamsResourceProjectsOccurrencesGetnotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsOccurrencesGetnotes]
  }
  
  extension [Self <: ParamsResourceProjectsOccurrencesGetnotes](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
