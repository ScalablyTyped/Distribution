package typings
package mapsjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Descriptor extends js.Object {
  var descriptor: js.UndefOr[js.Any] = js.undefined
  var enableTileFadeIn: js.UndefOr[scala.Boolean] = js.undefined
  var maxConcurrentRequests: js.UndefOr[scala.Double] = js.undefined
  var maxZoomLevel: js.UndefOr[scala.Double] = js.undefined
  var minZoomLevel: js.UndefOr[scala.Double] = js.undefined
  var notifyErrorAction: js.UndefOr[js.Function1[/* msg */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  var notifyLoadingQueueHasEmptiedAction: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var renderer: js.UndefOr[mapsjsLib.mapsjsMod.tileNs.renderer] = js.undefined
  var requestProcessor: js.UndefOr[js.Any] = js.undefined
  var requestor: js.UndefOr[mapsjsLib.mapsjsMod.tileNs.requestor] = js.undefined
  var retainInterlevelContent: js.UndefOr[scala.Boolean] = js.undefined
  var tileBleedPix: js.UndefOr[scala.Double] = js.undefined
  var useBackdrop: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Descriptor {
  @scala.inline
  def apply(
    descriptor: js.Any = null,
    enableTileFadeIn: js.UndefOr[scala.Boolean] = js.undefined,
    maxConcurrentRequests: scala.Int | scala.Double = null,
    maxZoomLevel: scala.Int | scala.Double = null,
    minZoomLevel: scala.Int | scala.Double = null,
    notifyErrorAction: js.Function1[/* msg */ js.UndefOr[java.lang.String], scala.Unit] = null,
    notifyLoadingQueueHasEmptiedAction: js.Function0[scala.Unit] = null,
    opacity: scala.Int | scala.Double = null,
    renderer: mapsjsLib.mapsjsMod.tileNs.renderer = null,
    requestProcessor: js.Any = null,
    requestor: mapsjsLib.mapsjsMod.tileNs.requestor = null,
    retainInterlevelContent: js.UndefOr[scala.Boolean] = js.undefined,
    tileBleedPix: scala.Int | scala.Double = null,
    useBackdrop: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Descriptor = {
    val __obj = js.Dynamic.literal()
    if (descriptor != null) __obj.updateDynamic("descriptor")(descriptor)
    if (!js.isUndefined(enableTileFadeIn)) __obj.updateDynamic("enableTileFadeIn")(enableTileFadeIn)
    if (maxConcurrentRequests != null) __obj.updateDynamic("maxConcurrentRequests")(maxConcurrentRequests.asInstanceOf[js.Any])
    if (maxZoomLevel != null) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.asInstanceOf[js.Any])
    if (minZoomLevel != null) __obj.updateDynamic("minZoomLevel")(minZoomLevel.asInstanceOf[js.Any])
    if (notifyErrorAction != null) __obj.updateDynamic("notifyErrorAction")(notifyErrorAction)
    if (notifyLoadingQueueHasEmptiedAction != null) __obj.updateDynamic("notifyLoadingQueueHasEmptiedAction")(notifyLoadingQueueHasEmptiedAction)
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

