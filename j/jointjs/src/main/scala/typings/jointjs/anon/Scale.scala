package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale extends StObject {
  
  def scale(d: Double): Double
  
  var symbol: String
}
object Scale {
  
  @scala.inline
  def apply(scale: Double => Double, symbol: String): Scale = {
    val __obj = js.Dynamic.literal(scale = js.Any.fromFunction1(scale), symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  implicit class ScaleMutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: Double => Double): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
