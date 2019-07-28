package typings.massive.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("massive", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(connection: ConnectionInfo | String): js.Promise[Database] = js.native
  def apply(connection: ConnectionInfo | String, loaderConfig: Loader): js.Promise[Database] = js.native
  def apply(connection: ConnectionInfo | String, loaderConfig: Loader, driverConfig: js.Object): js.Promise[Database] = js.native
}

