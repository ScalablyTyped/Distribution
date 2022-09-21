package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKnowledgebasesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the knowledge base to retrieve. Format `projects//locations//knowledgeBases/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsKnowledgebasesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsKnowledgebasesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKnowledgebasesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKnowledgebasesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
