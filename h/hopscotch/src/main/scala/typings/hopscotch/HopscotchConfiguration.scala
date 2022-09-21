package typings.hopscotch

import typings.hopscotch.anon.CloseTooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HopscotchConfiguration extends StObject {
  
  var arrowWidth: js.UndefOr[Double] = js.undefined
  
  var bubbleWidth: js.UndefOr[Double] = js.undefined
  
  var buddleHeight: js.UndefOr[Double] = js.undefined
  
  var i18n: js.UndefOr[CloseTooltip] = js.undefined
  
  var nextOnTargetClick: js.UndefOr[Boolean] = js.undefined
  
  var onClose: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  
  var onEnd: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  
  var onError: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  
  var onNext: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  
  var onPrev: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  
  var onShow: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  
  var onStart: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  
  var scrollDuration: js.UndefOr[Double] = js.undefined
  
  var scrollTopMargin: js.UndefOr[Double] = js.undefined
  
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  
  var showNextButton: js.UndefOr[Boolean] = js.undefined
  
  var showPrevButton: js.UndefOr[Boolean] = js.undefined
  
  var skipIfNoElement: js.UndefOr[Boolean] = js.undefined
  
  var smoothScroll: js.UndefOr[Boolean] = js.undefined
}
object HopscotchConfiguration {
  
  inline def apply(): HopscotchConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HopscotchConfiguration]
  }
  
  extension [Self <: HopscotchConfiguration](x: Self) {
    
    inline def setArrowWidth(value: Double): Self = StObject.set(x, "arrowWidth", value.asInstanceOf[js.Any])
    
    inline def setArrowWidthUndefined: Self = StObject.set(x, "arrowWidth", js.undefined)
    
    inline def setBubbleWidth(value: Double): Self = StObject.set(x, "bubbleWidth", value.asInstanceOf[js.Any])
    
    inline def setBubbleWidthUndefined: Self = StObject.set(x, "bubbleWidth", js.undefined)
    
    inline def setBuddleHeight(value: Double): Self = StObject.set(x, "buddleHeight", value.asInstanceOf[js.Any])
    
    inline def setBuddleHeightUndefined: Self = StObject.set(x, "buddleHeight", js.undefined)
    
    inline def setI18n(value: CloseTooltip): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    inline def setNextOnTargetClick(value: Boolean): Self = StObject.set(x, "nextOnTargetClick", value.asInstanceOf[js.Any])
    
    inline def setNextOnTargetClickUndefined: Self = StObject.set(x, "nextOnTargetClick", js.undefined)
    
    inline def setOnClose(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnCloseFunction0(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnCloseVarargs(value: String*): Self = StObject.set(x, "onClose", js.Array(value*))
    
    inline def setOnEnd(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    inline def setOnEndFunction0(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnEndVarargs(value: String*): Self = StObject.set(x, "onEnd", js.Array(value*))
    
    inline def setOnError(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnErrorFunction0(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnErrorVarargs(value: String*): Self = StObject.set(x, "onError", js.Array(value*))
    
    inline def setOnNext(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onNext", value.asInstanceOf[js.Any])
    
    inline def setOnNextFunction0(value: () => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction0(value))
    
    inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
    
    inline def setOnNextVarargs(value: String*): Self = StObject.set(x, "onNext", js.Array(value*))
    
    inline def setOnPrev(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onPrev", value.asInstanceOf[js.Any])
    
    inline def setOnPrevFunction0(value: () => Unit): Self = StObject.set(x, "onPrev", js.Any.fromFunction0(value))
    
    inline def setOnPrevUndefined: Self = StObject.set(x, "onPrev", js.undefined)
    
    inline def setOnPrevVarargs(value: String*): Self = StObject.set(x, "onPrev", js.Array(value*))
    
    inline def setOnShow(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    inline def setOnShowFunction0(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnShowVarargs(value: String*): Self = StObject.set(x, "onShow", js.Array(value*))
    
    inline def setOnStart(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
    
    inline def setOnStartFunction0(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setOnStartVarargs(value: String*): Self = StObject.set(x, "onStart", js.Array(value*))
    
    inline def setScrollDuration(value: Double): Self = StObject.set(x, "scrollDuration", value.asInstanceOf[js.Any])
    
    inline def setScrollDurationUndefined: Self = StObject.set(x, "scrollDuration", js.undefined)
    
    inline def setScrollTopMargin(value: Double): Self = StObject.set(x, "scrollTopMargin", value.asInstanceOf[js.Any])
    
    inline def setScrollTopMarginUndefined: Self = StObject.set(x, "scrollTopMargin", js.undefined)
    
    inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
    
    inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
    
    inline def setShowNextButton(value: Boolean): Self = StObject.set(x, "showNextButton", value.asInstanceOf[js.Any])
    
    inline def setShowNextButtonUndefined: Self = StObject.set(x, "showNextButton", js.undefined)
    
    inline def setShowPrevButton(value: Boolean): Self = StObject.set(x, "showPrevButton", value.asInstanceOf[js.Any])
    
    inline def setShowPrevButtonUndefined: Self = StObject.set(x, "showPrevButton", js.undefined)
    
    inline def setSkipIfNoElement(value: Boolean): Self = StObject.set(x, "skipIfNoElement", value.asInstanceOf[js.Any])
    
    inline def setSkipIfNoElementUndefined: Self = StObject.set(x, "skipIfNoElement", js.undefined)
    
    inline def setSmoothScroll(value: Boolean): Self = StObject.set(x, "smoothScroll", value.asInstanceOf[js.Any])
    
    inline def setSmoothScrollUndefined: Self = StObject.set(x, "smoothScroll", js.undefined)
  }
}
