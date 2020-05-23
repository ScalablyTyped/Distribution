package typings.hubspotPace.HubSpotPaceInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaceElementsOptions extends js.Object {
  /**
    * How frequently in ms should we check for the elements being tested for using the element monitor?
    */
  var checkInterval: js.UndefOr[Double] = js.undefined
  /**
    * What elements should we wait for before deciding the page is fully loaded (not required)
    */
  var selectors: js.UndefOr[js.Array[String]] = js.undefined
}

object PaceElementsOptions {
  @scala.inline
  def apply(checkInterval: js.UndefOr[Double] = js.undefined, selectors: js.Array[String] = null): PaceElementsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkInterval)) __obj.updateDynamic("checkInterval")(checkInterval.get.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaceElementsOptions]
  }
}

