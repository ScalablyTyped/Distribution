package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event Tag List Response
  */
trait SchemaEventTagsListResponse extends StObject {
  
  /**
    * Event tag collection.
    */
  var eventTags: js.UndefOr[js.Array[SchemaEventTag]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#eventTagsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaEventTagsListResponse {
  
  inline def apply(): SchemaEventTagsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventTagsListResponse]
  }
  
  extension [Self <: SchemaEventTagsListResponse](x: Self) {
    
    inline def setEventTags(value: js.Array[SchemaEventTag]): Self = StObject.set(x, "eventTags", value.asInstanceOf[js.Any])
    
    inline def setEventTagsUndefined: Self = StObject.set(x, "eventTags", js.undefined)
    
    inline def setEventTagsVarargs(value: SchemaEventTag*): Self = StObject.set(x, "eventTags", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
