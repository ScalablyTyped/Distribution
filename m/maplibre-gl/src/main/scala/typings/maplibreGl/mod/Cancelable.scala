package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancelable extends StObject {
  
  def cancel(): scala.Unit
}
object Cancelable {
  
  inline def apply(cancel: () => scala.Unit): Cancelable = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[Cancelable]
  }
  
  extension [Self <: Cancelable](x: Self) {
    
    inline def setCancel(value: () => scala.Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
