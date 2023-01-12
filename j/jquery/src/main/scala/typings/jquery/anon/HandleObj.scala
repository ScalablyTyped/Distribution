package typings.jquery.anon

import typings.jquery.JQuery.HandleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleObj[TTarget, TData] extends StObject {
  
  var handleObj: HandleObject[TTarget, TData]
}
object HandleObj {
  
  inline def apply[TTarget, TData](handleObj: HandleObject[TTarget, TData]): HandleObj[TTarget, TData] = {
    val __obj = js.Dynamic.literal(handleObj = handleObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleObj[TTarget, TData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HandleObj[?, ?], TTarget, TData] (val x: Self & (HandleObj[TTarget, TData])) extends AnyVal {
    
    inline def setHandleObj(value: HandleObject[TTarget, TData]): Self = StObject.set(x, "handleObj", value.asInstanceOf[js.Any])
  }
}
