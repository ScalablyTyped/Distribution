package typings.maplibreGl.anon

import typings.maplibreGl.mod.Cancelable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberCancelable extends StObject {
  
  var number: Cancelable
}
object NumberCancelable {
  
  inline def apply(number: Cancelable): NumberCancelable = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberCancelable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberCancelable] (val x: Self) extends AnyVal {
    
    inline def setNumber(value: Cancelable): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
