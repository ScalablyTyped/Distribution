package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Collapsible, 'open'> */
trait PickCollapsibleopen extends StObject {
  
  var open: js.UndefOr[js.Any] = js.undefined
}
object PickCollapsibleopen {
  
  inline def apply(): PickCollapsibleopen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCollapsibleopen]
  }
  
  extension [Self <: PickCollapsibleopen](x: Self) {
    
    inline def setOpen(value: js.Any): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
