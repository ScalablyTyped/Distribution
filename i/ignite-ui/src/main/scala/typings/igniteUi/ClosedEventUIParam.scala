package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClosedEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to menu widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ClosedEventUIParam {
  
  @scala.inline
  def apply(): ClosedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosedEventUIParam]
  }
  
  @scala.inline
  implicit class ClosedEventUIParamMutableBuilder[Self <: ClosedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
