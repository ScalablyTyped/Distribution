package typings.keystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArgs extends js.Object {
  def getList(key: String): /* import warning: importer.ImportType#apply Failed type conversion: @keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>['list'] */ js.Any = js.native
  def query(args: js.Any, context: js.Any): js.Promise[_] = js.native
  def query(args: js.Any, context: js.Any, options: AnonSkipAccessControl): js.Promise[_] = js.native
  def queryMany(args: js.Any, context: js.Any): js.Promise[js.Array[_]] = js.native
  def queryMany(args: js.Any, context: js.Any, options: AnonSkipAccessControl): js.Promise[js.Array[_]] = js.native
  def queryManyMeta(args: js.Any, context: js.Any): js.Promise[AnonCount] = js.native
  def queryManyMeta(args: js.Any, context: js.Any, options: AnonSkipAccessControl): js.Promise[AnonCount] = js.native
}

