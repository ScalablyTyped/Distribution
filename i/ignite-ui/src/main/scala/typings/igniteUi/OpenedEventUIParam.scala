package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenedEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to menu widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object OpenedEventUIParam {
  
  @scala.inline
  def apply(): OpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenedEventUIParam]
  }
  
  @scala.inline
  implicit class OpenedEventUIParamMutableBuilder[Self <: OpenedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
