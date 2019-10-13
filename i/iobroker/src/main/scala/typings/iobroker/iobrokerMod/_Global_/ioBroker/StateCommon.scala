package typings.iobroker.iobrokerMod._Global_.ioBroker

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateCommon extends ObjectCommon {
  /** Custom settings for this state */
  var custom: js.UndefOr[Record[String, _]] = js.undefined
  /** the default value */
  var `def`: js.UndefOr[js.Any] = js.undefined
  /** description of this state */
  var desc: js.UndefOr[String] = js.undefined
  /** attached history information */
  var history: js.UndefOr[js.Any] = js.undefined
  /** maximum value */
  var max: js.UndefOr[Double] = js.undefined
  /** minimum value */
  var min: js.UndefOr[Double] = js.undefined
  /** if this state is readable */
  var read: Boolean
  /** role of the state (used in user interfaces to indicate which widget to choose) */
  @JSName("role")
  var role_StateCommon: String
  /**
    * Dictionary of possible values for this state in the form
    * <pre>
    * {
    *     "internal value 1": "displayed value 1",
    *     "internal value 2": "displayed value 2",
    *     ...
    * }
    * </pre>
    * In old ioBroker versions, this could also be a string of the form
    * "val1:text1;val2:text2" (now deprecated)
    */
  var states: js.UndefOr[(Record[String, String]) | String] = js.undefined
  /** Type of this state. See https://github.com/ioBroker/ioBroker/blob/master/doc/SCHEMA.md#state-commonrole for a detailed description */
  var `type`: js.UndefOr[CommonType] = js.undefined
  /** unit of the value */
  var unit: js.UndefOr[String] = js.undefined
  /** ID of a helper state indicating if the handler of this state is working */
  var workingID: js.UndefOr[String] = js.undefined
  /** if this state is writable */
  var write: Boolean
}

object StateCommon {
  @scala.inline
  def apply(
    name: String,
    read: Boolean,
    role: String,
    write: Boolean,
    custom: Record[String, _] = null,
    `def`: js.Any = null,
    desc: String = null,
    history: js.Any = null,
    icon: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    states: (Record[String, String]) | String = null,
    `type`: CommonType = null,
    unit: String = null,
    workingID: String = null
  ): StateCommon = {
    val __obj = js.Dynamic.literal(name = name, read = read, role = role, write = write)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (`def` != null) __obj.updateDynamic("def")(`def`)
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (history != null) __obj.updateDynamic("history")(history)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (workingID != null) __obj.updateDynamic("workingID")(workingID)
    __obj.asInstanceOf[StateCommon]
  }
}

