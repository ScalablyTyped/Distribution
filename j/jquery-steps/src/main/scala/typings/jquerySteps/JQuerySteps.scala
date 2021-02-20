package typings.jquerySteps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait JQuerySteps extends StObject {
    
    /**
      * Adds a new step. (chainable)
      */
    def add(step: Step): typings.jquerySteps.JQuerySteps.JQuerySteps = js.native
    
    /**
      * Removes the control functionality completely and transforms the current state to the initial HTML structure.
      */
    def destroy(): Unit = js.native
    
    /**
      * Triggers the onFinishing and onFinished event.
      */
    def finish(): Unit = js.native
    
    /**
      * Gets the current step index.
      */
    def getCurrentIndex(): Double = js.native
    
    /**
      * Gets the current step object.
      */
    def getCurrentStep(): Step = js.native
    
    /**
      * Gets a specific step object by index.
      */
    def getStep(index: Double): Step = js.native
    
    /**
      * Inserts a new step to a specific position. (chainable)
      */
    def insert(index: Double, step: Step): typings.jquerySteps.JQuerySteps.JQuerySteps = js.native
    
    /**
      * Routes to the previous step.
      */
    def next(): Boolean = js.native
    
    /**
      * Routes to the next step.
      */
    def previous(): Boolean = js.native
    
    /**
      * Removes a specific step by an given index.
      */
    def remove(index: Double): Boolean = js.native
    
    /**
      * Skips a certain amount of steps. Not yet implemented!
      */
    def skip(count: Double): Boolean = js.native
  }
  object JQuerySteps {
    
    @scala.inline
    def apply(
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
    implicit class JQueryStepsMutableBuilder[Self <: typings.jquerySteps.JQuerySteps.JQuerySteps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: Step => typings.jquerySteps.JQuerySteps.JQuerySteps): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrentIndex(value: () => Double): Self = StObject.set(x, "getCurrentIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrentStep(value: () => Step): Self = StObject.set(x, "getCurrentStep", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStep(value: Double => Step): Self = StObject.set(x, "getStep", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsert(value: (Double, Step) => typings.jquerySteps.JQuerySteps.JQuerySteps): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNext(value: () => Boolean): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrevious(value: () => Boolean): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: Double => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkip(value: Double => Boolean): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    }
  }
  
  //#endregion "Settings"
  //#region "Label Settings"
  @js.native
  trait LabelSettings extends StObject {
    
    /**
      * Label for the cancel button. Default value is Cancel.
      */
    var cancel: js.UndefOr[String] = js.native
    
    /**
      * This label is important for accessability reasons. Indicates which step is activated. Default value is current step:.
      */
    var current: js.UndefOr[String] = js.native
    
    /**
      * Label for the finish button. Default value is Finish.
      */
    var finish: js.UndefOr[String] = js.native
    
    /**
      * Label for the loading animation. Default value is Loading ... .
      */
    var loading: js.UndefOr[String] = js.native
    
    /**
      * Label for the next button. Default value is Next.
      */
    var next: js.UndefOr[String] = js.native
    
    /**
      * This label is important for accessability reasons and describes the kind of navigation. Default value is Pagination.
      */
    var pagination: js.UndefOr[String] = js.native
    
    /**
      * Label for the previous button. Default value is Previous.
      */
    var previous: js.UndefOr[String] = js.native
  }
  object LabelSettings {
    
    @scala.inline
    def apply(): LabelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettings]
    }
    
    @scala.inline
    implicit class LabelSettingsMutableBuilder[Self <: LabelSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setFinish(value: String): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
      
      @scala.inline
      def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPagination(value: String): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      @scala.inline
      def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  @js.native
  trait Settings extends StObject {
    
    /**
      * The action container tag which will be used to wrap the pagination navigation. Default value is div.
      */
    var actionContainerTag: js.UndefOr[String] = js.native
    
    //#endregion "Templates"
    //#region "Behavior"
    /**
      * Sets the focus to the first wizard instance in order to enable the key navigation from the begining if true. Default value is false.
      */
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * The body tag is used to find the step content within the declared wizard area. Default value is div.
      */
    var bodyTag: js.UndefOr[String] = js.native
    
    /**
      * The content container tag which will be used to wrap all step contents. Default value is div.
      */
    var contentContainerTag: js.UndefOr[String] = js.native
    
    /**
      * The css class which will be added to the outer component wrapper. Default value is wizard.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /**
      * Enables all steps from the begining if true (all steps are clickable). Default value is false.
      */
    var enableAllSteps: js.UndefOr[Boolean] = js.native
    
    /**
      * Shows the cancel button if enabled. Default value is false.
      */
    var enableCancelButton: js.UndefOr[Boolean] = js.native
    
    /**
      * Enables cache for async loaded or iframe embedded content. Default value is true.
      */
    var enableContentCache: js.UndefOr[Boolean] = js.native
    
    /**
      * Shows the finish button if enabled. Default value is true.
      */
    var enableFinishButton: js.UndefOr[Boolean] = js.native
    
    /**
      * Enables keyboard navigation if true (arrow left and arrow right). Default value is true.
      */
    var enableKeyNavigation: js.UndefOr[Boolean] = js.native
    
    /**
      * Enables pagination (next, previous and finish button) if true. Default value is true.
      */
    var enablePagination: js.UndefOr[Boolean] = js.native
    
    /**
      * Prevents jumping to a previous step. Default value is false.
      */
    var forceMoveForward: js.UndefOr[Boolean] = js.native
    
    //#region "Appearance"
    /**
      * The header tag is used to find the step button text within the declared wizard area. Default value is h1.
      */
    var headerTag: js.UndefOr[String] = js.native
    
    //#endregion "Events"
    //#region "Labels"
    var labels: js.UndefOr[LabelSettings] = js.native
    
    /**
      * The loading template which will be used to create the loading animation. Default value is <span class="spinner"></span> #text#.
      */
    var loadingTemplate: js.UndefOr[String] = js.native
    
    /**
      * Fires after cancellation.
      */
    var onCanceled: js.UndefOr[FunctionOnCancelled] = js.native
    
    /**
      * Fires after async content is loaded.
      */
    var onContentLoaded: js.UndefOr[FunctionOnContentLoaded] = js.native
    
    /**
      * Fires after completion.
      */
    var onFinished: js.UndefOr[FunctionOnFinished] = js.native
    
    /**
      * Fires before finishing and can be used to prevent completion by returning false. Very useful for form validation.
      */
    var onFinishing: js.UndefOr[FunctionOnFinishing] = js.native
    
    /**
      * Fires when the wizard is initialized.
      */
    var onInit: js.UndefOr[FunctionOnInit] = js.native
    
    /**
      * Fires after the step has changed.
      */
    var onStepChanged: js.UndefOr[FunctionOnStepChanged] = js.native
    
    //#endregion "Transition Effects"
    //#region "Events"
    /**
      * Fires before the step changes and can be used to prevent step changing by returning false.
      */
    var onStepChanging: js.UndefOr[FunctionOnStepChanging] = js.native
    
    /**
      * Saves the current state (step position) to a cookie. By coming next time the last active step becomes activated. Default value is false.
      */
    var saveState: js.UndefOr[Boolean] = js.native
    
    /**
      * Shows the finish button always (on each step; right beside the next button) if true. Otherwise the next button will be replaced by the finish button if the last step becomes active. Default value is false.
      */
    var showFinishButtonAlways: js.UndefOr[Boolean] = js.native
    
    /**
      * The position to start on (zero-based). Default value is 0.
      */
    var startIndex: js.UndefOr[Double] = js.native
    
    /**
      * The steps container tag which will be used to wrap the steps navigation. Default value is div.
      */
    var stepsContainerTag: js.UndefOr[String] = js.native
    
    /**
      * Determines whether the steps are vertically or horizontally oriented. Default value is horizontal or 0.
      * This can be horizontal (0) or vertical (1).
      */
    var stepsOrientation: js.UndefOr[String | Double] = js.native
    
    /**
      * Suppresses pagination if a form field is focused. Default value is true.
      */
    var suppressPaginationOnFocus: js.UndefOr[Boolean] = js.native
    
    //#endregion "Appearance"
    //#region "Templates"
    /**
      * The title template which will be used to create a step button. Default value is span class="number">#index#.</span> #title#.
      */
    var titleTemplate: js.UndefOr[String] = js.native
    
    //#endregion "Behavior"
    //#region "Transition Effects"
    /**
      * The animation effect which will be used for step transitions. Default value is none or 0.
      * This can be none (0), fade (1), slide (2) or slideLeft (3).
      */
    var transitionEffect: js.UndefOr[String | Double] = js.native
    
    /**
      * Animation speed for step transitions (in milliseconds). Default value is 200.
      */
    var transitionEffectSpeed: js.UndefOr[Double] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionContainerTag(value: String): Self = StObject.set(x, "actionContainerTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionContainerTagUndefined: Self = StObject.set(x, "actionContainerTag", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBodyTag(value: String): Self = StObject.set(x, "bodyTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyTagUndefined: Self = StObject.set(x, "bodyTag", js.undefined)
      
      @scala.inline
      def setContentContainerTag(value: String): Self = StObject.set(x, "contentContainerTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentContainerTagUndefined: Self = StObject.set(x, "contentContainerTag", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setEnableAllSteps(value: Boolean): Self = StObject.set(x, "enableAllSteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAllStepsUndefined: Self = StObject.set(x, "enableAllSteps", js.undefined)
      
      @scala.inline
      def setEnableCancelButton(value: Boolean): Self = StObject.set(x, "enableCancelButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCancelButtonUndefined: Self = StObject.set(x, "enableCancelButton", js.undefined)
      
      @scala.inline
      def setEnableContentCache(value: Boolean): Self = StObject.set(x, "enableContentCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableContentCacheUndefined: Self = StObject.set(x, "enableContentCache", js.undefined)
      
      @scala.inline
      def setEnableFinishButton(value: Boolean): Self = StObject.set(x, "enableFinishButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFinishButtonUndefined: Self = StObject.set(x, "enableFinishButton", js.undefined)
      
      @scala.inline
      def setEnableKeyNavigation(value: Boolean): Self = StObject.set(x, "enableKeyNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableKeyNavigationUndefined: Self = StObject.set(x, "enableKeyNavigation", js.undefined)
      
      @scala.inline
      def setEnablePagination(value: Boolean): Self = StObject.set(x, "enablePagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePaginationUndefined: Self = StObject.set(x, "enablePagination", js.undefined)
      
      @scala.inline
      def setForceMoveForward(value: Boolean): Self = StObject.set(x, "forceMoveForward", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceMoveForwardUndefined: Self = StObject.set(x, "forceMoveForward", js.undefined)
      
      @scala.inline
      def setHeaderTag(value: String): Self = StObject.set(x, "headerTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTagUndefined: Self = StObject.set(x, "headerTag", js.undefined)
      
      @scala.inline
      def setLabels(value: LabelSettings): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setLoadingTemplate(value: String): Self = StObject.set(x, "loadingTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingTemplateUndefined: Self = StObject.set(x, "loadingTemplate", js.undefined)
      
      @scala.inline
      def setOnCanceled(value: /* event */ String => Unit): Self = StObject.set(x, "onCanceled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanceledUndefined: Self = StObject.set(x, "onCanceled", js.undefined)
      
      @scala.inline
      def setOnContentLoaded(value: (/* event */ String, /* currentIndex */ Double) => Unit): Self = StObject.set(x, "onContentLoaded", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnContentLoadedUndefined: Self = StObject.set(x, "onContentLoaded", js.undefined)
      
      @scala.inline
      def setOnFinished(value: (/* event */ String, /* currentIndex */ Double) => Unit): Self = StObject.set(x, "onFinished", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFinishedUndefined: Self = StObject.set(x, "onFinished", js.undefined)
      
      @scala.inline
      def setOnFinishing(value: (/* event */ String, /* currentIndex */ Double) => Boolean): Self = StObject.set(x, "onFinishing", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFinishingUndefined: Self = StObject.set(x, "onFinishing", js.undefined)
      
      @scala.inline
      def setOnInit(value: (/* event */ String, /* currentIndex */ Double) => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      @scala.inline
      def setOnStepChanged(value: (/* event */ String, /* currentIndex */ Double, /* priorIndex */ Double) => Unit): Self = StObject.set(x, "onStepChanged", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnStepChangedUndefined: Self = StObject.set(x, "onStepChanged", js.undefined)
      
      @scala.inline
      def setOnStepChanging(value: (/* event */ String, /* currentIndex */ Double, /* newIndex */ Double) => Boolean): Self = StObject.set(x, "onStepChanging", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnStepChangingUndefined: Self = StObject.set(x, "onStepChanging", js.undefined)
      
      @scala.inline
      def setSaveState(value: Boolean): Self = StObject.set(x, "saveState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveStateUndefined: Self = StObject.set(x, "saveState", js.undefined)
      
      @scala.inline
      def setShowFinishButtonAlways(value: Boolean): Self = StObject.set(x, "showFinishButtonAlways", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFinishButtonAlwaysUndefined: Self = StObject.set(x, "showFinishButtonAlways", js.undefined)
      
      @scala.inline
      def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      @scala.inline
      def setStepsContainerTag(value: String): Self = StObject.set(x, "stepsContainerTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsContainerTagUndefined: Self = StObject.set(x, "stepsContainerTag", js.undefined)
      
      @scala.inline
      def setStepsOrientation(value: String | Double): Self = StObject.set(x, "stepsOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsOrientationUndefined: Self = StObject.set(x, "stepsOrientation", js.undefined)
      
      @scala.inline
      def setSuppressPaginationOnFocus(value: Boolean): Self = StObject.set(x, "suppressPaginationOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressPaginationOnFocusUndefined: Self = StObject.set(x, "suppressPaginationOnFocus", js.undefined)
      
      @scala.inline
      def setTitleTemplate(value: String): Self = StObject.set(x, "titleTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleTemplateUndefined: Self = StObject.set(x, "titleTemplate", js.undefined)
      
      @scala.inline
      def setTransitionEffect(value: String | Double): Self = StObject.set(x, "transitionEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionEffectSpeed(value: Double): Self = StObject.set(x, "transitionEffectSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionEffectSpeedUndefined: Self = StObject.set(x, "transitionEffectSpeed", js.undefined)
      
      @scala.inline
      def setTransitionEffectUndefined: Self = StObject.set(x, "transitionEffect", js.undefined)
    }
  }
  
  //#endregion "Callback Functions"
  //#region "Step Object"
  @js.native
  trait Step extends StObject {
    
    /**
      *  The step content (HTML).
      */
    var content: js.UndefOr[String] = js.native
    
    /**
      * Indicates how the content will be loaded.
      * This can be html (0), iframe (1), or async (2).
      */
    var contentMode: js.UndefOr[String | Double] = js.native
    
    /**
      * The URI that refers to the content.
      */
    var contentUrl: js.UndefOr[String] = js.native
    
    /**
      * The step title (HTML).
      */
    var title: js.UndefOr[String] = js.native
  }
  object Step {
    
    @scala.inline
    def apply(): Step = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Step]
    }
    
    @scala.inline
    implicit class StepMutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentMode(value: String | Double): Self = StObject.set(x, "contentMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentModeUndefined: Self = StObject.set(x, "contentMode", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
