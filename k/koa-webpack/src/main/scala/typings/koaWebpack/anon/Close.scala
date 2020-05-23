package typings.koaWebpack.anon

import typings.webpackHotClient.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Close extends js.Object {
  var options: Options
  var server: js.Any
  def close(): Unit
}

object Close {
  @scala.inline
  def apply(close: () => Unit, options: Options, server: js.Any): Close = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), options = options.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
}

