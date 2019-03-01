package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerMethodCache
  extends catboxLib.catboxMod.PolicyOptions[js.Any] {
  @JSName("generateTimeout")
  var generateTimeout_ServerMethodCache: scala.Double | hapiLib.hapiLibNumbers.`false`
}

object ServerMethodCache {
  @scala.inline
  def apply(
    generateTimeout: scala.Double | hapiLib.hapiLibNumbers.`false`,
    dropOnError: js.UndefOr[scala.Boolean] = js.undefined,
    expiresAt: java.lang.String = null,
    expiresIn: scala.Int | scala.Double = null,
    generateFunc: catboxLib.catboxMod.GenerateFunc[js.Any] = null,
    generateIgnoreWriteError: js.UndefOr[scala.Boolean] = js.undefined,
    generateOnReadError: js.UndefOr[scala.Boolean] = js.undefined,
    pendingGenerateTimeout: scala.Int | scala.Double = null,
    staleIn: scala.Double | (js.Function2[/* stored */ scala.Double, /* ttl */ scala.Double, scala.Double]) = null,
    staleTimeout: scala.Int | scala.Double = null
  ): ServerMethodCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generateTimeout")(generateTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(dropOnError)) __obj.updateDynamic("dropOnError")(dropOnError)
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (generateFunc != null) __obj.updateDynamic("generateFunc")(generateFunc)
    if (!js.isUndefined(generateIgnoreWriteError)) __obj.updateDynamic("generateIgnoreWriteError")(generateIgnoreWriteError)
    if (!js.isUndefined(generateOnReadError)) __obj.updateDynamic("generateOnReadError")(generateOnReadError)
    if (pendingGenerateTimeout != null) __obj.updateDynamic("pendingGenerateTimeout")(pendingGenerateTimeout.asInstanceOf[js.Any])
    if (staleIn != null) __obj.updateDynamic("staleIn")(staleIn.asInstanceOf[js.Any])
    if (staleTimeout != null) __obj.updateDynamic("staleTimeout")(staleTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerMethodCache]
  }
}

