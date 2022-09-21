package typings.jqueryFancytree.Fancytree

import typings.jquery.JQueryPromise
import typings.std.HTMLElement
import typings.std.HTMLTableRowElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A FancytreeNode represents the hierarchical data model and operations. */
@js.native
trait FancytreeNode extends StObject {
  
  //#endregion
  //#region Methods
  /**
    * Append (or insert) a list of child nodes.
    *
    * @param children array of child node definitions (also single child accepted)
    * @param insertBefore child node to insert nodes before. If omitted, the new children is appended.
    * @returns The first child added.
    */
  def addChildren(children: js.Array[NodeData]): FancytreeNode = js.native
  def addChildren(children: js.Array[NodeData], insertBefore: String): FancytreeNode = js.native
  def addChildren(children: js.Array[NodeData], insertBefore: Double): FancytreeNode = js.native
  def addChildren(children: js.Array[NodeData], insertBefore: FancytreeNode): FancytreeNode = js.native
  /**
    * Append (or insert) a single child node.
    *
    * @param child node to add
    * @param insertBefore child node to insert this node before. If omitted, the new child is appended.
    * @returns The child added.
    */
  def addChildren(child: NodeData): FancytreeNode = js.native
  def addChildren(child: NodeData, insertBefore: String): FancytreeNode = js.native
  def addChildren(child: NodeData, insertBefore: Double): FancytreeNode = js.native
  def addChildren(child: NodeData, insertBefore: FancytreeNode): FancytreeNode = js.native
  
  /** Add class to node's span tag and to .extraClasses.
    * @param className class name
    */
  def addClass(className: String): Unit = js.native
  
  /** Append or prepend a node, or append a child node. This a convenience function that calls addChildren()
    *
    * @param mode 'before', 'after', 'firstChild', or 'child' ('over' is a synonym for 'child') (default='child')
    * @returns new node.
    */
  def addNode(node: NodeData): FancytreeNode = js.native
  def addNode(node: NodeData, mode: String): FancytreeNode = js.native
  
  /** Modify existing child nodes. */
  def applyPatch(patch: NodePatch): JQueryPromise[Any] = js.native
  
  /** Array of child nodes. For lazy nodes, null or undefined means 'not yet loaded'. Use an empty array to define a node that has no children. */
  var children: js.Array[FancytreeNode] = js.native
  
  /** Collapse all sibling nodes. */
  def collapseSiblings(): JQueryPromise[Any] = js.native
  
  /** Copy this node as sibling or child of `node`.
    *
    * @param node source node
    * @param mode 'before' | 'after' | 'child' (default='child')
    * @param map callback function(NodeData) that could modify the new node
    * @returns new node.
    */
  def copyTo(node: FancytreeNode): FancytreeNode = js.native
  def copyTo(node: FancytreeNode, mode: String): FancytreeNode = js.native
  def copyTo(node: FancytreeNode, mode: String, map: js.Function1[/* node */ NodeData, Unit]): FancytreeNode = js.native
  def copyTo(node: FancytreeNode, mode: Unit, map: js.Function1[/* node */ NodeData, Unit]): FancytreeNode = js.native
  
  /** Count direct and indirect children.
    *
    * @param deep pass 'false' to only count direct children. (default=true)
    */
  def countChildren(): Double = js.native
  def countChildren(deep: Boolean): Double = js.native
  
  /** Contains all extra data that was passed on node creation */
  var data: Any = js.native
  
  /** Write to browser console if debugLevel >= 2 (prepending node info) */
  def debug(msg: Any): Unit = js.native
  
  /** [ext-edit] Create a new child or sibling node and start edit mode.
    *
    * @param mode 'before', 'after', or 'child' (default='child')
    * @param init NodeData (or simple title string)
    */
  def editCreateNode(): Unit = js.native
  def editCreateNode(mode: String): Unit = js.native
  def editCreateNode(mode: String, init: js.Object): Unit = js.native
  def editCreateNode(mode: Unit, init: js.Object): Unit = js.native
  
  /** [ext-edit] Stop inline editing.
    *
    * @param applyChanges false: cancel edit, true: save (if modified)
    */
  def editEnd(applyChanges: Boolean): Unit = js.native
  
