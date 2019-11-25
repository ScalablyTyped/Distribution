package typings.atHapiHapi.atHapiHapiMod

import typings.atHapiCatbox.atHapiCatboxMod.GenerateFuncFlags
import typings.atHapiCatbox.atHapiCatboxMod.Id
import typings.atHapiCatbox.atHapiCatboxMod.PolicyOptions
import typings.atHapiHapi.atHapiHapiNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerMethodCache
  extends PolicyOptions[js.Any] {
  @JSName("generateTimeout")
  var generateTimeout_ServerMethodCache: Double | `false`
}

object ServerMethodCache {
  @scala.inline
  def apply(
    generateTimeout: Double | `false`,
    dropOnError: js.UndefOr[Boolean] = js.undefined,
    expiresAt: String = null,
    expiresIn: Int | Double = null,
    generateFunc: (/* id */ Id, /* flags */ GenerateFuncFlags) => js.Promise[js.Any] = null,
    generateIgnoreWriteError: js.UndefOr[Boolean] = js.undefined,
    generateOnReadError: js.UndefOr[Boolean] = js.undefined,
    pendingGenerateTimeout: Int | Double = null,
    staleIn: Double | (js.Function2[/* stored */ Double, /* ttl */ Double, Double]) = null,
    staleTimeout: Int | Double = null
  ): ServerMethodCache = {
    val __obj = js.Dynamic.literal(generateTimeout = generateTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(dropOnError)) __obj.updateDynamic("dropOnError")(dropOnError.asInstanceOf[js.Any])
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (generateFunc != null) __obj.updateDynamic("generateFunc")(js.Any.fromFunction2(generateFunc))
    if (!js.isUndefined(generateIgnoreWriteError)) __obj.updateDynamic("generateIgnoreWriteError")(generateIgnoreWriteError.asInstanceOf[js.Any])
    if (!js.isUndefined(generateOnReadError)) __obj.updateDynamic("generateOnReadError")(generateOnReadError.asInstanceOf[js.Any])
    if (pendingGenerateTimeout != null) __obj.updateDynamic("pendingGenerateTimeout")(pendingGenerateTimeout.asInstanceOf[js.Any])
    if (staleIn != null) __obj.updateDynamic("staleIn")(staleIn.asInstanceOf[js.Any])
    if (staleTimeout != null) __obj.updateDynamic("staleTimeout")(staleTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerMethodCache]
  }
}

