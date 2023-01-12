package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.CharacterCounter, 'destroy'> */
trait PickCharacterCounterdestr extends StObject {
  
  def destroy(): Unit
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit]
}
object PickCharacterCounterdestr {
  
  inline def apply(destroy: () => Unit): PickCharacterCounterdestr = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[PickCharacterCounterdestr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickCharacterCounterdestr] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
