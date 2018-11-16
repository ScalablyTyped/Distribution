package typings
package jqueryDotFancytreeLib.FancytreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fancytree extends js.Object {
  @JSName("$container")
  var $container: jqueryDotFancytreeLib.JQuery = js.native
  @JSName("$div")
  var $div: jqueryDotFancytreeLib.JQuery = js.native
  var focusNode: FancytreeNode = js.native
  var options: FancytreeOptions = js.native
   //JQueryUI.Widget;
  var rootNode: FancytreeNode = js.native
  var widget: js.Any = js.native
  /** Activate node with a given key and fire focus and
           * activate events. A previously activated node will be
           * deactivated. If activeVisible option is set, all parents
           * will be expanded as necessary. Pass key = false, to deactivate
           * the current node only.
           *
           * @returns {FancytreeNode} activate node (null, if not found)
           */
  def activateKey(key: java.lang.String): FancytreeNode = js.native
  /** Activate node with a given key and fire focus and
           * activate events. A previously activated node will be
           * deactivated. If activeVisible option is set, all parents
           * will be expanded as necessary. Pass key = false, to deactivate
           * the current node only.
           *
           * @returns {FancytreeNode} activate node (null, if not found)
           */
  def activateKey(key: scala.Boolean): FancytreeNode = js.native
  /** (experimental)
           *
           * @returns resolved, when all patches have been applied
           */
  def applyPatch(patchList: js.Array[NodePatch]): jqueryLib.JQueryPromise[_] = js.native
  /** [ext-clones] Replace a refKey with a new one. */
  def changeRefKey(oldRefKey: java.lang.String, newRefKey: java.lang.String): scala.Unit = js.native
  /** [ext-persist] Remove persistence cookies of the given type(s).
           *  Called like $("#tree").fancytree("getTree").clearCookies("active expanded focus selected"); */
  def clearCookies(): scala.Unit = js.native
  /** [ext-filter] Reset the filter.  */
  def clearFilter(): scala.Unit = js.native
  /** Return the number of nodes. */
  def count(): scala.Double = js.native
  /** Write to browser console if debugLevel >= 2 (prepending tree name)  */
  def debug(msg: js.Any): scala.Unit = js.native
  /** Temporarily suppress rendering to improve performance on bulk-updates.
          *
          * @param {boolean} flag
          * @returns {boolean} previous status
          * @since 2.19 */
  def enableUpdate(enabled: scala.Boolean): scala.Unit = js.native
  /** [ext-filter] Dimm or hide whole branches.
           * @returns {integer} count
           */
  def filterBranches(filter: java.lang.String): scala.Double = js.native
  /** [ext-filter] Dimm or hide whole branches.
           * @returns {integer} count
           */
  def filterBranches(filter: js.Function1[/* node */ FancytreeNode, scala.Boolean]): scala.Double = js.native
  /** [ext-filter] Dimm or hide nodes.
           * @returns {integer} count
           */
  def filterNodes(filter: java.lang.String): scala.Double = js.native
  /** [ext-filter] Dimm or hide nodes.
           * @returns {integer} count
           */
  def filterNodes(filter: java.lang.String, leavesOnly: scala.Boolean): scala.Double = js.native
  /** [ext-filter] Dimm or hide nodes.
           * @returns {integer} count
           */
  def filterNodes(filter: js.Function1[/* node */ FancytreeNode, scala.Boolean]): scala.Double = js.native
  /** [ext-filter] Dimm or hide nodes.
           * @returns {integer} count
           */
  def filterNodes(filter: js.Function1[/* node */ FancytreeNode, scala.Boolean], leavesOnly: scala.Boolean): scala.Double = js.native
  /** Find all nodes that matches condition.
           *
           * @returns array of nodes (may be empty)
           */
  def findAll(`match`: java.lang.String): js.Array[FancytreeNode] = js.native
  /** Find all nodes that matches condition.
           *
           * @returns array of nodes (may be empty)
           */
  def findAll(`match`: js.Function1[/* node */ FancytreeNode, js.UndefOr[scala.Boolean]]): js.Array[FancytreeNode] = js.native
  /** Find the next visible node that starts with `match`, starting at `startNode` and wrap-around at the end.
           *
           * @returns matching node or null
           */
  def findNextNode(`match`: java.lang.String): FancytreeNode = js.native
  /** Find the next visible node that starts with `match`, starting at `startNode` and wrap-around at the end.
           *
           * @returns matching node or null
           */
  def findNextNode(`match`: java.lang.String, startNode: FancytreeNode): FancytreeNode = js.native
  /** Find the next visible node that starts with `match`, starting at `startNode` and wrap-around at the end.
           *
           * @returns matching node or null
           */
  def findNextNode(`match`: js.Function1[/* node */ FancytreeNode, scala.Boolean]): FancytreeNode = js.native
  /** Find the next visible node that starts with `match`, starting at `startNode` and wrap-around at the end.
           *
           * @returns matching node or null
           */
  def findNextNode(`match`: js.Function1[/* node */ FancytreeNode, scala.Boolean], startNode: FancytreeNode): FancytreeNode = js.native
  /** Generate INPUT elements that can be submitted with html forms. In selectMode 3 only the topmost selected nodes are considered. */
  def generateFormElements(): scala.Unit = js.native
  /** Generate INPUT elements that can be submitted with html forms. In selectMode 3 only the topmost selected nodes are considered. */
  def generateFormElements(selected: scala.Boolean): scala.Unit = js.native
  /** Generate INPUT elements that can be submitted with html forms. In selectMode 3 only the topmost selected nodes are considered. */
  def generateFormElements(selected: scala.Boolean, active: scala.Boolean): scala.Unit = js.native
  /** Return the currently active node or null.  */
  def getActiveNode(): FancytreeNode = js.native
  /** Return the first top level node if any (not the invisible root node). */
  def getFirstChild(): FancytreeNode = js.native
  /** Return node that has keyboard focus.
           *
           * @param ifTreeHasFocus (default: false) (not yet implemented)
           */
  def getFocusNode(): FancytreeNode = js.native
  /** Return node that has keyboard focus.
           *
           * @param ifTreeHasFocus (default: false) (not yet implemented)
           */
  def getFocusNode(ifTreeHasFocus: scala.Boolean): FancytreeNode = js.native
  /** Return node with a given key or null if not found.
           *
           * @param searchRoot (optional) only search below this node.
           */
  def getNodeByKey(key: java.lang.String): FancytreeNode = js.native
  /** Return node with a given key or null if not found.
           *
           * @param searchRoot (optional) only search below this node.
           */
  def getNodeByKey(key: java.lang.String, searchRoot: FancytreeNode): FancytreeNode = js.native
  /** [ext-clones] Return all nodes with a given refKey (null if not found).
           *
           * @param rootNode optionally restrict results to descendants of this node.
           */
  def getNodesByRef(refKey: java.lang.String): js.Array[FancytreeNode] = js.native
  /** [ext-clones] Return all nodes with a given refKey (null if not found).
           *
           * @param rootNode optionally restrict results to descendants of this node.
           */
  def getNodesByRef(refKey: java.lang.String, rootNode: FancytreeNode): js.Array[FancytreeNode] = js.native
  /** [ext-persist] Return persistence information from cookies Called like $("#tree").fancytree("getTree").getPersistData(); */
  def getPersistData(): scala.Unit = js.native
  /** Return the invisible system root node.  */
  def getRootNode(): FancytreeNode = js.native
  /** Return an array of selected nodes.
           *
           * @param stopOnParents only return the topmost selected node (useful with selectMode 3)
           */
  def getSelectedNodes(): js.Array[FancytreeNode] = js.native
  /** Return an array of selected nodes.
           *
           * @param stopOnParents only return the topmost selected node (useful with selectMode 3)
           */
  def getSelectedNodes(stopOnParents: scala.Boolean): js.Array[FancytreeNode] = js.native
  /** Return true if the tree control has keyboard focus */
  def hasFocus(): scala.Boolean = js.native
  /** Write to browser console if debugLevel >= 1 (prepending tree name)  */
  def info(msg: js.Any): scala.Unit = js.native
  /**  [ext-edit] Check if any node in this tree in edit mode. */
  def isEditing(): FancytreeNode = js.native
  /** Make sure that a node with a given ID is loaded, by traversing - and loading - its parents. This method is ment for lazy hierarchies. A callback is executed for every node as we go.
           *
           * @param keyPathList one or more key paths  (e.g. '/3/2_1/7')
           * @param callback callback(node, status) is called for every visited node ('loading', 'loaded', 'ok', 'error')
           */
  def loadKeyPath(
    keyPathList: js.Array[java.lang.String],
    callback: js.Function2[/* node */ FancytreeNode, /* status */ java.lang.String, scala.Unit]
  ): jqueryLib.JQueryPromise[_] = js.native
  /** Make sure that a node with a given ID is loaded, by traversing - and loading - its parents. This method is ment for lazy hierarchies. A callback is executed for every node as we go.
           *
           * @param keyPath a key path (e.g. '/3/2_1/7')
           * @param callback callback(node, status) is called for every visited node ('loading', 'loaded', 'ok', 'error')
           */
  def loadKeyPath(
    keyPath: java.lang.String,
    callback: js.Function2[/* node */ FancytreeNode, /* status */ java.lang.String, scala.Unit]
  ): jqueryLib.JQueryPromise[_] = js.native
  /** Re-fire beforeActivate and activate events. */
  def reactivate(): scala.Unit = js.native
  /** Reload tree from source and return a promise.
           *
           * @param source optional new source (defaults to initial source data)
           */
  def reload(): jqueryLib.JQueryPromise[_] = js.native
  /** Reload tree from source and return a promise.
           *
           * @param source optional new source (defaults to initial source data)
           */
  def reload(source: js.Any): jqueryLib.JQueryPromise[_] = js.native
  /** Render tree (i.e. create DOM elements for all top-level nodes).
           *
           * @param force create DOM elements, even is parent is collapsed (default = false)
           * @param deep (default = false)
           */
  def render(): scala.Unit = js.native
  /** Render tree (i.e. create DOM elements for all top-level nodes).
           *
           * @param force create DOM elements, even is parent is collapsed (default = false)
           * @param deep (default = false)
           */
  def render(force: scala.Boolean): scala.Unit = js.native
  /** Render tree (i.e. create DOM elements for all top-level nodes).
           *
           * @param force create DOM elements, even is parent is collapsed (default = false)
           * @param deep (default = false)
           */
  def render(force: scala.Boolean, deep: scala.Boolean): scala.Unit = js.native
  /** @param flag (default = true) */
  def setFocus(): scala.Unit = js.native
  /** @param flag (default = true) */
  def setFocus(flag: scala.Boolean): scala.Unit = js.native
  /** Return all nodes as nested list of NodeData.
           *
           * @param callback Called for every node
           * @param includeRoot Returns the hidden system root node (and its children) (default = false)
           */
  def toDict(): js.Any = js.native
  /** Return all nodes as nested list of NodeData.
           *
           * @param callback Called for every node
           * @param includeRoot Returns the hidden system root node (and its children) (default = false)
           */
  def toDict(includeRoot: scala.Boolean): js.Any = js.native
  /** Return all nodes as nested list of NodeData.
           *
           * @param callback Called for every node
           * @param includeRoot Returns the hidden system root node (and its children) (default = false)
           */
  def toDict(includeRoot: scala.Boolean, callback: js.Function1[/* node */ FancytreeNode, scala.Unit]): js.Any = js.native
  /** Call fn(node) for all nodes.
           *
           * @param fn the callback function. Return false to stop iteration, return "skip" to skip this node and children only.
           * @returns false, if the iterator was stopped.
           */
  def visit(fn: js.Function1[/* node */ FancytreeNode, _]): scala.Boolean = js.native
  /** Write warning to browser console (prepending tree info) */
  def warn(msg: js.Any): scala.Unit = js.native
}

