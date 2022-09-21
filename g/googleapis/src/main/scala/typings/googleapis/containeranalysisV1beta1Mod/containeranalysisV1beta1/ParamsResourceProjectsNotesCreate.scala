package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsNotesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID to use for this note.
    */
  var noteId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the project in the form of `projects/[PROJECT_ID]`, under which the note is to be created.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaNote] = js.undefined
}
object ParamsResourceProjectsNotesCreate {
  
  inline def apply(): ParamsResourceProjectsNotesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsNotesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsNotesCreate](x: Self) {
    
    inline def setNoteId(value: String): Self = StObject.set(x, "noteId", value.asInstanceOf[js.Any])
    
    inline def setNoteIdUndefined: Self = StObject.set(x, "noteId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaNote): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
