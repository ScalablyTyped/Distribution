package typings.hammerjs

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HammerDefaults
  extends StObject
     with HammerOptions {
  
  @JSName("cssProps")
  var cssProps_HammerDefaults: CssProps
  
  @JSName("domEvents")
  var domEvents_HammerDefaults: Boolean
  
  @JSName("enable")
  var enable_HammerDefaults: Boolean
  
  @JSName("inputClass")
  var inputClass_HammerDefaults: HammerInput
  
  @JSName("inputTarget")
  var inputTarget_HammerDefaults: EventTarget
  
  @JSName("preset")
  var preset_HammerDefaults: js.Array[RecognizerTuple]
  
  @JSName("touchAction")
  var touchAction_HammerDefaults: String
}
object HammerDefaults {
  
  inline def apply(
    cssProps: CssProps,
    domEvents: Boolean,
    enable: Boolean,
    inputClass: HammerInput,
    inputTarget: EventTarget,
    preset: js.Array[RecognizerTuple],
    touchAction: String
  ): HammerDefaults = {
    val __obj = js.Dynamic.literal(cssProps = cssProps.asInstanceOf[js.Any], domEvents = domEvents.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], inputClass = inputClass.asInstanceOf[js.Any], inputTarget = inputTarget.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any], touchAction = touchAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[HammerDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HammerDefaults] (val x: Self) extends AnyVal {
    
    inline def setCssProps(value: CssProps): Self = StObject.set(x, "cssProps", value.asInstanceOf[js.Any])
    
    inline def setDomEvents(value: Boolean): Self = StObject.set(x, "domEvents", value.asInstanceOf[js.Any])
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setInputClass(value: HammerInput): Self = StObject.set(x, "inputClass", value.asInstanceOf[js.Any])
    
    inline def setInputTarget(value: EventTarget): Self = StObject.set(x, "inputTarget", value.asInstanceOf[js.Any])
    
    inline def setPreset(value: js.Array[RecognizerTuple]): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetVarargs(value: RecognizerTuple*): Self = StObject.set(x, "preset", js.Array(value*))
    
    inline def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
  }
}
