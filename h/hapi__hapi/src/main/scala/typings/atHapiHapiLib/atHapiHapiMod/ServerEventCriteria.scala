package typings
package atHapiHapiLib.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerEventCriteria[T] extends js.Object {
  /**
    * a string or array of strings specifying the event channels to subscribe to. If the event registration specified a list of allowed channels, the channels array must match the allowed
    * channels. If channels are specified, event updates without any channel designation will not be included in the subscription. Defaults to no channels filter.
    */
  var channels: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** if true, the data object passed to server.event.emit() is cloned before it is passed to the listener method. Defaults to the event registration option (which defaults to false). */
  @JSName("clone")
  var clone_FServerEventCriteria: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * a positive integer indicating the number of times the listener can be called after which the subscription is automatically removed. A count of 1 is the same as calling server.events.once().
    * Defaults to no limit.
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    * filter - the event tags (if present) to subscribe to which can be one of:
    * * a tag string.
    * * an array of tag strings.
    * * an object with the following:
    * * * tags - a tag string or array of tag strings.
    * * * all - if true, all tags must be present for the event update to match the subscription. Defaults to false (at least one matching tag).
    */
  var filter: js.UndefOr[java.lang.String | js.Array[java.lang.String] | atHapiHapiLib.Anon_All] = js.undefined
  /** (required) the event name string. */
  var name: T
  /**
    * if true, and the data object passed to server.event.emit() is an array, the listener method is called with each array element passed as a separate argument. This should only be used
    * when the emitted data structure is known and predictable. Defaults to the event registration option (which defaults to false).
    */
  var spread: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * if true and the criteria object passed to server.event.emit() includes tags, the tags are mapped to an object (where each tag string is the key and the value is true) which is appended
    * to the arguments list at the end. Defaults to the event registration option (which defaults to false).
    */
  var tags: js.UndefOr[scala.Boolean] = js.undefined
}

object ServerEventCriteria {
  @scala.inline
  def apply[T](
    name: T,
    channels: java.lang.String | js.Array[java.lang.String] = null,
    clone: js.UndefOr[scala.Boolean] = js.undefined,
    count: scala.Int | scala.Double = null,
    filter: java.lang.String | js.Array[java.lang.String] | atHapiHapiLib.Anon_All = null,
    spread: js.UndefOr[scala.Boolean] = js.undefined,
    tags: js.UndefOr[scala.Boolean] = js.undefined
  ): ServerEventCriteria[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(spread)) __obj.updateDynamic("spread")(spread)
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ServerEventCriteria[T]]
  }
}

