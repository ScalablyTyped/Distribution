package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Materials extends js.Object {
  var `material-amount`: js.UndefOr[Double] = js.undefined
  var `material-amount-units`: js.UndefOr[MaterialAmountUnits] = js.undefined
  var `material-color`: js.UndefOr[String] = js.undefined
  var `material-diameter`: js.UndefOr[Double] = js.undefined
  var `material-diameter-tolerance`: js.UndefOr[Double] = js.undefined
  var `material-fill-density`: js.UndefOr[Double] = js.undefined
  var `material-key`: js.UndefOr[String] = js.undefined
  var `material-name`: js.UndefOr[String] = js.undefined
  var `material-nozzle-diameter`: js.UndefOr[Double] = js.undefined
  var `material-purpose`: js.UndefOr[js.Array[MaterialPurpose]] = js.undefined
  var `material-rate`: js.UndefOr[Double] = js.undefined
  var `material-rate-units`: js.UndefOr[MaterialRateUnits] = js.undefined
  var `material-retraction`: js.UndefOr[Boolean] = js.undefined
  var `material-shell-thickness`: js.UndefOr[Double] = js.undefined
  var `material-temperature`: js.UndefOr[Double] = js.undefined
  var `material-type`: js.UndefOr[MaterialType] = js.undefined
}

object Materials {
  @scala.inline
  def apply(
    `material-amount`: js.UndefOr[Double] = js.undefined,
    `material-amount-units`: MaterialAmountUnits = null,
    `material-color`: String = null,
    `material-diameter`: js.UndefOr[Double] = js.undefined,
    `material-diameter-tolerance`: js.UndefOr[Double] = js.undefined,
    `material-fill-density`: js.UndefOr[Double] = js.undefined,
    `material-key`: String = null,
    `material-name`: String = null,
    `material-nozzle-diameter`: js.UndefOr[Double] = js.undefined,
    `material-purpose`: js.Array[MaterialPurpose] = null,
    `material-rate`: js.UndefOr[Double] = js.undefined,
    `material-rate-units`: MaterialRateUnits = null,
    `material-retraction`: js.UndefOr[Boolean] = js.undefined,
    `material-shell-thickness`: js.UndefOr[Double] = js.undefined,
    `material-temperature`: js.UndefOr[Double] = js.undefined,
    `material-type`: MaterialType = null
  ): Materials = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`material-amount`)) __obj.updateDynamic("material-amount")(`material-amount`.get.asInstanceOf[js.Any])
    if (`material-amount-units` != null) __obj.updateDynamic("material-amount-units")(`material-amount-units`.asInstanceOf[js.Any])
    if (`material-color` != null) __obj.updateDynamic("material-color")(`material-color`.asInstanceOf[js.Any])
    if (!js.isUndefined(`material-diameter`)) __obj.updateDynamic("material-diameter")(`material-diameter`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`material-diameter-tolerance`)) __obj.updateDynamic("material-diameter-tolerance")(`material-diameter-tolerance`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`material-fill-density`)) __obj.updateDynamic("material-fill-density")(`material-fill-density`.get.asInstanceOf[js.Any])
    if (`material-key` != null) __obj.updateDynamic("material-key")(`material-key`.asInstanceOf[js.Any])
    if (`material-name` != null) __obj.updateDynamic("material-name")(`material-name`.asInstanceOf[js.Any])
    if (!js.isUndefined(`material-nozzle-diameter`)) __obj.updateDynamic("material-nozzle-diameter")(`material-nozzle-diameter`.get.asInstanceOf[js.Any])
    if (`material-purpose` != null) __obj.updateDynamic("material-purpose")(`material-purpose`.asInstanceOf[js.Any])
    if (!js.isUndefined(`material-rate`)) __obj.updateDynamic("material-rate")(`material-rate`.get.asInstanceOf[js.Any])
    if (`material-rate-units` != null) __obj.updateDynamic("material-rate-units")(`material-rate-units`.asInstanceOf[js.Any])
    if (!js.isUndefined(`material-retraction`)) __obj.updateDynamic("material-retraction")(`material-retraction`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`material-shell-thickness`)) __obj.updateDynamic("material-shell-thickness")(`material-shell-thickness`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`material-temperature`)) __obj.updateDynamic("material-temperature")(`material-temperature`.get.asInstanceOf[js.Any])
    if (`material-type` != null) __obj.updateDynamic("material-type")(`material-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Materials]
  }
}

