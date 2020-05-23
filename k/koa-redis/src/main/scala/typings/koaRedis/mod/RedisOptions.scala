package typings.koaRedis.mod

import org.scalablytyped.runtime.StringDictionary
import typings.redis.mod.ClientOpts
import typings.redis.mod.RetryStrategyOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisOptions extends ClientOpts {
  var client: js.UndefOr[js.Any] = js.undefined
  var duplicate: js.UndefOr[Boolean] = js.undefined
}

object RedisOptions {
  @scala.inline
  def apply(
    auth_pass: String = null,
    client: js.Any = null,
    connect_timeout: js.UndefOr[Double] = js.undefined,
    db: String | Double = null,
    detect_buffers: js.UndefOr[Boolean] = js.undefined,
    duplicate: js.UndefOr[Boolean] = js.undefined,
    enable_offline_queue: js.UndefOr[Boolean] = js.undefined,
    family: String = null,
    host: String = null,
    max_attempts: js.UndefOr[Double] = js.undefined,
    no_ready_check: js.UndefOr[Boolean] = js.undefined,
    parser: String = null,
    password: String = null,
    path: String = null,
    port: js.UndefOr[Double] = js.undefined,
    prefix: String = null,
    rename_commands: js.UndefOr[Null | StringDictionary[String]] = js.undefined,
    retry_max_delay: js.UndefOr[Double] = js.undefined,
    retry_strategy: /* options */ RetryStrategyOptions => js.UndefOr[Double | Error] = null,
    retry_unfulfilled_commands: js.UndefOr[Boolean] = js.undefined,
    return_buffers: js.UndefOr[Boolean] = js.undefined,
    socket_initial_delay: js.UndefOr[Double] = js.undefined,
    socket_keepalive: js.UndefOr[Boolean] = js.undefined,
    string_numbers: js.UndefOr[Boolean] = js.undefined,
    tls: js.Any = null,
    url: String = null
  ): RedisOptions = {
    val __obj = js.Dynamic.literal()
    if (auth_pass != null) __obj.updateDynamic("auth_pass")(auth_pass.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (!js.isUndefined(connect_timeout)) __obj.updateDynamic("connect_timeout")(connect_timeout.get.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (!js.isUndefined(detect_buffers)) __obj.updateDynamic("detect_buffers")(detect_buffers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duplicate)) __obj.updateDynamic("duplicate")(duplicate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enable_offline_queue)) __obj.updateDynamic("enable_offline_queue")(enable_offline_queue.get.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(max_attempts)) __obj.updateDynamic("max_attempts")(max_attempts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(no_ready_check)) __obj.updateDynamic("no_ready_check")(no_ready_check.get.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(rename_commands)) __obj.updateDynamic("rename_commands")(rename_commands.asInstanceOf[js.Any])
    if (!js.isUndefined(retry_max_delay)) __obj.updateDynamic("retry_max_delay")(retry_max_delay.get.asInstanceOf[js.Any])
    if (retry_strategy != null) __obj.updateDynamic("retry_strategy")(js.Any.fromFunction1(retry_strategy))
    if (!js.isUndefined(retry_unfulfilled_commands)) __obj.updateDynamic("retry_unfulfilled_commands")(retry_unfulfilled_commands.get.asInstanceOf[js.Any])
    if (!js.isUndefined(return_buffers)) __obj.updateDynamic("return_buffers")(return_buffers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(socket_initial_delay)) __obj.updateDynamic("socket_initial_delay")(socket_initial_delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(socket_keepalive)) __obj.updateDynamic("socket_keepalive")(socket_keepalive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(string_numbers)) __obj.updateDynamic("string_numbers")(string_numbers.get.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedisOptions]
  }
}

