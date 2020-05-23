package typings.kikBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Call extends js.Object {
  def apply(url: String, data: js.Any, callback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def reply(data: js.Any): Unit = js.native
}

