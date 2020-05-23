package typings.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerEventsApplicationObject extends js.Object {
  /** a string or array of strings specifying the event channels available. Defaults to no channel restrictions (event updates can specify a channel or not). */
  var channels: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * if true, the data object passed to server.events.emit() is cloned before it is passed to the listeners (unless an override specified by each listener). Defaults to false (data is passed as-is).
    */
  @JSName("clone")
  var clone_FServerEventsApplicationObject: js.UndefOr[Boolean] = js.undefined
  /** the event name string (required). */
  var name: String
  /**
    * if true, the same event name can be registered multiple times where the second registration is ignored. Note that if the registration config is changed between registrations, only the first
    * configuration is used. Defaults to false (a duplicate registration will throw an error).
    */
  var shared: js.UndefOr[Boolean] = js.undefined
  /**
    * if true, the data object passed to server.event.emit() must be an array and the listener method is called with each array element passed as a separate argument (unless an override specified
    * by each listener). This should only be used when the emitted data structure is known and predictable. Defaults to false (data is emitted as a single argument regardless of its type).
    */
  var spread: js.UndefOr[Boolean] = js.undefined
  /**
    * if true and the criteria object passed to server.event.emit() includes tags, the tags are mapped to an object (where each tag string is the key and the value is true) which is appended to
    * the arguments list at the end. A configuration override can be set by each listener. Defaults to false.
    */
  var tags: js.UndefOr[Boolean] = js.undefined
}

object ServerEventsApplicationObject {
  @scala.inline
  def apply(
    name: String,
    channels: String | js.Array[String] = null,
    clone: js.UndefOr[Boolean] = js.undefined,
    shared: js.UndefOr[Boolean] = js.undefined,
    spread: js.UndefOr[Boolean] = js.undefined,
    tags: js.UndefOr[Boolean] = js.undefined
  ): ServerEventsApplicationObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spread)) __obj.updateDynamic("spread")(spread.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerEventsApplicationObject]
  }
}

