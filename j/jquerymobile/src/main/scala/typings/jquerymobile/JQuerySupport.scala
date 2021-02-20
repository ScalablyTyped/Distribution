package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuerySupport extends StObject {
  
  var touchOverflow: js.Any = js.native
}
object JQuerySupport {
  
  @scala.inline
  def apply(touchOverflow: js.Any): JQuerySupport = {
    val __obj = js.Dynamic.literal(touchOverflow = touchOverflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySupport]
  }
  
  @scala.inline
  implicit class JQuerySupportMutableBuilder[Self <: JQuerySupport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTouchOverflow(value: js.Any): Self = StObject.set(x, "touchOverflow", value.asInstanceOf[js.Any])
  }
}
