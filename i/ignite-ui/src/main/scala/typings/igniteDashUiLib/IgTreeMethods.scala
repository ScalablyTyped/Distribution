package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeMethods extends js.Object {
  /**
  	 * Adds a new array of nodes to the tree. New nodes are appended to the root or to a specified parent node, at a specified index.
  	 *
  	 * @param node Specifies the data used to create the new nodeс.
  	 * @param parent Specifies the element of the parent node the nodes are to be appended to.
  	 * @param nodeIndex Specifies the index at which the nodes to be inserted.
  	 */
  def addNode(node: js.Object): scala.Unit = js.native
  def addNode(node: js.Object, parent: js.Object): scala.Unit = js.native
  def addNode(node: js.Object, parent: js.Object, nodeIndex: scala.Double): scala.Unit = js.native
  /**
  	 * Performs a UI update on the provided node element with the provided data.
  	 *
  	 * @param element Specifies the node to be updated.
  	 * @param data Specifies the new data item the node would update according to.
  	 */
  def applyChangesToNode(element: js.Object, data: js.Object): scala.Unit = js.native
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): scala.Unit = js.native
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): scala.Unit = js.native
  def changeLocale(): scala.Unit = js.native
  /**
  	 * Applies a checked state to a node.
  	 *
  	 * @param nodeObj Specifies the node element to apply the state to.
  	 * @param cascadeDir
  	 */
  def checkNode(nodeObj: js.Object, cascadeDir: js.Object): scala.Unit = js.native
  /**
  	 * Returns the specified node checkstate.
  	 *
  	 * @param node Specifies the node element.
  	 */
  def checkState(node: js.Object): java.lang.String = js.native
  /**
  	 * Retrieves all the node objects for the nodes that have their checkboxes checked.
  	 */
  def checkedNodes(): js.Array[_] = js.native
  /**
  	 * Retrieves a node object collection of the immediate children of the provided node element.
  	 *
  	 * @param parent Specifies the node element.
  	 */
  def children(parent: js.Object): js.Array[_] = js.native
  /**
  	 * Retrieves a node object collection of the immediate children of the node with the provided path.
  	 *
  	 * @param path Specifies the path of the node the children of which are to be retrieved.
  	 */
  def childrenByPath(path: java.lang.String): js.Array[_] = js.native
  /**
  	 * Deselects all the selected nodes.
  	 */
  def clearSelection(): scala.Unit = js.native
  /**
  	 * Collapses the specified node.
  	 *
  	 * @param node Specifies the node element to collapse.
  	 * @param event The original browser event that triggered the collapse.
  	 */
  def collapse(node: java.lang.String): scala.Unit = js.native
  def collapse(node: java.lang.String, event: js.Object): scala.Unit = js.native
  /**
  	 * Performs databinding on the igTree.
  	 */
  def dataBind(): scala.Unit = js.native
  /**
  	 * Deselects the specified node.
  	 *
  	 * @param node Specifies the node element to be deselected.
  	 */
  def deselect(node: js.Object): scala.Unit = js.native
  /**
  	 * Destructor for the igTree widget.
  	 */
  def destroy(): scala.Unit = js.native
  /**
  	 * Expands the specified node.
  	 *
  	 * @param node Specifies the node element to expand.
  	 * @param event The original browser event that triggered the expand.
  	 */
  def expand(node: java.lang.String): scala.Unit = js.native
  def expand(node: java.lang.String, event: js.Object): scala.Unit = js.native
  /**
  	 * Expands the tree down to the specified node and selects the node if specified.
  	 *
  	 * @param node Specifies the node element down to which the tree would be expanded.
  	 * @param toSelect Specifies the whether to select the node after expanding to it.
  	 */
  def expandToNode(node: js.Object): scala.Unit = js.native
  def expandToNode(node: js.Object, toSelect: scala.Boolean): scala.Unit = js.native
  /**
  	 * Retrieves all node objects for the immediate children of the specified parent with the specified text (case sensitive).
  	 *
  	 * @param text The text to search for.
  	 * @param parent The node element the children of which would be searched.
  	 */
  def findImmediateNodesByText(text: java.lang.String): js.Array[_] = js.native
  def findImmediateNodesByText(text: java.lang.String, parent: js.Object): js.Array[_] = js.native
  /**
  	 * Retrieves all node objects with the specified text (case sensitive).
  	 *
  	 * @param text The text to search for.
  	 * @param parent The node element to start the search from. If not specified then search would start from the root of the tree.
  	 */
  def findNodesByText(text: java.lang.String): js.Array[_] = js.native
  def findNodesByText(text: java.lang.String, parent: js.Object): js.Array[_] = js.native
  /**
  	 * Returns true if the provided node element has its checkbox checkstate checked and false otherwise.
  	 *
  	 * @param node Specifies the node element.
  	 */
  def isChecked(node: js.Object): scala.Boolean = js.native
  /**
  	 * Returns true if the provided node element is expanded and false otherwise.
  	 *
  	 * @param node Specifies the node element.
  	 */
  def isExpanded(node: js.Object): scala.Boolean = js.native
  /**
  	 * Returns true if the provided node element is selected and false otherwise.
  	 *
  	 * @param node Specifies the node element.
  	 */
  def isSelected(node: js.Object): scala.Boolean = js.native
  /**
  	 * Retrieves the n-th jQuery node element child of the specified parent.
  	 *
  	 * @param index Specifies the index the node at which to be retrieved.
  	 * @param parent The parent node element to start the search from.
  	 */
  def nodeByIndex(index: scala.Double): js.Object = js.native
  def nodeByIndex(index: scala.Double, parent: js.Object): js.Object = js.native
  /**
  	 * Retrieves the jQuery element of the node with the specified path.
  	 *
  	 * @param nodePath Specifies the path to the required node.
  	 */
  def nodeByPath(nodePath: java.lang.String): js.Object = js.native
  /**
  	 * Returns the data for the node with specified path.
  	 *
  	 * @param path Specifies the node path for which the data is returned.
  	 */
  def nodeDataFor(path: java.lang.String): js.Object = js.native
  /**
  	 * Retrieves a node object for the specified node element.
  	 *
  	 * @param element Specifies the node jQuery element.
  	 */
  def nodeFromElement(element: java.lang.String): js.Object = js.native
  /**
  	 * Retrieves the jQuery element of the node with the specified value.
  	 *
  	 * @param value Specifies the value of the required node.
  	 */
  def nodesByValue(value: java.lang.String): js.Object = js.native
  /**
  	 * Retrieves the parent node element of the specified node element.
  	 *
  	 * @param node Specifies the jQuery selected node element to collapse.
  	 */
  def parentNode(node: js.Object): js.Object = js.native
  /**
  	 * Applies a partially checked state to a node.
  	 *
  	 * @param nodeObj Specifies the node element to apply the state to.
  	 * @param cascadeDir
  	 */
  def partiallyCheckNode(nodeObj: js.Object, cascadeDir: js.Object): scala.Unit = js.native
  /**
  	 * Retrieves all the node objects for the nodes that have their checkboxes partially checked.
  	 */
  def partiallyCheckedNodes(): js.Array[_] = js.native
  /**
  	 * Removes the node with with the specified path and all of its children.
  	 *
  	 * @param path Specifies the path of the node to be removed.
  	 */
  def removeAt(path: java.lang.String): scala.Unit = js.native
  /**
  	 * Removing all the nodes with the specified value.
  	 *
  	 * @param value Specifies the value of the nodes to be removed.
  	 */
  def removeNodesByValue(value: java.lang.String): scala.Unit = js.native
  /**
  	 * Selects a node.
  	 *
  	 * @param node Specifies the node element to be selected.
  	 * @param event Indicates the browser event which triggered this action, if this is not an API call.
  	 */
  def select(node: js.Object): scala.Unit = js.native
  def select(node: js.Object, event: js.Object): scala.Unit = js.native
  /**
  	 * Retrieves the node object for the selected node.
  	 */
  def selectedNode(): js.Object = js.native
  /**
  	 * Toggles the collapse/expand state for the specified node.
  	 *
  	 * @param node Specifies the node element the checkbox of which would be toggled.
  	 * @param event Indicates the browser event which triggered this action, if this is not an API call.
  	 */
  def toggle(node: js.Object): scala.Unit = js.native
  def toggle(node: js.Object, event: js.Object): scala.Unit = js.native
  /**
  	 * Toggles the checkstate of a node if checkboxMode is not set to off, otherwise does nothing.
  	 *
  	 * @param node Specifies the node element the checkbox of which would be toggled.
  	 * @param event Indicates the browser event which triggered this action, if this is not an API call.
  	 */
  def toggleCheckstate(node: js.Object): scala.Unit = js.native
  def toggleCheckstate(node: js.Object, event: js.Object): scala.Unit = js.native
  /**
  	 * Returns the transaction log stack.
  	 */
  def transactionLog(): js.Array[_] = js.native
  /**
  	 * Applies an unchecked state to a node.
  	 *
  	 * @param nodeObj Specifies the node element to apply the state to.
  	 * @param cascadeDir
  	 */
  def uncheckNode(nodeObj: js.Object, cascadeDir: js.Object): scala.Unit = js.native
  /**
  	 * Retrieves all the node objects for the nodes that have their checkboxes unchecked.
  	 */
  def uncheckedNodes(): js.Array[_] = js.native
}

