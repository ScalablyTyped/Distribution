package typings
package karmaDashWebpackLib.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var webpack: webpackLib.webpackMod.webpackNs.Configuration
  var webpackMiddleware: KarmaWebpackMiddlewareOptions
}

object ConfigOptions {
  @scala.inline
  def apply(
    webpack: webpackLib.webpackMod.webpackNs.Configuration,
    webpackMiddleware: KarmaWebpackMiddlewareOptions
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("webpack")(webpack)
    __obj.updateDynamic("webpackMiddleware")(webpackMiddleware)
    __obj.asInstanceOf[ConfigOptions]
  }
}

