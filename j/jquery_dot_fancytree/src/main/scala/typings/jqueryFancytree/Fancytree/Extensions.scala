package typings.jqueryFancytree.Fancytree

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryFancytree.jqueryFancytreeStrings.dimm
import typings.jqueryFancytree.jqueryFancytreeStrings.hide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Extensions {
  
  trait DragAndDrop5
    extends StObject
       with /* extension */ StringDictionary[Any] {
    
    /**
      * Expand nodes after n milliseconds of hovering.
      */
    var autoExpandMS: js.UndefOr[Double] = js.undefined
    
    var dragDrag: js.UndefOr[js.Function2[/* sourceNode */ FancytreeNode, /* data */ Any, Unit]] = js.undefined
    
    /**
      * Events (drag drop)
      */
    var dragDrop: js.UndefOr[js.Function2[/* node */ FancytreeNode, /* data */ Any, Unit]] = js.undefined
    
    var dragEnd: js.UndefOr[js.Function2[/* sourceNode */ FancytreeNode, /* data */ Any, Unit]] = js.undefined
    
    /**
      * Callback(targetNode, data), return true, to enable dnd drop
      */
    var dragEnter: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ Any, Unit]] = js.undefined
    
    /**
      * Callback(targetNode, data), return false to prevent autoExpand
      */
    var dragExpand: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ Any, Unit]] = js.undefined
    
    var dragLeave: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ Any, Unit]] = js.undefined
    
    /**
      * Events (drag over)
      */
    var dragOver: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ Any, Unit]] = js.undefined
    
    /**
      * Callback(sourceNode, data), return true, to enable dnd drag
      */
    var dragStart: js.UndefOr[js.Function2[/* sourceNode */ FancytreeNode, /* data */ Any, Unit]] = js.undefined
    
    /**
      * Additional offset for drop-marker with hitMode = "before"/"after"
      */
    var dropMarkerInsertOffsetX: js.UndefOr[Double] = js.undefined
    
    /**
      * Absolute position offset for .fancytree-drop-marker
      */
    var dropMarkerOffsetX: js.UndefOr[Double] = js.undefined
    
    /**
      * true: Drag multiple (i.e. selected) nodes.
      */
    var multiSource: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prevent dropping nodes from different Fancytrees
      */
    var preventForeignNodes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prevent dropping items other than Fancytree nodes
      */
    var preventNonNodes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prevent dropping nodes on own descendants
      */
    var preventRecursiveMoves: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prevent dropping nodes 'before self', etc.
      */
    var preventVoidMoves: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable auto-scrolling while dragging
      */
    var scroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Active top/bottom margin in pixel
      */
    var scrollSensitivity: js.UndefOr[Double] = js.undefined
    
    /**
      * Pixel per event
      */
    var scrollSpeed: js.UndefOr[Double] = js.undefined
    
    /**
      * Allow dragging of nodes to different IE windows, default: false
      */
    var setTextTypeJson: js.UndefOr[Boolean] = js.undefined
  }
  object DragAndDrop5 {
    
    inline def apply(): DragAndDrop5 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragAndDrop5]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragAndDrop5] (val x: Self) extends AnyVal {
      
      inline def setAutoExpandMS(value: Double): Self = StObject.set(x, "autoExpandMS", value.asInstanceOf[js.Any])
      
      inline def setAutoExpandMSUndefined: Self = StObject.set(x, "autoExpandMS", js.undefined)
      
      inline def setDragDrag(value: (/* sourceNode */ FancytreeNode, /* data */ Any) => Unit): Self = StObject.set(x, "dragDrag", js.Any.fromFunction2(value))
      
      inline def setDragDragUndefined: Self = StObject.set(x, "dragDrag", js.undefined)
      
      inline def setDragDrop(value: (/* node */ FancytreeNode, /* data */ Any) => Unit): Self = StObject.set(x, "dragDrop", js.Any.fromFunction2(value))
      
      inline def setDragDropUndefined: Self = StObject.set(x, "dragDrop", js.undefined)
      
      inline def setDragEnd(value: (/* sourceNode */ FancytreeNode, /* data */ Any) => Unit): Self = StObject.set(x, "dragEnd", js.Any.fromFunction2(value))
      
      inline def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
      
      inline def setDragEnter(value: (/* targetNode */ FancytreeNode, /* data */ Any) => Unit): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
      
      inline def setDragEnterUndefined: Self = StObject.set(x, "dragEnter", js.undefined)
      
      inline def setDragExpand(value: (/* targetNode */ FancytreeNode, /* data */ Any) => Unit): Self = StObject.set(x, "dragExpand", js.Any.fromFunction2(value))
      
      inline def setDragExpandUndefined: Self = StObject.set(x, "dragExpand", js.undefined)
      
      inline def setDragLeave(value: (/* targetNode */ FancytreeNode, /* data */ Any) => Unit): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
      
      inline def setDragLeaveUndefined: Self = StObject.set(x, "dragLeave", js.undefined)
      
      inline def setDragOver(value: (/* targetNode */ FancytreeNode, /* data */ Any) => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
      
      inline def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
      
      inline def setDragStart(value: (/* sourceNode */ FancytreeNode, /* data */ Any) => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
      
      inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
      
      inline def setDropMarkerInsertOffsetX(value: Double): Self = StObject.set(x, "dropMarkerInsertOffsetX", value.asInstanceOf[js.Any])
      
      inline def setDropMarkerInsertOffsetXUndefined: Self = StObject.set(x, "dropMarkerInsertOffsetX", js.undefined)
      
      inline def setDropMarkerOffsetX(value: Double): Self = StObject.set(x, "dropMarkerOffsetX", value.asInstanceOf[js.Any])
      
      inline def setDropMarkerOffsetXUndefined: Self = StObject.set(x, "dropMarkerOffsetX", js.undefined)
      
      inline def setMultiSource(value: Boolean): Self = StObject.set(x, "multiSource", value.asInstanceOf[js.Any])
      
      inline def setMultiSourceUndefined: Self = StObject.set(x, "multiSource", js.undefined)
      
      inline def setPreventForeignNodes(value: Boolean): Self = StObject.set(x, "preventForeignNodes", value.asInstanceOf[js.Any])
      
      inline def setPreventForeignNodesUndefined: Self = StObject.set(x, "preventForeignNodes", js.undefined)
      
      inline def setPreventNonNodes(value: Boolean): Self = StObject.set(x, "preventNonNodes", value.asInstanceOf[js.Any])
      
      inline def setPreventNonNodesUndefined: Self = StObject.set(x, "preventNonNodes", js.undefined)
      
      inline def setPreventRecursiveMoves(value: Boolean): Self = StObject.set(x, "preventRecursiveMoves", value.asInstanceOf[js.Any])
      
      inline def setPreventRecursiveMovesUndefined: Self = StObject.set(x, "preventRecursiveMoves", js.undefined)
      
      inline def setPreventVoidMoves(value: Boolean): Self = StObject.set(x, "preventVoidMoves", value.asInstanceOf[js.Any])
      
      inline def setPreventVoidMovesUndefined: Self = StObject.set(x, "preventVoidMoves", js.undefined)
      
      inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
      
      inline def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
      
      inline def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
      
      inline def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setSetTextTypeJson(value: Boolean): Self = StObject.set(x, "setTextTypeJson", value.asInstanceOf[js.Any])
      
      inline def setSetTextTypeJsonUndefined: Self = StObject.set(x, "setTextTypeJson", js.undefined)
    }
  }
  
  /**
    * Define filter-extension options
    */
  trait Filter
    extends StObject
       with /* extension */ StringDictionary[Any] {
    
    /**
      * Re-apply last filter if lazy data is loaded
      */
    var autoApply: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Expand all branches that contain matches while filtered
      */
    var autoExpand: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show a badge with number of matching child nodes near parent icons
      */
    var counter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Match single characters in order, e.g. 'fb' will match 'FooBar'
      */
    var fuzzy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hide counter badge if parent is expanded
      */
    var hideExpandedCounter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hide expanders if all child nodes are hidden by filter
      */
    var hideExpanders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Highlight matches by wrapping inside <mark> tags
      */
    var highlight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Match end nodes only
      */
    var leavesOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Grayout unmatched nodes (pass "hide" to remove unmatched node instead); default 'dimm'
      */
    var mode: js.UndefOr[dimm | hide] = js.undefined
    
    /**
      * Display a 'no data' status node if result is empty
      */
    var nodata: js.UndefOr[Boolean] = js.undefined
  }
  object Filter {
    
    inline def apply(): Filter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      inline def setAutoApply(value: Boolean): Self = StObject.set(x, "autoApply", value.asInstanceOf[js.Any])
      
      inline def setAutoApplyUndefined: Self = StObject.set(x, "autoApply", js.undefined)
      
      inline def setAutoExpand(value: Boolean): Self = StObject.set(x, "autoExpand", value.asInstanceOf[js.Any])
      
      inline def setAutoExpandUndefined: Self = StObject.set(x, "autoExpand", js.undefined)
      
      inline def setCounter(value: Boolean): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
      
      inline def setFuzzy(value: Boolean): Self = StObject.set(x, "fuzzy", value.asInstanceOf[js.Any])
      
      inline def setFuzzyUndefined: Self = StObject.set(x, "fuzzy", js.undefined)
      
      inline def setHideExpandedCounter(value: Boolean): Self = StObject.set(x, "hideExpandedCounter", value.asInstanceOf[js.Any])
      
      inline def setHideExpandedCounterUndefined: Self = StObject.set(x, "hideExpandedCounter", js.undefined)
      
      inline def setHideExpanders(value: Boolean): Self = StObject.set(x, "hideExpanders", value.asInstanceOf[js.Any])
      
      inline def setHideExpandersUndefined: Self = StObject.set(x, "hideExpanders", js.undefined)
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setLeavesOnly(value: Boolean): Self = StObject.set(x, "leavesOnly", value.asInstanceOf[js.Any])
      
      inline def setLeavesOnlyUndefined: Self = StObject.set(x, "leavesOnly", js.undefined)
      
      inline def setMode(value: dimm | hide): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNodata(value: Boolean): Self = StObject.set(x, "nodata", value.asInstanceOf[js.Any])
      
      inline def setNodataUndefined: Self = StObject.set(x, "nodata", js.undefined)
    }
  }
  
  trait List
    extends StObject
       with /* extension */ StringDictionary[Any] {
    
    var dnd5: js.UndefOr[DragAndDrop5] = js.undefined
    
    var filter: js.UndefOr[Filter] = js.undefined
    
    var table: js.UndefOr[Table] = js.undefined
  }
  object List {
    
    inline def apply(): typings.jqueryFancytree.Fancytree.Extensions.List = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.jqueryFancytree.Fancytree.Extensions.List]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.jqueryFancytree.Fancytree.Extensions.List] (val x: Self) extends AnyVal {
      
      inline def setDnd5(value: DragAndDrop5): Self = StObject.set(x, "dnd5", value.asInstanceOf[js.Any])
      
      inline def setDnd5Undefined: Self = StObject.set(x, "dnd5", js.undefined)
      
      inline def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
  
  /**
    * Define table-extension options
    */
  trait Table
    extends StObject
       with /* extension */ StringDictionary[Any] {
    
    /**
      * Render the checkboxes into the this column index (default: nodeColumnIdx)
      */
    var checkboxColumnIdx: Any
    
    /**
      * Indent every node level by 16px; default: 16
      */
    var indentation: Double
    
    /**
      * Render node expander, icon, and title to this column (default: 0)
      */
    var nodeColumnIdx: Double
  }
  object Table {
    
    inline def apply(checkboxColumnIdx: Any, indentation: Double, nodeColumnIdx: Double): Table = {
      val __obj = js.Dynamic.literal(checkboxColumnIdx = checkboxColumnIdx.asInstanceOf[js.Any], indentation = indentation.asInstanceOf[js.Any], nodeColumnIdx = nodeColumnIdx.asInstanceOf[js.Any])
      __obj.asInstanceOf[Table]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
      
      inline def setCheckboxColumnIdx(value: Any): Self = StObject.set(x, "checkboxColumnIdx", value.asInstanceOf[js.Any])
      
      inline def setIndentation(value: Double): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
      
      inline def setNodeColumnIdx(value: Double): Self = StObject.set(x, "nodeColumnIdx", value.asInstanceOf[js.Any])
    }
  }
}
