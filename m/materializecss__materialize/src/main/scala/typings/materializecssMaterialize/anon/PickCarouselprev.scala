package typings.materializecssMaterialize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Carousel, 'prev'> */
trait PickCarouselprev extends StObject {
  
  def prev(): Unit
  def prev(n: Double): Unit
  @JSName("prev")
  var prev_Original: js.Function1[/* n */ js.UndefOr[Double], Unit]
}
object PickCarouselprev {
  
  inline def apply(prev: /* n */ js.UndefOr[Double] => Unit): PickCarouselprev = {
    val __obj = js.Dynamic.literal(prev = js.Any.fromFunction1(prev))
    __obj.asInstanceOf[PickCarouselprev]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickCarouselprev] (val x: Self) extends AnyVal {
    
    inline def setPrev(value: /* n */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "prev", js.Any.fromFunction1(value))
  }
}