  /** [ext-edit] Start inline editing of current node title.  */
  def editStart(): Unit = js.native
  
  /** Use isExpanded(), setExpanded() to access this property. */
  var expanded: Boolean = js.native
  
  /** Addtional CSS classes, added to the node's `<span>`. */
  var extraClasses: String = js.native
  
  /** Find all nodes that contain `match` in the title.
    *
    * @param match string to search for
    */
  def findAll(`match`: String): js.Array[FancytreeNode] = js.native
  /** Find all nodes that contain `match` in the title.
    *
    * @param match a function that returns `true` if a node is matched.
    */
  def findAll(`match`: js.Function1[/* node */ this.type, Boolean]): js.Array[FancytreeNode] = js.native
  
  /** Find first node that contains `match` in the title (not including self).
    *
    * @param match string to search for
    */
  def findFirst(`match`: String): FancytreeNode = js.native
  /** Find first node that contains `match` in the title (not including self).
    *
    * @param match a function that returns `true` if a node is matched.
    */
  def findFirst(`match`: js.Function1[/* node */ this.type, Boolean]): FancytreeNode = js.native
  
  /** Fix selection status, after this node was (de)selected in multi-hier mode. This includes (de)selecting all children. */
  def fixSelection3AfterClick(): Unit = js.native
  
  /** Fix selection status for multi-hier mode. Only end-nodes are considered to update the descendants branch and parents. Should be called after this node has loaded new children or after children have been modified using the API. */
  def fixSelection3FromEndNodes(): Unit = js.native
  
  /** Folder nodes have different default icons and click behavior. Note: Also non-folders may have children. */
  var folder: Boolean = js.native
  
  /** Update node data. If dict contains 'children', then also replace the hole sub tree.  */
  def fromDict(dict: NodeData): Unit = js.native
  
  /** Return the list of child nodes (undefined for unexpanded lazy nodes). */
  def getChildren(): js.Array[FancytreeNode] = js.native
  
  /** [ext-clones] Return a list of clone-nodes or null. */
  def getCloneList(): js.Array[FancytreeNode] = js.native
  def getCloneList(includeSelf: Boolean): js.Array[FancytreeNode] = js.native
  
  /** Return the first child node or null. */
  def getFirstChild(): FancytreeNode = js.native
  
  /** Return the 0-based child index. */
  def getIndex(): Double = js.native
  
  /** Return the hierarchical child index (1-based, e.g. '3.2.4').  */
  def getIndexHier(): String = js.native
  
  /** Return the parent keys separated by options.keyPathSeparator, e.g. "id_1/id_17/id_32". */
  def getKeyPath(excludeSelf: Boolean): String = js.native
  
  /** Return the last child of this node or null. */
  def getLastChild(): FancytreeNode = js.native
  
  /** Return node depth. 0: System root node, 1: visible top-level node, 2: first sub-level, ... . */
  def getLevel(): Double = js.native
  
  /** Return the successor node (under the same parent) or null. */
  def getNextSibling(): FancytreeNode = js.native
  
  /** Return the parent node (null for the system root node).  */
  def getParent(): FancytreeNode = js.native
  
  /**Return an array of all parent nodes (top-down).
    *
    * @param includeRoot Include the invisible system root node. (default=false)
    * @param includeSelf Include the node itself (default=false).
    */
  def getParentList(includeRoot: Boolean, includeSelf: Boolean): js.Array[FancytreeNode] = js.native
  
  /** Return the predecessor node (under the same parent) or null. */
  def getPrevSibling(): FancytreeNode = js.native
  
  /** Return true if node has children. Return undefined if not sure, i.e. the node is lazy and not yet loaded). */
  def hasChildren(): Boolean = js.native
  
  /** Return true if node has keyboard focus. */
  def hasFocus(): Boolean = js.native
  
  /** Icon of the tree node. */
  var icon: String = js.native
  
  /** Write to browser console if debugLevel >= 1 (prepending node info)  */
  def info(msg: String): Unit = js.native
  
  /** Return true if node is active (see also FancytreeNode.isSelected). */
  def isActive(): Boolean = js.native
  
  /** Return true if node is a direct child of otherNode. */
  def isChildOf(otherNode: FancytreeNode): Boolean = js.native
  
