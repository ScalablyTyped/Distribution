package typings.mailchimpMailchimpMarketing.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberTagsBody extends StObject {
  
  var tags: js.Array[TagBody]
}
object MemberTagsBody {
  
  inline def apply(tags: js.Array[TagBody]): MemberTagsBody = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberTagsBody]
  }
  
  extension [Self <: MemberTagsBody](x: Self) {
    
    inline def setTags(value: js.Array[TagBody]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: TagBody*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
