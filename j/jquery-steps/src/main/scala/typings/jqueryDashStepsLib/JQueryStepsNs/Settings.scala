package typings
package jqueryDashStepsLib.JQueryStepsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Settings extends js.Object {
  /**
          * The action container tag which will be used to wrap the pagination navigation. Default value is div.
          */
  var actionContainerTag: js.UndefOr[java.lang.String] = js.undefined
  //#endregion "Templates"
  //#region "Behavior"
  /**
          * Sets the focus to the first wizard instance in order to enable the key navigation from the begining if true. Default value is false.
          */
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * The body tag is used to find the step content within the declared wizard area. Default value is div.
          */
  var bodyTag: js.UndefOr[java.lang.String] = js.undefined
  /**
          * The content container tag which will be used to wrap all step contents. Default value is div.
          */
  var contentContainerTag: js.UndefOr[java.lang.String] = js.undefined
  /**
          * The css class which will be added to the outer component wrapper. Default value is wizard.
          */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Enables all steps from the begining if true (all steps are clickable). Default value is false.
          */
  var enableAllSteps: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Shows the cancel button if enabled. Default value is false.
          */
  var enableCancelButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Enables cache for async loaded or iframe embedded content. Default value is true.
          */
  var enableContentCache: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Shows the finish button if enabled. Default value is true.
          */
  var enableFinishButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Enables keyboard navigation if true (arrow left and arrow right). Default value is true.
          */
  var enableKeyNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Enables pagination (next, previous and finish button) if true. Default value is true.
          */
  var enablePagination: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Prevents jumping to a previous step. Default value is false.
          */
  var forceMoveForward: js.UndefOr[scala.Boolean] = js.undefined
  //#region "Appearance"
  /**
          * The header tag is used to find the step button text within the declared wizard area. Default value is h1.
          */
  var headerTag: js.UndefOr[java.lang.String] = js.undefined
  //#endregion "Events"
  //#region "Labels"
  var labels: js.UndefOr[LabelSettings] = js.undefined
  /**
          * The loading template which will be used to create the loading animation. Default value is <span class="spinner"></span> #text#.
          */
  var loadingTemplate: js.UndefOr[java.lang.String] = js.undefined
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
  var saveState: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Shows the finish button always (on each step; right beside the next button) if true. Otherwise the next button will be replaced by the finish button if the last step becomes active. Default value is false.
          */
  var showFinishButtonAlways: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * The position to start on (zero-based). Default value is 0.
          */
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  /**
          * The steps container tag which will be used to wrap the steps navigation. Default value is div.
          */
  var stepsContainerTag: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Determines whether the steps are vertically or horizontally oriented. Default value is horizontal or 0.
          * This can be horizontal (0) or vertical (1).
          */
  var stepsOrientation: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
          * Suppresses pagination if a form field is focused. Default value is true.
          */
  var suppressPaginationOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  //#endregion "Appearance"
  //#region "Templates"
  /**
          * The title template which will be used to create a step button. Default value is span class="number">#index#.</span> #title#.
          */
  var titleTemplate: js.UndefOr[java.lang.String] = js.undefined
  //#endregion "Behavior"
  //#region "Transition Effects"
  /**
          * The animation effect which will be used for step transitions. Default value is none or 0.
          * This can be none (0), fade (1), slide (2) or slideLeft (3).
          */
  var transitionEffect: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
          * Animation speed for step transitions (in milliseconds). Default value is 200.
          */
  var transitionEffectSpeed: js.UndefOr[scala.Double] = js.undefined
}

