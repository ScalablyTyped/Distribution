package typings.jestUtil

import typings.node.NodeJS.Global
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-util/build/setGlobal", JSImport.Namespace)
@js.native
object setGlobalMod extends js.Object {
  def default(globalToMutate: Global, key: String, value: js.Any): Unit = js.native
  def default(globalToMutate: Window_, key: String, value: js.Any): Unit = js.native
}

