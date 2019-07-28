package typings.koaDashWebpack

import typings.webpackDashHotDashClient.webpackDashHotDashClientMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  var options: Options
  var server: js.Any
  def close(): Unit
}

object Anon_Close {
  @scala.inline
  def apply(close: () => Unit, options: Options, server: js.Any): Anon_Close = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), options = options, server = server)
  
    __obj.asInstanceOf[Anon_Close]
  }
}

