package typings
package graphvizLib.graphvizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphviz", JSImport.Namespace)
@js.native
object graphvizModMembers extends js.Object {
  def digraph(id: java.lang.String): Graph = js.native
  def graph(id: java.lang.String): Graph = js.native
  def parse(path: java.lang.String, callback: ParseCallback): scala.Unit = js.native
  def parse(path: java.lang.String, callback: ParseCallback, errback: ErrorCallback): scala.Unit = js.native
}

