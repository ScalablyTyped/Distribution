package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connections extends StObject {
  
  def detach(): Unit
  
  def each(e: js.Function1[/* c */ Connection, Unit]): Unit
  
  var length: Double
}
object Connections {
  
  @scala.inline
  def apply(detach: () => Unit, each: js.Function1[/* c */ Connection, Unit] => Unit, length: Double): Connections = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), each = js.Any.fromFunction1(each), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connections]
  }
  
  @scala.inline
  implicit class ConnectionsMutableBuilder[Self <: Connections] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEach(value: js.Function1[/* c */ Connection, Unit] => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
