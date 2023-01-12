package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListsInstance extends StObject {
  
  def getSelectedThreadRowViews(): js.Array[ThreadRowView]
  
  def registerThreadRowViewHandler(handler: js.Function1[/* threadRowView */ ThreadRowView, Any]): js.Function0[Unit]
  
  def registerThreadRowViewSelectionHandler(handler: js.Function0[Any]): js.Function0[Unit]
}
object ListsInstance {
  
  inline def apply(
    getSelectedThreadRowViews: () => js.Array[ThreadRowView],
    registerThreadRowViewHandler: js.Function1[/* threadRowView */ ThreadRowView, Any] => js.Function0[Unit],
    registerThreadRowViewSelectionHandler: js.Function0[Any] => js.Function0[Unit]
  ): ListsInstance = {
    val __obj = js.Dynamic.literal(getSelectedThreadRowViews = js.Any.fromFunction0(getSelectedThreadRowViews), registerThreadRowViewHandler = js.Any.fromFunction1(registerThreadRowViewHandler), registerThreadRowViewSelectionHandler = js.Any.fromFunction1(registerThreadRowViewSelectionHandler))
    __obj.asInstanceOf[ListsInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListsInstance] (val x: Self) extends AnyVal {
    
    inline def setGetSelectedThreadRowViews(value: () => js.Array[ThreadRowView]): Self = StObject.set(x, "getSelectedThreadRowViews", js.Any.fromFunction0(value))
    
    inline def setRegisterThreadRowViewHandler(value: js.Function1[/* threadRowView */ ThreadRowView, Any] => js.Function0[Unit]): Self = StObject.set(x, "registerThreadRowViewHandler", js.Any.fromFunction1(value))
    
    inline def setRegisterThreadRowViewSelectionHandler(value: js.Function0[Any] => js.Function0[Unit]): Self = StObject.set(x, "registerThreadRowViewSelectionHandler", js.Any.fromFunction1(value))
  }
}
