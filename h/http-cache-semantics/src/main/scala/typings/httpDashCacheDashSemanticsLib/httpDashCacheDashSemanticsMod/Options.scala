package typings
package httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * A fraction of response's age that is used as a fallback cache duration. The default is 0.1 (10%),
    * e.g. if a file hasn't been modified for 100 days, it'll be cached for 100*0.1 = 10 days.
    * @default 0.1
    */
  var cacheHeuristic: js.UndefOr[scala.Double] = js.undefined
  /**
    * If `true`, common anti-cache directives will be completely ignored if the non-standard `pre-check`
    * and `post-check` directives are present. These two useless directives are most commonly found
    * in bad StackOverflow answers and PHP's "session limiter" defaults.
    * @default false
    */
  var ignoreCargoCult: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A number of milliseconds to assume as the default time to cache responses with `Cache-Control: immutable`.
    * Note that [per RFC](https://httpwg.org/specs/rfc8246.html#the-immutable-cache-control-extension)
    * these can become stale, so `max-age` still overrides the default.
    * @default 24*3600*1000 (24h)
    */
  var immutableMinTimeToLive: js.UndefOr[scala.Double] = js.undefined
  /**
    * If `true`, then the response is evaluated from a perspective of a shared cache (i.e. `private` is not
    * cacheable and `s-maxage` is respected). If `false`, then the response is evaluated from a perspective
    * of a single-user cache (i.e. `private` is cacheable and `s-maxage` is ignored).
    * `true` is recommended for HTTP clients.
    * @default true
    */
  var shared: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `false`, then server's `Date` header won't be used as the base for `max-age`. This is against the RFC,
    * but it's useful if you want to cache responses with very short `max-age`, but your local clock
    * is not exactly in sync with the server's.
    * @default true
    */
  var trustServerDate: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cacheHeuristic: scala.Int | scala.Double = null,
    ignoreCargoCult: js.UndefOr[scala.Boolean] = js.undefined,
    immutableMinTimeToLive: scala.Int | scala.Double = null,
    shared: js.UndefOr[scala.Boolean] = js.undefined,
    trustServerDate: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cacheHeuristic != null) __obj.updateDynamic("cacheHeuristic")(cacheHeuristic.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCargoCult)) __obj.updateDynamic("ignoreCargoCult")(ignoreCargoCult)
    if (immutableMinTimeToLive != null) __obj.updateDynamic("immutableMinTimeToLive")(immutableMinTimeToLive.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared)
    if (!js.isUndefined(trustServerDate)) __obj.updateDynamic("trustServerDate")(trustServerDate)
    __obj.asInstanceOf[Options]
  }
}

