package typings.lobibox.LobiboxModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyMethods extends StObject {
  
  var remove: js.UndefOr[js.Function0[Any]] = js.undefined
}
object NotifyMethods {
  
  inline def apply(): NotifyMethods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyMethods]
  }
  
  extension [Self <: NotifyMethods](x: Self) {
    
    inline def setRemove(value: () => Any): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
