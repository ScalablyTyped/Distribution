package typings.heremaps.H.service.venues.TileProvider

import typings.heremaps.H.service.venues.Space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration object which can be used to initialize the TileProvider.
  * @property tileCacheSize {number=} - The number of fully rendered spatial tiles that are cached for immediate reuse, default is 32
  * @property pixelRatio {number=} - The pixel ratio to use for over-sampling in cases of high-resolution displays
  * @property onSpaceCreated {function(H.service.venues.Space)=} - A callback function that is called on every created space (see H.service.venues.Space) object. The function can be
  * used for space object styling.
  */
trait Options extends js.Object {
  var onSpaceCreated: js.UndefOr[js.Function1[/* space */ Space, Unit]] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var tileCacheSize: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    onSpaceCreated: /* space */ Space => Unit = null,
    pixelRatio: Int | Double = null,
    tileCacheSize: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (onSpaceCreated != null) __obj.updateDynamic("onSpaceCreated")(js.Any.fromFunction1(onSpaceCreated))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (tileCacheSize != null) __obj.updateDynamic("tileCacheSize")(tileCacheSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

