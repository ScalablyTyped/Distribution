package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowDragStartedEventUIParam extends StObject {
  
  /**
    * Gets reference to the igZoombar.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object WindowDragStartedEventUIParam {
  
  @scala.inline
  def apply(): WindowDragStartedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowDragStartedEventUIParam]
  }
  
  @scala.inline
  implicit class WindowDragStartedEventUIParamMutableBuilder[Self <: WindowDragStartedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
