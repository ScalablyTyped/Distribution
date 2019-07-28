package typings.graphviz.graphvizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphviz", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def digraph(id: String): Graph = js.native
  def graph(id: String): Graph = js.native
  def parse(path: String, callback: ParseCallback): Unit = js.native
  def parse(path: String, callback: ParseCallback, errback: ErrorCallback): Unit = js.native
}

