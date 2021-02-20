package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeMethods extends StObject {
  
  /**
    * Adds a new array of nodes to the tree. New nodes are appended to the root or to a specified parent node, at a specified index.
    *
    * @param node Specifies the data used to create the new nodeс.
    * @param parent Specifies the element of the parent node the nodes are to be appended to.
    * @param nodeIndex Specifies the index at which the nodes to be inserted.
    */
  def addNode(node: js.Object): Unit = js.native
  def addNode(node: js.Object, parent: js.UndefOr[scala.Nothing], nodeIndex: Double): Unit = js.native
  def addNode(node: js.Object, parent: js.Object): Unit = js.native
  def addNode(node: js.Object, parent: js.Object, nodeIndex: Double): Unit = js.native
  
  /**
    * Performs a UI update on the provided node element with the provided data.
    *
    * @param element Specifies the node to be updated.
    * @param data Specifies the new data item the node would update according to.
    */
  def applyChangesToNode(element: js.Object, data: js.Object): Unit = js.native
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  
  def changeLocale(): Unit = js.native
  
  /**
    * Applies a checked state to a node.
    *
    * @param nodeObj Specifies the node element to apply the state to.
    * @param cascadeDir
    */
  def checkNode(nodeObj: js.Object, cascadeDir: js.Object): Unit = js.native
  
  /**
    * Returns the specified node checkstate.
    *
    * @param node Specifies the node element.
    */
  def checkState(node: js.Object): String = js.native
  
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
  def childrenByPath(path: String): js.Array[_] = js.native
  
  /**
    * Deselects all the selected nodes.
    */
  def clearSelection(): Unit = js.native
  
  /**
    * Collapses the specified node.
    *
    * @param node Specifies the node element to collapse.
    * @param event The original browser event that triggered the collapse.
    */
  def collapse(node: String): Unit = js.native
  def collapse(node: String, event: js.Object): Unit = js.native
  
  /**
    * Performs databinding on the igTree.
    */
  def dataBind(): Unit = js.native
  
  /**
    * Deselects the specified node.
    *
    * @param node Specifies the node element to be deselected.
    */
  def deselect(node: js.Object): Unit = js.native
  
  /**
    * Destructor for the igTree widget.
    */
  def destroy(): Unit = js.native
  
  /**
    * Expands the specified node.
    *
    * @param node Specifies the node element to expand.
    * @param event The original browser event that triggered the expand.
    */
  def expand(node: String): Unit = js.native
  def expand(node: String, event: js.Object): Unit = js.native
  
  /**
    * Expands the tree down to the specified node and selects the node if specified.
    *
    * @param node Specifies the node element down to which the tree would be expanded.
    * @param toSelect Specifies the whether to select the node after expanding to it.
    */
  def expandToNode(node: js.Object): Unit = js.native
  def expandToNode(node: js.Object, toSelect: Boolean): Unit = js.native
  
  /**
    * Retrieves all node objects for the immediate children of the specified parent with the specified text (case sensitive).
    *
    * @param text The text to search for.
    * @param parent The node element the children of which would be searched.
    */
  def findImmediateNodesByText(text: String): js.Array[_] = js.native
  def findImmediateNodesByText(text: String, parent: js.Object): js.Array[_] = js.native
  
  /**
    * Retrieves all node objects with the specified text (case sensitive).
    *
    * @param text The text to search for.
    * @param parent The node element to start the search from. If not specified then search would start from the root of the tree.
    */
  def findNodesByText(text: String): js.Array[_] = js.native
  def findNodesByText(text: String, parent: js.Object): js.Array[_] = js.native
  
  /**
    * Returns true if the provided node element has its checkbox checkstate checked and false otherwise.
    *
    * @param node Specifies the node element.
    */
  def isChecked(node: js.Object): Boolean = js.native
  
  /**
    * Returns true if the provided node element is expanded and false otherwise.
    *
    * @param node Specifies the node element.
    */
  def isExpanded(node: js.Object): Boolean = js.native
  
  /**
    * Returns true if the provided node element is selected and false otherwise.
    *
    * @param node Specifies the node element.
    */
  def isSelected(node: js.Object): Boolean = js.native
  
  /**
    * Retrieves the n-th jQuery node element child of the specified parent.
    *
    * @param index Specifies the index the node at which to be retrieved.
    * @param parent The parent node element to start the search from.
    */
  def nodeByIndex(index: Double): js.Object = js.native
  def nodeByIndex(index: Double, parent: js.Object): js.Object = js.native
  
  /**
    * Retrieves the jQuery element of the node with the specified path.
    *
    * @param nodePath Specifies the path to the required node.
    */
  def nodeByPath(nodePath: String): js.Object = js.native
  
  /**
    * Returns the data for the node with specified path.
    *
    * @param path Specifies the node path for which the data is returned.
    */
  def nodeDataFor(path: String): js.Object = js.native
  
  /**
    * Retrieves a node object for the specified node element.
    *
    * @param element Specifies the node jQuery element.
    */
  def nodeFromElement(element: String): js.Object = js.native
  
  /**
    * Retrieves the jQuery element of the node with the specified value.
    *
    * @param value Specifies the value of the required node.
    */
  def nodesByValue(value: String): js.Object = js.native
  
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
  def partiallyCheckNode(nodeObj: js.Object, cascadeDir: js.Object): Unit = js.native
  
  /**
    * Retrieves all the node objects for the nodes that have their checkboxes partially checked.
    */
  def partiallyCheckedNodes(): js.Array[_] = js.native
  
  /**
    * Removes the node with with the specified path and all of its children.
    *
    * @param path Specifies the path of the node to be removed.
    */
  def removeAt(path: String): Unit = js.native
  
  /**
    * Removing all the nodes with the specified value.
    *
    * @param value Specifies the value of the nodes to be removed.
    */
  def removeNodesByValue(value: String): Unit = js.native
  
  /**
    * Selects a node.
    *
    * @param node Specifies the node element to be selected.
    * @param event Indicates the browser event which triggered this action, if this is not an API call.
    */
  def select(node: js.Object): Unit = js.native
  def select(node: js.Object, event: js.Object): Unit = js.native
  
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
  def toggle(node: js.Object): Unit = js.native
  def toggle(node: js.Object, event: js.Object): Unit = js.native
  
  /**
    * Toggles the checkstate of a node if checkboxMode is not set to off, otherwise does nothing.
    *
    * @param node Specifies the node element the checkbox of which would be toggled.
    * @param event Indicates the browser event which triggered this action, if this is not an API call.
    */
  def toggleCheckstate(node: js.Object): Unit = js.native
  def toggleCheckstate(node: js.Object, event: js.Object): Unit = js.native
  
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
  def uncheckNode(nodeObj: js.Object, cascadeDir: js.Object): Unit = js.native
  
  /**
    * Retrieves all the node objects for the nodes that have their checkboxes unchecked.
    */
  def uncheckedNodes(): js.Array[_] = js.native
}
