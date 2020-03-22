package typings.jestEnvironment.mod

import typings.node.NodeJS.Require
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalModuleRequire extends Require {
  def requireActual(moduleName: String): js.Any = js.native
  def requireMock(moduleName: String): js.Any = js.native
}

