package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProofPrint extends js.Object {
  var media: js.UndefOr[Media] = js.undefined
  var `media-col`: js.UndefOr[MediaInterface] = js.undefined
  var `proof-print-copies`: js.UndefOr[Double] = js.undefined
}

object ProofPrint {
  @scala.inline
  def apply(
    media: Media = null,
    `media-col`: MediaInterface = null,
    `proof-print-copies`: js.UndefOr[Double] = js.undefined
  ): ProofPrint = {
    val __obj = js.Dynamic.literal()
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (`media-col` != null) __obj.updateDynamic("media-col")(`media-col`.asInstanceOf[js.Any])
    if (!js.isUndefined(`proof-print-copies`)) __obj.updateDynamic("proof-print-copies")(`proof-print-copies`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofPrint]
  }
}

