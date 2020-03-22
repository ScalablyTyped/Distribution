package typings.hardSourceWebpackPlugin.mod

import typings.hardSourceWebpackPlugin.AnonDirectories
import typings.hardSourceWebpackPlugin.AnonLevel
import typings.hardSourceWebpackPlugin.AnonMaxAge
import typings.webpack.mod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cacheDirectory: js.UndefOr[String] = js.undefined
  var cachePrune: js.UndefOr[AnonMaxAge] = js.undefined
  var configHash: js.UndefOr[String | (js.Function1[/* webpackConfig */ js.UndefOr[Configuration], String])] = js.undefined
  var environmentHash: js.UndefOr[AnonDirectories] = js.undefined
  var info: js.UndefOr[AnonLevel] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cacheDirectory: String = null,
    cachePrune: AnonMaxAge = null,
    configHash: String | (js.Function1[/* webpackConfig */ js.UndefOr[Configuration], String]) = null,
    environmentHash: AnonDirectories = null,
    info: AnonLevel = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cacheDirectory != null) __obj.updateDynamic("cacheDirectory")(cacheDirectory.asInstanceOf[js.Any])
    if (cachePrune != null) __obj.updateDynamic("cachePrune")(cachePrune.asInstanceOf[js.Any])
    if (configHash != null) __obj.updateDynamic("configHash")(configHash.asInstanceOf[js.Any])
    if (environmentHash != null) __obj.updateDynamic("environmentHash")(environmentHash.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

