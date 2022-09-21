package typings.materializecssMaterialize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Carousel, 'prev'> */
trait PickCarouselprev extends StObject {
  
  var prev: js.UndefOr[Any] = js.undefined
}
object PickCarouselprev {
  
  inline def apply(): PickCarouselprev = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCarouselprev]
  }
  
  extension [Self <: PickCarouselprev](x: Self) {
    
    inline def setPrev(value: Any): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
  }
}
