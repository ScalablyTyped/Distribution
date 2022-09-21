package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsNotesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the project. Should be of the form "providers/{provider_id\}". @Deprecated
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The ID to use for this note.
    */
  var noteId: js.UndefOr[String] = js.undefined
  
  /**
    * This field contains the project Id for example: "projects/{project_id\}
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
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoteId(value: String): Self = StObject.set(x, "noteId", value.asInstanceOf[js.Any])
    
    inline def setNoteIdUndefined: Self = StObject.set(x, "noteId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaNote): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
