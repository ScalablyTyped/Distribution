package typings.hammerjs

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HammerDefaults extends HammerOptions {
  
  @JSName("cssProps")
  var cssProps_HammerDefaults: CssProps = js.native
  
  @JSName("domEvents")
  var domEvents_HammerDefaults: Boolean = js.native
  
  @JSName("enable")
  var enable_HammerDefaults: Boolean = js.native
  
  @JSName("inputClass")
  var inputClass_HammerDefaults: HammerInput = js.native
  
  @JSName("inputTarget")
  var inputTarget_HammerDefaults: EventTarget = js.native
  
  @JSName("preset")
  var preset_HammerDefaults: js.Array[RecognizerTuple] = js.native
  
  @JSName("touchAction")
  var touchAction_HammerDefaults: String = js.native
}
object HammerDefaults {
  
  @scala.inline
  def apply(
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
  implicit class HammerDefaultsMutableBuilder[Self <: HammerDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssProps(value: CssProps): Self = StObject.set(x, "cssProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomEvents(value: Boolean): Self = StObject.set(x, "domEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputClass(value: HammerInput): Self = StObject.set(x, "inputClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTarget(value: EventTarget): Self = StObject.set(x, "inputTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreset(value: js.Array[RecognizerTuple]): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetVarargs(value: RecognizerTuple*): Self = StObject.set(x, "preset", js.Array(value :_*))
    
    @scala.inline
    def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
  }
}
