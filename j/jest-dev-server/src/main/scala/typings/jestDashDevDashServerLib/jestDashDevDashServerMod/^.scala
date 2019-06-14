package typings
package jestDashDevDashServerLib.jestDashDevDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-dev-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ERROR_NO_COMMAND: jestDashDevDashServerLib.jestDashDevDashServerLibStrings.ERROR_NO_COMMAND = js.native
  val ERROR_PORT_USED: jestDashDevDashServerLib.jestDashDevDashServerLibStrings.ERROR_PORT_USED = js.native
  val ERROR_TIMEOUT: jestDashDevDashServerLib.jestDashDevDashServerLibStrings.ERROR_TIMEOUT = js.native
  def getServers(): js.Array[nodeLib.childUnderscoreProcessMod.ChildProcess] = js.native
  def setup(options: JestDevServerOptions): js.Promise[scala.Unit] = js.native
  def setup(options: js.Array[JestDevServerOptions]): js.Promise[scala.Unit] = js.native
  def teardown(): js.Promise[scala.Unit] = js.native
}

