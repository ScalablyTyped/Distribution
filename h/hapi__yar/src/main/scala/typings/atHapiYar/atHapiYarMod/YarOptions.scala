package typings.atHapiYar.atHapiYarMod

import typings.atHapiHapi.atHapiHapiMod.CachePolicyOptions
import typings.atHapiYar.Anon_ClearInvalid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YarOptions extends js.Object {
  /**
    * hapi cache options which includes (among other options):
    */
  var cache: js.UndefOr[CachePolicyOptions[_]] = js.undefined
  /**
    * the configuration for cookie-specific features:
    */
  var cookieOptions: Anon_ClearInvalid
  /**
    * will cause yar to throw an exception if trying to persist to cache when the cache is unavailable.
    * Setting this to false will allow applications using yar to run uninterrupted if the cache is not ready (however sessions will not be saving).
    * Defaults to true.
    */
  var errorOnCacheNotReady: js.UndefOr[Boolean] = js.undefined
  /**
    * maximum cookie size before using server-side storage.
    * Defaults to 1K. Set to zero to always use server-side storage.
    */
  var maxCookieSize: js.UndefOr[Double] = js.undefined
  /**
    * Determines the name of the cookie used to store session information.
    * Defaults to session.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * determines whether to store empty session before they've been modified.
    * Defaults to true.
    */
  var storeBlank: js.UndefOr[Boolean] = js.undefined
}

object YarOptions {
  @scala.inline
  def apply(
    cookieOptions: Anon_ClearInvalid,
    cache: CachePolicyOptions[_] = null,
    errorOnCacheNotReady: js.UndefOr[Boolean] = js.undefined,
    maxCookieSize: Int | Double = null,
    name: String = null,
    storeBlank: js.UndefOr[Boolean] = js.undefined
  ): YarOptions = {
    val __obj = js.Dynamic.literal(cookieOptions = cookieOptions.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(errorOnCacheNotReady)) __obj.updateDynamic("errorOnCacheNotReady")(errorOnCacheNotReady.asInstanceOf[js.Any])
    if (maxCookieSize != null) __obj.updateDynamic("maxCookieSize")(maxCookieSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(storeBlank)) __obj.updateDynamic("storeBlank")(storeBlank.asInstanceOf[js.Any])
    __obj.asInstanceOf[YarOptions]
  }
}

