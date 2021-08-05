package typings.jpm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Combo extends StObject {
  
  var combo: String
  
  def onPress(): Unit
}
object Combo {
  
  inline def apply(combo: String, onPress: () => Unit): Combo = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[Combo]
  }
  
  extension [Self <: Combo](x: Self) {
    
    inline def setCombo(value: String): Self = StObject.set(x, "combo", value.asInstanceOf[js.Any])
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
  }
}
