package typings.hubspotPace.HubSpotPaceInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaceOptions extends js.Object {
  var ajax: js.UndefOr[Boolean | PaceAjaxOptions] = js.undefined
  /**
    * How long should it take for the bar to animate to a new point after receiving it
    */
  var catchupTime: js.UndefOr[Double] = js.undefined
  var document: js.UndefOr[Boolean | String] = js.undefined
  /**
    * This tweaks the animation easing
    */
  var easeFactor: js.UndefOr[Double] = js.undefined
  var elements: js.UndefOr[Boolean | PaceElementsOptions] = js.undefined
  var eventLag: js.UndefOr[Boolean | PaceEventLagOptions] = js.undefined
  /**
    * What is the minimum amount of time the bar should sit after the last update before disappearing
    */
  var ghostTime: js.UndefOr[Double] = js.undefined
  /**
    * How quickly should the bar be moving before it has any progress info from a new source in %/ms
    */
  var initialRate: js.UndefOr[Double] = js.undefined
  /**
    * Its easy for a bunch of the bar to be eaten in the first few frames before we know how much there is to load. This limits how much of the bar can be used per frame
    */
  var maxProgressPerFrame: js.UndefOr[Double] = js.undefined
  /**
    * What is the minimum amount of time the bar should be on the screen. Irrespective of this number, the bar will always be on screen for 33 * (100 / maxProgressPerFrame) + ghostTime ms.
    */
  var minTime: js.UndefOr[Double] = js.undefined
  /**
    * Should we restart the browser when pushState or replaceState is called?  (Generally means ajax navigation has occured)
    */
  var restartOnPushState: js.UndefOr[Boolean] = js.undefined
  /**
    * Should we show the progress bar for every ajax request (not just regular or ajax-y page navigation)? Set to false to disable. If so, how many ms does the request have to be running for before we show the progress?
    */
  var restartOnRequestAfter: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * Should pace automatically start when the page is loaded, or should it wait for `start` to be called? Always false if pace is loaded with AMD or CommonJS.
    */
  var startOnPageLoad: js.UndefOr[Boolean] = js.undefined
  /**
    * What element should the pace element be appended to on the page?
    */
  var target: js.UndefOr[String] = js.undefined
}

object PaceOptions {
  @scala.inline
  def apply(
    ajax: Boolean | PaceAjaxOptions = null,
    catchupTime: js.UndefOr[Double] = js.undefined,
    document: Boolean | String = null,
    easeFactor: js.UndefOr[Double] = js.undefined,
    elements: Boolean | PaceElementsOptions = null,
    eventLag: Boolean | PaceEventLagOptions = null,
    ghostTime: js.UndefOr[Double] = js.undefined,
    initialRate: js.UndefOr[Double] = js.undefined,
    maxProgressPerFrame: js.UndefOr[Double] = js.undefined,
    minTime: js.UndefOr[Double] = js.undefined,
    restartOnPushState: js.UndefOr[Boolean] = js.undefined,
    restartOnRequestAfter: Boolean | Double = null,
    startOnPageLoad: js.UndefOr[Boolean] = js.undefined,
    target: String = null
  ): PaceOptions = {
    val __obj = js.Dynamic.literal()
    if (ajax != null) __obj.updateDynamic("ajax")(ajax.asInstanceOf[js.Any])
    if (!js.isUndefined(catchupTime)) __obj.updateDynamic("catchupTime")(catchupTime.get.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (!js.isUndefined(easeFactor)) __obj.updateDynamic("easeFactor")(easeFactor.get.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (eventLag != null) __obj.updateDynamic("eventLag")(eventLag.asInstanceOf[js.Any])
    if (!js.isUndefined(ghostTime)) __obj.updateDynamic("ghostTime")(ghostTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialRate)) __obj.updateDynamic("initialRate")(initialRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxProgressPerFrame)) __obj.updateDynamic("maxProgressPerFrame")(maxProgressPerFrame.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTime)) __obj.updateDynamic("minTime")(minTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restartOnPushState)) __obj.updateDynamic("restartOnPushState")(restartOnPushState.get.asInstanceOf[js.Any])
    if (restartOnRequestAfter != null) __obj.updateDynamic("restartOnRequestAfter")(restartOnRequestAfter.asInstanceOf[js.Any])
    if (!js.isUndefined(startOnPageLoad)) __obj.updateDynamic("startOnPageLoad")(startOnPageLoad.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaceOptions]
  }
}

