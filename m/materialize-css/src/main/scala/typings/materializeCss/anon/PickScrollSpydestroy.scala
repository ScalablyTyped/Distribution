package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.ScrollSpy, 'destroy'> */
trait PickScrollSpydestroy extends StObject {
  
  var destroy: js.UndefOr[js.Any] = js.undefined
}
object PickScrollSpydestroy {
  
  inline def apply(): PickScrollSpydestroy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickScrollSpydestroy]
  }
  
  extension [Self <: PickScrollSpydestroy](x: Self) {
    
    inline def setDestroy(value: js.Any): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
  }
}
