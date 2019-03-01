package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptionsCache
  extends catboxLib.catboxMod.PolicyOptions[js.Any]
     with /** other options passed to the catbox strategy used. Other options are only passed to catbox when engine above is a class or function and ignored if engine is a catbox engine object). */
/* s */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** catbox engine object. */
  var engine: js.UndefOr[catboxLib.catboxMod.ClientApi[_]] = js.undefined
  /**
    * an identifier used later when provisioning or configuring caching for server methods or plugins. Each cache name must be unique. A single item may omit the name option which defines
    * the default cache. If every cache includes a name, a default memory cache is provisioned as well.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** (optional) string used to isolate cached data. Defaults to 'hapi-cache'. */
  var partition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * a class or a prototype function
    */
  var provider: js.UndefOr[CacheProvider[catboxLib.catboxMod.ClientOptions]] = js.undefined
  /** if true, allows multiple cache users to share the same segment (e.g. multiple methods using the same cache storage container). Default to false. */
  var shared: js.UndefOr[scala.Boolean] = js.undefined
}

object ServerOptionsCache {
  @scala.inline
  def apply(
    StringDictionary: /** other options passed to the catbox strategy used. Other options are only passed to catbox when engine above is a class or function and ignored if engine is a catbox engine object). */
  /* s */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    dropOnError: js.UndefOr[scala.Boolean] = js.undefined,
    engine: catboxLib.catboxMod.ClientApi[_] = null,
    expiresAt: java.lang.String = null,
    expiresIn: scala.Int | scala.Double = null,
    generateFunc: catboxLib.catboxMod.GenerateFunc[js.Any] = null,
    generateIgnoreWriteError: js.UndefOr[scala.Boolean] = js.undefined,
    generateOnReadError: js.UndefOr[scala.Boolean] = js.undefined,
    generateTimeout: scala.Double | catboxLib.catboxLibNumbers.`false` = null,
    name: java.lang.String = null,
    partition: java.lang.String = null,
    pendingGenerateTimeout: scala.Int | scala.Double = null,
    provider: CacheProvider[catboxLib.catboxMod.ClientOptions] = null,
    shared: js.UndefOr[scala.Boolean] = js.undefined,
    staleIn: scala.Double | (js.Function2[/* stored */ scala.Double, /* ttl */ scala.Double, scala.Double]) = null,
    staleTimeout: scala.Int | scala.Double = null
  ): ServerOptionsCache = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(dropOnError)) __obj.updateDynamic("dropOnError")(dropOnError)
    if (engine != null) __obj.updateDynamic("engine")(engine)
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (generateFunc != null) __obj.updateDynamic("generateFunc")(generateFunc)
    if (!js.isUndefined(generateIgnoreWriteError)) __obj.updateDynamic("generateIgnoreWriteError")(generateIgnoreWriteError)
    if (!js.isUndefined(generateOnReadError)) __obj.updateDynamic("generateOnReadError")(generateOnReadError)
    if (generateTimeout != null) __obj.updateDynamic("generateTimeout")(generateTimeout.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (partition != null) __obj.updateDynamic("partition")(partition)
    if (pendingGenerateTimeout != null) __obj.updateDynamic("pendingGenerateTimeout")(pendingGenerateTimeout.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared)
    if (staleIn != null) __obj.updateDynamic("staleIn")(staleIn.asInstanceOf[js.Any])
    if (staleTimeout != null) __obj.updateDynamic("staleTimeout")(staleTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptionsCache]
  }
}

