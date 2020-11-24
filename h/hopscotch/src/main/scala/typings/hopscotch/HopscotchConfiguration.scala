package typings.hopscotch

import typings.hopscotch.anon.CloseTooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HopscotchConfiguration extends js.Object {
  
  var arrowWidth: js.UndefOr[Double] = js.native
  
  var bubbleWidth: js.UndefOr[Double] = js.native
  
  var buddleHeight: js.UndefOr[Double] = js.native
  
  var i18n: js.UndefOr[CloseTooltip] = js.native
  
  var nextOnTargetClick: js.UndefOr[Boolean] = js.native
  
  var onClose: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  
  var onEnd: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  
  var onError: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  
  var onNext: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  
  var onPrev: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  
  var onShow: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  
  var onStart: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  
  var scrollDuration: js.UndefOr[Double] = js.native
  
  var scrollTopMargin: js.UndefOr[Double] = js.native
  
  var showCloseButton: js.UndefOr[Boolean] = js.native
  
  var showNextButton: js.UndefOr[Boolean] = js.native
  
  var showPrevButton: js.UndefOr[Boolean] = js.native
  
  var skipIfNoElement: js.UndefOr[Boolean] = js.native
  
  var smoothScroll: js.UndefOr[Boolean] = js.native
}
object HopscotchConfiguration {
  
  @scala.inline
  def apply(): HopscotchConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HopscotchConfiguration]
  }
  
  @scala.inline
  implicit class HopscotchConfigurationOps[Self <: HopscotchConfiguration] (val x: Self) extends AnyVal {
    
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
    def setArrowWidth(value: Double): Self = this.set("arrowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowWidth: Self = this.set("arrowWidth", js.undefined)
    
    @scala.inline
    def setBubbleWidth(value: Double): Self = this.set("bubbleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleWidth: Self = this.set("bubbleWidth", js.undefined)
    
    @scala.inline
    def setBuddleHeight(value: Double): Self = this.set("buddleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuddleHeight: Self = this.set("buddleHeight", js.undefined)
    
    @scala.inline
    def setI18n(value: CloseTooltip): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    
    @scala.inline
    def setNextOnTargetClick(value: Boolean): Self = this.set("nextOnTargetClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextOnTargetClick: Self = this.set("nextOnTargetClick", js.undefined)
    
    @scala.inline
    def setOnCloseVarargs(value: String*): Self = this.set("onClose", js.Array(value :_*))
    
    @scala.inline
    def setOnCloseFunction0(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClose(value: CallbackNameNamesOrDefinition): Self = this.set("onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnEndVarargs(value: String*): Self = this.set("onEnd", js.Array(value :_*))
    
    @scala.inline
    def setOnEndFunction0(value: () => Unit): Self = this.set("onEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEnd(value: CallbackNameNamesOrDefinition): Self = this.set("onEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    
    @scala.inline
    def setOnErrorVarargs(value: String*): Self = this.set("onError", js.Array(value :_*))
    
    @scala.inline
    def setOnErrorFunction0(value: () => Unit): Self = this.set("onError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnError(value: CallbackNameNamesOrDefinition): Self = this.set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnNextVarargs(value: String*): Self = this.set("onNext", js.Array(value :_*))
    
    @scala.inline
    def setOnNextFunction0(value: () => Unit): Self = this.set("onNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnNext(value: CallbackNameNamesOrDefinition): Self = this.set("onNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnNext: Self = this.set("onNext", js.undefined)
    
    @scala.inline
    def setOnPrevVarargs(value: String*): Self = this.set("onPrev", js.Array(value :_*))
    
    @scala.inline
    def setOnPrevFunction0(value: () => Unit): Self = this.set("onPrev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPrev(value: CallbackNameNamesOrDefinition): Self = this.set("onPrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPrev: Self = this.set("onPrev", js.undefined)
    
    @scala.inline
    def setOnShowVarargs(value: String*): Self = this.set("onShow", js.Array(value :_*))
    
    @scala.inline
    def setOnShowFunction0(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShow(value: CallbackNameNamesOrDefinition): Self = this.set("onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOnStartVarargs(value: String*): Self = this.set("onStart", js.Array(value :_*))
    
    @scala.inline
    def setOnStartFunction0(value: () => Unit): Self = this.set("onStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStart(value: CallbackNameNamesOrDefinition): Self = this.set("onStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    
    @scala.inline
    def setScrollDuration(value: Double): Self = this.set("scrollDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollDuration: Self = this.set("scrollDuration", js.undefined)
    
    @scala.inline
    def setScrollTopMargin(value: Double): Self = this.set("scrollTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTopMargin: Self = this.set("scrollTopMargin", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    
    @scala.inline
    def setShowNextButton(value: Boolean): Self = this.set("showNextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNextButton: Self = this.set("showNextButton", js.undefined)
    
    @scala.inline
    def setShowPrevButton(value: Boolean): Self = this.set("showPrevButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPrevButton: Self = this.set("showPrevButton", js.undefined)
    
    @scala.inline
    def setSkipIfNoElement(value: Boolean): Self = this.set("skipIfNoElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipIfNoElement: Self = this.set("skipIfNoElement", js.undefined)
    
    @scala.inline
    def setSmoothScroll(value: Boolean): Self = this.set("smoothScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmoothScroll: Self = this.set("smoothScroll", js.undefined)
  }
}
