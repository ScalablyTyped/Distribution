package typings.mailchimpMailchimpMarketing.mod.lists

import typings.mailchimpMailchimpMarketing.mod.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddListMemberBody
  extends StObject
     with Body {
  
  var email_address: String
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object AddListMemberBody {
  
  inline def apply(email_address: String): AddListMemberBody = {
    val __obj = js.Dynamic.literal(email_address = email_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddListMemberBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddListMemberBody] (val x: Self) extends AnyVal {
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
