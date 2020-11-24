package typings.hammerjs

import typings.std.EventTarget
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
  implicit class HammerDefaultsOps[Self <: HammerDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCssProps(value: CssProps): Self = this.set("cssProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomEvents(value: Boolean): Self = this.set("domEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputClass(value: HammerInput): Self = this.set("inputClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTarget(value: EventTarget): Self = this.set("inputTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetVarargs(value: RecognizerTuple*): Self = this.set("preset", js.Array(value :_*))
    
    @scala.inline
    def setPreset(value: js.Array[RecognizerTuple]): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchAction(value: String): Self = this.set("touchAction", value.asInstanceOf[js.Any])
  }
}
