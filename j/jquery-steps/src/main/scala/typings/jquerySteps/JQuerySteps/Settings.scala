package typings.jquerySteps.JQuerySteps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
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
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
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
    def setActionContainerTag(value: String): Self = this.set("actionContainerTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionContainerTag: Self = this.set("actionContainerTag", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setBodyTag(value: String): Self = this.set("bodyTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyTag: Self = this.set("bodyTag", js.undefined)
    
    @scala.inline
    def setContentContainerTag(value: String): Self = this.set("contentContainerTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentContainerTag: Self = this.set("contentContainerTag", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setEnableAllSteps(value: Boolean): Self = this.set("enableAllSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAllSteps: Self = this.set("enableAllSteps", js.undefined)
    
    @scala.inline
    def setEnableCancelButton(value: Boolean): Self = this.set("enableCancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCancelButton: Self = this.set("enableCancelButton", js.undefined)
    
    @scala.inline
    def setEnableContentCache(value: Boolean): Self = this.set("enableContentCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableContentCache: Self = this.set("enableContentCache", js.undefined)
    
    @scala.inline
    def setEnableFinishButton(value: Boolean): Self = this.set("enableFinishButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFinishButton: Self = this.set("enableFinishButton", js.undefined)
    
    @scala.inline
    def setEnableKeyNavigation(value: Boolean): Self = this.set("enableKeyNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableKeyNavigation: Self = this.set("enableKeyNavigation", js.undefined)
    
    @scala.inline
    def setEnablePagination(value: Boolean): Self = this.set("enablePagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePagination: Self = this.set("enablePagination", js.undefined)
    
    @scala.inline
    def setForceMoveForward(value: Boolean): Self = this.set("forceMoveForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceMoveForward: Self = this.set("forceMoveForward", js.undefined)
    
    @scala.inline
    def setHeaderTag(value: String): Self = this.set("headerTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTag: Self = this.set("headerTag", js.undefined)
    
    @scala.inline
    def setLabels(value: LabelSettings): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLoadingTemplate(value: String): Self = this.set("loadingTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingTemplate: Self = this.set("loadingTemplate", js.undefined)
    
    @scala.inline
    def setOnCanceled(value: /* event */ String => Unit): Self = this.set("onCanceled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCanceled: Self = this.set("onCanceled", js.undefined)
    
    @scala.inline
    def setOnContentLoaded(value: (/* event */ String, /* currentIndex */ Double) => Unit): Self = this.set("onContentLoaded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnContentLoaded: Self = this.set("onContentLoaded", js.undefined)
    
    @scala.inline
    def setOnFinished(value: (/* event */ String, /* currentIndex */ Double) => Unit): Self = this.set("onFinished", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFinished: Self = this.set("onFinished", js.undefined)
    
    @scala.inline
    def setOnFinishing(value: (/* event */ String, /* currentIndex */ Double) => Boolean): Self = this.set("onFinishing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFinishing: Self = this.set("onFinishing", js.undefined)
    
    @scala.inline
    def setOnInit(value: (/* event */ String, /* currentIndex */ Double) => Unit): Self = this.set("onInit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    
    @scala.inline
    def setOnStepChanged(value: (/* event */ String, /* currentIndex */ Double, /* priorIndex */ Double) => Unit): Self = this.set("onStepChanged", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnStepChanged: Self = this.set("onStepChanged", js.undefined)
    
    @scala.inline
    def setOnStepChanging(value: (/* event */ String, /* currentIndex */ Double, /* newIndex */ Double) => Boolean): Self = this.set("onStepChanging", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnStepChanging: Self = this.set("onStepChanging", js.undefined)
    
    @scala.inline
    def setSaveState(value: Boolean): Self = this.set("saveState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveState: Self = this.set("saveState", js.undefined)
    
    @scala.inline
    def setShowFinishButtonAlways(value: Boolean): Self = this.set("showFinishButtonAlways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFinishButtonAlways: Self = this.set("showFinishButtonAlways", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setStepsContainerTag(value: String): Self = this.set("stepsContainerTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepsContainerTag: Self = this.set("stepsContainerTag", js.undefined)
    
    @scala.inline
    def setStepsOrientation(value: String | Double): Self = this.set("stepsOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepsOrientation: Self = this.set("stepsOrientation", js.undefined)
    
    @scala.inline
    def setSuppressPaginationOnFocus(value: Boolean): Self = this.set("suppressPaginationOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressPaginationOnFocus: Self = this.set("suppressPaginationOnFocus", js.undefined)
    
    @scala.inline
    def setTitleTemplate(value: String): Self = this.set("titleTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTemplate: Self = this.set("titleTemplate", js.undefined)
    
    @scala.inline
    def setTransitionEffect(value: String | Double): Self = this.set("transitionEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionEffect: Self = this.set("transitionEffect", js.undefined)
    
    @scala.inline
    def setTransitionEffectSpeed(value: Double): Self = this.set("transitionEffectSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionEffectSpeed: Self = this.set("transitionEffectSpeed", js.undefined)
  }
}
