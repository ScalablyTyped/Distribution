package typings.materializeCss.anon

import typings.materializeCss.M.Pushpin
import typings.materializeCss.materializeCssStrings.`pin-bottom`
import typings.materializeCss.materializeCssStrings.`pin-top`
import typings.materializeCss.materializeCssStrings.pinned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.PushpinOptions> */
trait PartialPushpinOptions extends StObject {
  
  var bottom: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var onPositionChange: js.UndefOr[
    js.ThisFunction1[/* this */ Pushpin, /* position */ pinned | `pin-top` | `pin-bottom`, Unit]
  ] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
}
object PartialPushpinOptions {
  
  inline def apply(): PartialPushpinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPushpinOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPushpinOptions] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOnPositionChange(
      value: js.ThisFunction1[/* this */ Pushpin, /* position */ pinned | `pin-top` | `pin-bottom`, Unit]
    ): Self = StObject.set(x, "onPositionChange", value.asInstanceOf[js.Any])
    
    inline def setOnPositionChangeUndefined: Self = StObject.set(x, "onPositionChange", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
