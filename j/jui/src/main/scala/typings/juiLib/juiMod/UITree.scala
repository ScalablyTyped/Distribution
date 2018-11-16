package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UITree extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: juiLib.Anon_Root): this.type = js.native
  /**
       * Gets the index of a node that is activated in an active state.
       *
       * @return index
       */
  def activeIndex(): scala.Double = js.native
  /**
       * Adds to a child node at a specified index.
       *
       * @param param1 index or data (Array/String)
       * @param param2 null or data
       */
  def append(args: js.Any*): scala.Unit = js.native
  /**
       * Folds up a child node at a specified index.
       *
       */
  def fold(index: java.lang.String, e: js.Any): scala.Unit = js.native
  /**
       * Folds up all child nodes at a specified index.
       *
       */
  def foldAll(index: java.lang.String): scala.Unit = js.native
  /**
       * Gets a node at a specified index
       *
       * @return node
       */
  def get(index: java.lang.String): UITreeNode = js.native
  /**
       * Gets all nodes at a specified index including child nodes.
       *
       * @return nodes
       */
  def getAll(index: java.lang.String): js.Array[UITreeNode] = js.native
  /**
       * Adds a node at a specified index.
       *
       */
  def insert(index: java.lang.String, data: js.Array[_]): scala.Unit = js.native
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
  def listParents(index: java.lang.String): js.Array[UITreeNode] = js.native
  /**
       * Moves a node at a specified index to the target index.
       *
       */
  def move(index: java.lang.String, targetIndex: java.lang.String): scala.Unit = js.native
  /**
       * Shows a child node at a specified index.
       *
       */
  def open(index: java.lang.String, e: js.Any): scala.Unit = js.native
  /**
       * Shows all child nodes at a specified index.
       *
       */
  def openAll(index: java.lang.String): scala.Unit = js.native
  /**
       * Deletes a node at a specified index.
       *
       */
  def remove(index: java.lang.String): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  /**
       * Adds a node at a specified index.
       *
       * @return node
       */
  def select(index: java.lang.String): UITreeNode = js.native
  def unselect(): scala.Unit = js.native
  /**
       * Changes to the node at a specified index.
       *
       */
  def update(index: java.lang.String, data: js.Array[_]): scala.Unit = js.native
}

