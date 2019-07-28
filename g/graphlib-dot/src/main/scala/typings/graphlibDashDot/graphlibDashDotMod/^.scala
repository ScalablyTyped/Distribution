package typings.graphlibDashDot.graphlibDashDotMod

import typings.graphlib.graphlibMod.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphlib-dot", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val graphlib: js.Any = js.native
  def read(str: String): Graph = js.native
  def readMany(str: String): js.Array[Graph] = js.native
  def write(g: Graph): String = js.native
}

