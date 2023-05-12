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
  
  inline def apply(): IntroJs = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[IntroJs]
  inline def apply(element: HTMLElement): IntroJs = ^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any]).asInstanceOf[IntroJs]
  inline def apply(querySelector: String): IntroJs = ^.asInstanceOf[js.Dynamic].apply(querySelector.asInstanceOf[js.Any]).asInstanceOf[IntroJs]
  
  @JSImport("intro.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Hint extends StObject {
    
    var element: js.UndefOr[String | HTMLElement | Element] = js.undefined
    
    var hint: String
    
    var hintPosition: js.UndefOr[String] = js.undefined
  }
  object Hint {
    
    inline def apply(hint: String): Hint = {
      val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hint] (val x: Self) extends AnyVal {
      
      inline def setElement(value: String | HTMLElement | Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintPosition(value: String): Self = StObject.set(x, "hintPosition", value.asInstanceOf[js.Any])
      
      inline def setHintPositionUndefined: Self = StObject.set(x, "hintPosition", js.undefined)
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
    
    def currentStep(): js.UndefOr[Double] = js.native
    
    def exit(): IntroJs = js.native
    def exit(force: Boolean): IntroJs = js.native
    
    def goToStep(step: Double): IntroJs = js.native
    
    def goToStepNumber(stepId: Double): IntroJs = js.native
    
    def hideHint(stepId: Double): IntroJs = js.native
    
    def hideHints(): IntroJs = js.native
    
    def nextStep(): IntroJs = js.native
    
    def onafterchange(callback: js.Function1[/* element */ HTMLElement, Any]): IntroJs = js.native
    
    def onbeforechange(callback: js.Function1[/* element */ HTMLElement, Any]): IntroJs = js.native
    
    def onbeforeexit(callback: js.Function0[Boolean | Unit]): IntroJs = js.native
    
    def onchange(callback: js.Function1[/* element */ HTMLElement, Any]): IntroJs = js.native
    
    def oncomplete(callback: js.Function): IntroJs = js.native
    
    def onexit(callback: js.Function): IntroJs = js.native
    
    def onhintclick(callback: js.Function3[/* hintElement */ HTMLElement, /* item */ Step, /* stepId */ Double, Any]): IntroJs = js.native
    
    def onhintclose(callback: js.Function1[/* stepId */ Double, Any]): IntroJs = js.native
    
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
    
    var buttonClass: js.UndefOr[String] = js.undefined
    
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
    
    var nextToDone: js.UndefOr[Boolean] = js.undefined
    
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setButtonClass(value: String): Self = StObject.set(x, "buttonClass", value.asInstanceOf[js.Any])
      
      inline def setButtonClassUndefined: Self = StObject.set(x, "buttonClass", js.undefined)
      
      inline def setDisableInteraction(value: Boolean): Self = StObject.set(x, "disableInteraction", value.asInstanceOf[js.Any])
      
      inline def setDisableInteractionUndefined: Self = StObject.set(x, "disableInteraction", js.undefined)
      
      inline def setDoneLabel(value: String): Self = StObject.set(x, "doneLabel", value.asInstanceOf[js.Any])
      
      inline def setDoneLabelUndefined: Self = StObject.set(x, "doneLabel", js.undefined)
      
      inline def setExitOnEsc(value: Boolean): Self = StObject.set(x, "exitOnEsc", value.asInstanceOf[js.Any])
      
      inline def setExitOnEscUndefined: Self = StObject.set(x, "exitOnEsc", js.undefined)
      
      inline def setExitOnOverlayClick(value: Boolean): Self = StObject.set(x, "exitOnOverlayClick", value.asInstanceOf[js.Any])
      
      inline def setExitOnOverlayClickUndefined: Self = StObject.set(x, "exitOnOverlayClick", js.undefined)
      
      inline def setHideNext(value: Boolean): Self = StObject.set(x, "hideNext", value.asInstanceOf[js.Any])
      
      inline def setHideNextUndefined: Self = StObject.set(x, "hideNext", js.undefined)
      
      inline def setHidePrev(value: Boolean): Self = StObject.set(x, "hidePrev", value.asInstanceOf[js.Any])
      
      inline def setHidePrevUndefined: Self = StObject.set(x, "hidePrev", js.undefined)
      
      inline def setHighlightClass(value: String): Self = StObject.set(x, "highlightClass", value.asInstanceOf[js.Any])
      
      inline def setHighlightClassUndefined: Self = StObject.set(x, "highlightClass", js.undefined)
      
      inline def setHintAnimation(value: Boolean): Self = StObject.set(x, "hintAnimation", value.asInstanceOf[js.Any])
      
      inline def setHintAnimationUndefined: Self = StObject.set(x, "hintAnimation", js.undefined)
      
      inline def setHintButtonLabel(value: String): Self = StObject.set(x, "hintButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setHintButtonLabelUndefined: Self = StObject.set(x, "hintButtonLabel", js.undefined)
      
      inline def setHintPosition(value: String): Self = StObject.set(x, "hintPosition", value.asInstanceOf[js.Any])
      
      inline def setHintPositionUndefined: Self = StObject.set(x, "hintPosition", js.undefined)
      
      inline def setHints(value: js.Array[Hint]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
      
      inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
      
      inline def setHintsVarargs(value: Hint*): Self = StObject.set(x, "hints", js.Array(value*))
      
      inline def setKeyboardNavigation(value: Boolean): Self = StObject.set(x, "keyboardNavigation", value.asInstanceOf[js.Any])
      
      inline def setKeyboardNavigationUndefined: Self = StObject.set(x, "keyboardNavigation", js.undefined)
      
      inline def setNextLabel(value: String): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      inline def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
      
      inline def setNextToDone(value: Boolean): Self = StObject.set(x, "nextToDone", value.asInstanceOf[js.Any])
      
      inline def setNextToDoneUndefined: Self = StObject.set(x, "nextToDone", js.undefined)
      
      inline def setOverlayOpacity(value: Double): Self = StObject.set(x, "overlayOpacity", value.asInstanceOf[js.Any])
      
      inline def setOverlayOpacityUndefined: Self = StObject.set(x, "overlayOpacity", js.undefined)
      
      inline def setPositionPrecedence(value: js.Array[String]): Self = StObject.set(x, "positionPrecedence", value.asInstanceOf[js.Any])
      
      inline def setPositionPrecedenceUndefined: Self = StObject.set(x, "positionPrecedence", js.undefined)
      
      inline def setPositionPrecedenceVarargs(value: String*): Self = StObject.set(x, "positionPrecedence", js.Array(value*))
      
      inline def setPrevLabel(value: String): Self = StObject.set(x, "prevLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevLabelUndefined: Self = StObject.set(x, "prevLabel", js.undefined)
      
      inline def setScrollPadding(value: Double): Self = StObject.set(x, "scrollPadding", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingUndefined: Self = StObject.set(x, "scrollPadding", js.undefined)
      
      inline def setScrollToElement(value: Boolean): Self = StObject.set(x, "scrollToElement", value.asInstanceOf[js.Any])
      
      inline def setScrollToElementUndefined: Self = StObject.set(x, "scrollToElement", js.undefined)
      
      inline def setShowBullets(value: Boolean): Self = StObject.set(x, "showBullets", value.asInstanceOf[js.Any])
      
      inline def setShowBulletsUndefined: Self = StObject.set(x, "showBullets", js.undefined)
      
      inline def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
      
      inline def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
      
      inline def setShowProgress(value: Boolean): Self = StObject.set(x, "showProgress", value.asInstanceOf[js.Any])
      
      inline def setShowProgressUndefined: Self = StObject.set(x, "showProgress", js.undefined)
      
      inline def setShowStepNumbers(value: Boolean): Self = StObject.set(x, "showStepNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowStepNumbersUndefined: Self = StObject.set(x, "showStepNumbers", js.undefined)
      
      inline def setSkipLabel(value: String): Self = StObject.set(x, "skipLabel", value.asInstanceOf[js.Any])
      
      inline def setSkipLabelUndefined: Self = StObject.set(x, "skipLabel", js.undefined)
      
      inline def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setTooltipClass(value: String): Self = StObject.set(x, "tooltipClass", value.asInstanceOf[js.Any])
      
      inline def setTooltipClassUndefined: Self = StObject.set(x, "tooltipClass", js.undefined)
      
      inline def setTooltipPosition(value: String): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
      
      inline def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
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
    
    var step: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var tooltipClass: js.UndefOr[String] = js.undefined
  }
  object Step {
    
    inline def apply(intro: String): Step = {
      val __obj = js.Dynamic.literal(intro = intro.asInstanceOf[js.Any])
      __obj.asInstanceOf[Step]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
      
      inline def setDisableInteraction(value: Boolean): Self = StObject.set(x, "disableInteraction", value.asInstanceOf[js.Any])
      
      inline def setDisableInteractionUndefined: Self = StObject.set(x, "disableInteraction", js.undefined)
      
      inline def setElement(value: String | HTMLElement | Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setHighlightClass(value: String): Self = StObject.set(x, "highlightClass", value.asInstanceOf[js.Any])
      
      inline def setHighlightClassUndefined: Self = StObject.set(x, "highlightClass", js.undefined)
      
      inline def setIntro(value: String): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      inline def setPosition(
        value: top | left | right | bottom | `bottom-left-aligned` | `bottom-middle-aligned` | `bottom-right-aligned` | auto
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScrollTo(value: off | tooltip | element): Self = StObject.set(x, "scrollTo", value.asInstanceOf[js.Any])
      
      inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTooltipClass(value: String): Self = StObject.set(x, "tooltipClass", value.asInstanceOf[js.Any])
      
      inline def setTooltipClassUndefined: Self = StObject.set(x, "tooltipClass", js.undefined)
    }
  }
}
