package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTagsResponse extends StObject {
  
  /**
    * All GTM Tags of a GTM Container.
    */
  var tags: js.UndefOr[js.Array[SchemaTag]] = js.undefined
}
object SchemaListTagsResponse {
  
  inline def apply(): SchemaListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTagsResponse]
  }
  
  extension [Self <: SchemaListTagsResponse](x: Self) {
    
    inline def setTags(value: js.Array[SchemaTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: SchemaTag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
