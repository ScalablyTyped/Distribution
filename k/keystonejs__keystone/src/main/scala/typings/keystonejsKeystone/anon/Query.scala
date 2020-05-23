package typings.keystonejsKeystone.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query[Record /* <: js.Object */] extends js.Object {
  def getList(key: String): GetList = js.native
  def query(args: js.Any, context: js.Any): js.Promise[Record] = js.native
  def query(args: js.Any, context: js.Any, options: SkipAccessControl): js.Promise[Record] = js.native
  def queryMany(args: js.Any, context: js.Any): js.Promise[js.Array[Record]] = js.native
  def queryMany(args: js.Any, context: js.Any, options: SkipAccessControl): js.Promise[js.Array[Record]] = js.native
  def queryManyMeta(args: js.Any, context: js.Any): js.Promise[Count] = js.native
  def queryManyMeta(args: js.Any, context: js.Any, options: SkipAccessControl): js.Promise[Count] = js.native
}

