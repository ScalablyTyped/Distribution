package typings.keystonejsKeystone.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryManyMeta extends js.Object {
  def getList(key: String): QueryMany = js.native
  def query(args: js.Any, context: js.Any): js.Promise[_] = js.native
  def query(args: js.Any, context: js.Any, options: SkipAccessControl): js.Promise[_] = js.native
  def queryMany(args: js.Any, context: js.Any): js.Promise[js.Array[_]] = js.native
  def queryMany(args: js.Any, context: js.Any, options: SkipAccessControl): js.Promise[js.Array[_]] = js.native
  def queryManyMeta(args: js.Any, context: js.Any): js.Promise[Count] = js.native
  def queryManyMeta(args: js.Any, context: js.Any, options: SkipAccessControl): js.Promise[Count] = js.native
}

