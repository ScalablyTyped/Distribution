package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Carousel, 'set'> */
trait PickCarouselset extends StObject {
  
  var set: js.UndefOr[js.Any] = js.undefined
}
object PickCarouselset {
  
  @scala.inline
  def apply(): PickCarouselset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCarouselset]
  }
  
  @scala.inline
  implicit class PickCarouselsetMutableBuilder[Self <: PickCarouselset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSet(value: js.Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
