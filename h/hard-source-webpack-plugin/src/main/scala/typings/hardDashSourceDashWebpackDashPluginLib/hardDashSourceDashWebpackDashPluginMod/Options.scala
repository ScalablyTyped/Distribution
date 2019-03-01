package typings
package hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cacheDirectory: js.UndefOr[java.lang.String] = js.undefined
  var cachePrune: js.UndefOr[hardDashSourceDashWebpackDashPluginLib.Anon_MaxAge] = js.undefined
  var configHash: js.UndefOr[
    java.lang.String | (js.Function1[
      /* webpackConfig */ js.UndefOr[webpackLib.webpackMod.webpackNs.Configuration], 
      java.lang.String
    ])
  ] = js.undefined
  var environmentHash: js.UndefOr[hardDashSourceDashWebpackDashPluginLib.Anon_Directories] = js.undefined
  var info: js.UndefOr[hardDashSourceDashWebpackDashPluginLib.Anon_Debug] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cacheDirectory: java.lang.String = null,
    cachePrune: hardDashSourceDashWebpackDashPluginLib.Anon_MaxAge = null,
    configHash: java.lang.String | (js.Function1[
      /* webpackConfig */ js.UndefOr[webpackLib.webpackMod.webpackNs.Configuration], 
      java.lang.String
    ]) = null,
    environmentHash: hardDashSourceDashWebpackDashPluginLib.Anon_Directories = null,
    info: hardDashSourceDashWebpackDashPluginLib.Anon_Debug = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cacheDirectory != null) __obj.updateDynamic("cacheDirectory")(cacheDirectory)
    if (cachePrune != null) __obj.updateDynamic("cachePrune")(cachePrune)
    if (configHash != null) __obj.updateDynamic("configHash")(configHash.asInstanceOf[js.Any])
    if (environmentHash != null) __obj.updateDynamic("environmentHash")(environmentHash)
    if (info != null) __obj.updateDynamic("info")(info)
    __obj.asInstanceOf[Options]
  }
}

