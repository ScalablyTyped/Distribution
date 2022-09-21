package typings.materializecssMaterialize.anon

import typings.materializecssMaterialize.M.Pushpin
import typings.materializecssMaterialize.materializecssMaterializeStrings.`pin-bottom`
import typings.materializecssMaterialize.materializecssMaterializeStrings.`pin-top`
import typings.materializecssMaterialize.materializecssMaterializeStrings.pinned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@materializecss/materialize.M.PushpinOptions> */
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
  
  extension [Self <: PartialPushpinOptions](x: Self) {
    
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
