package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Carousel, 'prev'> */
trait PickCarouselprev extends StObject {
  
  var prev: js.UndefOr[js.Any] = js.undefined
}
object PickCarouselprev {
  
  inline def apply(): PickCarouselprev = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCarouselprev]
  }
  
  extension [Self <: PickCarouselprev](x: Self) {
    
    inline def setPrev(value: js.Any): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
  }
}
