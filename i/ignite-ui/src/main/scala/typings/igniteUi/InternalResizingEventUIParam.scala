package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalResizingEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the layout manager performing resizing.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object InternalResizingEventUIParam {
  
  @scala.inline
  def apply(): InternalResizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalResizingEventUIParam]
  }
  
  @scala.inline
  implicit class InternalResizingEventUIParamMutableBuilder[Self <: InternalResizingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
