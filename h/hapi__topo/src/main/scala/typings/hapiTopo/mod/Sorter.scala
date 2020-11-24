package typings.hapiTopo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/topo", "Sorter")
@js.native
class Sorter[T] () extends js.Object {
  
  /**
    * Adds a node or list of nodes to be added and topologically sorted
    * 
    * @param nodes - A mixed value or array of mixed values to be added as nodes to the topologically sorted list.
    * @param options - Optional sorting information about the nodes.
    * 
    * @returns Returns an array of the topologically sorted nodes.
    */
  def add(nodes: T): js.Array[T] = js.native
  def add(nodes: T, options: Options): js.Array[T] = js.native
  def add(nodes: js.Array[T]): js.Array[T] = js.native
  def add(nodes: js.Array[T], options: Options): js.Array[T] = js.native
  
  def merge(others: js.Array[Sorter[T]]): js.Array[T] = js.native
  /**
    * Merges another Sorter object into the current object.
    * 
    * @param others - The other object or array of objects to be merged into the current one.
    * 
    * @returns Returns an array of the topologically sorted nodes.
    */
  def merge(others: Sorter[T]): js.Array[T] = js.native
  
  /**
    * An array of the topologically sorted nodes. This list is renewed upon each call to topo.add().
    */
  var nodes: js.Array[T] = js.native
}
