package typings.mailchimpMailchimpMarketing.mod.lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberTagsBody extends StObject {
  
  var tags: js.Array[ListTagBody]
}
object MemberTagsBody {
  
  inline def apply(tags: js.Array[ListTagBody]): MemberTagsBody = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberTagsBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberTagsBody] (val x: Self) extends AnyVal {
    
    inline def setTags(value: js.Array[ListTagBody]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: ListTagBody*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
