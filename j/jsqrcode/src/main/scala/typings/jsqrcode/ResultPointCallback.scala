package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultPointCallback extends StObject {
  
  def foundPossibleResultPoint(point: FinderPattern): Unit
}
object ResultPointCallback {
  
  @scala.inline
  def apply(foundPossibleResultPoint: FinderPattern => Unit): ResultPointCallback = {
    val __obj = js.Dynamic.literal(foundPossibleResultPoint = js.Any.fromFunction1(foundPossibleResultPoint))
    __obj.asInstanceOf[ResultPointCallback]
  }
  
  @scala.inline
  implicit class ResultPointCallbackMutableBuilder[Self <: ResultPointCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFoundPossibleResultPoint(value: FinderPattern => Unit): Self = StObject.set(x, "foundPossibleResultPoint", js.Any.fromFunction1(value))
  }
}
