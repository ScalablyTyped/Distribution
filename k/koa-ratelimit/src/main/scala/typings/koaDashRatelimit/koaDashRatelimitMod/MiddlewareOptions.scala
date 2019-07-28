package typings.koaDashRatelimit.koaDashRatelimitMod

import typings.koa.koaMod.Context
import typings.koaDashRatelimit.koaDashRatelimitNumbers.`false`
import typings.redis.redisMod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOptions extends js.Object {
  /**
    * The database powering the backing rate-limiter package.
    */
  var db: RedisClient
  /**
    * Whether or not to disable the usage of rate limit headers. This defaults
    * to **false**.
    */
  var disableHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * The length of a single limiting period. This value is expressed
    * in milliseconds, defaulting to one hour.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The message used on the response body if a client is rate-limited. There is
    * a default message; which includes when they should try again.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  /**
    * A relation of header to the header's display name.
    */
  var headers: js.UndefOr[HeaderNameOptions] = js.undefined
  /**
    * Get the unique-identifier for a request. This defaults to the
    * client's IP address. Returning "false" will skip rate-limiting.
    */
  var id: js.UndefOr[js.Function1[/* context */ Context, String | `false`]] = js.undefined
  /**
    * The maximum amount of requests a client (see the `id` field) may
    * make during a limiting period. (see `duration`)
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Whether or not to throw an error upon being rate-limited. This uses
    * the Koa context function "throw".
    */
  var `throw`: js.UndefOr[Boolean] = js.undefined
}

object MiddlewareOptions {
  @scala.inline
  def apply(
    db: RedisClient,
    disableHeader: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    errorMessage: String = null,
    headers: HeaderNameOptions = null,
    id: /* context */ Context => String | `false` = null,
    max: Int | Double = null,
    `throw`: js.UndefOr[Boolean] = js.undefined
  ): MiddlewareOptions = {
    val __obj = js.Dynamic.literal(db = db)
    if (!js.isUndefined(disableHeader)) __obj.updateDynamic("disableHeader")(disableHeader)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (id != null) __obj.updateDynamic("id")(js.Any.fromFunction1(id))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(`throw`)) __obj.updateDynamic("throw")(`throw`)
    __obj.asInstanceOf[MiddlewareOptions]
  }
}

