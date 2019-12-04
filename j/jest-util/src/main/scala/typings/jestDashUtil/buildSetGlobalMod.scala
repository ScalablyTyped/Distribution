package typings.jestDashUtil

import typings.node.NodeJS.Global
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-util/build/setGlobal", JSImport.Namespace)
@js.native
object buildSetGlobalMod extends js.Object {
  def default(globalToMutate: Global, key: String, value: js.Any): Unit = js.native
  def default(globalToMutate: Window, key: String, value: js.Any): Unit = js.native
}

