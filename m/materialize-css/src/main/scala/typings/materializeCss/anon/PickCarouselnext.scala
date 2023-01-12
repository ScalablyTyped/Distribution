package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Carousel, 'next'> */
trait PickCarouselnext extends StObject {
  
  def next(): Unit
  def next(n: Double): Unit
  @JSName("next")
  var next_Original: js.Function1[/* n */ js.UndefOr[Double], Unit]
}
object PickCarouselnext {
  
  inline def apply(next: /* n */ js.UndefOr[Double] => Unit): PickCarouselnext = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[PickCarouselnext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickCarouselnext] (val x: Self) extends AnyVal {
    
    inline def setNext(value: /* n */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
  }
}
