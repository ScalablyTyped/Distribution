package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsKnowledgebasesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Force deletes the knowledge base. When set to true, any documents in the knowledge base are also deleted.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The name of the knowledge base to delete. Format: `projects//locations//knowledgeBases/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsKnowledgebasesDelete {
  
  inline def apply(): ParamsResourceProjectsKnowledgebasesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsKnowledgebasesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsKnowledgebasesDelete](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
