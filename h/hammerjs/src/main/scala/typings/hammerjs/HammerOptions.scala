package typings.hammerjs

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HammerOptions extends StObject {
  
  var cssProps: js.UndefOr[CssProps] = js.native
  
  var domEvents: js.UndefOr[Boolean] = js.native
  
  var enable: js.UndefOr[Boolean | (js.Function1[/* manager */ HammerManager, Boolean])] = js.native
  
  var inputClass: js.UndefOr[HammerInput] = js.native
  
  var inputTarget: js.UndefOr[EventTarget] = js.native
  
  var preset: js.UndefOr[js.Array[RecognizerTuple]] = js.native
  
  var recognizers: js.UndefOr[js.Array[RecognizerTuple]] = js.native
  
  var touchAction: js.UndefOr[String] = js.native
}
object HammerOptions {
  
  @scala.inline
  def apply(): HammerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HammerOptions]
  }
  
  @scala.inline
  implicit class HammerOptionsMutableBuilder[Self <: HammerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssProps(value: CssProps): Self = StObject.set(x, "cssProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssPropsUndefined: Self = StObject.set(x, "cssProps", js.undefined)
    
    @scala.inline
    def setDomEvents(value: Boolean): Self = StObject.set(x, "domEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomEventsUndefined: Self = StObject.set(x, "domEvents", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean | (js.Function1[/* manager */ HammerManager, Boolean])): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableFunction1(value: /* manager */ HammerManager => Boolean): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setInputClass(value: HammerInput): Self = StObject.set(x, "inputClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputClassUndefined: Self = StObject.set(x, "inputClass", js.undefined)
    
    @scala.inline
    def setInputTarget(value: EventTarget): Self = StObject.set(x, "inputTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTargetUndefined: Self = StObject.set(x, "inputTarget", js.undefined)
    
    @scala.inline
    def setPreset(value: js.Array[RecognizerTuple]): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    @scala.inline
    def setPresetVarargs(value: RecognizerTuple*): Self = StObject.set(x, "preset", js.Array(value :_*))
    
    @scala.inline
    def setRecognizers(value: js.Array[RecognizerTuple]): Self = StObject.set(x, "recognizers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecognizersUndefined: Self = StObject.set(x, "recognizers", js.undefined)
    
    @scala.inline
    def setRecognizersVarargs(value: RecognizerTuple*): Self = StObject.set(x, "recognizers", js.Array(value :_*))
    
    @scala.inline
    def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
  }
}