  /** [ext-clones] Return true if this node has at least another clone with same refKey. */
  def isClone(): Boolean = js.native
  
  /** Return true, if node is a direct or indirect sub node of otherNode. */
  def isDescendantOf(otherNode: FancytreeNode): Boolean = js.native
  
  /** [ext-edit] Check if this node is in edit mode. */
  def isEditing(): Boolean = js.native
  
  /** Return true if node is expanded.  */
  def isExpanded(): Boolean = js.native
  
  /** Return true if node is the first node of its parent's children.  */
  def isFirstSibling(): Boolean = js.native
  
  /** Return true if node is a folder, i.e. has the node.folder attribute set. */
  def isFolder(): Boolean = js.native
  
  /** Return true if node is the last node of its parent's children.  */
  def isLastSibling(): Boolean = js.native
  
  /** Return true if node is lazy (even if data was already loaded)  */
  def isLazy(): Boolean = js.native
  
  /** Return true if node is lazy and loaded. For non-lazy nodes always return true.  */
  def isLoaded(): Boolean = js.native
  
  /**Return true if children are currently beeing loaded, i.e. a Ajax request is pending.  */
  def isLoading(): Boolean = js.native
  
  /** Return true if this is the (invisible) system root node. */
  def isRootNode(): Boolean = js.native
  
  /** Return true if node is selected, i.e. has a checkmark set (see also FancytreeNode#isActive). */
  def isSelected(): Boolean = js.native
  
  /** Return true if this node is a temporarily generated system node like 'loading', or 'error' (node.statusNodeType contains the type). */
  def isStatusNode(): Boolean = js.native
  
  /** Return true if this a top level node, i.e. a direct child of the (invisible) system root node. */
  def isTopLevel(): Boolean = js.native
  
  /** Return true if node is lazy and not yet loaded. For non-lazy nodes always return false. */
  def isUndefined(): Boolean = js.native
  
  /** Return true if all parent nodes are expanded. Note: this does not check whether the node is scrolled into the visible part of the screen. */
  def isVisible(): Boolean = js.native
  
  /** Node id (must be unique inside the tree) */
  var key: String = js.native
  
  /** True if this node is loaded on demand, i.e. on first expansion. */
  var `lazy`: Boolean = js.native
  
  /** Load all children of a lazy node if neccessary. The *expanded* state is maintained.
    *
    * @param forceReload Pass true to discard any existing nodes before.
    */
  def load(): JQueryPromise[Any] = js.native
  def load(forceReload: Boolean): JQueryPromise[Any] = js.native
  
  /** Expand all parents and optionally scroll into visible area as neccessary. Promise is resolved, when lazy loading and animations are done.
    *
    * @param opts passed to `setExpanded()`. Defaults to {noAnimation: false, noEvents: false, scrollIntoView: true}
    */
  def makeVisible(): JQueryPromise[Any] = js.native
  def makeVisible(opts: js.Object): JQueryPromise[Any] = js.native
  
  /** Move this node to targetNode.
    *
    * @param mode 'child': append this node as last child of targetNode.
    *                       This is the default. To be compatble with the D'n'd
    *                       hitMode, we also accept 'over'.
    *              'before': add this node as sibling before targetNode.
    *              'after': add this node as sibling after targetNode.
    *
    * @param map optional callback(FancytreeNode) to allow modifcations
    */
  def moveTo(targetNode: FancytreeNode, mode: String): Unit = js.native
  def moveTo(targetNode: FancytreeNode, mode: String, map: js.Function1[/* node */ this.type, Unit]): Unit = js.native
  
  /** Set focus relative to this node and optionally activate.
    *
    * @param where The keyCode that would normally trigger this move, e.g. `$.ui.keyCode.LEFT` would collapse the node if it is expanded or move to the parent oterwise.
    * @param activate (default=true)
    */
  def navigate(where: Double): JQueryPromise[Any] = js.native
  def navigate(where: Double, activate: Boolean): JQueryPromise[Any] = js.native
  
  /** The parent node */
  var parent: FancytreeNode = js.native
  
  /** [ext-clones] Update key and/or refKey for an existing node. */
  def reRegister(key: String, refKey: String): Boolean = js.native
  
