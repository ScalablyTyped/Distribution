package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputAttributes extends js.Object {
  var `input-auto-scaling`: js.UndefOr[Boolean] = js.undefined
  var `input-auto-skew-correction`: js.UndefOr[Boolean] = js.undefined
  var `input-brightness`: js.UndefOr[Double] = js.undefined
  var `input-color-mode`: js.UndefOr[InputColorMode] = js.undefined
  var `input-content-type`: js.UndefOr[InputContentType] = js.undefined
  var `input-contrast`: js.UndefOr[Double] = js.undefined
  var `input-film-scan-mode`: js.UndefOr[InputFilmScanMode] = js.undefined
  var `input-images-to-transfer`: js.UndefOr[Double] = js.undefined
  var `input-media`: js.UndefOr[MediaName | MediaSizeName] = js.undefined
  var `input-orientation-requested`: js.UndefOr[OrientationRequested] = js.undefined
  var `input-quality`: js.UndefOr[PrintQuality] = js.undefined
  var `input-resolution`: js.UndefOr[Resolution] = js.undefined
  var `input-scaling-height`: js.UndefOr[Double] = js.undefined
  var `input-scaling-width`: js.UndefOr[Double] = js.undefined
  var `input-scan-regions`: js.UndefOr[js.Array[PPScanRegions]] = js.undefined
  var `input-sharpness`: js.UndefOr[Double] = js.undefined
  var `input-sides`: js.UndefOr[Sides] = js.undefined
  var `input-source`: js.UndefOr[InputSource] = js.undefined
}

object InputAttributes {
  @scala.inline
  def apply(
    `input-auto-scaling`: js.UndefOr[Boolean] = js.undefined,
    `input-auto-skew-correction`: js.UndefOr[Boolean] = js.undefined,
    `input-brightness`: js.UndefOr[Double] = js.undefined,
    `input-color-mode`: InputColorMode = null,
    `input-content-type`: InputContentType = null,
    `input-contrast`: js.UndefOr[Double] = js.undefined,
    `input-film-scan-mode`: InputFilmScanMode = null,
    `input-images-to-transfer`: js.UndefOr[Double] = js.undefined,
    `input-media`: MediaName | MediaSizeName = null,
    `input-orientation-requested`: OrientationRequested = null,
    `input-quality`: PrintQuality = null,
    `input-resolution`: Resolution = null,
    `input-scaling-height`: js.UndefOr[Double] = js.undefined,
    `input-scaling-width`: js.UndefOr[Double] = js.undefined,
    `input-scan-regions`: js.Array[PPScanRegions] = null,
    `input-sharpness`: js.UndefOr[Double] = js.undefined,
    `input-sides`: Sides = null,
    `input-source`: InputSource = null
  ): InputAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`input-auto-scaling`)) __obj.updateDynamic("input-auto-scaling")(`input-auto-scaling`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`input-auto-skew-correction`)) __obj.updateDynamic("input-auto-skew-correction")(`input-auto-skew-correction`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`input-brightness`)) __obj.updateDynamic("input-brightness")(`input-brightness`.get.asInstanceOf[js.Any])
    if (`input-color-mode` != null) __obj.updateDynamic("input-color-mode")(`input-color-mode`.asInstanceOf[js.Any])
    if (`input-content-type` != null) __obj.updateDynamic("input-content-type")(`input-content-type`.asInstanceOf[js.Any])
    if (!js.isUndefined(`input-contrast`)) __obj.updateDynamic("input-contrast")(`input-contrast`.get.asInstanceOf[js.Any])
    if (`input-film-scan-mode` != null) __obj.updateDynamic("input-film-scan-mode")(`input-film-scan-mode`.asInstanceOf[js.Any])
    if (!js.isUndefined(`input-images-to-transfer`)) __obj.updateDynamic("input-images-to-transfer")(`input-images-to-transfer`.get.asInstanceOf[js.Any])
    if (`input-media` != null) __obj.updateDynamic("input-media")(`input-media`.asInstanceOf[js.Any])
    if (`input-orientation-requested` != null) __obj.updateDynamic("input-orientation-requested")(`input-orientation-requested`.asInstanceOf[js.Any])
    if (`input-quality` != null) __obj.updateDynamic("input-quality")(`input-quality`.asInstanceOf[js.Any])
    if (`input-resolution` != null) __obj.updateDynamic("input-resolution")(`input-resolution`.asInstanceOf[js.Any])
    if (!js.isUndefined(`input-scaling-height`)) __obj.updateDynamic("input-scaling-height")(`input-scaling-height`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`input-scaling-width`)) __obj.updateDynamic("input-scaling-width")(`input-scaling-width`.get.asInstanceOf[js.Any])
    if (`input-scan-regions` != null) __obj.updateDynamic("input-scan-regions")(`input-scan-regions`.asInstanceOf[js.Any])
    if (!js.isUndefined(`input-sharpness`)) __obj.updateDynamic("input-sharpness")(`input-sharpness`.get.asInstanceOf[js.Any])
    if (`input-sides` != null) __obj.updateDynamic("input-sides")(`input-sides`.asInstanceOf[js.Any])
    if (`input-source` != null) __obj.updateDynamic("input-source")(`input-source`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputAttributes]
  }
}

