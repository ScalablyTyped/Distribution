package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkTags extends StObject {
  
  /** List of network tags. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object NetworkTags {
  
  inline def apply(): NetworkTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkTags]
  }
  
  extension [Self <: NetworkTags](x: Self) {
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
