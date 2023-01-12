package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeVar extends StObject {
  
  /** The global merge variable's content. */
  var content: String
  
  /** The global merge variable's name. Merge variable names are case-insensitive and may not start with `_`. */
  var name: String
}
object MergeVar {
  
  inline def apply(content: String, name: String): MergeVar = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeVar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MergeVar] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
