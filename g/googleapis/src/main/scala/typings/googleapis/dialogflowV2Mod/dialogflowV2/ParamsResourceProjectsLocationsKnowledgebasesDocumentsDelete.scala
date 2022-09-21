package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKnowledgebasesDocumentsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the document to delete. Format: `projects//locations//knowledgeBases//documents/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsKnowledgebasesDocumentsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsKnowledgebasesDocumentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKnowledgebasesDocumentsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKnowledgebasesDocumentsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