  /** Remove this node (not allowed for system root).  */
  def remove(): Unit = js.native
  
  /** Remove childNode from list of direct children. */
  def removeChild(childNode: FancytreeNode): Unit = js.native
  
  /** Remove all child nodes and descendents. This converts the node into a leaf.
    * If this was a lazy node, it is still considered 'loaded'; call node.resetLazy() in order to trigger lazyLoad on next expand.
    */
  def removeChildren(): Unit = js.native
  
  /** Remove class from node's span tag and .extraClasses.
    * @param className class name
    */
  def removeClass(className: String): Unit = js.native
  
  /** This method renders and updates all HTML markup that is required to display this node in its current state.
    *
    * @param force re-render, even if html markup was already created
    * @param deep  also render all descendants, even if parent is collapsed
    */
  def render(): Unit = js.native
  def render(force: Boolean): Unit = js.native
  def render(force: Boolean, deep: Boolean): Unit = js.native
  def render(force: Unit, deep: Boolean): Unit = js.native
  
  /** Update element's CSS classes according to node state. */
  def renderStatus(): Unit = js.native
  
  /** Create HTML markup for the node's outer (expander, checkbox, icon, and title).  */
  def renderTitle(): Unit = js.native
  
  /** Remove all children, collapse, and set the lazy-flag, so that the lazyLoad event is triggered on next expand. */
  def resetLazy(): Unit = js.native
  
  /** Schedule activity for delayed execution (cancel any pending request). scheduleAction('cancel') will only cancel a pending request (if any). */
  def scheduleAction(mode: String, ms: Double): Unit = js.native
  
  /**
    * @param effects animation options.
    * @param options {topNode: null, effects: ..., parent: ...} this node will remain visible in any case, even if `this` is outside the scroll pane.
    */
  def scrollIntoView(): JQueryPromise[Any] = js.native
  def scrollIntoView(effects: js.Object): JQueryPromise[Any] = js.native
  def scrollIntoView(effects: js.Object, options: js.Object): JQueryPromise[Any] = js.native
  def scrollIntoView(effects: Boolean): JQueryPromise[Any] = js.native
  def scrollIntoView(effects: Boolean, options: js.Object): JQueryPromise[Any] = js.native
  def scrollIntoView(effects: Unit, options: js.Object): JQueryPromise[Any] = js.native
  
  /**
    * @param flag pass false to deactivate
    * @param opts additional options. Defaults to {noEvents: false}
    */
  def setActive(): JQueryPromise[Any] = js.native
  def setActive(flag: Boolean): JQueryPromise[Any] = js.native
  def setActive(flag: Boolean, opts: js.Object): JQueryPromise[Any] = js.native
  def setActive(flag: Unit, opts: js.Object): JQueryPromise[Any] = js.native
  
  /**
    * @param flag pass false to collapse.
    * @param opts additional options. Defaults to {noAnimation:false, noEvents:false}
    */
  def setExpanded(): JQueryPromise[Any] = js.native
  def setExpanded(flag: Boolean): JQueryPromise[Any] = js.native
  def setExpanded(flag: Boolean, opts: js.Object): JQueryPromise[Any] = js.native
  def setExpanded(flag: Unit, opts: js.Object): JQueryPromise[Any] = js.native
  
  /**
    * Set keyboard focus to this node.
    *
    * @param flag pass false to blur.
    */
  def setFocus(): Unit = js.native
  def setFocus(flag: Boolean): Unit = js.native
  
  /**
    * Select this node, i.e. check the checkbox.
    *
    * @param flag pass false to deselect.
    */
  def setSelected(): Unit = js.native
  def setSelected(flag: Boolean): Unit = js.native
  
  /**
    * Mark a lazy node as 'error', 'loading', or 'ok'.
    *
    * @param status 'error', 'ok'
    */
  def setStatus(status: String): Unit = js.native
  def setStatus(status: String, message: String): Unit = js.native
  def setStatus(status: String, message: String, details: String): Unit = js.native
  def setStatus(status: String, message: Unit, details: String): Unit = js.native
  
  /** Rename this node. */
  def setTitle(title: String): Unit = js.native
  
