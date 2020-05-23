package typings.hardSourceWebpackPlugin.mod

import typings.hardSourceWebpackPlugin.anon.Directories
import typings.hardSourceWebpackPlugin.anon.Level
import typings.hardSourceWebpackPlugin.anon.MaxAge
import typings.webpack.mod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cacheDirectory: js.UndefOr[String] = js.undefined
  var cachePrune: js.UndefOr[MaxAge] = js.undefined
  var configHash: js.UndefOr[String | (js.Function1[/* webpackConfig */ js.UndefOr[Configuration], String])] = js.undefined
  var environmentHash: js.UndefOr[Directories] = js.undefined
  var info: js.UndefOr[Level] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cacheDirectory: String = null,
    cachePrune: MaxAge = null,
    configHash: String | (js.Function1[/* webpackConfig */ js.UndefOr[Configuration], String]) = null,
    environmentHash: Directories = null,
    info: Level = null
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

