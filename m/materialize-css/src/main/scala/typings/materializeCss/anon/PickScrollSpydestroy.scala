package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.ScrollSpy, 'destroy'> */
@js.native
trait PickScrollSpydestroy extends StObject {
  
  var destroy: js.UndefOr[js.Any] = js.native
}
object PickScrollSpydestroy {
  
  @scala.inline
  def apply(): PickScrollSpydestroy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickScrollSpydestroy]
  }
  
  @scala.inline
  implicit class PickScrollSpydestroyMutableBuilder[Self <: PickScrollSpydestroy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: js.Any): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
  }
}
