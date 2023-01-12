package typings.kakaomaps.kakao.maps.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Toolbox extends StObject {
  
  def getElement(): Any
}
object Toolbox {
  
  inline def apply(getElement: () => Any): Toolbox = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction0(getElement))
    __obj.asInstanceOf[Toolbox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Toolbox] (val x: Self) extends AnyVal {
    
    inline def setGetElement(value: () => Any): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
  }
}
