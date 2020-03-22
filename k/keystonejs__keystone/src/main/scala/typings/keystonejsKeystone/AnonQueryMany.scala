package typings.keystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQueryMany extends js.Object {
  def getList(key: String): AnonGetList = js.native
  def query(args: js.Any, context: js.Any): js.Promise[_] = js.native
  def query(args: js.Any, context: js.Any, options: AnonSkipAccessControl): js.Promise[_] = js.native
  def queryMany(args: js.Any, context: js.Any): js.Promise[js.Array[_]] = js.native
  def queryMany(args: js.Any, context: js.Any, options: AnonSkipAccessControl): js.Promise[js.Array[_]] = js.native
  def queryManyMeta(args: js.Any, context: js.Any): js.Promise[AnonCount] = js.native
  def queryManyMeta(args: js.Any, context: js.Any, options: AnonSkipAccessControl): js.Promise[AnonCount] = js.native
}

