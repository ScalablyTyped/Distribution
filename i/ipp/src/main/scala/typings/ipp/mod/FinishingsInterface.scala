package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinishingsInterface extends js.Object {
  var baling: js.UndefOr[FinishingBailing] = js.undefined
  var binding: js.UndefOr[FinishingBinding] = js.undefined
  var coating: js.UndefOr[FinishingCoating] = js.undefined
  var covering: js.UndefOr[FinishingCovering] = js.undefined
  var `finishing-template`: js.UndefOr[Finishings] = js.undefined
  var folding: js.UndefOr[js.Array[FinishingFolding]] = js.undefined
  var `imposition-template`: js.UndefOr[ImpositionTemplate] = js.undefined
  var laminating: js.UndefOr[FinishingLaminating] = js.undefined
  var `media-sheets-supported`: js.UndefOr[String] = js.undefined
  var `media-size`: js.UndefOr[MediaSize] = js.undefined
  var `media-size-name`: js.UndefOr[String] = js.undefined
  var punching: js.UndefOr[FinishingPunching] = js.undefined
  var stitching: js.UndefOr[FinishingStitching] = js.undefined
  var trimming: js.UndefOr[js.Array[FinishingTrimming]] = js.undefined
}

object FinishingsInterface {
  @scala.inline
  def apply(
    baling: FinishingBailing = null,
    binding: FinishingBinding = null,
    coating: FinishingCoating = null,
    covering: FinishingCovering = null,
    `finishing-template`: Finishings = null,
    folding: js.Array[FinishingFolding] = null,
    `imposition-template`: ImpositionTemplate = null,
    laminating: FinishingLaminating = null,
    `media-sheets-supported`: String = null,
    `media-size`: MediaSize = null,
    `media-size-name`: String = null,
    punching: FinishingPunching = null,
    stitching: FinishingStitching = null,
    trimming: js.Array[FinishingTrimming] = null
  ): FinishingsInterface = {
    val __obj = js.Dynamic.literal()
    if (baling != null) __obj.updateDynamic("baling")(baling.asInstanceOf[js.Any])
    if (binding != null) __obj.updateDynamic("binding")(binding.asInstanceOf[js.Any])
    if (coating != null) __obj.updateDynamic("coating")(coating.asInstanceOf[js.Any])
    if (covering != null) __obj.updateDynamic("covering")(covering.asInstanceOf[js.Any])
    if (`finishing-template` != null) __obj.updateDynamic("finishing-template")(`finishing-template`.asInstanceOf[js.Any])
    if (folding != null) __obj.updateDynamic("folding")(folding.asInstanceOf[js.Any])
    if (`imposition-template` != null) __obj.updateDynamic("imposition-template")(`imposition-template`.asInstanceOf[js.Any])
    if (laminating != null) __obj.updateDynamic("laminating")(laminating.asInstanceOf[js.Any])
    if (`media-sheets-supported` != null) __obj.updateDynamic("media-sheets-supported")(`media-sheets-supported`.asInstanceOf[js.Any])
    if (`media-size` != null) __obj.updateDynamic("media-size")(`media-size`.asInstanceOf[js.Any])
    if (`media-size-name` != null) __obj.updateDynamic("media-size-name")(`media-size-name`.asInstanceOf[js.Any])
    if (punching != null) __obj.updateDynamic("punching")(punching.asInstanceOf[js.Any])
    if (stitching != null) __obj.updateDynamic("stitching")(stitching.asInstanceOf[js.Any])
    if (trimming != null) __obj.updateDynamic("trimming")(trimming.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishingsInterface]
  }
}

