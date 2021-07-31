package typings.introJs

import typings.introJs.introJsStrings.`bottom-left-aligned`
import typings.introJs.introJsStrings.`bottom-middle-aligned`
import typings.introJs.introJsStrings.`bottom-right-aligned`
import typings.introJs.introJsStrings.auto
import typings.introJs.introJsStrings.bottom
import typings.introJs.introJsStrings.element
import typings.introJs.introJsStrings.left
import typings.introJs.introJsStrings.off
import typings.introJs.introJsStrings.right
import typings.introJs.introJsStrings.tooltip
import typings.introJs.introJsStrings.top
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): IntroJs = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[IntroJs]
  @scala.inline
  def apply(element: HTMLElement): IntroJs = ^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any]).asInstanceOf[IntroJs]
  @scala.inline
  def apply(querySelector: String): IntroJs = ^.asInstanceOf[js.Dynamic].apply(querySelector.asInstanceOf[js.Any]).asInstanceOf[IntroJs]
  
  @JSImport("intro.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Hint extends StObject {
    
    var element: js.UndefOr[String | HTMLElement | Element] = js.undefined
    
    var hint: String
    
    var hintPosition: js.UndefOr[String] = js.undefined
  }
  object Hint {
    
    @scala.inline
    def apply(hint: String): Hint = {
      val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hint]
    }
    
    @scala.inline
    implicit class HintMutableBuilder[Self <: Hint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: String | HTMLElement | Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintPosition(value: String): Self = StObject.set(x, "hintPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintPositionUndefined: Self = StObject.set(x, "hintPosition", js.undefined)
    }
  }
  
  @js.native
  trait IntroJs extends StObject {
    
    def addHints(): IntroJs = js.native
    
    /**
      * @link https://introjs.com/docs/intro/api/#introjsaddstepoptions
      */
    def addStep(options: Step): IntroJs = js.native
    
    /**
      * @link https://introjs.com/docs/intro/api/#introjsaddstepssteps
      */
    def addSteps(steps: js.Array[Step]): IntroJs = js.native
    
    def exit(): IntroJs = js.native
    
    def goToStep(step: Double): IntroJs = js.native
    
    def goToStepNumber(stepId: Double): IntroJs = js.native
    
    def hideHint(stepId: Double): IntroJs = js.native
    
    def hideHints(): IntroJs = js.native
    
    def nextStep(): IntroJs = js.native
    
    def onafterchange(callback: js.Function1[/* element */ HTMLElement, js.Any]): IntroJs = js.native
    
    def onbeforechange(callback: js.Function1[/* element */ HTMLElement, js.Any]): IntroJs = js.native
    
    def onchange(callback: js.Function1[/* element */ HTMLElement, js.Any]): IntroJs = js.native
    
    def oncomplete(callback: js.Function): IntroJs = js.native
    
    def onexit(callback: js.Function): IntroJs = js.native
    
    def onhintclick(
      callback: js.Function3[/* hintElement */ HTMLElement, /* item */ Step, /* stepId */ Double, js.Any]
    ): IntroJs = js.native
    
    def onhintclose(callback: js.Function1[/* stepId */ Double, js.Any]): IntroJs = js.native
    
    def onhintsadded(callback: js.Function): IntroJs = js.native
    
    def previousStep(): IntroJs = js.native
    
    def refresh(): IntroJs = js.native
    
    def removeHint(stepId: Double): IntroJs = js.native
    
    def removeHints(): IntroJs = js.native
    
    def setOption(option: String, value: String): IntroJs = js.native
    def setOption(option: String, value: Boolean): IntroJs = js.native
    def setOption(option: String, value: Double): IntroJs = js.native
    
    def setOptions(options: Options): IntroJs = js.native
    
    def showHint(stepId: Double): IntroJs = js.native
    
    def showHints(): IntroJs = js.native
    
    def start(): IntroJs = js.native
  }
  
  trait Options extends StObject {
    
    var disableInteraction: js.UndefOr[Boolean] = js.undefined
    
    var doneLabel: js.UndefOr[String] = js.undefined
    
    var exitOnEsc: js.UndefOr[Boolean] = js.undefined
    
    var exitOnOverlayClick: js.UndefOr[Boolean] = js.undefined
    
    var hideNext: js.UndefOr[Boolean] = js.undefined
    
    var hidePrev: js.UndefOr[Boolean] = js.undefined
    
    var highlightClass: js.UndefOr[String] = js.undefined
    
    var hintAnimation: js.UndefOr[Boolean] = js.undefined
    
    var hintButtonLabel: js.UndefOr[String] = js.undefined
    
    var hintPosition: js.UndefOr[String] = js.undefined
    
    var hints: js.UndefOr[js.Array[Hint]] = js.undefined
    
    var keyboardNavigation: js.UndefOr[Boolean] = js.undefined
    
    var nextLabel: js.UndefOr[String] = js.undefined
    
    var overlayOpacity: js.UndefOr[Double] = js.undefined
    
    var positionPrecedence: js.UndefOr[js.Array[String]] = js.undefined
    
    var prevLabel: js.UndefOr[String] = js.undefined
    
    var scrollPadding: js.UndefOr[Double] = js.undefined
    
    var scrollToElement: js.UndefOr[Boolean] = js.undefined
    
    var showBullets: js.UndefOr[Boolean] = js.undefined
    
    var showButtons: js.UndefOr[Boolean] = js.undefined
    
    var showProgress: js.UndefOr[Boolean] = js.undefined
    
    var showStepNumbers: js.UndefOr[Boolean] = js.undefined
    
    var skipLabel: js.UndefOr[String] = js.undefined
    
    var steps: js.UndefOr[js.Array[Step]] = js.undefined
    
    var tooltipClass: js.UndefOr[String] = js.undefined
    
    var tooltipPosition: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableInteraction(value: Boolean): Self = StObject.set(x, "disableInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableInteractionUndefined: Self = StObject.set(x, "disableInteraction", js.undefined)
      
      @scala.inline
      def setDoneLabel(value: String): Self = StObject.set(x, "doneLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoneLabelUndefined: Self = StObject.set(x, "doneLabel", js.undefined)
      
      @scala.inline
      def setExitOnEsc(value: Boolean): Self = StObject.set(x, "exitOnEsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitOnEscUndefined: Self = StObject.set(x, "exitOnEsc", js.undefined)
      
      @scala.inline
      def setExitOnOverlayClick(value: Boolean): Self = StObject.set(x, "exitOnOverlayClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitOnOverlayClickUndefined: Self = StObject.set(x, "exitOnOverlayClick", js.undefined)
      
      @scala.inline
      def setHideNext(value: Boolean): Self = StObject.set(x, "hideNext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideNextUndefined: Self = StObject.set(x, "hideNext", js.undefined)
      
      @scala.inline
      def setHidePrev(value: Boolean): Self = StObject.set(x, "hidePrev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidePrevUndefined: Self = StObject.set(x, "hidePrev", js.undefined)
      
      @scala.inline
      def setHighlightClass(value: String): Self = StObject.set(x, "highlightClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightClassUndefined: Self = StObject.set(x, "highlightClass", js.undefined)
      
      @scala.inline
      def setHintAnimation(value: Boolean): Self = StObject.set(x, "hintAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintAnimationUndefined: Self = StObject.set(x, "hintAnimation", js.undefined)
      
      @scala.inline
      def setHintButtonLabel(value: String): Self = StObject.set(x, "hintButtonLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintButtonLabelUndefined: Self = StObject.set(x, "hintButtonLabel", js.undefined)
      
      @scala.inline
      def setHintPosition(value: String): Self = StObject.set(x, "hintPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintPositionUndefined: Self = StObject.set(x, "hintPosition", js.undefined)
      
      @scala.inline
      def setHints(value: js.Array[Hint]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
      
      @scala.inline
      def setHintsVarargs(value: Hint*): Self = StObject.set(x, "hints", js.Array(value :_*))
      
      @scala.inline
      def setKeyboardNavigation(value: Boolean): Self = StObject.set(x, "keyboardNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardNavigationUndefined: Self = StObject.set(x, "keyboardNavigation", js.undefined)
      
      @scala.inline
      def setNextLabel(value: String): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
      
      @scala.inline
      def setOverlayOpacity(value: Double): Self = StObject.set(x, "overlayOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayOpacityUndefined: Self = StObject.set(x, "overlayOpacity", js.undefined)
      
      @scala.inline
      def setPositionPrecedence(value: js.Array[String]): Self = StObject.set(x, "positionPrecedence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionPrecedenceUndefined: Self = StObject.set(x, "positionPrecedence", js.undefined)
      
      @scala.inline
      def setPositionPrecedenceVarargs(value: String*): Self = StObject.set(x, "positionPrecedence", js.Array(value :_*))
      
      @scala.inline
      def setPrevLabel(value: String): Self = StObject.set(x, "prevLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevLabelUndefined: Self = StObject.set(x, "prevLabel", js.undefined)
      
      @scala.inline
      def setScrollPadding(value: Double): Self = StObject.set(x, "scrollPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPaddingUndefined: Self = StObject.set(x, "scrollPadding", js.undefined)
      
      @scala.inline
      def setScrollToElement(value: Boolean): Self = StObject.set(x, "scrollToElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToElementUndefined: Self = StObject.set(x, "scrollToElement", js.undefined)
      
      @scala.inline
      def setShowBullets(value: Boolean): Self = StObject.set(x, "showBullets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBulletsUndefined: Self = StObject.set(x, "showBullets", js.undefined)
      
      @scala.inline
      def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
      
      @scala.inline
      def setShowProgress(value: Boolean): Self = StObject.set(x, "showProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowProgressUndefined: Self = StObject.set(x, "showProgress", js.undefined)
      
      @scala.inline
      def setShowStepNumbers(value: Boolean): Self = StObject.set(x, "showStepNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowStepNumbersUndefined: Self = StObject.set(x, "showStepNumbers", js.undefined)
      
      @scala.inline
      def setSkipLabel(value: String): Self = StObject.set(x, "skipLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipLabelUndefined: Self = StObject.set(x, "skipLabel", js.undefined)
      
      @scala.inline
      def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setTooltipClass(value: String): Self = StObject.set(x, "tooltipClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipClassUndefined: Self = StObject.set(x, "tooltipClass", js.undefined)
      
      @scala.inline
      def setTooltipPosition(value: String): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
    }
  }
  
  trait Step extends StObject {
    
    var disableInteraction: js.UndefOr[Boolean] = js.undefined
    
    var element: js.UndefOr[String | HTMLElement | Element] = js.undefined
    
    var highlightClass: js.UndefOr[String] = js.undefined
    
    var intro: String
    
    var position: js.UndefOr[
        top | left | right | bottom | `bottom-left-aligned` | `bottom-middle-aligned` | `bottom-right-aligned` | auto
      ] = js.undefined
    
    var scrollTo: js.UndefOr[off | tooltip | element] = js.undefined
    
    var tooltipClass: js.UndefOr[String] = js.undefined
  }
  object Step {
    
    @scala.inline
    def apply(intro: String): Step = {
      val __obj = js.Dynamic.literal(intro = intro.asInstanceOf[js.Any])
      __obj.asInstanceOf[Step]
    }
    
    @scala.inline
    implicit class StepMutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableInteraction(value: Boolean): Self = StObject.set(x, "disableInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableInteractionUndefined: Self = StObject.set(x, "disableInteraction", js.undefined)
      
      @scala.inline
      def setElement(value: String | HTMLElement | Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setHighlightClass(value: String): Self = StObject.set(x, "highlightClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightClassUndefined: Self = StObject.set(x, "highlightClass", js.undefined)
      
      @scala.inline
      def setIntro(value: String): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(
        value: top | left | right | bottom | `bottom-left-aligned` | `bottom-middle-aligned` | `bottom-right-aligned` | auto
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setScrollTo(value: off | tooltip | element): Self = StObject.set(x, "scrollTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      @scala.inline
      def setTooltipClass(value: String): Self = StObject.set(x, "tooltipClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipClassUndefined: Self = StObject.set(x, "tooltipClass", js.undefined)
    }
  }
}
