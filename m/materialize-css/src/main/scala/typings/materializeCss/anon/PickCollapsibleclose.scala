package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Collapsible, 'close'> */
trait PickCollapsibleclose extends StObject {
  
  var close: js.UndefOr[js.Any] = js.undefined
}
object PickCollapsibleclose {
  
  @scala.inline
  def apply(): PickCollapsibleclose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCollapsibleclose]
  }
  
  @scala.inline
  implicit class PickCollapsiblecloseMutableBuilder[Self <: PickCollapsibleclose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: js.Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
  }
}
