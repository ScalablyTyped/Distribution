package typings.koaWebpack

import typings.webpackHotClient.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClose extends js.Object {
  var options: Options
  var server: js.Any
  def close(): Unit
}

object AnonClose {
  @scala.inline
  def apply(close: () => Unit, options: Options, server: js.Any): AnonClose = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), options = options.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClose]
  }
}

