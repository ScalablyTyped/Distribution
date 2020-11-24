package typings.jqueryFancytree.Fancytree.Extensions

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryFancytree.Fancytree.FancytreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragAndDrop5
  extends /* extension */ StringDictionary[js.Any] {
  
  /**
    * Expand nodes after n milliseconds of hovering.
    */
  var autoExpandMS: js.UndefOr[Double] = js.native
  
  var dragDrag: js.UndefOr[js.Function2[/* sourceNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  
  /**
    * Events (drag drop)
    */
  var dragDrop: js.UndefOr[js.Function2[/* node */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  
  var dragEnd: js.UndefOr[js.Function2[/* sourceNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  
  /**
    * Callback(targetNode, data), return true, to enable dnd drop
    */
  var dragEnter: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  
  /**
    * Callback(targetNode, data), return false to prevent autoExpand
    */
  var dragExpand: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  
  var dragLeave: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  
  /**
    * Events (drag over)
    */
  var dragOver: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  
  /**
    * Callback(sourceNode, data), return true, to enable dnd drag
    */
  var dragStart: js.UndefOr[js.Function2[/* sourceNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.native
  
  /**
    * Additional offset for drop-marker with hitMode = "before"/"after"
    */
  var dropMarkerInsertOffsetX: js.UndefOr[Double] = js.native
  
  /**
    * Absolute position offset for .fancytree-drop-marker
    */
  var dropMarkerOffsetX: js.UndefOr[Double] = js.native
  
  /**
    * true: Drag multiple (i.e. selected) nodes.
    */
  var multiSource: js.UndefOr[Boolean] = js.native
  
  /**
    * Prevent dropping nodes from different Fancytrees
    */
  var preventForeignNodes: js.UndefOr[Boolean] = js.native
  
  /**
    * Prevent dropping items other than Fancytree nodes
    */
  var preventNonNodes: js.UndefOr[Boolean] = js.native
  
  /**
    * Prevent dropping nodes on own descendants
    */
  var preventRecursiveMoves: js.UndefOr[Boolean] = js.native
  
  /**
    * Prevent dropping nodes 'before self', etc.
    */
  var preventVoidMoves: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable auto-scrolling while dragging
    */
  var scroll: js.UndefOr[Boolean] = js.native
  
  /**
    * Active top/bottom margin in pixel
    */
  var scrollSensitivity: js.UndefOr[Double] = js.native
  
  /**
    * Pixel per event
    */
  var scrollSpeed: js.UndefOr[Double] = js.native
  
  /**
    * Allow dragging of nodes to different IE windows, default: false
    */
  var setTextTypeJson: js.UndefOr[Boolean] = js.native
}
object DragAndDrop5 {
  
  @scala.inline
  def apply(): DragAndDrop5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragAndDrop5]
  }
  
  @scala.inline
  implicit class DragAndDrop5Ops[Self <: DragAndDrop5] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoExpandMS(value: Double): Self = this.set("autoExpandMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoExpandMS: Self = this.set("autoExpandMS", js.undefined)
    
    @scala.inline
    def setDragDrag(value: (/* sourceNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = this.set("dragDrag", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDragDrag: Self = this.set("dragDrag", js.undefined)
    
    @scala.inline
    def setDragDrop(value: (/* node */ FancytreeNode, /* data */ js.Any) => Unit): Self = this.set("dragDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDragDrop: Self = this.set("dragDrop", js.undefined)
    
    @scala.inline
    def setDragEnd(value: (/* sourceNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = this.set("dragEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDragEnd: Self = this.set("dragEnd", js.undefined)
    
    @scala.inline
    def setDragEnter(value: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = this.set("dragEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDragEnter: Self = this.set("dragEnter", js.undefined)
    
    @scala.inline
    def setDragExpand(value: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = this.set("dragExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDragExpand: Self = this.set("dragExpand", js.undefined)
    
    @scala.inline
    def setDragLeave(value: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = this.set("dragLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDragLeave: Self = this.set("dragLeave", js.undefined)
    
    @scala.inline
    def setDragOver(value: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = this.set("dragOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDragOver: Self = this.set("dragOver", js.undefined)
    
    @scala.inline
    def setDragStart(value: (/* sourceNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = this.set("dragStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    
    @scala.inline
    def setDropMarkerInsertOffsetX(value: Double): Self = this.set("dropMarkerInsertOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropMarkerInsertOffsetX: Self = this.set("dropMarkerInsertOffsetX", js.undefined)
    
    @scala.inline
    def setDropMarkerOffsetX(value: Double): Self = this.set("dropMarkerOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropMarkerOffsetX: Self = this.set("dropMarkerOffsetX", js.undefined)
    
    @scala.inline
    def setMultiSource(value: Boolean): Self = this.set("multiSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSource: Self = this.set("multiSource", js.undefined)
    
    @scala.inline
    def setPreventForeignNodes(value: Boolean): Self = this.set("preventForeignNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventForeignNodes: Self = this.set("preventForeignNodes", js.undefined)
    
    @scala.inline
    def setPreventNonNodes(value: Boolean): Self = this.set("preventNonNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventNonNodes: Self = this.set("preventNonNodes", js.undefined)
    
    @scala.inline
    def setPreventRecursiveMoves(value: Boolean): Self = this.set("preventRecursiveMoves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventRecursiveMoves: Self = this.set("preventRecursiveMoves", js.undefined)
    
    @scala.inline
    def setPreventVoidMoves(value: Boolean): Self = this.set("preventVoidMoves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventVoidMoves: Self = this.set("preventVoidMoves", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setScrollSensitivity(value: Double): Self = this.set("scrollSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSensitivity: Self = this.set("scrollSensitivity", js.undefined)
    
    @scala.inline
    def setScrollSpeed(value: Double): Self = this.set("scrollSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSpeed: Self = this.set("scrollSpeed", js.undefined)
    
    @scala.inline
    def setSetTextTypeJson(value: Boolean): Self = this.set("setTextTypeJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetTextTypeJson: Self = this.set("setTextTypeJson", js.undefined)
  }
}
