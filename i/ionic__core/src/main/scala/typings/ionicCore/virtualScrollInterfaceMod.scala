package typings.ionicCore

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualScrollInterfaceMod {
  
  @js.native
  trait Cell extends StObject {
    
    var height: Double = js.native
    
    var i: Double = js.native
    
    var index: Double = js.native
    
    var reads: Double = js.native
    
    var `type`: CellType = js.native
    
    var value: js.Any = js.native
    
    var visible: Boolean = js.native
  }
  object Cell {
    
    @scala.inline
    def apply(
      height: Double,
      i: Double,
      index: Double,
      reads: Double,
      `type`: CellType,
      value: js.Any,
      visible: Boolean
    ): Cell = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], reads = reads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cell]
    }
    
    @scala.inline
    implicit class CellMutableBuilder[Self <: Cell] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReads(value: Double): Self = StObject.set(x, "reads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: CellType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCore.ionicCoreStrings.item
    - typings.ionicCore.ionicCoreStrings.header
    - typings.ionicCore.ionicCoreStrings.footer
  */
  trait CellType extends StObject
  object CellType {
    
    @scala.inline
    def footer: typings.ionicCore.ionicCoreStrings.footer = "footer".asInstanceOf[typings.ionicCore.ionicCoreStrings.footer]
    
    @scala.inline
    def header: typings.ionicCore.ionicCoreStrings.header = "header".asInstanceOf[typings.ionicCore.ionicCoreStrings.header]
    
    @scala.inline
    def item: typings.ionicCore.ionicCoreStrings.item = "item".asInstanceOf[typings.ionicCore.ionicCoreStrings.item]
  }
  
  type DomRenderFn = js.Function1[/* dom */ js.Array[VirtualNode], Unit]
  
  type FooterHeightFn = js.Function2[/* item */ js.Any, /* index */ Double, Double]
  
  type HeaderFn = js.Function3[
    /* item */ js.Any, 
    /* index */ Double, 
    /* items */ js.Array[js.Any], 
    js.UndefOr[String | Null]
  ]
  
  type HeaderHeightFn = js.Function2[/* item */ js.Any, /* index */ Double, Double]
  
  type ItemHeightFn = js.Function2[/* item */ js.Any, /* index */ Double, Double]
  
  type ItemRenderFn = js.Function3[/* el */ HTMLElement | Null, /* cell */ Cell, /* domIndex */ Double, HTMLElement]
  
  type NodeChange = Double
  
  @js.native
  trait VirtualNode extends StObject {
    
    var cell: Cell = js.native
    
    var change: NodeChange = js.native
    
    var d: Boolean = js.native
    
    var top: Double = js.native
    
    var visible: Boolean = js.native
  }
  object VirtualNode {
    
    @scala.inline
    def apply(cell: Cell, change: NodeChange, d: Boolean, top: Double, visible: Boolean): VirtualNode = {
      val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualNode]
    }
    
    @scala.inline
    implicit class VirtualNodeMutableBuilder[Self <: VirtualNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCell(value: Cell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChange(value: NodeChange): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setD(value: Boolean): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
