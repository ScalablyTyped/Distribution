package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventTagsListResponse extends StObject {
  
  /**
    * Event tag collection.
    */
  var eventTags: js.UndefOr[js.Array[SchemaEventTag]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#eventTagsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaEventTagsListResponse {
  
  inline def apply(): SchemaEventTagsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventTagsListResponse]
  }
  
  extension [Self <: SchemaEventTagsListResponse](x: Self) {
    
    inline def setEventTags(value: js.Array[SchemaEventTag]): Self = StObject.set(x, "eventTags", value.asInstanceOf[js.Any])
    
    inline def setEventTagsUndefined: Self = StObject.set(x, "eventTags", js.undefined)
    
    inline def setEventTagsVarargs(value: SchemaEventTag*): Self = StObject.set(x, "eventTags", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
