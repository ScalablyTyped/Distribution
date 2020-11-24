package typings.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hoxy", "Cycle")
@js.native
class Cycle protected () extends js.Object {
  
  /**
    * Stores and retrieves data on a cycle instance. This is useful since the same
    * instance is shared across all interceptors for a given request/response cycle,
    * allowing you to share related data across disparate scopes. With two params this
    * method behaves as a setter, with one param as a getter.
    */
  def data(name: String): js.Any = js.native
  def data(name: String, value: js.Any): js.Any = js.native
  
  /**
    * Provisions responses from the local filesystem. Generally, the reason you'd do
    * this is to be able to edit those files locally and test them as if they were
    * live on the remote server. This action populates the response object; see
    * response population for more info. The completion of this action is asynchronous,
    * so serve() returns a promise.
    *
    * The returned promise resolves after the response has been populated. There are at
    * least three use cases worth mentioning.
    */
  def serve(): js.Promise[Unit] = js.native
  def serve(opts: String): js.Promise[Unit] = js.native
  def serve(opts: ServeOptions): js.Promise[Unit] = js.native
}
