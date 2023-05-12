package typings.mailchimpMailchimpMarketing.mod.lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagBody extends StObject {
  
  var name: String
  
  var status: ListStatusTag
}
object ListTagBody {
  
  inline def apply(name: String, status: ListStatusTag): ListTagBody = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagBody] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ListStatusTag): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
