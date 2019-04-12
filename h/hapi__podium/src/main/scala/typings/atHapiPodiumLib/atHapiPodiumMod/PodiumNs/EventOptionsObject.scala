package typings
package atHapiPodiumLib.atHapiPodiumMod.PodiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOptionsObject extends _Events {
  /** a string or array of strings specifying the event channels available. Defaults to no channel restrictions (event updates can specify a channel or not). */
  var channels: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** if true, the data object passed to podium.emit() is cloned before it is passed to the listeners (unless an override specified by each listener). Defaults to false (data is passed as-is). */
  @JSName("clone")
  var clone_FEventOptionsObject: js.UndefOr[scala.Boolean] = js.undefined
  /** the event name string (required). */
  var name: java.lang.String
  /** if true, the same event name can be registered multiple times where the second registration is ignored. Note that if the registration config is changed between registrations, only the first configuration is used. Defaults to false (a duplicate registration will throw an error). */
  var shared: js.UndefOr[scala.Boolean] = js.undefined
  /** if true, the data object passed to podium.emit() must be an array and the listener method is called with each array element passed as a separate argument (unless an override specified by each listener). This should only be used when the emitted data structure is known and predictable. Defaults to false (data is emitted as a single argument regardless of its type). */
  var spread: js.UndefOr[scala.Boolean] = js.undefined
  /** if true and the criteria object passed to podium.emit() includes tags, the tags are mapped to an object (where each tag string is the key and the value is true) which is appended to the arguments list at the end (but before the callback argument if block is set). A configuration override can be set by each listener. Defaults to false. */
  var tags: js.UndefOr[scala.Boolean] = js.undefined
}

object EventOptionsObject {
  @scala.inline
  def apply(
    name: java.lang.String,
    channels: java.lang.String | js.Array[java.lang.String] = null,
    clone: js.UndefOr[scala.Boolean] = js.undefined,
    shared: js.UndefOr[scala.Boolean] = js.undefined,
    spread: js.UndefOr[scala.Boolean] = js.undefined,
    tags: js.UndefOr[scala.Boolean] = js.undefined
  ): EventOptionsObject = {
    val __obj = js.Dynamic.literal(name = name)
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone)
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared)
    if (!js.isUndefined(spread)) __obj.updateDynamic("spread")(spread)
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[EventOptionsObject]
  }
}

