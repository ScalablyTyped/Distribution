package typings.hopscotch

import typings.hopscotch.hopscotchStrings.center
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepDefinition extends js.Object {
  
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
  implicit class StepDefinitionOps[Self <: StepDefinition] (val x: Self) extends AnyVal {
    
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
    def setPlacement(value: placementTypes): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: (String | HTMLElement)*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: String | HTMLElement | (js.Array[String | HTMLElement])): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowOffset(value: Double | center): Self = this.set("arrowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowOffset: Self = this.set("arrowOffset", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setCtaLabel(value: String): Self = this.set("ctaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtaLabel: Self = this.set("ctaLabel", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setFixedElement(value: Boolean): Self = this.set("fixedElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedElement: Self = this.set("fixedElement", js.undefined)
    
    @scala.inline
    def setMultipage(value: Boolean): Self = this.set("multipage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipage: Self = this.set("multipage", js.undefined)
    
    @scala.inline
    def setNextOnTargetClick(value: Boolean): Self = this.set("nextOnTargetClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextOnTargetClick: Self = this.set("nextOnTargetClick", js.undefined)
    
    @scala.inline
    def setOnCTAVarargs(value: String*): Self = this.set("onCTA", js.Array(value :_*))
    
    @scala.inline
    def setOnCTAFunction0(value: () => Unit): Self = this.set("onCTA", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCTA(value: CallbackNameNamesOrDefinition): Self = this.set("onCTA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCTA: Self = this.set("onCTA", js.undefined)
    
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
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setShowCTAButton(value: Boolean): Self = this.set("showCTAButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCTAButton: Self = this.set("showCTAButton", js.undefined)
    
    @scala.inline
    def setShowNextButton(value: Boolean): Self = this.set("showNextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNextButton: Self = this.set("showNextButton", js.undefined)
    
    @scala.inline
    def setShowPrevButton(value: Boolean): Self = this.set("showPrevButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPrevButton: Self = this.set("showPrevButton", js.undefined)
    
    @scala.inline
    def setShowSkip(value: Boolean): Self = this.set("showSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSkip: Self = this.set("showSkip", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setXOffset(value: Double | center): Self = this.set("xOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXOffset: Self = this.set("xOffset", js.undefined)
    
    @scala.inline
    def setYOffset(value: Double | center): Self = this.set("yOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYOffset: Self = this.set("yOffset", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
