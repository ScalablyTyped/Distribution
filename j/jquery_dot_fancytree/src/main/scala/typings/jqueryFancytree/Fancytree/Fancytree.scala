package typings.jqueryFancytree.Fancytree

import typings.jquery.JQueryPromise
import typings.jqueryFancytree.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fancytree extends js.Object {
  @JSName("$container")
  var $container: JQuery = js.native
  @JSName("$div")
  var $div: JQuery = js.native
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
  def activateKey(key: String): FancytreeNode = js.native
  def activateKey(key: Boolean): FancytreeNode = js.native
  /** (experimental)
    *
    * @returns resolved, when all patches have been applied
    */
  def applyPatch(patchList: js.Array[NodePatch]): JQueryPromise[_] = js.native
  /** [ext-clones] Replace a refKey with a new one. */
  def changeRefKey(oldRefKey: String, newRefKey: String): Unit = js.native
  /** [ext-persist] Remove persistence cookies of the given type(s).
    *  Called like $("#tree").fancytree("getTree").clearCookies("active expanded focus selected"); */
  def clearCookies(): Unit = js.native
  /** [ext-filter] Reset the filter.  */
  def clearFilter(): Unit = js.native
  /** Return the number of nodes. */
  def count(): Double = js.native
  /** Write to browser console if debugLevel >= 2 (prepending tree name)  */
  def debug(msg: js.Any): Unit = js.native
  /** Temporarily suppress rendering to improve performance on bulk-updates.
    *
    * @param {boolean} flag
    * @returns {boolean} previous status
    * @since 2.19 */
  def enableUpdate(enabled: Boolean): Unit = js.native
  /** Expand (or collapse) all parent nodes. */
  def expandAll(): Unit = js.native
  def expandAll(flag: js.UndefOr[scala.Nothing], options: js.Object): Unit = js.native
  def expandAll(flag: Boolean): Unit = js.native
  def expandAll(flag: Boolean, options: js.Object): Unit = js.native
  /** [ext-filter] Dimm or hide whole branches.
    * @returns {integer} count
    */
  def filterBranches(filter: String): Double = js.native
  /** [ext-filter] Dimm or hide whole branches.
    * @returns {integer} count
    */
  def filterBranches(filter: js.Function1[/* node */ FancytreeNode, Boolean]): Double = js.native
  /** [ext-filter] Dimm or hide nodes.
    * @returns {integer} count
    */
  def filterNodes(filter: String): Double = js.native
  def filterNodes(filter: String, leavesOnly: Boolean): Double = js.native
  /** [ext-filter] Dimm or hide nodes.
    * @returns {integer} count
    */
  def filterNodes(filter: js.Function1[/* node */ FancytreeNode, Boolean]): Double = js.native
  def filterNodes(filter: js.Function1[/* node */ FancytreeNode, Boolean], leavesOnly: Boolean): Double = js.native
  /** Find all nodes that matches condition.
    *
    * @returns array of nodes (may be empty)
    */
  def findAll(`match`: String): js.Array[FancytreeNode] = js.native
  def findAll(`match`: js.Function1[/* node */ FancytreeNode, js.UndefOr[Boolean]]): js.Array[FancytreeNode] = js.native
  /** Find the next visible node that starts with `match`, starting at `startNode` and wrap-around at the end.
    *
    * @returns matching node or null
    */
  def findNextNode(`match`: String): FancytreeNode = js.native
  def findNextNode(`match`: String, startNode: FancytreeNode): FancytreeNode = js.native
  /** Find the next visible node that starts with `match`, starting at `startNode` and wrap-around at the end.
    *
    * @returns matching node or null
    */
  def findNextNode(`match`: js.Function1[/* node */ FancytreeNode, Boolean]): FancytreeNode = js.native
  def findNextNode(`match`: js.Function1[/* node */ FancytreeNode, Boolean], startNode: FancytreeNode): FancytreeNode = js.native
  /** Generate INPUT elements that can be submitted with html forms. In selectMode 3 only the topmost selected nodes are considered. */
  def generateFormElements(): Unit = js.native
  def generateFormElements(selected: js.UndefOr[scala.Nothing], active: Boolean): Unit = js.native
  def generateFormElements(selected: Boolean): Unit = js.native
  def generateFormElements(selected: Boolean, active: Boolean): Unit = js.native
  /** Return the currently active node or null.  */
  def getActiveNode(): FancytreeNode = js.native
  /** Return the first top level node if any (not the invisible root node). */
  def getFirstChild(): FancytreeNode = js.native
  /** Return node that has keyboard focus.
    *
    * @param ifTreeHasFocus (default: false) (not yet implemented)
    */
  def getFocusNode(): FancytreeNode = js.native
  def getFocusNode(ifTreeHasFocus: Boolean): FancytreeNode = js.native
  /** Return node with a given key or null if not found.
    *
    * @param searchRoot (optional) only search below this node.
    */
  def getNodeByKey(key: String): FancytreeNode = js.native
  def getNodeByKey(key: String, searchRoot: FancytreeNode): FancytreeNode = js.native
  /** [ext-clones] Return all nodes with a given refKey (null if not found).
    *
    * @param rootNode optionally restrict results to descendants of this node.
    */
  def getNodesByRef(refKey: String): js.Array[FancytreeNode] = js.native
  def getNodesByRef(refKey: String, rootNode: FancytreeNode): js.Array[FancytreeNode] = js.native
  /** [ext-persist] Return persistence information from cookies Called like $("#tree").fancytree("getTree").getPersistData(); */
  def getPersistData(): PersistData = js.native
  /** Return the invisible system root node.  */
  def getRootNode(): FancytreeNode = js.native
  /** Return an array of selected nodes.
    *
    * @param stopOnParents only return the topmost selected node (useful with selectMode 3)
    */
  def getSelectedNodes(): js.Array[FancytreeNode] = js.native
  def getSelectedNodes(stopOnParents: Boolean): js.Array[FancytreeNode] = js.native
  /** Return true if the tree control has keyboard focus */
  def hasFocus(): Boolean = js.native
  /** Write to browser console if debugLevel >= 1 (prepending tree name)  */
  def info(msg: js.Any): Unit = js.native
  /**  [ext-edit] Check if any node in this tree in edit mode. */
  def isEditing(): FancytreeNode = js.native
  /** Make sure that a node with a given ID is loaded, by traversing - and loading - its parents. This method is ment for lazy hierarchies. A callback is executed for every node as we go.
    *
    * @param keyPathList one or more key paths  (e.g. '/3/2_1/7')
    * @param callback callback(node, status) is called for every visited node ('loading', 'loaded', 'ok', 'error')
    */
  def loadKeyPath(
    keyPathList: js.Array[String],
    callback: js.Function2[/* node */ FancytreeNode, /* status */ String, Unit]
  ): JQueryPromise[_] = js.native
  /** Make sure that a node with a given ID is loaded, by traversing - and loading - its parents. This method is ment for lazy hierarchies. A callback is executed for every node as we go.
    *
    * @param keyPath a key path (e.g. '/3/2_1/7')
    * @param callback callback(node, status) is called for every visited node ('loading', 'loaded', 'ok', 'error')
    */
  def loadKeyPath(keyPath: String, callback: js.Function2[/* node */ FancytreeNode, /* status */ String, Unit]): JQueryPromise[_] = js.native
  /** Re-fire beforeActivate and activate events. */
  def reactivate(): Unit = js.native
  /** Reload tree from source and return a promise.
    *
    * @param source optional new source (defaults to initial source data)
    */
  def reload(): JQueryPromise[_] = js.native
  def reload(source: js.Any): JQueryPromise[_] = js.native
  /** Render tree (i.e. create DOM elements for all top-level nodes).
    *
    * @param force create DOM elements, even is parent is collapsed (default = false)
    * @param deep (default = false)
    */
  def render(): Unit = js.native
  def render(force: js.UndefOr[scala.Nothing], deep: Boolean): Unit = js.native
  def render(force: Boolean): Unit = js.native
  def render(force: Boolean, deep: Boolean): Unit = js.native
  /** @param flag (default = true) */
  def setFocus(): Unit = js.native
  def setFocus(flag: Boolean): Unit = js.native
  /** Return all nodes as nested list of NodeData.
    *
    * @param callback Called for every node
    * @param includeRoot Returns the hidden system root node (and its children) (default = false)
    */
  def toDict(): js.Any = js.native
  def toDict(includeRoot: js.UndefOr[scala.Nothing], callback: js.Function1[/* node */ FancytreeNode, Unit]): js.Any = js.native
  def toDict(includeRoot: Boolean): js.Any = js.native
  def toDict(includeRoot: Boolean, callback: js.Function1[/* node */ FancytreeNode, Unit]): js.Any = js.native
  /** Call fn(node) for all nodes.
    *
    * @param fn the callback function. Return false to stop iteration, return "skip" to skip this node and children only.
    * @returns false, if the iterator was stopped.
    */
  def visit(fn: js.Function1[/* node */ FancytreeNode, _]): Boolean = js.native
  /** Write warning to browser console (prepending tree info) */
  def warn(msg: js.Any): Unit = js.native
}

