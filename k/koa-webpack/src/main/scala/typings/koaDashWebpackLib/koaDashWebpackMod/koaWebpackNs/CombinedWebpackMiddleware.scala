package typings
package koaDashWebpackLib.koaDashWebpackMod.koaWebpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombinedWebpackMiddleware extends js.Object {
  var devMiddleware: webpackDashDevDashMiddlewareLib.webpackDashDevDashMiddlewareMod.WebpackDevMiddlewareNs.WebpackDevMiddleware = js.native
  /**
    * @todo make this a `webpack-hot-client@^4.0.0` instance, no typings for v4 available yet
    */
  var hotClient: koaDashWebpackLib.Anon_Close = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[_]): scala.Unit = js.native
}

