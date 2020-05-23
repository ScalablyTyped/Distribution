package typings.hapiHapi.mod

import typings.hapiCatbox.mod.GenerateFuncFlags
import typings.hapiCatbox.mod.Id
import typings.hapiCatbox.mod.PolicyOptions
import typings.hapiHapi.hapiHapiBooleans.`false`
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
    expiresIn: js.UndefOr[Double] = js.undefined,
    generateFunc: (/* id */ Id, /* flags */ GenerateFuncFlags) => js.Promise[js.Any] = null,
    generateIgnoreWriteError: js.UndefOr[Boolean] = js.undefined,
    generateOnReadError: js.UndefOr[Boolean] = js.undefined,
    pendingGenerateTimeout: js.UndefOr[Double] = js.undefined,
    staleIn: Double | (js.Function2[/* stored */ Double, /* ttl */ Double, Double]) = null,
    staleTimeout: js.UndefOr[Double] = js.undefined
  ): ServerMethodCache = {
    val __obj = js.Dynamic.literal(generateTimeout = generateTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(dropOnError)) __obj.updateDynamic("dropOnError")(dropOnError.get.asInstanceOf[js.Any])
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt.asInstanceOf[js.Any])
    if (!js.isUndefined(expiresIn)) __obj.updateDynamic("expiresIn")(expiresIn.get.asInstanceOf[js.Any])
    if (generateFunc != null) __obj.updateDynamic("generateFunc")(js.Any.fromFunction2(generateFunc))
    if (!js.isUndefined(generateIgnoreWriteError)) __obj.updateDynamic("generateIgnoreWriteError")(generateIgnoreWriteError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generateOnReadError)) __obj.updateDynamic("generateOnReadError")(generateOnReadError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pendingGenerateTimeout)) __obj.updateDynamic("pendingGenerateTimeout")(pendingGenerateTimeout.get.asInstanceOf[js.Any])
    if (staleIn != null) __obj.updateDynamic("staleIn")(staleIn.asInstanceOf[js.Any])
    if (!js.isUndefined(staleTimeout)) __obj.updateDynamic("staleTimeout")(staleTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerMethodCache]
  }
}

