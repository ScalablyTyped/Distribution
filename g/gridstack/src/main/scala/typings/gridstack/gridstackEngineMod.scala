package typings.gridstack

import typings.gridstack.typesMod.GridStackNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridstackEngineMod {
  
  @JSImport("gridstack/dist/gridstack-engine", "GridStackEngine")
  @js.native
  class GridStackEngine () extends StObject {
    def this(column: Double) = this()
    def this(column: js.UndefOr[scala.Nothing], onchange: onChangeCB) = this()
    def this(column: Double, onchange: onChangeCB) = this()
    def this(column: js.UndefOr[scala.Nothing], onchange: js.UndefOr[scala.Nothing], float: Boolean) = this()
    def this(column: js.UndefOr[scala.Nothing], onchange: onChangeCB, float: Boolean) = this()
    def this(column: Double, onchange: js.UndefOr[scala.Nothing], float: Boolean) = this()
    def this(column: Double, onchange: onChangeCB, float: Boolean) = this()
    def this(
      column: js.UndefOr[scala.Nothing],
      onchange: js.UndefOr[scala.Nothing],
      float: js.UndefOr[scala.Nothing],
      maxRow: Double
    ) = this()
    def this(
      column: js.UndefOr[scala.Nothing],
      onchange: js.UndefOr[scala.Nothing],
      float: Boolean,
      maxRow: Double
    ) = this()
    def this(
      column: js.UndefOr[scala.Nothing],
      onchange: onChangeCB,
      float: js.UndefOr[scala.Nothing],
      maxRow: Double
    ) = this()
    def this(column: js.UndefOr[scala.Nothing], onchange: onChangeCB, float: Boolean, maxRow: Double) = this()
    def this(
      column: Double,
      onchange: js.UndefOr[scala.Nothing],
      float: js.UndefOr[scala.Nothing],
      maxRow: Double
    ) = this()
    def this(column: Double, onchange: js.UndefOr[scala.Nothing], float: Boolean, maxRow: Double) = this()
    def this(column: Double, onchange: onChangeCB, float: js.UndefOr[scala.Nothing], maxRow: Double) = this()
    def this(column: Double, onchange: onChangeCB, float: Boolean, maxRow: Double) = this()
    def this(
      column: js.UndefOr[scala.Nothing],
      onchange: js.UndefOr[scala.Nothing],
      float: js.UndefOr[scala.Nothing],
      maxRow: js.UndefOr[scala.Nothing],
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(
      column: js.UndefOr[scala.Nothing],
      onchange: js.UndefOr[scala.Nothing],
      float: js.UndefOr[scala.Nothing],
      maxRow: Double,
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(
      column: js.UndefOr[scala.Nothing],
      onchange: js.UndefOr[scala.Nothing],
      float: Boolean,
      maxRow: js.UndefOr[scala.Nothing],
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(
      column: js.UndefOr[scala.Nothing],
      onchange: js.UndefOr[scala.Nothing],
      float: Boolean,
      maxRow: Double,
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(
      column: js.UndefOr[scala.Nothing],
      onchange: onChangeCB,
      float: js.UndefOr[scala.Nothing],
      maxRow: js.UndefOr[scala.Nothing],
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(
      column: js.UndefOr[scala.Nothing],
      onchange: onChangeCB,
      float: js.UndefOr[scala.Nothing],
      maxRow: Double,
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(
      column: js.UndefOr[scala.Nothing],
      onchange: onChangeCB,
      float: Boolean,
      maxRow: js.UndefOr[scala.Nothing],
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(
      column: js.UndefOr[scala.Nothing],
      onchange: onChangeCB,
      float: Boolean,
      maxRow: Double,
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(
      column: Double,
      onchange: js.UndefOr[scala.Nothing],
      float: js.UndefOr[scala.Nothing],
      maxRow: js.UndefOr[scala.Nothing],
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(
      column: Double,
      onchange: js.UndefOr[scala.Nothing],
      float: js.UndefOr[scala.Nothing],
      maxRow: Double,
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(
      column: Double,
      onchange: js.UndefOr[scala.Nothing],
      float: Boolean,
      maxRow: js.UndefOr[scala.Nothing],
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(
      column: Double,
      onchange: js.UndefOr[scala.Nothing],
      float: Boolean,
      maxRow: Double,
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(
      column: Double,
      onchange: onChangeCB,
      float: js.UndefOr[scala.Nothing],
      maxRow: js.UndefOr[scala.Nothing],
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(
      column: Double,
      onchange: onChangeCB,
      float: js.UndefOr[scala.Nothing],
      maxRow: Double,
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(
      column: Double,
      onchange: onChangeCB,
      float: Boolean,
      maxRow: js.UndefOr[scala.Nothing],
      nodes: js.Array[GridStackNode]
    ) = this()
    def this(
      column: Double,
      onchange: onChangeCB,
      float: Boolean,
      maxRow: Double,
      nodes: js.Array[GridStackNode]
    ) = this()
    
    def addNode(node: GridStackNode): GridStackNode = js.native
    def addNode(node: GridStackNode, triggerAddEvent: Boolean): GridStackNode = js.native
    
    var addedNodes: js.Array[GridStackNode] = js.native
    
    var batchMode: Boolean = js.native
    
    def batchUpdate(): GridStackEngine = js.native
    
    def beginUpdate(node: GridStackNode): GridStackEngine = js.native
    
    def canBePlacedWithRespectToHeight(node: GridStackNode): Boolean = js.native
    
    def canMoveNode(node: GridStackNode, x: Double, y: Double): Boolean = js.native
    def canMoveNode(node: GridStackNode, x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Boolean = js.native
    def canMoveNode(node: GridStackNode, x: Double, y: Double, width: Double): Boolean = js.native
    def canMoveNode(node: GridStackNode, x: Double, y: Double, width: Double, height: Double): Boolean = js.native
    
    def cleanNodes(): GridStackEngine = js.native
    
    /** called to remove all internal values */
    def cleanupNode(node: GridStackNode): GridStackEngine = js.native
    
    var column: Double = js.native
    
    def commit(): GridStackEngine = js.native
    
    /** re-layout grid items to reclaim any empty space */
    def compact(): GridStackEngine = js.native
    
    def endUpdate(): GridStackEngine = js.native
    
    /** float getter method */
    def float: Boolean = js.native
    /** enable/disable floating widgets (default: `false`) See [example](http://gridstackjs.com/demo/float.html) */
    def float_=(`val`: Boolean): Unit = js.native
    
    def getDirtyNodes(): js.Array[GridStackNode] = js.native
    def getDirtyNodes(verify: Boolean): js.Array[GridStackNode] = js.native
    
    def getRow(): Double = js.native
    
    def isAreaEmpty(x: Double, y: Double, width: Double, height: Double): Boolean = js.native
    
    def isNodeChangedPosition(node: GridStackNode, x: Double, y: Double, width: Double, height: Double): Boolean = js.native
    
    var maxRow: Double = js.native
    
    def moveNode(node: GridStackNode, x: Double, y: Double): GridStackNode = js.native
    def moveNode(
      node: GridStackNode,
      x: Double,
      y: Double,
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      noPack: Boolean
    ): GridStackNode = js.native
    def moveNode(node: GridStackNode, x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): GridStackNode = js.native
    def moveNode(
      node: GridStackNode,
      x: Double,
      y: Double,
      width: js.UndefOr[scala.Nothing],
      height: Double,
      noPack: Boolean
    ): GridStackNode = js.native
    def moveNode(node: GridStackNode, x: Double, y: Double, width: Double): GridStackNode = js.native
    def moveNode(
      node: GridStackNode,
      x: Double,
      y: Double,
      width: Double,
      height: js.UndefOr[scala.Nothing],
      noPack: Boolean
    ): GridStackNode = js.native
    def moveNode(node: GridStackNode, x: Double, y: Double, width: Double, height: Double): GridStackNode = js.native
    def moveNode(node: GridStackNode, x: Double, y: Double, width: Double, height: Double, noPack: Boolean): GridStackNode = js.native
    
    var nodes: js.Array[GridStackNode] = js.native
    
    def onchange(nodes: js.Array[GridStackNode]): Unit = js.native
    def onchange(nodes: js.Array[GridStackNode], removeDOM: Boolean): Unit = js.native
    @JSName("onchange")
    var onchange_Original: onChangeCB = js.native
    
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
    def removeNode(node: GridStackNode, removeDOM: js.UndefOr[scala.Nothing], triggerEvent: Boolean): GridStackEngine = js.native
    def removeNode(node: GridStackNode, removeDOM: Boolean): GridStackEngine = js.native
    def removeNode(node: GridStackNode, removeDOM: Boolean, triggerEvent: Boolean): GridStackEngine = js.native
    
    var removedNodes: js.Array[GridStackNode] = js.native
    
    /** saves the current layout returning a list of widgets for serialization */
    def save(): js.Array[GridStackNode] = js.native
    def save(saveElement: Boolean): js.Array[GridStackNode] = js.native
  }
  
  type onChangeCB = js.Function2[/* nodes */ js.Array[GridStackNode], /* removeDOM */ js.UndefOr[Boolean], Unit]
}
