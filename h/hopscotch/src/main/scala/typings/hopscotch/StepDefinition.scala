package typings.hopscotch

import typings.hopscotch.hopscotchStrings.center
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepDefinition extends StObject {
  
  var arrowOffset: js.UndefOr[Double | center] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var ctaLabel: js.UndefOr[String] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var fixedElement: js.UndefOr[Boolean] = js.undefined
  
  var multipage: js.UndefOr[Boolean] = js.undefined
  
  var nextOnTargetClick: js.UndefOr[Boolean] = js.undefined
  
  var onCTA: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  
  var onNext: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  
  var onPrev: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  
  var onShow: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var placement: placementTypes
  
  var showCTAButton: js.UndefOr[Boolean] = js.undefined
  
  var showNextButton: js.UndefOr[Boolean] = js.undefined
  
  var showPrevButton: js.UndefOr[Boolean] = js.undefined
  
  var showSkip: js.UndefOr[Boolean] = js.undefined
  
  var target: String | HTMLElement | (js.Array[String | HTMLElement])
  
  var title: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var xOffset: js.UndefOr[Double | center] = js.undefined
  
  var yOffset: js.UndefOr[Double | center] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object StepDefinition {
  
  inline def apply(placement: placementTypes, target: String | HTMLElement | (js.Array[String | HTMLElement])): StepDefinition = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDefinition]
  }
  
  extension [Self <: StepDefinition](x: Self) {
    
    inline def setArrowOffset(value: Double | center): Self = StObject.set(x, "arrowOffset", value.asInstanceOf[js.Any])
    
    inline def setArrowOffsetUndefined: Self = StObject.set(x, "arrowOffset", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCtaLabel(value: String): Self = StObject.set(x, "ctaLabel", value.asInstanceOf[js.Any])
    
    inline def setCtaLabelUndefined: Self = StObject.set(x, "ctaLabel", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setFixedElement(value: Boolean): Self = StObject.set(x, "fixedElement", value.asInstanceOf[js.Any])
    
    inline def setFixedElementUndefined: Self = StObject.set(x, "fixedElement", js.undefined)
    
    inline def setMultipage(value: Boolean): Self = StObject.set(x, "multipage", value.asInstanceOf[js.Any])
    
    inline def setMultipageUndefined: Self = StObject.set(x, "multipage", js.undefined)
    
    inline def setNextOnTargetClick(value: Boolean): Self = StObject.set(x, "nextOnTargetClick", value.asInstanceOf[js.Any])
    
    inline def setNextOnTargetClickUndefined: Self = StObject.set(x, "nextOnTargetClick", js.undefined)
    
    inline def setOnCTA(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onCTA", value.asInstanceOf[js.Any])
    
    inline def setOnCTAFunction0(value: () => Unit): Self = StObject.set(x, "onCTA", js.Any.fromFunction0(value))
    
    inline def setOnCTAUndefined: Self = StObject.set(x, "onCTA", js.undefined)
    
    inline def setOnCTAVarargs(value: String*): Self = StObject.set(x, "onCTA", js.Array(value*))
    
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
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPlacement(value: placementTypes): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setShowCTAButton(value: Boolean): Self = StObject.set(x, "showCTAButton", value.asInstanceOf[js.Any])
    
    inline def setShowCTAButtonUndefined: Self = StObject.set(x, "showCTAButton", js.undefined)
    
    inline def setShowNextButton(value: Boolean): Self = StObject.set(x, "showNextButton", value.asInstanceOf[js.Any])
    
    inline def setShowNextButtonUndefined: Self = StObject.set(x, "showNextButton", js.undefined)
    
    inline def setShowPrevButton(value: Boolean): Self = StObject.set(x, "showPrevButton", value.asInstanceOf[js.Any])
    
    inline def setShowPrevButtonUndefined: Self = StObject.set(x, "showPrevButton", js.undefined)
    
    inline def setShowSkip(value: Boolean): Self = StObject.set(x, "showSkip", value.asInstanceOf[js.Any])
    
    inline def setShowSkipUndefined: Self = StObject.set(x, "showSkip", js.undefined)
    
    inline def setTarget(value: String | HTMLElement | (js.Array[String | HTMLElement])): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetVarargs(value: (String | HTMLElement)*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXOffset(value: Double | center): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
    
    inline def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
    
    inline def setYOffset(value: Double | center): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    
    inline def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
