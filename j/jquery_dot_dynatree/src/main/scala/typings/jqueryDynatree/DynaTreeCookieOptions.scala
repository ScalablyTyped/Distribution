package typings.jqueryDynatree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynaTreeCookieOptions extends StObject {
  
  var expires: js.Any = js.native
}
object DynaTreeCookieOptions {
  
  @scala.inline
  def apply(expires: js.Any): DynaTreeCookieOptions = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynaTreeCookieOptions]
  }
  
  @scala.inline
  implicit class DynaTreeCookieOptionsMutableBuilder[Self <: DynaTreeCookieOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpires(value: js.Any): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
  }
}
