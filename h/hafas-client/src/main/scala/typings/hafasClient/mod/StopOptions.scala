package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopOptions extends js.Object {
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.undefined
  /**
    * Language of the results
    * @default en
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * parse & expose lines at the stop/station?
    * @default false
    */
  var linesOfStops: js.UndefOr[Boolean] = js.undefined
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.undefined
}

object StopOptions {
  @scala.inline
  def apply(
    entrances: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    linesOfStops: js.UndefOr[Boolean] = js.undefined,
    subStops: js.UndefOr[Boolean] = js.undefined
  ): StopOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entrances)) __obj.updateDynamic("entrances")(entrances.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(linesOfStops)) __obj.updateDynamic("linesOfStops")(linesOfStops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subStops)) __obj.updateDynamic("subStops")(subStops.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopOptions]
  }
}

