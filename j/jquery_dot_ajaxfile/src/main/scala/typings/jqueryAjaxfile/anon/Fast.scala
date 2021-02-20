package typings.jqueryAjaxfile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fast extends StObject {
  
  var fast: Double = js.native
  
  var slow: Double = js.native
}
object Fast {
  
  @scala.inline
  def apply(fast: Double, slow: Double): Fast = {
    val __obj = js.Dynamic.literal(fast = fast.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fast]
  }
  
  @scala.inline
  implicit class FastMutableBuilder[Self <: Fast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFast(value: Double): Self = StObject.set(x, "fast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlow(value: Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
  }
}
