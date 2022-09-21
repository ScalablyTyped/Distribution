package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsKnowledgebasesDocumentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the document to retrieve. Format `projects//locations//knowledgeBases//documents/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsKnowledgebasesDocumentsGet {
  
  inline def apply(): ParamsResourceProjectsKnowledgebasesDocumentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsKnowledgebasesDocumentsGet]
  }
  
  extension [Self <: ParamsResourceProjectsKnowledgebasesDocumentsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
