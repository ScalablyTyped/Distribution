package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestinationStatuses extends js.Object {
  var `destination-uri`: js.UndefOr[String] = js.undefined
  var `images-completed`: js.UndefOr[Double] = js.undefined
  var `transmission-status`: js.UndefOr[TransmissionStatus] = js.undefined
}

object DestinationStatuses {
  @scala.inline
  def apply(
    `destination-uri`: String = null,
    `images-completed`: js.UndefOr[Double] = js.undefined,
    `transmission-status`: TransmissionStatus = null
  ): DestinationStatuses = {
    val __obj = js.Dynamic.literal()
    if (`destination-uri` != null) __obj.updateDynamic("destination-uri")(`destination-uri`.asInstanceOf[js.Any])
    if (!js.isUndefined(`images-completed`)) __obj.updateDynamic("images-completed")(`images-completed`.get.asInstanceOf[js.Any])
    if (`transmission-status` != null) __obj.updateDynamic("transmission-status")(`transmission-status`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationStatuses]
  }
}

