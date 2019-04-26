package typings
package atHapiYarLib.atHapiYarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YarOptions extends js.Object {
  /**
    * hapi cache options which includes (among other options):
    */
  var cache: js.UndefOr[atHapiHapiLib.atHapiHapiMod.CachePolicyOptions[_]] = js.undefined
  /**
    * the configuration for cookie-specific features:
    */
  var cookieOptions: atHapiYarLib.Anon_ClearInvalid
  /**
    * will cause yar to throw an exception if trying to persist to cache when the cache is unavailable.
    * Setting this to false will allow applications using yar to run uninterrupted if the cache is not ready (however sessions will not be saving).
    * Defaults to true.
    */
  var errorOnCacheNotReady: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * maximum cookie size before using server-side storage.
    * Defaults to 1K. Set to zero to always use server-side storage.
    */
  var maxCookieSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Determines the name of the cookie used to store session information.
    * Defaults to session.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * determines whether to store empty session before they've been modified.
    * Defaults to true.
    */
  var storeBlank: js.UndefOr[scala.Boolean] = js.undefined
}

object YarOptions {
  @scala.inline
  def apply(
    cookieOptions: atHapiYarLib.Anon_ClearInvalid,
    cache: atHapiHapiLib.atHapiHapiMod.CachePolicyOptions[_] = null,
    errorOnCacheNotReady: js.UndefOr[scala.Boolean] = js.undefined,
    maxCookieSize: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    storeBlank: js.UndefOr[scala.Boolean] = js.undefined
  ): YarOptions = {
    val __obj = js.Dynamic.literal(cookieOptions = cookieOptions)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(errorOnCacheNotReady)) __obj.updateDynamic("errorOnCacheNotReady")(errorOnCacheNotReady)
    if (maxCookieSize != null) __obj.updateDynamic("maxCookieSize")(maxCookieSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(storeBlank)) __obj.updateDynamic("storeBlank")(storeBlank)
    __obj.asInstanceOf[YarOptions]
  }
}

