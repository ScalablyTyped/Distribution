package typings.jqueryFancytree.Fancytree

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryFancytree.jqueryFancytreeStrings.dimm
import typings.jqueryFancytree.jqueryFancytreeStrings.hide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Extensions {
  
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
    implicit class DragAndDrop5MutableBuilder[Self <: DragAndDrop5] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoExpandMS(value: Double): Self = StObject.set(x, "autoExpandMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoExpandMSUndefined: Self = StObject.set(x, "autoExpandMS", js.undefined)
      
      @scala.inline
      def setDragDrag(value: (/* sourceNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = StObject.set(x, "dragDrag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragDragUndefined: Self = StObject.set(x, "dragDrag", js.undefined)
      
      @scala.inline
      def setDragDrop(value: (/* node */ FancytreeNode, /* data */ js.Any) => Unit): Self = StObject.set(x, "dragDrop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragDropUndefined: Self = StObject.set(x, "dragDrop", js.undefined)
      
      @scala.inline
      def setDragEnd(value: (/* sourceNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = StObject.set(x, "dragEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
      
      @scala.inline
      def setDragEnter(value: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragEnterUndefined: Self = StObject.set(x, "dragEnter", js.undefined)
      
      @scala.inline
      def setDragExpand(value: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = StObject.set(x, "dragExpand", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragExpandUndefined: Self = StObject.set(x, "dragExpand", js.undefined)
      
      @scala.inline
      def setDragLeave(value: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragLeaveUndefined: Self = StObject.set(x, "dragLeave", js.undefined)
      
      @scala.inline
      def setDragOver(value: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
      
      @scala.inline
      def setDragStart(value: (/* sourceNode */ FancytreeNode, /* data */ js.Any) => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
      
      @scala.inline
      def setDropMarkerInsertOffsetX(value: Double): Self = StObject.set(x, "dropMarkerInsertOffsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropMarkerInsertOffsetXUndefined: Self = StObject.set(x, "dropMarkerInsertOffsetX", js.undefined)
      
      @scala.inline
      def setDropMarkerOffsetX(value: Double): Self = StObject.set(x, "dropMarkerOffsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropMarkerOffsetXUndefined: Self = StObject.set(x, "dropMarkerOffsetX", js.undefined)
      
      @scala.inline
      def setMultiSource(value: Boolean): Self = StObject.set(x, "multiSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSourceUndefined: Self = StObject.set(x, "multiSource", js.undefined)
      
      @scala.inline
      def setPreventForeignNodes(value: Boolean): Self = StObject.set(x, "preventForeignNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventForeignNodesUndefined: Self = StObject.set(x, "preventForeignNodes", js.undefined)
      
      @scala.inline
      def setPreventNonNodes(value: Boolean): Self = StObject.set(x, "preventNonNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventNonNodesUndefined: Self = StObject.set(x, "preventNonNodes", js.undefined)
      
      @scala.inline
      def setPreventRecursiveMoves(value: Boolean): Self = StObject.set(x, "preventRecursiveMoves", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventRecursiveMovesUndefined: Self = StObject.set(x, "preventRecursiveMoves", js.undefined)
      
      @scala.inline
      def setPreventVoidMoves(value: Boolean): Self = StObject.set(x, "preventVoidMoves", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventVoidMovesUndefined: Self = StObject.set(x, "preventVoidMoves", js.undefined)
      
      @scala.inline
      def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
      
      @scala.inline
      def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setSetTextTypeJson(value: Boolean): Self = StObject.set(x, "setTextTypeJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetTextTypeJsonUndefined: Self = StObject.set(x, "setTextTypeJson", js.undefined)
    }
  }
  
  /**
    * Define filter-extension options
    */
  @js.native
  trait Filter
    extends /* extension */ StringDictionary[js.Any] {
    
    /**
      * Re-apply last filter if lazy data is loaded
      */
    var autoApply: js.UndefOr[Boolean] = js.native
    
    /**
      * Expand all branches that contain matches while filtered
      */
    var autoExpand: js.UndefOr[Boolean] = js.native
    
    /**
      * Show a badge with number of matching child nodes near parent icons
      */
    var counter: js.UndefOr[Boolean] = js.native
    
    /**
      * Match single characters in order, e.g. 'fb' will match 'FooBar'
      */
    var fuzzy: js.UndefOr[Boolean] = js.native
    
    /**
      * Hide counter badge if parent is expanded
      */
    var hideExpandedCounter: js.UndefOr[Boolean] = js.native
    
    /**
      * Hide expanders if all child nodes are hidden by filter
      */
    var hideExpanders: js.UndefOr[Boolean] = js.native
    
    /**
      * Highlight matches by wrapping inside <mark> tags
      */
    var highlight: js.UndefOr[Boolean] = js.native
    
    /**
      * Match end nodes only
      */
    var leavesOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Grayout unmatched nodes (pass "hide" to remove unmatched node instead); default 'dimm'
      */
    var mode: js.UndefOr[dimm | hide] = js.native
    
    /**
      * Display a 'no data' status node if result is empty
      */
    var nodata: js.UndefOr[Boolean] = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(): Filter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoApply(value: Boolean): Self = StObject.set(x, "autoApply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoApplyUndefined: Self = StObject.set(x, "autoApply", js.undefined)
      
      @scala.inline
      def setAutoExpand(value: Boolean): Self = StObject.set(x, "autoExpand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoExpandUndefined: Self = StObject.set(x, "autoExpand", js.undefined)
      
      @scala.inline
      def setCounter(value: Boolean): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
      
      @scala.inline
      def setFuzzy(value: Boolean): Self = StObject.set(x, "fuzzy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuzzyUndefined: Self = StObject.set(x, "fuzzy", js.undefined)
      
      @scala.inline
      def setHideExpandedCounter(value: Boolean): Self = StObject.set(x, "hideExpandedCounter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideExpandedCounterUndefined: Self = StObject.set(x, "hideExpandedCounter", js.undefined)
      
      @scala.inline
      def setHideExpanders(value: Boolean): Self = StObject.set(x, "hideExpanders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideExpandersUndefined: Self = StObject.set(x, "hideExpanders", js.undefined)
      
      @scala.inline
      def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      @scala.inline
      def setLeavesOnly(value: Boolean): Self = StObject.set(x, "leavesOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeavesOnlyUndefined: Self = StObject.set(x, "leavesOnly", js.undefined)
      
      @scala.inline
      def setMode(value: dimm | hide): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNodata(value: Boolean): Self = StObject.set(x, "nodata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodataUndefined: Self = StObject.set(x, "nodata", js.undefined)
    }
  }
  
  @js.native
  trait List
    extends /* extension */ StringDictionary[js.Any] {
    
    var dnd5: js.UndefOr[DragAndDrop5] = js.native
    
    var filter: js.UndefOr[Filter] = js.native
    
    var table: js.UndefOr[Table] = js.native
  }
  object List {
    
    @scala.inline
    def apply(): List = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[List]
    }
    
    @scala.inline
    implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDnd5(value: DragAndDrop5): Self = StObject.set(x, "dnd5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnd5Undefined: Self = StObject.set(x, "dnd5", js.undefined)
      
      @scala.inline
      def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
  
  /**
    * Define table-extension options
    */
  @js.native
  trait Table
    extends /* extension */ StringDictionary[js.Any] {
    
    /**
      * Render the checkboxes into the this column index (default: nodeColumnIdx)
      */
    var checkboxColumnIdx: js.Any = js.native
    
    /**
      * Indent every node level by 16px; default: 16
      */
    var indentation: Double = js.native
    
    /**
      * Render node expander, icon, and title to this column (default: 0)
      */
    var nodeColumnIdx: Double = js.native
  }
  object Table {
    
    @scala.inline
    def apply(checkboxColumnIdx: js.Any, indentation: Double, nodeColumnIdx: Double): Table = {
      val __obj = js.Dynamic.literal(checkboxColumnIdx = checkboxColumnIdx.asInstanceOf[js.Any], indentation = indentation.asInstanceOf[js.Any], nodeColumnIdx = nodeColumnIdx.asInstanceOf[js.Any])
      __obj.asInstanceOf[Table]
    }
    
    @scala.inline
    implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckboxColumnIdx(value: js.Any): Self = StObject.set(x, "checkboxColumnIdx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentation(value: Double): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeColumnIdx(value: Double): Self = StObject.set(x, "nodeColumnIdx", value.asInstanceOf[js.Any])
    }
  }
}
