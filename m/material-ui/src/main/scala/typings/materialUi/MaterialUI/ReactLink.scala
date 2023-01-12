package typings.materialUi.MaterialUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ReactLink is from "react/addons"
trait ReactLink[T] extends StObject {
  
  def requestChange(newValue: T): Unit
  
  var value: T
}
object ReactLink {
  
  inline def apply[T](requestChange: T => Unit, value: T): ReactLink[T] = {
    val __obj = js.Dynamic.literal(requestChange = js.Any.fromFunction1(requestChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactLink[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReactLink[?], T] (val x: Self & ReactLink[T]) extends AnyVal {
    
    inline def setRequestChange(value: T => Unit): Self = StObject.set(x, "requestChange", js.Any.fromFunction1(value))
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
