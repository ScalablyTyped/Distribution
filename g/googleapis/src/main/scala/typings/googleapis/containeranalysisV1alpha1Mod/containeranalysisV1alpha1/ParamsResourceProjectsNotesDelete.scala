package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsNotesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the note in the form of "providers/{provider_id\}/notes/{NOTE_ID\}"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsNotesDelete {
  
  inline def apply(): ParamsResourceProjectsNotesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsNotesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsNotesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
