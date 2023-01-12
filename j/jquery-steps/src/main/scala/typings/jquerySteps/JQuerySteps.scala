package typings.jquerySteps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQuerySteps {
  
  type FunctionOnCancelled = js.Function1[/* event */ String, Unit]
  
  type FunctionOnContentLoaded = js.Function2[/* event */ String, /* currentIndex */ Double, Unit]
  
  type FunctionOnFinished = js.Function2[/* event */ String, /* currentIndex */ Double, Unit]
  
  type FunctionOnFinishing = js.Function2[/* event */ String, /* currentIndex */ Double, Boolean]
  
  type FunctionOnInit = js.Function2[/* event */ String, /* currentIndex */ Double, Unit]
  
  type FunctionOnStepChanged = js.Function3[/* event */ String, /* currentIndex */ Double, /* priorIndex */ Double, Unit]
  
  //#endregion "Label Settings"
  //#region "Callback Functions"
  type FunctionOnStepChanging = js.Function3[/* event */ String, /* currentIndex */ Double, /* newIndex */ Double, Boolean]
  
  trait JQuerySteps extends StObject {
    
    /**
      * Adds a new step. (chainable)
      */
    def add(step: Step): typings.jquerySteps.JQuerySteps.JQuerySteps
    
    /**
      * Removes the control functionality completely and transforms the current state to the initial HTML structure.
      */
    def destroy(): Unit
    
    /**
      * Triggers the onFinishing and onFinished event.
      */
    def finish(): Unit
    
    /**
      * Gets the current step index.
      */
    def getCurrentIndex(): Double
    
    /**
      * Gets the current step object.
      */
    def getCurrentStep(): Step
    
    /**
      * Gets a specific step object by index.
      */
    def getStep(index: Double): Step
    
    /**
      * Inserts a new step to a specific position. (chainable)
      */
    def insert(index: Double, step: Step): typings.jquerySteps.JQuerySteps.JQuerySteps
    
    /**
      * Routes to the previous step.
      */
    def next(): Boolean
    
    /**
      * Routes to the next step.
      */
    def previous(): Boolean
    
    /**
      * Removes a specific step by an given index.
      */
    def remove(index: Double): Boolean
    
    /**
      * Skips a certain amount of steps. Not yet implemented!
      */
    def skip(count: Double): Boolean
  }
  object JQuerySteps {
    
    inline def apply(
      add: Step => typings.jquerySteps.JQuerySteps.JQuerySteps,
      destroy: () => Unit,
      finish: () => Unit,
      getCurrentIndex: () => Double,
      getCurrentStep: () => Step,
      getStep: Double => Step,
      insert: (Double, Step) => typings.jquerySteps.JQuerySteps.JQuerySteps,
      next: () => Boolean,
      previous: () => Boolean,
      remove: Double => Boolean,
      skip: Double => Boolean
    ): typings.jquerySteps.JQuerySteps.JQuerySteps = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), destroy = js.Any.fromFunction0(destroy), finish = js.Any.fromFunction0(finish), getCurrentIndex = js.Any.fromFunction0(getCurrentIndex), getCurrentStep = js.Any.fromFunction0(getCurrentStep), getStep = js.Any.fromFunction1(getStep), insert = js.Any.fromFunction2(insert), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous), remove = js.Any.fromFunction1(remove), skip = js.Any.fromFunction1(skip))
      __obj.asInstanceOf[typings.jquerySteps.JQuerySteps.JQuerySteps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.jquerySteps.JQuerySteps.JQuerySteps] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: Step => typings.jquerySteps.JQuerySteps.JQuerySteps): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      inline def setGetCurrentIndex(value: () => Double): Self = StObject.set(x, "getCurrentIndex", js.Any.fromFunction0(value))
      
      inline def setGetCurrentStep(value: () => Step): Self = StObject.set(x, "getCurrentStep", js.Any.fromFunction0(value))
      
      inline def setGetStep(value: Double => Step): Self = StObject.set(x, "getStep", js.Any.fromFunction1(value))
      
      inline def setInsert(value: (Double, Step) => typings.jquerySteps.JQuerySteps.JQuerySteps): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      inline def setNext(value: () => Boolean): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setPrevious(value: () => Boolean): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
      
      inline def setRemove(value: Double => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setSkip(value: Double => Boolean): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    }
  }
  
  //#endregion "Settings"
  //#region "Label Settings"
  trait LabelSettings extends StObject {
    
    /**
      * Label for the cancel button. Default value is Cancel.
      */
    var cancel: js.UndefOr[String] = js.undefined
    
    /**
      * This label is important for accessability reasons. Indicates which step is activated. Default value is current step:.
      */
    var current: js.UndefOr[String] = js.undefined
    
    /**
      * Label for the finish button. Default value is Finish.
      */
    var finish: js.UndefOr[String] = js.undefined
    
    /**
      * Label for the loading animation. Default value is Loading ... .
      */
    var loading: js.UndefOr[String] = js.undefined
    
    /**
      * Label for the next button. Default value is Next.
      */
    var next: js.UndefOr[String] = js.undefined
    
    /**
      * This label is important for accessability reasons and describes the kind of navigation. Default value is Pagination.
      */
    var pagination: js.UndefOr[String] = js.undefined
    
    /**
      * Label for the previous button. Default value is Previous.
      */
    var previous: js.UndefOr[String] = js.undefined
  }
  object LabelSettings {
    
    inline def apply(): LabelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LabelSettings] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setFinish(value: String): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
      
      inline def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
      
      inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPagination(value: String): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  trait Settings extends StObject {
    
    /**
      * The action container tag which will be used to wrap the pagination navigation. Default value is div.
      */
    var actionContainerTag: js.UndefOr[String] = js.undefined
    
    //#endregion "Templates"
    //#region "Behavior"
    /**
      * Sets the focus to the first wizard instance in order to enable the key navigation from the begining if true. Default value is false.
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The body tag is used to find the step content within the declared wizard area. Default value is div.
      */
    var bodyTag: js.UndefOr[String] = js.undefined
    
    /**
      * The content container tag which will be used to wrap all step contents. Default value is div.
      */
    var contentContainerTag: js.UndefOr[String] = js.undefined
    
    /**
      * The css class which will be added to the outer component wrapper. Default value is wizard.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /**
      * Enables all steps from the begining if true (all steps are clickable). Default value is false.
      */
    var enableAllSteps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Shows the cancel button if enabled. Default value is false.
      */
    var enableCancelButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables cache for async loaded or iframe embedded content. Default value is true.
      */
    var enableContentCache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Shows the finish button if enabled. Default value is true.
      */
    var enableFinishButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables keyboard navigation if true (arrow left and arrow right). Default value is true.
      */
    var enableKeyNavigation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables pagination (next, previous and finish button) if true. Default value is true.
      */
    var enablePagination: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prevents jumping to a previous step. Default value is false.
      */
    var forceMoveForward: js.UndefOr[Boolean] = js.undefined
    
    //#region "Appearance"
    /**
      * The header tag is used to find the step button text within the declared wizard area. Default value is h1.
      */
    var headerTag: js.UndefOr[String] = js.undefined
    
    //#endregion "Events"
    //#region "Labels"
    var labels: js.UndefOr[LabelSettings] = js.undefined
    
    /**
      * The loading template which will be used to create the loading animation. Default value is <span class="spinner"></span> #text#.
      */
    var loadingTemplate: js.UndefOr[String] = js.undefined
    
    /**
      * Fires after cancellation.
      */
    var onCanceled: js.UndefOr[FunctionOnCancelled] = js.undefined
    
    /**
      * Fires after async content is loaded.
      */
    var onContentLoaded: js.UndefOr[FunctionOnContentLoaded] = js.undefined
    
    /**
      * Fires after completion.
      */
    var onFinished: js.UndefOr[FunctionOnFinished] = js.undefined
    
    /**
      * Fires before finishing and can be used to prevent completion by returning false. Very useful for form validation.
      */
    var onFinishing: js.UndefOr[FunctionOnFinishing] = js.undefined
    
    /**
      * Fires when the wizard is initialized.
      */
    var onInit: js.UndefOr[FunctionOnInit] = js.undefined
    
    /**
      * Fires after the step has changed.
      */
    var onStepChanged: js.UndefOr[FunctionOnStepChanged] = js.undefined
    
    //#endregion "Transition Effects"
    //#region "Events"
    /**
      * Fires before the step changes and can be used to prevent step changing by returning false.
      */
    var onStepChanging: js.UndefOr[FunctionOnStepChanging] = js.undefined
    
    /**
      * Saves the current state (step position) to a cookie. By coming next time the last active step becomes activated. Default value is false.
      */
    var saveState: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Shows the finish button always (on each step; right beside the next button) if true. Otherwise the next button will be replaced by the finish button if the last step becomes active. Default value is false.
      */
    var showFinishButtonAlways: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The position to start on (zero-based). Default value is 0.
      */
    var startIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * The steps container tag which will be used to wrap the steps navigation. Default value is div.
      */
    var stepsContainerTag: js.UndefOr[String] = js.undefined
    
    /**
      * Determines whether the steps are vertically or horizontally oriented. Default value is horizontal or 0.
      * This can be horizontal (0) or vertical (1).
      */
    var stepsOrientation: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Suppresses pagination if a form field is focused. Default value is true.
      */
    var suppressPaginationOnFocus: js.UndefOr[Boolean] = js.undefined
    
    //#endregion "Appearance"
    //#region "Templates"
    /**
      * The title template which will be used to create a step button. Default value is span class="number">#index#.</span> #title#.
      */
    var titleTemplate: js.UndefOr[String] = js.undefined
    
    //#endregion "Behavior"
    //#region "Transition Effects"
    /**
      * The animation effect which will be used for step transitions. Default value is none or 0.
      * This can be none (0), fade (1), slide (2) or slideLeft (3).
      */
    var transitionEffect: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Animation speed for step transitions (in milliseconds). Default value is 200.
      */
    var transitionEffectSpeed: js.UndefOr[Double] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      inline def setActionContainerTag(value: String): Self = StObject.set(x, "actionContainerTag", value.asInstanceOf[js.Any])
      
      inline def setActionContainerTagUndefined: Self = StObject.set(x, "actionContainerTag", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBodyTag(value: String): Self = StObject.set(x, "bodyTag", value.asInstanceOf[js.Any])
      
      inline def setBodyTagUndefined: Self = StObject.set(x, "bodyTag", js.undefined)
      
      inline def setContentContainerTag(value: String): Self = StObject.set(x, "contentContainerTag", value.asInstanceOf[js.Any])
      
      inline def setContentContainerTagUndefined: Self = StObject.set(x, "contentContainerTag", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setEnableAllSteps(value: Boolean): Self = StObject.set(x, "enableAllSteps", value.asInstanceOf[js.Any])
      
      inline def setEnableAllStepsUndefined: Self = StObject.set(x, "enableAllSteps", js.undefined)
      
      inline def setEnableCancelButton(value: Boolean): Self = StObject.set(x, "enableCancelButton", value.asInstanceOf[js.Any])
      
      inline def setEnableCancelButtonUndefined: Self = StObject.set(x, "enableCancelButton", js.undefined)
      
      inline def setEnableContentCache(value: Boolean): Self = StObject.set(x, "enableContentCache", value.asInstanceOf[js.Any])
      
      inline def setEnableContentCacheUndefined: Self = StObject.set(x, "enableContentCache", js.undefined)
      
      inline def setEnableFinishButton(value: Boolean): Self = StObject.set(x, "enableFinishButton", value.asInstanceOf[js.Any])
      
      inline def setEnableFinishButtonUndefined: Self = StObject.set(x, "enableFinishButton", js.undefined)
      
      inline def setEnableKeyNavigation(value: Boolean): Self = StObject.set(x, "enableKeyNavigation", value.asInstanceOf[js.Any])
      
      inline def setEnableKeyNavigationUndefined: Self = StObject.set(x, "enableKeyNavigation", js.undefined)
      
      inline def setEnablePagination(value: Boolean): Self = StObject.set(x, "enablePagination", value.asInstanceOf[js.Any])
      
      inline def setEnablePaginationUndefined: Self = StObject.set(x, "enablePagination", js.undefined)
      
      inline def setForceMoveForward(value: Boolean): Self = StObject.set(x, "forceMoveForward", value.asInstanceOf[js.Any])
      
      inline def setForceMoveForwardUndefined: Self = StObject.set(x, "forceMoveForward", js.undefined)
      
      inline def setHeaderTag(value: String): Self = StObject.set(x, "headerTag", value.asInstanceOf[js.Any])
      
      inline def setHeaderTagUndefined: Self = StObject.set(x, "headerTag", js.undefined)
      
      inline def setLabels(value: LabelSettings): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLoadingTemplate(value: String): Self = StObject.set(x, "loadingTemplate", value.asInstanceOf[js.Any])
      
      inline def setLoadingTemplateUndefined: Self = StObject.set(x, "loadingTemplate", js.undefined)
      
      inline def setOnCanceled(value: /* event */ String => Unit): Self = StObject.set(x, "onCanceled", js.Any.fromFunction1(value))
      
      inline def setOnCanceledUndefined: Self = StObject.set(x, "onCanceled", js.undefined)
      
      inline def setOnContentLoaded(value: (/* event */ String, /* currentIndex */ Double) => Unit): Self = StObject.set(x, "onContentLoaded", js.Any.fromFunction2(value))
      
      inline def setOnContentLoadedUndefined: Self = StObject.set(x, "onContentLoaded", js.undefined)
      
      inline def setOnFinished(value: (/* event */ String, /* currentIndex */ Double) => Unit): Self = StObject.set(x, "onFinished", js.Any.fromFunction2(value))
      
      inline def setOnFinishedUndefined: Self = StObject.set(x, "onFinished", js.undefined)
      
      inline def setOnFinishing(value: (/* event */ String, /* currentIndex */ Double) => Boolean): Self = StObject.set(x, "onFinishing", js.Any.fromFunction2(value))
      
      inline def setOnFinishingUndefined: Self = StObject.set(x, "onFinishing", js.undefined)
      
      inline def setOnInit(value: (/* event */ String, /* currentIndex */ Double) => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction2(value))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setOnStepChanged(value: (/* event */ String, /* currentIndex */ Double, /* priorIndex */ Double) => Unit): Self = StObject.set(x, "onStepChanged", js.Any.fromFunction3(value))
      
      inline def setOnStepChangedUndefined: Self = StObject.set(x, "onStepChanged", js.undefined)
      
      inline def setOnStepChanging(value: (/* event */ String, /* currentIndex */ Double, /* newIndex */ Double) => Boolean): Self = StObject.set(x, "onStepChanging", js.Any.fromFunction3(value))
      
      inline def setOnStepChangingUndefined: Self = StObject.set(x, "onStepChanging", js.undefined)
      
      inline def setSaveState(value: Boolean): Self = StObject.set(x, "saveState", value.asInstanceOf[js.Any])
      
      inline def setSaveStateUndefined: Self = StObject.set(x, "saveState", js.undefined)
      
      inline def setShowFinishButtonAlways(value: Boolean): Self = StObject.set(x, "showFinishButtonAlways", value.asInstanceOf[js.Any])
      
      inline def setShowFinishButtonAlwaysUndefined: Self = StObject.set(x, "showFinishButtonAlways", js.undefined)
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      inline def setStepsContainerTag(value: String): Self = StObject.set(x, "stepsContainerTag", value.asInstanceOf[js.Any])
      
      inline def setStepsContainerTagUndefined: Self = StObject.set(x, "stepsContainerTag", js.undefined)
      
      inline def setStepsOrientation(value: String | Double): Self = StObject.set(x, "stepsOrientation", value.asInstanceOf[js.Any])
      
      inline def setStepsOrientationUndefined: Self = StObject.set(x, "stepsOrientation", js.undefined)
      
      inline def setSuppressPaginationOnFocus(value: Boolean): Self = StObject.set(x, "suppressPaginationOnFocus", value.asInstanceOf[js.Any])
      
      inline def setSuppressPaginationOnFocusUndefined: Self = StObject.set(x, "suppressPaginationOnFocus", js.undefined)
      
      inline def setTitleTemplate(value: String): Self = StObject.set(x, "titleTemplate", value.asInstanceOf[js.Any])
      
      inline def setTitleTemplateUndefined: Self = StObject.set(x, "titleTemplate", js.undefined)
      
      inline def setTransitionEffect(value: String | Double): Self = StObject.set(x, "transitionEffect", value.asInstanceOf[js.Any])
      
      inline def setTransitionEffectSpeed(value: Double): Self = StObject.set(x, "transitionEffectSpeed", value.asInstanceOf[js.Any])
      
      inline def setTransitionEffectSpeedUndefined: Self = StObject.set(x, "transitionEffectSpeed", js.undefined)
      
      inline def setTransitionEffectUndefined: Self = StObject.set(x, "transitionEffect", js.undefined)
    }
  }
  
  //#endregion "Callback Functions"
  //#region "Step Object"
  trait Step extends StObject {
    
    /**
      *  The step content (HTML).
      */
    var content: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates how the content will be loaded.
      * This can be html (0), iframe (1), or async (2).
      */
    var contentMode: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The URI that refers to the content.
      */
    var contentUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The step title (HTML).
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object Step {
    
    inline def apply(): Step = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Step]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentMode(value: String | Double): Self = StObject.set(x, "contentMode", value.asInstanceOf[js.Any])
      
      inline def setContentModeUndefined: Self = StObject.set(x, "contentMode", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
      
      inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
