package typings.lesgo.anon

import typings.lesgo.servicesLoggerServiceMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCreatedAt extends StObject {
  
  var getCreatedAt: js.UndefOr[Boolean] = js.undefined
  
  var meta: js.UndefOr[Tags] = js.undefined
  
  var tags: js.Array[Tag]
}
object GetCreatedAt {
  
  inline def apply(tags: js.Array[Tag]): GetCreatedAt = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCreatedAt]
  }
  
  extension [Self <: GetCreatedAt](x: Self) {
    
    inline def setGetCreatedAt(value: Boolean): Self = StObject.set(x, "getCreatedAt", value.asInstanceOf[js.Any])
    
    inline def setGetCreatedAtUndefined: Self = StObject.set(x, "getCreatedAt", js.undefined)
    
    inline def setMeta(value: Tags): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
