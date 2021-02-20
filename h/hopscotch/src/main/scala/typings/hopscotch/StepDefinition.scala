package typings.hopscotch

import typings.hopscotch.hopscotchStrings.center
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepDefinition extends StObject {
  
  var arrowOffset: js.UndefOr[Double | center] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var ctaLabel: js.UndefOr[String] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var fixedElement: js.UndefOr[Boolean] = js.native
  
  var multipage: js.UndefOr[Boolean] = js.native
  
  var nextOnTargetClick: js.UndefOr[Boolean] = js.native
  
  var onCTA: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  
  var onNext: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  
  var onPrev: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  
  var onShow: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var placement: placementTypes = js.native
  
  var showCTAButton: js.UndefOr[Boolean] = js.native
  
  var showNextButton: js.UndefOr[Boolean] = js.native
  
  var showPrevButton: js.UndefOr[Boolean] = js.native
  
  var showSkip: js.UndefOr[Boolean] = js.native
  
  var target: String | HTMLElement | (js.Array[String | HTMLElement]) = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var xOffset: js.UndefOr[Double | center] = js.native
  
  var yOffset: js.UndefOr[Double | center] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object StepDefinition {
  
  @scala.inline
  def apply(placement: placementTypes, target: String | HTMLElement | (js.Array[String | HTMLElement])): StepDefinition = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDefinition]
  }
  
  @scala.inline
  implicit class StepDefinitionMutableBuilder[Self <: StepDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowOffset(value: Double | center): Self = StObject.set(x, "arrowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowOffsetUndefined: Self = StObject.set(x, "arrowOffset", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setCtaLabel(value: String): Self = StObject.set(x, "ctaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtaLabelUndefined: Self = StObject.set(x, "ctaLabel", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setFixedElement(value: Boolean): Self = StObject.set(x, "fixedElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedElementUndefined: Self = StObject.set(x, "fixedElement", js.undefined)
    
    @scala.inline
    def setMultipage(value: Boolean): Self = StObject.set(x, "multipage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipageUndefined: Self = StObject.set(x, "multipage", js.undefined)
    
    @scala.inline
    def setNextOnTargetClick(value: Boolean): Self = StObject.set(x, "nextOnTargetClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextOnTargetClickUndefined: Self = StObject.set(x, "nextOnTargetClick", js.undefined)
    
    @scala.inline
    def setOnCTA(value: CallbackNameNamesOrDefinition): Self = StObject.set(x, "onCTA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCTAFunction0(value: () => Unit): Self = StObject.set(x, "onCTA", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCTAUndefined: Self = StObject.set(x, "onCTA", js.undefined)
    
    @scala.inline
    def setOnCTAVarargs(value: String*): Self = StObject.set(x, "onCTA", js.Array(value :_*))
    
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
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPlacement(value: placementTypes): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCTAButton(value: Boolean): Self = StObject.set(x, "showCTAButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCTAButtonUndefined: Self = StObject.set(x, "showCTAButton", js.undefined)
    
    @scala.inline
    def setShowNextButton(value: Boolean): Self = StObject.set(x, "showNextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNextButtonUndefined: Self = StObject.set(x, "showNextButton", js.undefined)
    
    @scala.inline
    def setShowPrevButton(value: Boolean): Self = StObject.set(x, "showPrevButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPrevButtonUndefined: Self = StObject.set(x, "showPrevButton", js.undefined)
    
    @scala.inline
    def setShowSkip(value: Boolean): Self = StObject.set(x, "showSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSkipUndefined: Self = StObject.set(x, "showSkip", js.undefined)
    
    @scala.inline
    def setTarget(value: String | HTMLElement | (js.Array[String | HTMLElement])): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: (String | HTMLElement)*): Self = StObject.set(x, "target", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setXOffset(value: Double | center): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
    
    @scala.inline
    def setYOffset(value: Double | center): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
