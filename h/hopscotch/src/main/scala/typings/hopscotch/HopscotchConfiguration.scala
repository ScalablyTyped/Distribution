package typings.hopscotch

import typings.hopscotch.anon.CloseTooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HopscotchConfiguration extends StObject {
  
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
  implicit class HopscotchConfigurationMutableBuilder[Self <: HopscotchConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowWidth(value: Double): Self = StObject.set(x, "arrowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowWidthUndefined: Self = StObject.set(x, "arrowWidth", js.undefined)
    
    @scala.inline
    def setBubbleWidth(value: Double): Self = StObject.set(x, "bubbleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleWidthUndefined: Self = StObject.set(x, "bubbleWidth", js.undefined)
    
    @scala.inline
    def setBuddleHeight(value: Double): Self = StObject.set(x, "buddleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuddleHeightUndefined: Self = StObject.set(x, "buddleHeight", js.undefined)
    
    @scala.inline
    def setI18n(value: CloseTooltip): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    @scala.inline
    def setNextOnTargetClick(value: Boolean): Self = StObject.set(x, "nextOnTargetClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextOnTargetClickUndefined: Self = StObject.set(x, "nextOnTargetClick", js.undefined)
    
    @scala.inline
    def setOnClose(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseFunction0(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnCloseVarargs(value: String*): Self = StObject.set(x, "onClose", js.Array(value :_*))
    
    @scala.inline
    def setOnEnd(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndFunction0(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    @scala.inline
    def setOnEndVarargs(value: String*): Self = StObject.set(x, "onEnd", js.Array(value :_*))
    
    @scala.inline
    def setOnError(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorFunction0(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnErrorVarargs(value: String*): Self = StObject.set(x, "onError", js.Array(value :_*))
    
    @scala.inline
    def setOnNext(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnNextFunction0(value: () => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
    
    @scala.inline
    def setOnNextVarargs(value: String*): Self = StObject.set(x, "onNext", js.Array(value :_*))
    
    @scala.inline
    def setOnPrev(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onPrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPrevFunction0(value: () => Unit): Self = StObject.set(x, "onPrev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPrevUndefined: Self = StObject.set(x, "onPrev", js.undefined)
    
    @scala.inline
    def setOnPrevVarargs(value: String*): Self = StObject.set(x, "onPrev", js.Array(value :_*))
    
    @scala.inline
    def setOnShow(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShowFunction0(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOnShowVarargs(value: String*): Self = StObject.set(x, "onShow", js.Array(value :_*))
    
    @scala.inline
    def setOnStart(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStartFunction0(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    @scala.inline
    def setOnStartVarargs(value: String*): Self = StObject.set(x, "onStart", js.Array(value :_*))
    
    @scala.inline
    def setScrollDuration(value: Double): Self = StObject.set(x, "scrollDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollDurationUndefined: Self = StObject.set(x, "scrollDuration", js.undefined)
    
    @scala.inline
    def setScrollTopMargin(value: Double): Self = StObject.set(x, "scrollTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTopMarginUndefined: Self = StObject.set(x, "scrollTopMargin", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
    
    @scala.inline
    def setShowNextButton(value: Boolean): Self = StObject.set(x, "showNextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNextButtonUndefined: Self = StObject.set(x, "showNextButton", js.undefined)
    
    @scala.inline
    def setShowPrevButton(value: Boolean): Self = StObject.set(x, "showPrevButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPrevButtonUndefined: Self = StObject.set(x, "showPrevButton", js.undefined)
    
    @scala.inline
    def setSkipIfNoElement(value: Boolean): Self = StObject.set(x, "skipIfNoElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipIfNoElementUndefined: Self = StObject.set(x, "skipIfNoElement", js.undefined)
    
    @scala.inline
    def setSmoothScroll(value: Boolean): Self = StObject.set(x, "smoothScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothScrollUndefined: Self = StObject.set(x, "smoothScroll", js.undefined)
  }
}
