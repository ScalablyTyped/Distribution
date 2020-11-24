package typings.introJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var disableInteraction: js.UndefOr[Boolean] = js.native
  
  var doneLabel: js.UndefOr[String] = js.native
  
  var exitOnEsc: js.UndefOr[Boolean] = js.native
  
  var exitOnOverlayClick: js.UndefOr[Boolean] = js.native
  
  var hideNext: js.UndefOr[Boolean] = js.native
  
  var hidePrev: js.UndefOr[Boolean] = js.native
  
  var highlightClass: js.UndefOr[String] = js.native
  
  var hintAnimation: js.UndefOr[Boolean] = js.native
  
  var hintButtonLabel: js.UndefOr[String] = js.native
  
  var hintPosition: js.UndefOr[String] = js.native
  
  var hints: js.UndefOr[js.Array[Hint]] = js.native
  
  var keyboardNavigation: js.UndefOr[Boolean] = js.native
  
  var nextLabel: js.UndefOr[String] = js.native
  
  var overlayOpacity: js.UndefOr[Double] = js.native
  
  var positionPrecedence: js.UndefOr[js.Array[String]] = js.native
  
  var prevLabel: js.UndefOr[String] = js.native
  
  var scrollPadding: js.UndefOr[Double] = js.native
  
  var scrollToElement: js.UndefOr[Boolean] = js.native
  
  var showBullets: js.UndefOr[Boolean] = js.native
  
  var showButtons: js.UndefOr[Boolean] = js.native
  
  var showProgress: js.UndefOr[Boolean] = js.native
  
  var showStepNumbers: js.UndefOr[Boolean] = js.native
  
  var skipLabel: js.UndefOr[String] = js.native
  
  var steps: js.UndefOr[js.Array[Step]] = js.native
  
  var tooltipClass: js.UndefOr[String] = js.native
  
  var tooltipPosition: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDisableInteraction(value: Boolean): Self = this.set("disableInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableInteraction: Self = this.set("disableInteraction", js.undefined)
    
    @scala.inline
    def setDoneLabel(value: String): Self = this.set("doneLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoneLabel: Self = this.set("doneLabel", js.undefined)
    
    @scala.inline
    def setExitOnEsc(value: Boolean): Self = this.set("exitOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitOnEsc: Self = this.set("exitOnEsc", js.undefined)
    
    @scala.inline
    def setExitOnOverlayClick(value: Boolean): Self = this.set("exitOnOverlayClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitOnOverlayClick: Self = this.set("exitOnOverlayClick", js.undefined)
    
    @scala.inline
    def setHideNext(value: Boolean): Self = this.set("hideNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideNext: Self = this.set("hideNext", js.undefined)
    
    @scala.inline
    def setHidePrev(value: Boolean): Self = this.set("hidePrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidePrev: Self = this.set("hidePrev", js.undefined)
    
    @scala.inline
    def setHighlightClass(value: String): Self = this.set("highlightClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightClass: Self = this.set("highlightClass", js.undefined)
    
    @scala.inline
    def setHintAnimation(value: Boolean): Self = this.set("hintAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHintAnimation: Self = this.set("hintAnimation", js.undefined)
    
    @scala.inline
    def setHintButtonLabel(value: String): Self = this.set("hintButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHintButtonLabel: Self = this.set("hintButtonLabel", js.undefined)
    
    @scala.inline
    def setHintPosition(value: String): Self = this.set("hintPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHintPosition: Self = this.set("hintPosition", js.undefined)
    
    @scala.inline
    def setHintsVarargs(value: Hint*): Self = this.set("hints", js.Array(value :_*))
    
    @scala.inline
    def setHints(value: js.Array[Hint]): Self = this.set("hints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHints: Self = this.set("hints", js.undefined)
    
    @scala.inline
    def setKeyboardNavigation(value: Boolean): Self = this.set("keyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardNavigation: Self = this.set("keyboardNavigation", js.undefined)
    
    @scala.inline
    def setNextLabel(value: String): Self = this.set("nextLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextLabel: Self = this.set("nextLabel", js.undefined)
    
    @scala.inline
    def setOverlayOpacity(value: Double): Self = this.set("overlayOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayOpacity: Self = this.set("overlayOpacity", js.undefined)
    
    @scala.inline
    def setPositionPrecedenceVarargs(value: String*): Self = this.set("positionPrecedence", js.Array(value :_*))
    
    @scala.inline
    def setPositionPrecedence(value: js.Array[String]): Self = this.set("positionPrecedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionPrecedence: Self = this.set("positionPrecedence", js.undefined)
    
    @scala.inline
    def setPrevLabel(value: String): Self = this.set("prevLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevLabel: Self = this.set("prevLabel", js.undefined)
    
    @scala.inline
    def setScrollPadding(value: Double): Self = this.set("scrollPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPadding: Self = this.set("scrollPadding", js.undefined)
    
    @scala.inline
    def setScrollToElement(value: Boolean): Self = this.set("scrollToElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToElement: Self = this.set("scrollToElement", js.undefined)
    
    @scala.inline
    def setShowBullets(value: Boolean): Self = this.set("showBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBullets: Self = this.set("showBullets", js.undefined)
    
    @scala.inline
    def setShowButtons(value: Boolean): Self = this.set("showButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowButtons: Self = this.set("showButtons", js.undefined)
    
    @scala.inline
    def setShowProgress(value: Boolean): Self = this.set("showProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowProgress: Self = this.set("showProgress", js.undefined)
    
    @scala.inline
    def setShowStepNumbers(value: Boolean): Self = this.set("showStepNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowStepNumbers: Self = this.set("showStepNumbers", js.undefined)
    
    @scala.inline
    def setSkipLabel(value: String): Self = this.set("skipLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipLabel: Self = this.set("skipLabel", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: Step*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[Step]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setTooltipClass(value: String): Self = this.set("tooltipClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipClass: Self = this.set("tooltipClass", js.undefined)
    
    @scala.inline
    def setTooltipPosition(value: String): Self = this.set("tooltipPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipPosition: Self = this.set("tooltipPosition", js.undefined)
  }
}
