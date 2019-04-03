package typings
package graphqlDashApiDashKoaLib.graphqlDashApiDashKoaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-api-koa", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def errorHandler(): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  def execute[StateT, CustomT](options: ExecuteOptions with (graphqlDashApiDashKoaLib.Anon_Ctx[StateT, CustomT])): koaLib.koaMod.ApplicationNs.Middleware[StateT, CustomT] = js.native
}

