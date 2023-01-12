package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.ParallaxOptions> */
trait PartialParallaxOptions extends StObject {
  
  var responsiveThreshold: js.UndefOr[Double] = js.undefined
}
object PartialParallaxOptions {
  
  inline def apply(): PartialParallaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialParallaxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialParallaxOptions] (val x: Self) extends AnyVal {
    
    inline def setResponsiveThreshold(value: Double): Self = StObject.set(x, "responsiveThreshold", value.asInstanceOf[js.Any])
    
    inline def setResponsiveThresholdUndefined: Self = StObject.set(x, "responsiveThreshold", js.undefined)
  }
}
