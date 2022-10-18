package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Collapsible, 'close'> */
trait PickCollapsibleclose extends StObject {
  
  def close(n: Double): Unit
  @JSName("close")
  var close_Original: js.Function1[/* n */ Double, Unit]
}
object PickCollapsibleclose {
  
  inline def apply(close: /* n */ Double => Unit): PickCollapsibleclose = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close))
    __obj.asInstanceOf[PickCollapsibleclose]
  }
  
  extension [Self <: PickCollapsibleclose](x: Self) {
    
    inline def setClose(value: /* n */ Double => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
  }
}
