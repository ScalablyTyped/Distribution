package typings.mapsjs.anon

import typings.mapsjs.mod.tile.renderer
import typings.mapsjs.mod.tile.requestor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descriptor extends js.Object {
  var descriptor: js.UndefOr[js.Any] = js.undefined
  var enableTileFadeIn: js.UndefOr[Boolean] = js.undefined
  var maxConcurrentRequests: js.UndefOr[Double] = js.undefined
  var maxZoomLevel: js.UndefOr[Double] = js.undefined
  var minZoomLevel: js.UndefOr[Double] = js.undefined
  var notifyErrorAction: js.UndefOr[js.Function1[/* msg */ js.UndefOr[String], Unit]] = js.undefined
  var notifyLoadingQueueHasEmptiedAction: js.UndefOr[js.Function0[Unit]] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var renderer: js.UndefOr[typings.mapsjs.mod.tile.renderer] = js.undefined
  var requestProcessor: js.UndefOr[js.Any] = js.undefined
  var requestor: js.UndefOr[typings.mapsjs.mod.tile.requestor] = js.undefined
  var retainInterlevelContent: js.UndefOr[Boolean] = js.undefined
  var tileBleedPix: js.UndefOr[Double] = js.undefined
  var useBackdrop: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Descriptor {
  @scala.inline
  def apply(
    descriptor: js.Any = null,
    enableTileFadeIn: js.UndefOr[Boolean] = js.undefined,
    maxConcurrentRequests: js.UndefOr[Double] = js.undefined,
    maxZoomLevel: js.UndefOr[Double] = js.undefined,
    minZoomLevel: js.UndefOr[Double] = js.undefined,
    notifyErrorAction: /* msg */ js.UndefOr[String] => Unit = null,
    notifyLoadingQueueHasEmptiedAction: () => Unit = null,
    opacity: js.UndefOr[Double] = js.undefined,
    renderer: renderer = null,
    requestProcessor: js.Any = null,
    requestor: requestor = null,
    retainInterlevelContent: js.UndefOr[Boolean] = js.undefined,
    tileBleedPix: js.UndefOr[Double] = js.undefined,
    useBackdrop: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Descriptor = {
    val __obj = js.Dynamic.literal()
    if (descriptor != null) __obj.updateDynamic("descriptor")(descriptor.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTileFadeIn)) __obj.updateDynamic("enableTileFadeIn")(enableTileFadeIn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConcurrentRequests)) __obj.updateDynamic("maxConcurrentRequests")(maxConcurrentRequests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoomLevel)) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoomLevel)) __obj.updateDynamic("minZoomLevel")(minZoomLevel.get.asInstanceOf[js.Any])
    if (notifyErrorAction != null) __obj.updateDynamic("notifyErrorAction")(js.Any.fromFunction1(notifyErrorAction))
    if (notifyLoadingQueueHasEmptiedAction != null) __obj.updateDynamic("notifyLoadingQueueHasEmptiedAction")(js.Any.fromFunction0(notifyLoadingQueueHasEmptiedAction))
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (requestProcessor != null) __obj.updateDynamic("requestProcessor")(requestProcessor.asInstanceOf[js.Any])
    if (requestor != null) __obj.updateDynamic("requestor")(requestor.asInstanceOf[js.Any])
    if (!js.isUndefined(retainInterlevelContent)) __obj.updateDynamic("retainInterlevelContent")(retainInterlevelContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileBleedPix)) __obj.updateDynamic("tileBleedPix")(tileBleedPix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useBackdrop)) __obj.updateDynamic("useBackdrop")(useBackdrop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptor]
  }
}