  /**
    * Sort child list by title.
    *
    * @param cmp custom compare function(a, b) that returns -1, 0, or 1 (defaults to sort by title).
    * @param deep pass true to sort all descendant nodes
    */
  def sortChildren(): Unit = js.native
  def sortChildren(cmp: js.Function2[/* a */ this.type, /* b */ this.type, Double]): Unit = js.native
  def sortChildren(cmp: js.Function2[/* a */ this.type, /* b */ this.type, Double], deep: Boolean): Unit = js.native
  def sortChildren(cmp: Unit, deep: Boolean): Unit = js.native
  
  /** Outer element of single nodes */
  var span: HTMLElement = js.native
  
  /** null or type of temporarily generated system node like 'loading', or 'error'. */
  var statusNodeType: String = js.native
  
  /** Display name (may contain HTML) */
  var title: String = js.native
  
  /**
    * Convert node (or whole branch) into a plain object. The result is compatible with node.addChildren().
    *
    * @param recursive include child nodes.
    * @param callback callback(dict) is called for every node, in order to allow modifications
    */
  def toDict(): NodeData = js.native
  def toDict(recursive: Boolean): NodeData = js.native
  def toDict(recursive: Boolean, callback: js.Function1[/* dict */ NodeData, Unit]): NodeData = js.native
  def toDict(recursive: Unit, callback: js.Function1[/* dict */ NodeData, Unit]): NodeData = js.native
  
  /** Set, clear, or toggle class of node's span tag and .extraClasses.
    * @param {string} className class name (separate multiple classes by space)
    * @param {boolean} [flag] true/false to add/remove class. If omitted, class is toggled.
    * @return true if a class was added
    */
  def toggleClass(className: String): Boolean = js.native
  def toggleClass(className: String, flag: Boolean): Boolean = js.native
  
  /** Flip expanded status. */
  def toggleExpanded(): Unit = js.native
  
  /** Flip selection status. */
  def toggleSelected(): Unit = js.native
  
  /** Alternative description used as hover banner */
  var tooltip: String = js.native
  
  /** Outer element of single nodes for table extension */
  var tr: HTMLTableRowElement = js.native
  
  //#region Properties
  /** The tree instance */
  var tree: typings.jqueryFancytree.Fancytree.Fancytree = js.native
  
  var unselectable: js.UndefOr[Boolean] = js.native
  
  var unselectableIgnore: js.UndefOr[Boolean] = js.native
  
  var unselectableStatus: js.UndefOr[Boolean] = js.native
  
  /**
    * Call fn(node) for all child nodes.
    * Stop iteration, if fn() returns false. Skip current branch,
    * if fn() returns "skip". Return false if iteration was stopped.
    *
    * @param fn the callback function. Return false to stop iteration, return "skip" to skip this node and its children only.
    * @param includeSelf (default=false)
    */
  def visit(fn: js.Function1[/* node */ this.type, Any]): Boolean = js.native
  def visit(fn: js.Function1[/* node */ this.type, Any], includeSelf: Boolean): Boolean = js.native
  
  /**
    * Call fn(node) for all child nodes and recursively load lazy children.
    * Note: If you need this method, you probably should consider to review your architecture! Recursivley loading nodes is
    * a perfect way for lazy programmers to flood the server with requests ;-)
    *
    * @param fn the callback function. Return false to stop iteration, return "skip" to skip this node and its children only.
    * @param includeSelf (default=false)
    */
  def visitAndLoad(fn: js.Function1[/* node */ this.type, Any]): JQueryPromise[Any] = js.native
  def visitAndLoad(fn: js.Function1[/* node */ this.type, Any], includeSelf: Boolean): JQueryPromise[Any] = js.native
  
  /**
    * Call fn(node) for all parent nodes, bottom-up, including invisible system root.
    * Stop iteration, if fn() returns false.
    * Return false if iteration was stopped.
    *
    * @param fn the callback function. Return false to stop iteration, return "skip" to skip this node and its children only.
    * @param includeSelf (default=false)
    */
  def visitParents(fn: js.Function1[/* node */ this.type, Any]): Boolean = js.native
  def visitParents(fn: js.Function1[/* node */ this.type, Any], includeSelf: Boolean): Boolean = js.native
  
  /**
    * Write warning to browser console (prepending node info)
    */
  def warn(msg: Any): Unit = js.native
}
