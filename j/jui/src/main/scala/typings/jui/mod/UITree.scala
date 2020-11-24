package typings.jui.mod

import typings.jui.anon.DragChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UITree extends js.Object {
  
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: DragChild): this.type = js.native
  
  /**
    * Gets the index of a node that is activated in an active state.
    *
    * @return index
    */
  def activeIndex(): Double = js.native
  
  /**
    * Adds to a child node at a specified index.
    *
    * @param param1 index or data (Array/String)
    * @param param2 null or data
    */
  def append(args: js.Any*): Unit = js.native
  
  /**
    * Folds up a child node at a specified index.
    *
    */
  def fold(index: String, e: js.Any): Unit = js.native
  
  /**
    * Folds up all child nodes at a specified index.
    *
    */
  def foldAll(index: String): Unit = js.native
  
  /**
    * Gets a node at a specified index
    *
    * @return node
    */
  def get(index: String): UITreeNode = js.native
  
  /**
    * Gets all nodes at a specified index including child nodes.
    *
    * @return nodes
    */
  def getAll(index: String): js.Array[UITreeNode] = js.native
  
  /**
    * Adds a node at a specified index.
    *
    */
  def insert(index: String, data: js.Array[_]): Unit = js.native
  
  /**
    * Return all nodes of the root.
    *
    * @return nodes
    */
  def list(): js.Array[UITreeNode] = js.native
  
  /**
    * Returns all child nodes.
    *
    * @return nodes
    */
  def listAll(): js.Array[UITreeNode] = js.native
  
  /**
    * Returns all parent nodes at a specified index.
    *
    * @return nodes
    */
  def listParents(index: String): js.Array[UITreeNode] = js.native
  
  /**
    * Moves a node at a specified index to the target index.
    *
    */
  def move(index: String, targetIndex: String): Unit = js.native
  
  /**
    * Shows a child node at a specified index.
    *
    */
  def open(index: String, e: js.Any): Unit = js.native
  
  /**
    * Shows all child nodes at a specified index.
    *
    */
  def openAll(index: String): Unit = js.native
  
  /**
    * Deletes a node at a specified index.
    *
    */
  def remove(index: String): Unit = js.native
  
  def reset(): Unit = js.native
  
  /**
    * Adds a node at a specified index.
    *
    * @return node
    */
  def select(index: String): UITreeNode = js.native
  
  def unselect(): Unit = js.native
  
  /**
    * Changes to the node at a specified index.
    *
    */
  def update(index: String, data: js.Array[_]): Unit = js.native
}
