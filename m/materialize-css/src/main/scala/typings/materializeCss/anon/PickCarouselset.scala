package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Carousel, 'set'> */
trait PickCarouselset extends StObject {
  
  var set: js.UndefOr[Any] = js.undefined
}
object PickCarouselset {
  
  inline def apply(): PickCarouselset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCarouselset]
  }
  
  extension [Self <: PickCarouselset](x: Self) {
    
    inline def setSet(value: Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
