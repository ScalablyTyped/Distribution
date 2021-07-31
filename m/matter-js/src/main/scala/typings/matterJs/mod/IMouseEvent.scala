package typings.matterJs.mod

import typings.matterJs.matterJsStrings.mousedown
import typings.matterJs.matterJsStrings.mousemove
import typings.matterJs.matterJsStrings.mouseup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseEvent[T]
  extends StObject
     with IEvent[T] {
  
  @JSName("name")
  var name_IMouseEvent: mousedown | mousemove | mouseup
}
object IMouseEvent {
  
  @scala.inline
  def apply[T](name: mousedown | mousemove | mouseup, source: T): IMouseEvent[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEvent[T]]
  }
  
  @scala.inline
  implicit class IMouseEventMutableBuilder[Self <: IMouseEvent[?], T] (val x: Self & IMouseEvent[T]) extends AnyVal {
    
    @scala.inline
    def setName(value: mousedown | mousemove | mouseup): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
