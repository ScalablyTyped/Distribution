package typings.jackrabbit.mod.jackrabbit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amqplib.amqplib.Options.AssertQueue & {  name ? :string,   key ? :string,   keys ? :std.ReadonlyArray<string>,   prefetch ? :number} */
trait QueueOptions extends js.Object {
  var arguments: js.UndefOr[js.Any] = js.undefined
  var autoDelete: js.UndefOr[Boolean] = js.undefined
  var deadLetterExchange: js.UndefOr[String] = js.undefined
  var deadLetterRoutingKey: js.UndefOr[String] = js.undefined
  var durable: js.UndefOr[Boolean] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var maxPriority: js.UndefOr[Double] = js.undefined
  var messageTtl: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var prefetch: js.UndefOr[Double] = js.undefined
}

object QueueOptions {
  @scala.inline
  def apply(
    arguments: js.Any = null,
    autoDelete: js.UndefOr[Boolean] = js.undefined,
    deadLetterExchange: String = null,
    deadLetterRoutingKey: String = null,
    durable: js.UndefOr[Boolean] = js.undefined,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    expires: Int | Double = null,
    key: String = null,
    keys: js.Array[String] = null,
    maxLength: Int | Double = null,
    maxPriority: Int | Double = null,
    messageTtl: Int | Double = null,
    name: String = null,
    prefetch: Int | Double = null
  ): QueueOptions = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete.asInstanceOf[js.Any])
    if (deadLetterExchange != null) __obj.updateDynamic("deadLetterExchange")(deadLetterExchange.asInstanceOf[js.Any])
    if (deadLetterRoutingKey != null) __obj.updateDynamic("deadLetterRoutingKey")(deadLetterRoutingKey.asInstanceOf[js.Any])
    if (!js.isUndefined(durable)) __obj.updateDynamic("durable")(durable.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxPriority != null) __obj.updateDynamic("maxPriority")(maxPriority.asInstanceOf[js.Any])
    if (messageTtl != null) __obj.updateDynamic("messageTtl")(messageTtl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefetch != null) __obj.updateDynamic("prefetch")(prefetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueOptions]
  }
}

