package typings.jquery.anon

import typings.jquery.JQuery.HandleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleObj[TTarget, TData] extends StObject {
  
  var handleObj: HandleObject[TTarget, TData] = js.native
}
object HandleObj {
  
  @scala.inline
  def apply[TTarget, TData](handleObj: HandleObject[TTarget, TData]): HandleObj[TTarget, TData] = {
    val __obj = js.Dynamic.literal(handleObj = handleObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleObj[TTarget, TData]]
  }
  
  @scala.inline
  implicit class HandleObjMutableBuilder[Self <: HandleObj[_, _], TTarget, TData] (val x: Self with (HandleObj[TTarget, TData])) extends AnyVal {
    
    @scala.inline
    def setHandleObj(value: HandleObject[TTarget, TData]): Self = StObject.set(x, "handleObj", value.asInstanceOf[js.Any])
  }
}
