package typings.koaWebpack.mod

import typings.koaWebpack.anon.Close
import typings.webpackDevMiddleware.mod.WebpackDevMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombinedWebpackMiddleware extends js.Object {
  var devMiddleware: WebpackDevMiddleware = js.native
  /**
    * @todo make this a `webpack-hot-client@^4.0.0` instance, no typings for v4 available yet
    */
  var hotClient: Close = js.native
  def close(): Unit = js.native
  def close(callback: js.Function0[_]): Unit = js.native
}

