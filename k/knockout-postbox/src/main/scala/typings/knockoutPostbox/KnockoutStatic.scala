package typings.knockoutPostbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutStatic extends StObject {
  
  var postbox: KnockoutPostBox = js.native
}
object KnockoutStatic {
  
  @scala.inline
  def apply(postbox: KnockoutPostBox): KnockoutStatic = {
    val __obj = js.Dynamic.literal(postbox = postbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  @scala.inline
  implicit class KnockoutStaticMutableBuilder[Self <: KnockoutStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostbox(value: KnockoutPostBox): Self = StObject.set(x, "postbox", value.asInstanceOf[js.Any])
  }
}
