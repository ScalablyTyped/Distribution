package typings.materializecssMaterialize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Carousel, 'set'> */
trait PickCarouselset extends StObject {
  
  def set(): Unit
  def set(n: Double): Unit
  @JSName("set")
  var set_Original: js.Function1[/* n */ js.UndefOr[Double], Unit]
}
object PickCarouselset {
  
  inline def apply(set: /* n */ js.UndefOr[Double] => Unit): PickCarouselset = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[PickCarouselset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickCarouselset] (val x: Self) extends AnyVal {
    
    inline def setSet(value: /* n */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
