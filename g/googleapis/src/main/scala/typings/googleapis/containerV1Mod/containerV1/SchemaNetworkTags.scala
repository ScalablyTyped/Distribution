package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkTags extends StObject {
  
  /**
    * List of network tags.
    */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaNetworkTags {
  
  inline def apply(): SchemaNetworkTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkTags]
  }
  
  extension [Self <: SchemaNetworkTags](x: Self) {
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
