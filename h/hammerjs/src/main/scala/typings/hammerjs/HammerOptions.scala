package typings.hammerjs

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HammerOptions extends js.Object {
  
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
  implicit class HammerOptionsOps[Self <: HammerOptions] (val x: Self) extends AnyVal {
    
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
    def deleteCssProps: Self = this.set("cssProps", js.undefined)
    
    @scala.inline
    def setDomEvents(value: Boolean): Self = this.set("domEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomEvents: Self = this.set("domEvents", js.undefined)
    
    @scala.inline
    def setEnableFunction1(value: /* manager */ HammerManager => Boolean): Self = this.set("enable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnable(value: Boolean | (js.Function1[/* manager */ HammerManager, Boolean])): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setInputClass(value: HammerInput): Self = this.set("inputClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputClass: Self = this.set("inputClass", js.undefined)
    
    @scala.inline
    def setInputTarget(value: EventTarget): Self = this.set("inputTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputTarget: Self = this.set("inputTarget", js.undefined)
    
    @scala.inline
    def setPresetVarargs(value: RecognizerTuple*): Self = this.set("preset", js.Array(value :_*))
    
    @scala.inline
    def setPreset(value: js.Array[RecognizerTuple]): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    
    @scala.inline
    def setRecognizersVarargs(value: RecognizerTuple*): Self = this.set("recognizers", js.Array(value :_*))
    
    @scala.inline
    def setRecognizers(value: js.Array[RecognizerTuple]): Self = this.set("recognizers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecognizers: Self = this.set("recognizers", js.undefined)
    
    @scala.inline
    def setTouchAction(value: String): Self = this.set("touchAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchAction: Self = this.set("touchAction", js.undefined)
  }
}
