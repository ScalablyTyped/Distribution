package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.CommonType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<iobroker.iobroker.<global>.ioBroker.StateCommon> */
trait PartialStateCommon extends js.Object {
  var alias: js.UndefOr[Id] = js.undefined
  var custom: js.UndefOr[Record[String, _]] = js.undefined
  var `def`: js.UndefOr[js.Any] = js.undefined
  var desc: js.UndefOr[String] = js.undefined
  var history: js.UndefOr[js.Any] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var read: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var states: js.UndefOr[(Record[String, String]) | String] = js.undefined
  var `type`: js.UndefOr[CommonType] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
  var workingID: js.UndefOr[String] = js.undefined
  var write: js.UndefOr[Boolean] = js.undefined
}

object PartialStateCommon {
  @scala.inline
  def apply(
    alias: Id = null,
    custom: Record[String, _] = null,
    `def`: js.Any = null,
    desc: String = null,
    history: js.Any = null,
    icon: String = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    name: String = null,
    read: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    states: (Record[String, String]) | String = null,
    `type`: CommonType = null,
    unit: String = null,
    workingID: String = null,
    write: js.UndefOr[Boolean] = js.undefined
  ): PartialStateCommon = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (`def` != null) __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (workingID != null) __obj.updateDynamic("workingID")(workingID.asInstanceOf[js.Any])
    if (!js.isUndefined(write)) __obj.updateDynamic("write")(write.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStateCommon]
  }
}

