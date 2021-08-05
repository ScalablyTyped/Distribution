package typings.hammerjs

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HammerOptions extends StObject {
  
  var cssProps: js.UndefOr[CssProps] = js.undefined
  
  var domEvents: js.UndefOr[Boolean] = js.undefined
  
  var enable: js.UndefOr[Boolean | (js.Function1[/* manager */ HammerManager, Boolean])] = js.undefined
  
  var inputClass: js.UndefOr[HammerInput] = js.undefined
  
  var inputTarget: js.UndefOr[EventTarget] = js.undefined
  
  var preset: js.UndefOr[js.Array[RecognizerTuple]] = js.undefined
  
  var recognizers: js.UndefOr[js.Array[RecognizerTuple]] = js.undefined
  
  var touchAction: js.UndefOr[String] = js.undefined
}
object HammerOptions {
  
  inline def apply(): HammerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HammerOptions]
  }
  
  extension [Self <: HammerOptions](x: Self) {
    
    inline def setCssProps(value: CssProps): Self = StObject.set(x, "cssProps", value.asInstanceOf[js.Any])
    
    inline def setCssPropsUndefined: Self = StObject.set(x, "cssProps", js.undefined)
    
    inline def setDomEvents(value: Boolean): Self = StObject.set(x, "domEvents", value.asInstanceOf[js.Any])
    
    inline def setDomEventsUndefined: Self = StObject.set(x, "domEvents", js.undefined)
    
    inline def setEnable(value: Boolean | (js.Function1[/* manager */ HammerManager, Boolean])): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableFunction1(value: /* manager */ HammerManager => Boolean): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setInputClass(value: HammerInput): Self = StObject.set(x, "inputClass", value.asInstanceOf[js.Any])
    
    inline def setInputClassUndefined: Self = StObject.set(x, "inputClass", js.undefined)
    
    inline def setInputTarget(value: EventTarget): Self = StObject.set(x, "inputTarget", value.asInstanceOf[js.Any])
    
    inline def setInputTargetUndefined: Self = StObject.set(x, "inputTarget", js.undefined)
    
    inline def setPreset(value: js.Array[RecognizerTuple]): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    inline def setPresetVarargs(value: RecognizerTuple*): Self = StObject.set(x, "preset", js.Array(value :_*))
    
    inline def setRecognizers(value: js.Array[RecognizerTuple]): Self = StObject.set(x, "recognizers", value.asInstanceOf[js.Any])
    
    inline def setRecognizersUndefined: Self = StObject.set(x, "recognizers", js.undefined)
    
    inline def setRecognizersVarargs(value: RecognizerTuple*): Self = StObject.set(x, "recognizers", js.Array(value :_*))
    
    inline def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
    
    inline def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
  }
}
