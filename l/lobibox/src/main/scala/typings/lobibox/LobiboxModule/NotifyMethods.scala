package typings.lobibox.LobiboxModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyMethods extends StObject {
  
  var remove: js.UndefOr[js.Function0[js.Any]] = js.undefined
}
object NotifyMethods {
  
  @scala.inline
  def apply(): NotifyMethods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyMethods]
  }
  
  @scala.inline
  implicit class NotifyMethodsMutableBuilder[Self <: NotifyMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemove(value: () => js.Any): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
