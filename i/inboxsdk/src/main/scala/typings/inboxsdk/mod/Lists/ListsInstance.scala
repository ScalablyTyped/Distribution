package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListsInstance extends StObject {
  
  def getSelectedThreadRowViews(): js.Array[ThreadRowView] = js.native
  
  def registerThreadRowViewHandler(handler: js.Function1[/* threadRowView */ ThreadRowView, _]): js.Function0[Unit] = js.native
  
  def registerThreadRowViewSelectionHandler(handler: js.Function0[_]): js.Function0[Unit] = js.native
}
object ListsInstance {
  
  @scala.inline
  def apply(
    getSelectedThreadRowViews: () => js.Array[ThreadRowView],
    registerThreadRowViewHandler: js.Function1[/* threadRowView */ ThreadRowView, _] => js.Function0[Unit],
    registerThreadRowViewSelectionHandler: js.Function0[_] => js.Function0[Unit]
  ): ListsInstance = {
    val __obj = js.Dynamic.literal(getSelectedThreadRowViews = js.Any.fromFunction0(getSelectedThreadRowViews), registerThreadRowViewHandler = js.Any.fromFunction1(registerThreadRowViewHandler), registerThreadRowViewSelectionHandler = js.Any.fromFunction1(registerThreadRowViewSelectionHandler))
    __obj.asInstanceOf[ListsInstance]
  }
  
  @scala.inline
  implicit class ListsInstanceMutableBuilder[Self <: ListsInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSelectedThreadRowViews(value: () => js.Array[ThreadRowView]): Self = StObject.set(x, "getSelectedThreadRowViews", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterThreadRowViewHandler(value: js.Function1[/* threadRowView */ ThreadRowView, _] => js.Function0[Unit]): Self = StObject.set(x, "registerThreadRowViewHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterThreadRowViewSelectionHandler(value: js.Function0[_] => js.Function0[Unit]): Self = StObject.set(x, "registerThreadRowViewSelectionHandler", js.Any.fromFunction1(value))
  }
}
