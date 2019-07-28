package typings.jestDashDevDashServer.jestDashDevDashServerMod

import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-dev-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ERROR_NO_COMMAND: typings.jestDashDevDashServer.jestDashDevDashServerStrings.ERROR_NO_COMMAND = js.native
  val ERROR_PORT_USED: typings.jestDashDevDashServer.jestDashDevDashServerStrings.ERROR_PORT_USED = js.native
  val ERROR_TIMEOUT: typings.jestDashDevDashServer.jestDashDevDashServerStrings.ERROR_TIMEOUT = js.native
  def getServers(): js.Array[ChildProcess] = js.native
  def setup(options: js.Array[JestDevServerOptions]): js.Promise[Unit] = js.native
  def setup(options: JestDevServerOptions): js.Promise[Unit] = js.native
  def teardown(): js.Promise[Unit] = js.native
}

