package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Pushpin, 'destroy'> */
trait PickPushpindestroy extends StObject {
  
  var destroy: js.UndefOr[Any] = js.undefined
}
object PickPushpindestroy {
  
  inline def apply(): PickPushpindestroy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPushpindestroy]
  }
  
  extension [Self <: PickPushpindestroy](x: Self) {
    
    inline def setDestroy(value: Any): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
  }
}
