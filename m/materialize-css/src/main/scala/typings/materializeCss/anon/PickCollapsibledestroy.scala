package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Collapsible, 'destroy'> */
trait PickCollapsibledestroy extends StObject {
  
  var destroy: js.UndefOr[Any] = js.undefined
}
object PickCollapsibledestroy {
  
  inline def apply(): PickCollapsibledestroy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCollapsibledestroy]
  }
  
  extension [Self <: PickCollapsibledestroy](x: Self) {
    
    inline def setDestroy(value: Any): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
  }
}
