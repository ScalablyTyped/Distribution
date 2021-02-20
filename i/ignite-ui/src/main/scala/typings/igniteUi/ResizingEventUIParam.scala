package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizingEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to igScroll.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ResizingEventUIParam {
  
  @scala.inline
  def apply(): ResizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizingEventUIParam]
  }
  
  @scala.inline
  implicit class ResizingEventUIParamMutableBuilder[Self <: ResizingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
