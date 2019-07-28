package typings.hubspotDashPace.HubSpotPaceInterfacesNs

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
  def apply(checkInterval: Int | Double = null, selectors: js.Array[String] = null): PaceElementsOptions = {
    val __obj = js.Dynamic.literal()
    if (checkInterval != null) __obj.updateDynamic("checkInterval")(checkInterval.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors)
    __obj.asInstanceOf[PaceElementsOptions]
  }
}

