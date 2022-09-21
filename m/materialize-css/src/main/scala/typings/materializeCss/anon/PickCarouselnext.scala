package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Carousel, 'next'> */
trait PickCarouselnext extends StObject {
  
  var next: js.UndefOr[Any] = js.undefined
}
object PickCarouselnext {
  
  inline def apply(): PickCarouselnext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCarouselnext]
  }
  
  extension [Self <: PickCarouselnext](x: Self) {
    
    inline def setNext(value: Any): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
