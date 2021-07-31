package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Pushpin, 'destroy'> */
trait PickPushpindestroy extends StObject {
  
  var destroy: js.UndefOr[js.Any] = js.undefined
}
object PickPushpindestroy {
  
  @scala.inline
  def apply(): PickPushpindestroy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPushpindestroy]
  }
  
  @scala.inline
  implicit class PickPushpindestroyMutableBuilder[Self <: PickPushpindestroy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: js.Any): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
  }
}
