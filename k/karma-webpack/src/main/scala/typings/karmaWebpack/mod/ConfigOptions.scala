package typings.karmaWebpack.mod

import typings.webpack.mod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var webpack: Configuration
  var webpackMiddleware: KarmaWebpackMiddlewareOptions
}

object ConfigOptions {
  @scala.inline
  def apply(webpack: Configuration, webpackMiddleware: KarmaWebpackMiddlewareOptions): ConfigOptions = {
    val __obj = js.Dynamic.literal(webpack = webpack.asInstanceOf[js.Any], webpackMiddleware = webpackMiddleware.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfigOptions]
  }
}

