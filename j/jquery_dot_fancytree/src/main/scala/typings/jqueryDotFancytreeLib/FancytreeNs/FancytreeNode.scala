package typings
package jqueryDotFancytreeLib.FancytreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A FancytreeNode represents the hierarchical data model and operations. */
@js.native
trait FancytreeNode extends js.Object {
  /** Array of child nodes. For lazy nodes, null or undefined means 'not yet loaded'. Use an empty array to define a node that has no children. */
  var children: js.Array[FancytreeNode] = js.native
  /** Contains all extra data that was passed on node creation */
  var data: js.Any = js.native
  /** Use isExpanded(), setExpanded() to access this property. */
  var expanded: scala.Boolean = js.native
  /** Addtional CSS classes, added to the node's `<span>`. */
  var extraClasses: java.lang.String = js.native
  /** Folder nodes have different default icons and click behavior. Note: Also non-folders may have children. */
  var folder: scala.Boolean = js.native
  /** Node id (must be unique inside the tree) */
  var key: java.lang.String = js.native
  /** True if this node is loaded on demand, i.e. on first expansion. */
  var `lazy`: scala.Boolean = js.native
  /** The parent node */
  var parent: FancytreeNode = js.native
  /** Outer element of single nodes */
  var span: stdLib.HTMLElement = js.native
  /** null or type of temporarily generated system node like 'loading', or 'error'. */
  var statusNodeType: java.lang.String = js.native
  /** Display name (may contain HTML) */
  var title: java.lang.String = js.native
  /** Alternative description used as hover banner */
  var tooltip: java.lang.String = js.native
  /** Outer element of single nodes for table extension */
  var tr: stdLib.HTMLTableRowElement = js.native
  //#region Properties
  /** The tree instance */
  var tree: Fancytree = js.native
  /**
           * Append (or insert) a single child node.
           *
           * @param child node to add
           * @param insertBefore child node to insert this node before. If omitted, the new child is appended.
           * @returns The child added.
           */
  def addChildren(child: NodeData): FancytreeNode = js.native
  /**
           * Append (or insert) a single child node.
           *
           * @param child node to add
           * @param insertBefore key of the child node to insert this node before. If omitted, the new child is appended.
           * @returns The child added.
           */
  def addChildren(child: NodeData, insertBefore: java.lang.String): FancytreeNode = js.native
  /**
           * Append (or insert) a single child node.
           *
           * @param child node to add
           * @param insertBefore child node to insert this node before. If omitted, the new child is appended.
           * @returns The child added.
           */
  def addChildren(child: NodeData, insertBefore: FancytreeNode): FancytreeNode = js.native
  /**
           * Append (or insert) a single child node.
           *
           * @param child node to add
           * @param insertBefore index of the child node to insert this node before. If omitted, the new child is appended.
           * @returns The child added.
           */
  def addChildren(child: NodeData, insertBefore: scala.Double): FancytreeNode = js.native
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
  /**
           * Append (or insert) a list of child nodes.
           *
           * @param children array of child node definitions (also single child accepted)
           * @param insertBefore key of the child node to insert nodes before. If omitted, the new children is appended.
           * @returns The first child added.
           */
  def addChildren(children: js.Array[NodeData], insertBefore: java.lang.String): FancytreeNode = js.native
  //#endregion
  //#region Methods
  /**
           * Append (or insert) a list of child nodes.
           *
           * @param children array of child node definitions (also single child accepted)
           * @param insertBefore child node to insert nodes before. If omitted, the new children is appended.
           * @returns The first child added.
           */
  def addChildren(children: js.Array[NodeData], insertBefore: FancytreeNode): FancytreeNode = js.native
  /**
           * Append (or insert) a list of child nodes.
           *
           * @param children array of child node definitions (also single child accepted)
           * @param insertBefore index of the child node to insert nodes before. If omitted, the new children is appended.
           * @returns The first child added.
           */
  def addChildren(children: js.Array[NodeData], insertBefore: scala.Double): FancytreeNode = js.native
  /** Add class to node's span tag and to .extraClasses.
           * @param className class name
           */
  def addClass(className: java.lang.String): scala.Unit = js.native
  /** Append or prepend a node, or append a child node. This a convenience function that calls addChildren()
           *
           * @param mode 'before', 'after', 'firstChild', or 'child' ('over' is a synonym for 'child') (default='child')
           * @returns new node.
           */
  def addNode(node: NodeData): FancytreeNode = js.native
  /** Append or prepend a node, or append a child node. This a convenience function that calls addChildren()
           *
           * @param mode 'before', 'after', 'firstChild', or 'child' ('over' is a synonym for 'child') (default='child')
           * @returns new node.
           */
  def addNode(node: NodeData, mode: java.lang.String): FancytreeNode = js.native
  /** Modify existing child nodes. */
  def applyPatch(patch: NodePatch): jqueryLib.JQueryPromise[_] = js.native
  /** Collapse all sibling nodes. */
  def collapseSiblings(): jqueryLib.JQueryPromise[_] = js.native
  /** Copy this node as sibling or child of `node`.
           *
           * @param node source node
           * @param mode 'before' | 'after' | 'child' (default='child')
           * @param map callback function(NodeData) that could modify the new node
           * @returns new node.
           */
  def copyTo(node: FancytreeNode): FancytreeNode = js.native
  /** Copy this node as sibling or child of `node`.
           *
           * @param node source node
           * @param mode 'before' | 'after' | 'child' (default='child')
           * @param map callback function(NodeData) that could modify the new node
           * @returns new node.
           */
  def copyTo(node: FancytreeNode, mode: java.lang.String): FancytreeNode = js.native
  /** Copy this node as sibling or child of `node`.
           *
           * @param node source node
           * @param mode 'before' | 'after' | 'child' (default='child')
           * @param map callback function(NodeData) that could modify the new node
           * @returns new node.
           */
  def copyTo(node: FancytreeNode, mode: java.lang.String, map: js.Function1[/* node */ NodeData, scala.Unit]): FancytreeNode = js.native
  /** Count direct and indirect children.
           *
           * @param deep pass 'false' to only count direct children. (default=true)
           */
  def countChildren(): scala.Double = js.native
  /** Count direct and indirect children.
           *
           * @param deep pass 'false' to only count direct children. (default=true)
           */
  def countChildren(deep: scala.Boolean): scala.Double = js.native
  /** Write to browser console if debugLevel >= 2 (prepending node info) */
  def debug(msg: js.Any): scala.Unit = js.native
  /** [ext-edit] Create a new child or sibling node and start edit mode.
           *
           * @param mode 'before', 'after', or 'child' (default='child')
           * @param init NodeData (or simple title string)
           */
  def editCreateNode(): scala.Unit = js.native
  /** [ext-edit] Create a new child or sibling node and start edit mode.
           *
           * @param mode 'before', 'after', or 'child' (default='child')
           * @param init NodeData (or simple title string)
           */
  def editCreateNode(mode: java.lang.String): scala.Unit = js.native
  /** [ext-edit] Create a new child or sibling node and start edit mode.
           *
           * @param mode 'before', 'after', or 'child' (default='child')
           * @param init NodeData (or simple title string)
           */
  def editCreateNode(mode: java.lang.String, init: js.Object): scala.Unit = js.native
  /** [ext-edit] Stop inline editing.
           *
           * @param applyChanges false: cancel edit, true: save (if modified)
           */
  def editEnd(applyChanges: scala.Boolean): scala.Unit = js.native
  /** [ext-edit] Start inline editing of current node title.  */
  def editStart(): scala.Unit = js.native
  /** Find all nodes that contain `match` in the title.
           *
           * @param match string to search for
           */
  def findAll(`match`: java.lang.String): js.Array[FancytreeNode] = js.native
  /** Find all nodes that contain `match` in the title.
            *
            * @param match a function that returns `true` if a node is matched.
            */
  def findAll(`match`: js.Function1[/* node */ this.type, scala.Boolean]): js.Array[FancytreeNode] = js.native
  /** Find first node that contains `match` in the title (not including self).
           *
           * @param match string to search for
           */
  def findFirst(`match`: java.lang.String): FancytreeNode = js.native
  /** Find first node that contains `match` in the title (not including self).
            *
            * @param match a function that returns `true` if a node is matched.
            */
  def findFirst(`match`: js.Function1[/* node */ this.type, scala.Boolean]): FancytreeNode = js.native
  /** Fix selection status, after this node was (de)selected in multi-hier mode. This includes (de)selecting all children. */
  def fixSelection3AfterClick(): scala.Unit = js.native
  /** Fix selection status for multi-hier mode. Only end-nodes are considered to update the descendants branch and parents. Should be called after this node has loaded new children or after children have been modified using the API. */
  def fixSelection3FromEndNodes(): scala.Unit = js.native
  /** Update node data. If dict contains 'children', then also replace the hole sub tree.  */
  def fromDict(dict: NodeData): scala.Unit = js.native
  /** Return the list of child nodes (undefined for unexpanded lazy nodes). */
  def getChildren(): js.Array[FancytreeNode] = js.native
  /** [ext-clones] Return a list of clone-nodes or null. */
  def getCloneList(): js.Array[FancytreeNode] = js.native
  /** [ext-clones] Return a list of clone-nodes or null. */
  def getCloneList(includeSelf: scala.Boolean): js.Array[FancytreeNode] = js.native
  /** Return the first child node or null. */
  def getFirstChild(): FancytreeNode = js.native
  /** Return the 0-based child index. */
  def getIndex(): scala.Double = js.native
  /** Return the hierarchical child index (1-based, e.g. '3.2.4').  */
  def getIndexHier(): java.lang.String = js.native
  /** Return the parent keys separated by options.keyPathSeparator, e.g. "id_1/id_17/id_32". */
  def getKeyPath(excludeSelf: scala.Boolean): java.lang.String = js.native
  /** Return the last child of this node or null. */
  def getLastChild(): FancytreeNode = js.native
  /** Return node depth. 0: System root node, 1: visible top-level node, 2: first sub-level, ... . */
  def getLevel(): scala.Double = js.native
  /** Return the successor node (under the same parent) or null. */
  def getNextSibling(): FancytreeNode = js.native
  /** Return the parent node (null for the system root node).  */
  def getParent(): FancytreeNode = js.native
  /**Return an array of all parent nodes (top-down).
           *
           * @param includeRoot Include the invisible system root node. (default=false)
           * @param includeSelf Include the node itself (default=false).
            */
  def getParentList(includeRoot: scala.Boolean, includeSelf: scala.Boolean): js.Array[FancytreeNode] = js.native
  /** Return the predecessor node (under the same parent) or null. */
  def getPrevSibling(): FancytreeNode = js.native
  /** Return true if node has children. Return undefined if not sure, i.e. the node is lazy and not yet loaded). */
  def hasChildren(): scala.Boolean = js.native
  /** Return true if node has keyboard focus. */
  def hasFocus(): scala.Boolean = js.native
  /** Write to browser console if debugLevel >= 1 (prepending node info)  */
  def info(msg: java.lang.String): scala.Unit = js.native
  /** Return true if node is active (see also FancytreeNode.isSelected). */
  def isActive(): scala.Boolean = js.native
  /** Return true if node is a direct child of otherNode. */
  def isChildOf(otherNode: FancytreeNode): scala.Boolean = js.native
  /** [ext-clones] Return true if this node has at least another clone with same refKey. */
  def isClone(): scala.Boolean = js.native
  /** Return true, if node is a direct or indirect sub node of otherNode. */
  def isDescendantOf(otherNode: FancytreeNode): scala.Boolean = js.native
  /** [ext-edit] Check if this node is in edit mode. */
  def isEditing(): scala.Boolean = js.native
  /** Return true if node is expanded.  */
  def isExpanded(): scala.Boolean = js.native
  /** Return true if node is the first node of its parent's children.  */
  def isFirstSibling(): scala.Boolean = js.native
  /** Return true if node is a folder, i.e. has the node.folder attribute set. */
  def isFolder(): scala.Boolean = js.native
  /** Return true if node is the last node of its parent's children.  */
  def isLastSibling(): scala.Boolean = js.native
  /** Return true if node is lazy (even if data was already loaded)  */
  def isLazy(): scala.Boolean = js.native
  /** Return true if node is lazy and loaded. For non-lazy nodes always return true.  */
  def isLoaded(): scala.Boolean = js.native
  /**Return true if children are currently beeing loaded, i.e. a Ajax request is pending.  */
  def isLoading(): scala.Boolean = js.native
  /** Return true if this is the (invisible) system root node. */
  def isRootNode(): scala.Boolean = js.native
  /** Return true if node is selected, i.e. has a checkmark set (see also FancytreeNode#isActive). */
  def isSelected(): scala.Boolean = js.native
  /** Return true if this node is a temporarily generated system node like 'loading', or 'error' (node.statusNodeType contains the type). */
  def isStatusNode(): scala.Boolean = js.native
  /** Return true if this a top level node, i.e. a direct child of the (invisible) system root node. */
  def isTopLevel(): scala.Boolean = js.native
  /** Return true if node is lazy and not yet loaded. For non-lazy nodes always return false. */
  def isUndefined(): scala.Boolean = js.native
  /** Return true if all parent nodes are expanded. Note: this does not check whether the node is scrolled into the visible part of the screen. */
  def isVisible(): scala.Boolean = js.native
  /** Load all children of a lazy node if neccessary. The *expanded* state is maintained.
           *
           * @param forceReload Pass true to discard any existing nodes before.
           */
  def load(): jqueryLib.JQueryPromise[_] = js.native
  /** Load all children of a lazy node if neccessary. The *expanded* state is maintained.
           *
           * @param forceReload Pass true to discard any existing nodes before.
           */
  def load(forceReload: scala.Boolean): jqueryLib.JQueryPromise[_] = js.native
  /** Expand all parents and optionally scroll into visible area as neccessary. Promise is resolved, when lazy loading and animations are done.
           *
           * @param opts passed to `setExpanded()`. Defaults to {noAnimation: false, noEvents: false, scrollIntoView: true}
           */
  def makeVisible(): jqueryLib.JQueryPromise[_] = js.native
  /** Expand all parents and optionally scroll into visible area as neccessary. Promise is resolved, when lazy loading and animations are done.
           *
           * @param opts passed to `setExpanded()`. Defaults to {noAnimation: false, noEvents: false, scrollIntoView: true}
           */
  def makeVisible(opts: js.Object): jqueryLib.JQueryPromise[_] = js.native
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
  def moveTo(targetNode: FancytreeNode, mode: java.lang.String): scala.Unit = js.native
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
  def moveTo(
    targetNode: FancytreeNode,
    mode: java.lang.String,
    map: js.Function1[/* node */ this.type, scala.Unit]
  ): scala.Unit = js.native
  /** Set focus relative to this node and optionally activate.
           *
           * @param where The keyCode that would normally trigger this move, e.g. `$.ui.keyCode.LEFT` would collapse the node if it is expanded or move to the parent oterwise.
           * @param activate (default=true)
           */
  def navigate(where: scala.Double): jqueryLib.JQueryPromise[_] = js.native
  /** Set focus relative to this node and optionally activate.
           *
           * @param where The keyCode that would normally trigger this move, e.g. `$.ui.keyCode.LEFT` would collapse the node if it is expanded or move to the parent oterwise.
           * @param activate (default=true)
           */
  def navigate(where: scala.Double, activate: scala.Boolean): jqueryLib.JQueryPromise[_] = js.native
  /** [ext-clones] Update key and/or refKey for an existing node. */
  def reRegister(key: java.lang.String, refKey: java.lang.String): scala.Boolean = js.native
  /** Remove this node (not allowed for system root).  */
  def remove(): scala.Unit = js.native
  /** Remove childNode from list of direct children. */
  def removeChild(childNode: FancytreeNode): scala.Unit = js.native
  /** Remove all child nodes and descendents. This converts the node into a leaf.
           * If this was a lazy node, it is still considered 'loaded'; call node.resetLazy() in order to trigger lazyLoad on next expand.
           */
  def removeChildren(): scala.Unit = js.native
  /** Remove class from node's span tag and .extraClasses.
           * @param className class name
           */
  def removeClass(className: java.lang.String): scala.Unit = js.native
  /** This method renders and updates all HTML markup that is required to display this node in its current state.
           *
           * @param force re-render, even if html markup was already created
           * @param deep  also render all descendants, even if parent is collapsed
           */
  def render(): scala.Unit = js.native
  /** This method renders and updates all HTML markup that is required to display this node in its current state.
           *
           * @param force re-render, even if html markup was already created
           * @param deep  also render all descendants, even if parent is collapsed
           */
  def render(force: scala.Boolean): scala.Unit = js.native
  /** This method renders and updates all HTML markup that is required to display this node in its current state.
           *
           * @param force re-render, even if html markup was already created
           * @param deep  also render all descendants, even if parent is collapsed
           */
  def render(force: scala.Boolean, deep: scala.Boolean): scala.Unit = js.native
  /** Update element's CSS classes according to node state. */
  def renderStatus(): scala.Unit = js.native
  /** Create HTML markup for the node's outer (expander, checkbox, icon, and title).  */
  def renderTitle(): scala.Unit = js.native
  /** Remove all children, collapse, and set the lazy-flag, so that the lazyLoad event is triggered on next expand. */
  def resetLazy(): scala.Unit = js.native
  /** Schedule activity for delayed execution (cancel any pending request). scheduleAction('cancel') will only cancel a pending request (if any). */
  def scheduleAction(mode: java.lang.String, ms: scala.Double): scala.Unit = js.native
  /**
           * @param effects animation options.
           * @param options {topNode: null, effects: ..., parent: ...} this node will remain visible in any case, even if `this` is outside the scroll pane.
           */
  def scrollIntoView(): jqueryLib.JQueryPromise[_] = js.native
  /**
           * @param effects animation options.
           * @param options {topNode: null, effects: ..., parent: ...} this node will remain visible in any case, even if `this` is outside the scroll pane.
           */
  def scrollIntoView(effects: js.Object): jqueryLib.JQueryPromise[_] = js.native
  /**
           * @param effects animation options.
           * @param options {topNode: null, effects: ..., parent: ...} this node will remain visible in any case, even if `this` is outside the scroll pane.
           */
  def scrollIntoView(effects: js.Object, options: js.Object): jqueryLib.JQueryPromise[_] = js.native
  /**
           * @param effects animation options.
           * @param options {topNode: null, effects: ..., parent: ...} this node will remain visible in any case, even if `this` is outside the scroll pane.
           */
  def scrollIntoView(effects: scala.Boolean): jqueryLib.JQueryPromise[_] = js.native
  /**
           * @param effects animation options.
           * @param options {topNode: null, effects: ..., parent: ...} this node will remain visible in any case, even if `this` is outside the scroll pane.
           */
  def scrollIntoView(effects: scala.Boolean, options: js.Object): jqueryLib.JQueryPromise[_] = js.native
  /**
           * @param flag pass false to deactivate
           * @param opts additional options. Defaults to {noEvents: false}
           */
  def setActive(): jqueryLib.JQueryPromise[_] = js.native
  /**
           * @param flag pass false to deactivate
           * @param opts additional options. Defaults to {noEvents: false}
           */
  def setActive(flag: scala.Boolean): jqueryLib.JQueryPromise[_] = js.native
  /**
           * @param flag pass false to deactivate
           * @param opts additional options. Defaults to {noEvents: false}
           */
  def setActive(flag: scala.Boolean, opts: js.Object): jqueryLib.JQueryPromise[_] = js.native
  /**
           * @param flag pass false to collapse.
           * @param opts additional options. Defaults to {noAnimation:false, noEvents:false}
           */
  def setExpanded(): jqueryLib.JQueryPromise[_] = js.native
  /**
           * @param flag pass false to collapse.
           * @param opts additional options. Defaults to {noAnimation:false, noEvents:false}
           */
  def setExpanded(flag: scala.Boolean): jqueryLib.JQueryPromise[_] = js.native
  /**
           * @param flag pass false to collapse.
           * @param opts additional options. Defaults to {noAnimation:false, noEvents:false}
           */
  def setExpanded(flag: scala.Boolean, opts: js.Object): jqueryLib.JQueryPromise[_] = js.native
  /**
           * Set keyboard focus to this node.
           *
           * @param flag pass false to blur.
           */
  def setFocus(): scala.Unit = js.native
  /**
           * Set keyboard focus to this node.
           *
           * @param flag pass false to blur.
           */
  def setFocus(flag: scala.Boolean): scala.Unit = js.native
  /**
           * Select this node, i.e. check the checkbox.
           *
           * @param flag pass false to deselect.
           */
  def setSelected(): scala.Unit = js.native
  /**
           * Select this node, i.e. check the checkbox.
           *
           * @param flag pass false to deselect.
           */
  def setSelected(flag: scala.Boolean): scala.Unit = js.native
  /**
           * Mark a lazy node as 'error', 'loading', or 'ok'.
           *
           * @param status 'error', 'ok'
           */
  def setStatus(status: java.lang.String): scala.Unit = js.native
  /**
           * Mark a lazy node as 'error', 'loading', or 'ok'.
           *
           * @param status 'error', 'ok'
           */
  def setStatus(status: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
           * Mark a lazy node as 'error', 'loading', or 'ok'.
           *
           * @param status 'error', 'ok'
           */
  def setStatus(status: java.lang.String, message: java.lang.String, details: java.lang.String): scala.Unit = js.native
  /** Rename this node. */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
           * Sort child list by title.
           *
           * @param cmp custom compare function(a, b) that returns -1, 0, or 1 (defaults to sort by title).
           * @param deep pass true to sort all descendant nodes
           */
  def sortChildren(): scala.Unit = js.native
  /**
           * Sort child list by title.
           *
           * @param cmp custom compare function(a, b) that returns -1, 0, or 1 (defaults to sort by title).
           * @param deep pass true to sort all descendant nodes
           */
  def sortChildren(cmp: js.Function2[/* a */ this.type, /* b */ this.type, scala.Double]): scala.Unit = js.native
  /**
           * Sort child list by title.
           *
           * @param cmp custom compare function(a, b) that returns -1, 0, or 1 (defaults to sort by title).
           * @param deep pass true to sort all descendant nodes
           */
  def sortChildren(cmp: js.Function2[/* a */ this.type, /* b */ this.type, scala.Double], deep: scala.Boolean): scala.Unit = js.native
  /**
           * Convert node (or whole branch) into a plain object. The result is compatible with node.addChildren().
           *
           * @param recursive include child nodes.
           * @param callback callback(dict) is called for every node, in order to allow modifications
           */
  def toDict(): NodeData = js.native
  /**
           * Convert node (or whole branch) into a plain object. The result is compatible with node.addChildren().
           *
           * @param recursive include child nodes.
           * @param callback callback(dict) is called for every node, in order to allow modifications
           */
  def toDict(recursive: scala.Boolean): NodeData = js.native
  /**
           * Convert node (or whole branch) into a plain object. The result is compatible with node.addChildren().
           *
           * @param recursive include child nodes.
           * @param callback callback(dict) is called for every node, in order to allow modifications
           */
  def toDict(recursive: scala.Boolean, callback: js.Function1[/* dict */ NodeData, scala.Unit]): NodeData = js.native
  /** Set, clear, or toggle class of node's span tag and .extraClasses.
           * @param {string} className class name (separate multiple classes by space)
           * @param {boolean} [flag] true/false to add/remove class. If omitted, class is toggled.
           * @return true if a class was added
           */
  def toggleClass(className: java.lang.String): scala.Boolean = js.native
  /** Set, clear, or toggle class of node's span tag and .extraClasses.
           * @param {string} className class name (separate multiple classes by space)
           * @param {boolean} [flag] true/false to add/remove class. If omitted, class is toggled.
           * @return true if a class was added
           */
  def toggleClass(className: java.lang.String, flag: scala.Boolean): scala.Boolean = js.native
  /** Flip expanded status. */
  def toggleExpanded(): scala.Unit = js.native
  /** Flip selection status. */
  def toggleSelected(): scala.Unit = js.native
  /**
           * Call fn(node) for all child nodes.
           * Stop iteration, if fn() returns false. Skip current branch,
           * if fn() returns "skip". Return false if iteration was stopped.
           *
           * @param fn the callback function. Return false to stop iteration, return "skip" to skip this node and its children only.
           * @param includeSelf (default=false)
           */
  def visit(fn: js.Function1[/* node */ this.type, _]): scala.Boolean = js.native
  /**
           * Call fn(node) for all child nodes.
           * Stop iteration, if fn() returns false. Skip current branch,
           * if fn() returns "skip". Return false if iteration was stopped.
           *
           * @param fn the callback function. Return false to stop iteration, return "skip" to skip this node and its children only.
           * @param includeSelf (default=false)
           */
  def visit(fn: js.Function1[/* node */ this.type, _], includeSelf: scala.Boolean): scala.Boolean = js.native
  /**
           * Call fn(node) for all child nodes and recursively load lazy children.
           * Note: If you need this method, you probably should consider to review your architecture! Recursivley loading nodes is
           * a perfect way for lazy programmers to flood the server with requests ;-)
           *
           * @param fn the callback function. Return false to stop iteration, return "skip" to skip this node and its children only.
           * @param includeSelf (default=false)
           */
  def visitAndLoad(fn: js.Function1[/* node */ this.type, _]): jqueryLib.JQueryPromise[_] = js.native
  /**
           * Call fn(node) for all child nodes and recursively load lazy children.
           * Note: If you need this method, you probably should consider to review your architecture! Recursivley loading nodes is
           * a perfect way for lazy programmers to flood the server with requests ;-)
           *
           * @param fn the callback function. Return false to stop iteration, return "skip" to skip this node and its children only.
           * @param includeSelf (default=false)
           */
  def visitAndLoad(fn: js.Function1[/* node */ this.type, _], includeSelf: scala.Boolean): jqueryLib.JQueryPromise[_] = js.native
  /**
           * Call fn(node) for all parent nodes, bottom-up, including invisible system root.
           * Stop iteration, if fn() returns false.
           * Return false if iteration was stopped.
           *
           * @param fn the callback function. Return false to stop iteration, return "skip" to skip this node and its children only.
           * @param includeSelf (default=false)
           */
  def visitParents(fn: js.Function1[/* node */ this.type, _]): scala.Boolean = js.native
  /**
           * Call fn(node) for all parent nodes, bottom-up, including invisible system root.
           * Stop iteration, if fn() returns false.
           * Return false if iteration was stopped.
           *
           * @param fn the callback function. Return false to stop iteration, return "skip" to skip this node and its children only.
           * @param includeSelf (default=false)
           */
  def visitParents(fn: js.Function1[/* node */ this.type, _], includeSelf: scala.Boolean): scala.Boolean = js.native
  /**
           * Write warning to browser console (prepending node info)
           */
  def warn(msg: js.Any): scala.Unit = js.native
}

