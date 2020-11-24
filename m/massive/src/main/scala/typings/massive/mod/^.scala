package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("massive", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(connection: String): js.Promise[Database] = js.native
  def apply(connection: String, loaderConfig: js.UndefOr[scala.Nothing], driverConfig: js.Object): js.Promise[Database] = js.native
  def apply(connection: String, loaderConfig: Loader): js.Promise[Database] = js.native
  def apply(connection: String, loaderConfig: Loader, driverConfig: js.Object): js.Promise[Database] = js.native
  def apply(connection: ConnectionInfo): js.Promise[Database] = js.native
  def apply(connection: ConnectionInfo, loaderConfig: js.UndefOr[scala.Nothing], driverConfig: js.Object): js.Promise[Database] = js.native
  def apply(connection: ConnectionInfo, loaderConfig: Loader): js.Promise[Database] = js.native
  def apply(connection: ConnectionInfo, loaderConfig: Loader, driverConfig: js.Object): js.Promise[Database] = js.native
}
