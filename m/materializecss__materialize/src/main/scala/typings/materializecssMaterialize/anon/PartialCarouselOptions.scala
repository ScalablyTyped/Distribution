package typings.materializecssMaterialize.anon

import typings.materializecssMaterialize.M.Carousel
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@materializecss/materialize.M.CarouselOptions> */
trait PartialCarouselOptions extends StObject {
  
  var dist: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  var indicators: js.UndefOr[Boolean] = js.undefined
  
  var noWrap: js.UndefOr[Boolean] = js.undefined
  
  var numVisible: js.UndefOr[Double] = js.undefined
  
  var onCycleTo: js.UndefOr[
    js.ThisFunction2[/* this */ Carousel, /* current */ Element, /* dragged */ Boolean, Unit]
  ] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var shift: js.UndefOr[Double] = js.undefined
}
object PartialCarouselOptions {
  
  inline def apply(): PartialCarouselOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCarouselOptions]
  }
  
  extension [Self <: PartialCarouselOptions](x: Self) {
    
    inline def setDist(value: Double): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
    
    inline def setDistUndefined: Self = StObject.set(x, "dist", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setIndicators(value: Boolean): Self = StObject.set(x, "indicators", value.asInstanceOf[js.Any])
    
    inline def setIndicatorsUndefined: Self = StObject.set(x, "indicators", js.undefined)
    
    inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    
    inline def setNumVisible(value: Double): Self = StObject.set(x, "numVisible", value.asInstanceOf[js.Any])
    
    inline def setNumVisibleUndefined: Self = StObject.set(x, "numVisible", js.undefined)
    
    inline def setOnCycleTo(value: js.ThisFunction2[/* this */ Carousel, /* current */ Element, /* dragged */ Boolean, Unit]): Self = StObject.set(x, "onCycleTo", value.asInstanceOf[js.Any])
    
    inline def setOnCycleToUndefined: Self = StObject.set(x, "onCycleTo", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setShift(value: Double): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
  }
}
