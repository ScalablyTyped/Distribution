package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKnowledgeBase extends StObject {
  
  /**
    * The KB name (generally of the form KB[0-9]+ (e.g., KB123456)).
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link to the KB in the [Windows update catalog] (https://www.catalog.update.microsoft.com/).
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaKnowledgeBase {
  
  inline def apply(): SchemaKnowledgeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKnowledgeBase]
  }
  
  extension [Self <: SchemaKnowledgeBase](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
