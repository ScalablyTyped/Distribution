package typings.mapsjs

import typings.mapsjs.mapsjsMod.tile.renderer
import typings.mapsjs.mapsjsMod.tile.requestor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Descriptor extends js.Object {
  var descriptor: js.UndefOr[js.Any] = js.undefined
  var enableTileFadeIn: js.UndefOr[Boolean] = js.undefined
  var maxConcurrentRequests: js.UndefOr[Double] = js.undefined
  var maxZoomLevel: js.UndefOr[Double] = js.undefined
  var minZoomLevel: js.UndefOr[Double] = js.undefined
  var notifyErrorAction: js.UndefOr[js.Function1[/* msg */ js.UndefOr[String], Unit]] = js.undefined
  var notifyLoadingQueueHasEmptiedAction: js.UndefOr[js.Function0[Unit]] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var renderer: js.UndefOr[typings.mapsjs.mapsjsMod.tile.renderer] = js.undefined
  var requestProcessor: js.UndefOr[js.Any] = js.undefined
  var requestor: js.UndefOr[typings.mapsjs.mapsjsMod.tile.requestor] = js.undefined
  var retainInterlevelContent: js.UndefOr[Boolean] = js.undefined
  var tileBleedPix: js.UndefOr[Double] = js.undefined
  var useBackdrop: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Anon_Descriptor {
  @scala.inline
  def apply(
    descriptor: js.Any = null,
    enableTileFadeIn: js.UndefOr[Boolean] = js.undefined,
    maxConcurrentRequests: Int | Double = null,
    maxZoomLevel: Int | Double = null,
    minZoomLevel: Int | Double = null,
    notifyErrorAction: /* msg */ js.UndefOr[String] => Unit = null,
    notifyLoadingQueueHasEmptiedAction: () => Unit = null,
    opacity: Int | Double = null,
    renderer: renderer = null,
    requestProcessor: js.Any = null,
    requestor: requestor = null,
    retainInterlevelContent: js.UndefOr[Boolean] = js.undefined,
    tileBleedPix: Int | Double = null,
    useBackdrop: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Anon_Descriptor = {
    val __obj = js.Dynamic.literal()
    if (descriptor != null) __obj.updateDynamic("descriptor")(descriptor)
    if (!js.isUndefined(enableTileFadeIn)) __obj.updateDynamic("enableTileFadeIn")(enableTileFadeIn)
    if (maxConcurrentRequests != null) __obj.updateDynamic("maxConcurrentRequests")(maxConcurrentRequests.asInstanceOf[js.Any])
    if (maxZoomLevel != null) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.asInstanceOf[js.Any])
    if (minZoomLevel != null) __obj.updateDynamic("minZoomLevel")(minZoomLevel.asInstanceOf[js.Any])
    if (notifyErrorAction != null) __obj.updateDynamic("notifyErrorAction")(js.Any.fromFunction1(notifyErrorAction))
    if (notifyLoadingQueueHasEmptiedAction != null) __obj.updateDynamic("notifyLoadingQueueHasEmptiedAction")(js.Any.fromFunction0(notifyLoadingQueueHasEmptiedAction))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (requestProcessor != null) __obj.updateDynamic("requestProcessor")(requestProcessor)
    if (requestor != null) __obj.updateDynamic("requestor")(requestor)
    if (!js.isUndefined(retainInterlevelContent)) __obj.updateDynamic("retainInterlevelContent")(retainInterlevelContent)
    if (tileBleedPix != null) __obj.updateDynamic("tileBleedPix")(tileBleedPix.asInstanceOf[js.Any])
    if (!js.isUndefined(useBackdrop)) __obj.updateDynamic("useBackdrop")(useBackdrop)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Anon_Descriptor]
  }
}

