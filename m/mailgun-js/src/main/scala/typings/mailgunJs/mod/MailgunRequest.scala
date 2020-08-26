package typings.mailgunJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailgunRequest extends js.Object {
  def apply(resource: String): js.Promise[_] = js.native
  def apply(resource: String, callback: js.Function2[/* error */ Error, /* response */ js.Any, Unit]): Unit = js.native
  def apply(resource: String, data: js.Any): js.Promise[_] = js.native
  def apply(
    resource: String,
    data: js.Any,
    callback: js.Function2[/* error */ Error, /* response */ js.Any, Unit]
  ): Unit = js.native
}

