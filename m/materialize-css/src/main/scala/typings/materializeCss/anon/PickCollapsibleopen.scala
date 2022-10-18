package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Collapsible, 'open'> */
trait PickCollapsibleopen extends StObject {
  
  def open(n: Double): Unit
  @JSName("open")
  var open_Original: js.Function1[/* n */ Double, Unit]
}
object PickCollapsibleopen {
  
  inline def apply(open: /* n */ Double => Unit): PickCollapsibleopen = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[PickCollapsibleopen]
  }
  
  extension [Self <: PickCollapsibleopen](x: Self) {
    
    inline def setOpen(value: /* n */ Double => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
  }
}
