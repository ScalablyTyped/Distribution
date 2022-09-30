package typings.gridstack

import typings.gridstack.distTypesMod.GridStackMoveOpts
import typings.gridstack.distTypesMod.GridStackNode
import typings.gridstack.distTypesMod.GridStackPosition
import typings.gridstack.gridstackInts.`-1`
import typings.gridstack.gridstackInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGridstackEngineMod {
  
  @JSImport("gridstack/dist/gridstack-engine", "GridStackEngine")
  @js.native
  open class GridStackEngine () extends StObject {
    def this(opts: GridStackEngineOptions) = this()
    
    /* protected */ def _useEntireRowArea(node: GridStackNode, nn: GridStackPosition): Boolean = js.native
    
    /** call to add the given node to our list, fixing collision and re-packing */
    def addNode(node: GridStackNode): GridStackNode = js.native
    def addNode(node: GridStackNode, triggerAddEvent: Boolean): GridStackNode = js.native
    
    var addedNodes: js.Array[GridStackNode] = js.native
    
    var batchMode: Boolean = js.native
    
    def batchUpdate(): GridStackEngine = js.native
    def batchUpdate(flag: Boolean): GridStackEngine = js.native
    
    def beginUpdate(node: GridStackNode): GridStackEngine = js.native
    
    /**
      * call to cache the given layout internally to the given location so we can restore back when column changes size
      * @param nodes list of nodes
      * @param column corresponding column index to save it under
      * @param clear if true, will force other caches to be removed (default false)
      */
    def cacheLayout(nodes: js.Array[GridStackNode], column: Double): GridStackEngine = js.native
    def cacheLayout(nodes: js.Array[GridStackNode], column: Double, clear: Boolean): GridStackEngine = js.native
    
    /**
      * call to cache the given node layout internally to the given location so we can restore back when column changes size
      * @param node single node to cache
      * @param column corresponding column index to save it under
      */
    def cacheOneLayout(n: GridStackNode, column: Double): GridStackEngine = js.native
    
    /** called to cache the nodes pixel rectangles used for collision detection during drag */
    def cacheRects(w: Double, h: Double, top: Double, right: Double, bottom: Double, left: Double): GridStackEngine = js.native
    
    /** true if x,y or w,h are different after clamping to min/max */
    def changedPosConstrain(node: GridStackNode, p: GridStackPosition): Boolean = js.native
    
    /** called to remove all internal values but the _id */
    def cleanupNode(node: GridStackNode): GridStackEngine = js.native
    
    /** return the nodes that intercept the given node. Optionally a different area can be used, as well as a second node to skip */
    def collide(skip: GridStackNode): GridStackNode = js.native
    def collide(skip: GridStackNode, area: Unit, skip2: GridStackNode): GridStackNode = js.native
    def collide(skip: GridStackNode, area: GridStackNode): GridStackNode = js.native
    def collide(skip: GridStackNode, area: GridStackNode, skip2: GridStackNode): GridStackNode = js.native
    
    def collideAll(skip: GridStackNode): js.Array[GridStackNode] = js.native
    def collideAll(skip: GridStackNode, area: Unit, skip2: GridStackNode): js.Array[GridStackNode] = js.native
    def collideAll(skip: GridStackNode, area: GridStackNode): js.Array[GridStackNode] = js.native
    def collideAll(skip: GridStackNode, area: GridStackNode, skip2: GridStackNode): js.Array[GridStackNode] = js.native
    
    /** does a pixel coverage collision, returning the node that has the most coverage that is >50% mid line */
    def collideCoverage(node: GridStackNode, o: GridStackMoveOpts, collides: js.Array[GridStackNode]): GridStackNode = js.native
    
    var column: Double = js.native
    
    /** re-layout grid items to reclaim any empty space */
    def compact(): GridStackEngine = js.native
    
    def endUpdate(): GridStackEngine = js.native
    
    /** float getter method */
    def float: Boolean = js.native
    /** enable/disable floating widgets (default: `false`) See [example](http://gridstackjs.com/demo/float.html) */
    def float_=(`val`: Boolean): Unit = js.native
    
    /** returns a list of modified nodes from their original values */
    def getDirtyNodes(): js.Array[GridStackNode] = js.native
    def getDirtyNodes(verify: Boolean): js.Array[GridStackNode] = js.native
    
    def getRow(): Double = js.native
    
    def isAreaEmpty(x: Double, y: Double, w: Double, h: Double): Boolean = js.native
    
    var maxRow: Double = js.native
    
    /** return true if the passed in node was actually moved (checks for no-op and locked) */
    def moveNode(node: GridStackNode, o: GridStackMoveOpts): Boolean = js.native
    
    /** checks if item can be moved (layout constrain) vs moveNode(), returning true if was able to move.
      * In more complicated cases (maxRow) it will attempt at moving the item and fixing
      * others in a clone first, then apply those changes if still within specs. */
    def moveNodeCheck(node: GridStackNode, o: GridStackMoveOpts): Boolean = js.native
    
    /** part2 of preparing a node to fit inside our grid - checks  for x,y from grid dimensions */
    def nodeBoundFix(node: GridStackNode): GridStackNode = js.native
    def nodeBoundFix(node: GridStackNode, resizing: Boolean): GridStackNode = js.native
    
    var nodes: js.Array[GridStackNode] = js.native
    
    /**
      * given a random node, makes sure it's coordinates/values are valid in the current grid
      * @param node to adjust
      * @param resizing if out of bound, resize down or move into the grid to fit ?
      */
    def prepareNode(node: GridStackNode): GridStackNode = js.native
    def prepareNode(node: GridStackNode, resizing: Boolean): GridStackNode = js.native
    
    def removeAll(): GridStackEngine = js.native
    def removeAll(removeDOM: Boolean): GridStackEngine = js.native
    
    def removeNode(node: GridStackNode): GridStackEngine = js.native
    def removeNode(node: GridStackNode, removeDOM: Boolean): GridStackEngine = js.native
    def removeNode(node: GridStackNode, removeDOM: Boolean, triggerEvent: Boolean): GridStackEngine = js.native
    def removeNode(node: GridStackNode, removeDOM: Unit, triggerEvent: Boolean): GridStackEngine = js.native
    
    var removedNodes: js.Array[GridStackNode] = js.native
    
    /** saves a copy of the largest column layout (eg 12 even when rendering oneColumnMode, so we don't loose orig layout),
      * returning a list of widgets for serialization */
    def save(): js.Array[GridStackNode] = js.native
    def save(saveElement: Boolean): js.Array[GridStackNode] = js.native
    
    /** sort the nodes array from first to last, or reverse. Called during collision/placement to force an order */
    def sortNodes(): GridStackEngine = js.native
    def sortNodes(dir: `-1` | `1`): GridStackEngine = js.native
    
    /** called to possibly swap between 2 nodes (same size or column, not locked, touching), returning true if successful */
    def swap(a: GridStackNode, b: GridStackNode): Boolean = js.native
    
    /** return true if can fit in grid height constrain only (always true if no maxRow) */
    def willItFit(node: GridStackNode): Boolean = js.native
  }
  
  trait GridStackEngineOptions extends StObject {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var float: js.UndefOr[Boolean] = js.undefined
    
    var maxRow: js.UndefOr[Double] = js.undefined
    
    var nodes: js.UndefOr[js.Array[GridStackNode]] = js.undefined
    
    var onChange: js.UndefOr[OnChangeCB] = js.undefined
  }
  object GridStackEngineOptions {
    
    inline def apply(): GridStackEngineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridStackEngineOptions]
    }
    
    extension [Self <: GridStackEngineOptions](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setMaxRow(value: Double): Self = StObject.set(x, "maxRow", value.asInstanceOf[js.Any])
      
      inline def setMaxRowUndefined: Self = StObject.set(x, "maxRow", js.undefined)
      
      inline def setNodes(value: js.Array[GridStackNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setNodesVarargs(value: GridStackNode*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setOnChange(value: /* nodes */ js.Array[GridStackNode] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  /** callback to update the DOM attributes since this class is generic (no HTML or other info) for items that changed - see _notify() */
  type OnChangeCB = js.Function1[/* nodes */ js.Array[GridStackNode], Unit]
}
