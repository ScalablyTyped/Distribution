package typings.hubspotPace.HubSpotPaceInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaceOptions extends js.Object {
  var ajax: js.UndefOr[Boolean | PaceAjaxOptions] = js.native
  /**
    * How long should it take for the bar to animate to a new point after receiving it
    */
  var catchupTime: js.UndefOr[Double] = js.native
  var document: js.UndefOr[Boolean | String] = js.native
  /**
    * This tweaks the animation easing
    */
  var easeFactor: js.UndefOr[Double] = js.native
  var elements: js.UndefOr[Boolean | PaceElementsOptions] = js.native
  var eventLag: js.UndefOr[Boolean | PaceEventLagOptions] = js.native
  /**
    * What is the minimum amount of time the bar should sit after the last update before disappearing
    */
  var ghostTime: js.UndefOr[Double] = js.native
  /**
    * How quickly should the bar be moving before it has any progress info from a new source in %/ms
    */
  var initialRate: js.UndefOr[Double] = js.native
  /**
    * Its easy for a bunch of the bar to be eaten in the first few frames before we know how much there is to load. This limits how much of the bar can be used per frame
    */
  var maxProgressPerFrame: js.UndefOr[Double] = js.native
  /**
    * What is the minimum amount of time the bar should be on the screen. Irrespective of this number, the bar will always be on screen for 33 * (100 / maxProgressPerFrame) + ghostTime ms.
    */
  var minTime: js.UndefOr[Double] = js.native
  /**
    * Should we restart the browser when pushState or replaceState is called?  (Generally means ajax navigation has occured)
    */
  var restartOnPushState: js.UndefOr[Boolean] = js.native
  /**
    * Should we show the progress bar for every ajax request (not just regular or ajax-y page navigation)? Set to false to disable. If so, how many ms does the request have to be running for before we show the progress?
    */
  var restartOnRequestAfter: js.UndefOr[Boolean | Double] = js.native
  /**
    * Should pace automatically start when the page is loaded, or should it wait for `start` to be called? Always false if pace is loaded with AMD or CommonJS.
    */
  var startOnPageLoad: js.UndefOr[Boolean] = js.native
  /**
    * What element should the pace element be appended to on the page?
    */
  var target: js.UndefOr[String] = js.native
}

object PaceOptions {
  @scala.inline
  def apply(): PaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaceOptions]
  }
  @scala.inline
  implicit class PaceOptionsOps[Self <: PaceOptions] (val x: Self) extends AnyVal {
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
    def setAjax(value: Boolean | PaceAjaxOptions): Self = this.set("ajax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjax: Self = this.set("ajax", js.undefined)
    @scala.inline
    def setCatchupTime(value: Double): Self = this.set("catchupTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatchupTime: Self = this.set("catchupTime", js.undefined)
    @scala.inline
    def setDocument(value: Boolean | String): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setEaseFactor(value: Double): Self = this.set("easeFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEaseFactor: Self = this.set("easeFactor", js.undefined)
    @scala.inline
    def setElements(value: Boolean | PaceElementsOptions): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    @scala.inline
    def setEventLag(value: Boolean | PaceEventLagOptions): Self = this.set("eventLag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventLag: Self = this.set("eventLag", js.undefined)
    @scala.inline
    def setGhostTime(value: Double): Self = this.set("ghostTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGhostTime: Self = this.set("ghostTime", js.undefined)
    @scala.inline
    def setInitialRate(value: Double): Self = this.set("initialRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialRate: Self = this.set("initialRate", js.undefined)
    @scala.inline
    def setMaxProgressPerFrame(value: Double): Self = this.set("maxProgressPerFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxProgressPerFrame: Self = this.set("maxProgressPerFrame", js.undefined)
    @scala.inline
    def setMinTime(value: Double): Self = this.set("minTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTime: Self = this.set("minTime", js.undefined)
    @scala.inline
    def setRestartOnPushState(value: Boolean): Self = this.set("restartOnPushState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestartOnPushState: Self = this.set("restartOnPushState", js.undefined)
    @scala.inline
    def setRestartOnRequestAfter(value: Boolean | Double): Self = this.set("restartOnRequestAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestartOnRequestAfter: Self = this.set("restartOnRequestAfter", js.undefined)
    @scala.inline
    def setStartOnPageLoad(value: Boolean): Self = this.set("startOnPageLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartOnPageLoad: Self = this.set("startOnPageLoad", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

