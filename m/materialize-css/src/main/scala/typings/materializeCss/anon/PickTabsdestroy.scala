package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Tabs, 'destroy'> */
trait PickTabsdestroy extends StObject {
  
  var destroy: js.UndefOr[js.Any] = js.undefined
}
object PickTabsdestroy {
  
  @scala.inline
  def apply(): PickTabsdestroy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTabsdestroy]
  }
  
  @scala.inline
  implicit class PickTabsdestroyMutableBuilder[Self <: PickTabsdestroy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: js.Any): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
  }
}
