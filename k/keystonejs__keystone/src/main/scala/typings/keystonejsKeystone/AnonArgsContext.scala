package typings.keystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArgsContext[Record /* <: js.Object */] extends js.Object {
  def getList(key: String): AnonArgs = js.native
  def query(args: js.Any, context: js.Any): js.Promise[Record] = js.native
  def query(args: js.Any, context: js.Any, options: AnonSkipAccessControl): js.Promise[Record] = js.native
  def queryMany(args: js.Any, context: js.Any): js.Promise[js.Array[Record]] = js.native
  def queryMany(args: js.Any, context: js.Any, options: AnonSkipAccessControl): js.Promise[js.Array[Record]] = js.native
  def queryManyMeta(args: js.Any, context: js.Any): js.Promise[AnonCount] = js.native
  def queryManyMeta(args: js.Any, context: js.Any, options: AnonSkipAccessControl): js.Promise[AnonCount] = js.native
}

