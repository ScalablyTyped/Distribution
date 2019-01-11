package typings
package graphvizLib.graphvizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphviz", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def digraph(id: java.lang.String): graphvizLib.graphvizMod.Graph = js.native
  def graph(id: java.lang.String): graphvizLib.graphvizMod.Graph = js.native
  def parse(path: java.lang.String, callback: graphvizLib.graphvizMod.ParseCallback): scala.Unit = js.native
  def parse(
    path: java.lang.String,
    callback: graphvizLib.graphvizMod.ParseCallback,
    errback: graphvizLib.graphvizMod.ErrorCallback
  ): scala.Unit = js.native
}

