package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.FormSelect, 'getSelectedValues' | 'destroy'> */
trait PickFormSelectgetSelected extends StObject {
  
  def destroy(): Unit
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit]
  
  def getSelectedValues(): js.Array[String]
  @JSName("getSelectedValues")
  var getSelectedValues_Original: js.Function0[js.Array[String]]
}
object PickFormSelectgetSelected {
  
  inline def apply(destroy: () => Unit, getSelectedValues: () => js.Array[String]): PickFormSelectgetSelected = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getSelectedValues = js.Any.fromFunction0(getSelectedValues))
    __obj.asInstanceOf[PickFormSelectgetSelected]
  }
  
  extension [Self <: PickFormSelectgetSelected](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGetSelectedValues(value: () => js.Array[String]): Self = StObject.set(x, "getSelectedValues", js.Any.fromFunction0(value))
  }
}
