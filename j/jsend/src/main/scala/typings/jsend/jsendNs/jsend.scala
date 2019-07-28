package typings.jsend.jsendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jsend extends jsendCore {
  def forward(json: js.Object, done: js.Function2[/* err */ js.Any, /* data */ js.Any, _]): Unit = js.native
  def fromArguments(err: String): JSendObject = js.native
  def fromArguments(err: String, json: js.Object): JSendObject = js.native
  def fromArguments(err: js.Object): JSendObject = js.native
  def fromArguments(err: js.Object, json: js.Object): JSendObject = js.native
  def isValid(json: js.Object): Boolean = js.native
  def middleware(req: js.Any, res: js.Any, next: js.Function): js.Any = js.native
}

