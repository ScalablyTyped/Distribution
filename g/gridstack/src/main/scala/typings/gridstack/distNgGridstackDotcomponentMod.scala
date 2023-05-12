package typings.gridstack

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.AfterContentInit
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.OnInit
import typings.angularCore.mod.QueryList
import typings.angularCore.mod.Type
import typings.angularCore.mod.ViewContainerRef
import typings.gridstack.distNgGridstackItemDotcomponentMod.GridstackItemComponent
import typings.gridstack.distTypesMod.GridItemHTMLElement
import typings.gridstack.distTypesMod.GridStackNode
import typings.gridstack.distTypesMod.GridStackOptions
import typings.gridstack.distTypesMod.GridStackWidget
import typings.gridstack.mod.GridHTMLElement
import typings.gridstack.mod.GridStack
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNgGridstackDotcomponentMod {
  
  @JSImport("gridstack/dist/ng/gridstack.component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gridstack/dist/ng/gridstack.component", "GridstackComponent")
  @js.native
  open class GridstackComponent protected ()
    extends StObject
       with OnInit
       with AfterContentInit
       with OnDestroy {
    def this(elementRef: ElementRef[GridCompHTMLElement]) = this()
    
    /* private */ var _grid: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /** individual list of GridStackEvent callbacks handlers as output
      * otherwise use this.grid.on('name1 name2 name3', callback) to handle multiple at once
      * see https://github.com/gridstack/gridstack.js/blob/master/demo/events.js#L4
      *
      * Note: camel casing and 'CB' added at the end to prevent @angular-eslint/no-output-native
      * eg: 'change' would trigger the raw CustomEvent so use different name.
      */
    var addedCB: EventEmitter[nodesCB] = js.native
    
    var changeCB: EventEmitter[nodesCB] = js.native
    
    /** check if the grid is empty, if so show alternative content */
    def checkEmpty(): Unit = js.native
    
    /** container to append items dynamically */
    var container: js.UndefOr[ViewContainerRef] = js.native
    
    var disableCB: EventEmitter[eventCB] = js.native
    
    var dragCB: EventEmitter[elementCB] = js.native
    
    var dragStartCB: EventEmitter[elementCB] = js.native
    
    var dragStopCB: EventEmitter[elementCB] = js.native
    
    var droppedCB: EventEmitter[typings.gridstack.distNgGridstackDotcomponentMod.droppedCB] = js.native
    
    /** return the native element that contains grid specific fields as well */
    def el: GridCompHTMLElement = js.native
    
    /* private */ val elementRef: Any = js.native
    
    var enableCB: EventEmitter[eventCB] = js.native
    
    /** return the GridStack class */
    def grid: js.UndefOr[GridStack] = js.native
    
    /** track list of TEMPLATE grid items so we can sync between DOM and GS internals */
    var gridstackItems: js.UndefOr[QueryList[GridstackItemComponent]] = js.native
    
    /** get all known events as easy to use Outputs for convenience */
    /* private */ var hookEvents: Any = js.native
    
    /** true while ng-content with 'no-item-content' should be shown when last item is removed from a grid */
    var isEmpty: js.UndefOr[Boolean] = js.native
    
    /* private */ var loaded: Any = js.native
    
    /**
      * A callback method that is invoked immediately after
      * Angular has completed initialization of all of the directive's
      * content.
      * It is invoked only once when the directive is instantiated.
      */
    /* CompleteClass */
    override def ngAfterContentInit(): Unit = js.native
    
    /**
      * A callback method that performs custom clean-up, invoked immediately
      * before a directive, pipe, or service instance is destroyed.
      */
    /* CompleteClass */
    override def ngOnDestroy(): Unit = js.native
    
    /**
      * A callback method that is invoked immediately after the
      * default change detector has checked the directive's
      * data-bound properties for the first time,
      * and before any of the view or content children have been checked.
      * It is invoked only once when the directive is instantiated.
      */
    /* CompleteClass */
    override def ngOnInit(): Unit = js.native
    
    /* private */ var ngUnsubscribe: Any = js.native
    
    /** return the current running options */
    def options: GridStackOptions = js.native
    /** initial options for creation of the grid */
    def options_=(`val`: GridStackOptions): Unit = js.native
    
    var removedCB: EventEmitter[nodesCB] = js.native
    
    var resizeCB: EventEmitter[elementCB] = js.native
    
    var resizeStartCB: EventEmitter[elementCB] = js.native
    
    var resizeStopCB: EventEmitter[elementCB] = js.native
    
    /**
      * called when the TEMPLATE list of items changes - get a list of nodes and
      * update the layout accordingly (which will take care of adding/removing items changed by Angular)
      */
    def updateAll(): Unit = js.native
  }
  /* static members */
  object GridstackComponent {
    
    @JSImport("gridstack/dist/ng/gridstack.component", "GridstackComponent")
    @js.native
    val ^ : js.Any = js.native
    
    /** add a list of ng Component to be mapped to selector */
    inline def addComponentToSelectorType(typeList: js.Array[Type[js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addComponentToSelectorType")(typeList.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** return the ng Component selector */
    inline def getSelector(`type`: Type[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelector")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * stores the selector -> Type mapping, so we can create items dynamically from a string.
      * Unfortunately Ng doesn't provide public access to that mapping.
      */
    @JSImport("gridstack/dist/ng/gridstack.component", "GridstackComponent.selectorToType")
    @js.native
    def selectorToType: SelectorToType = js.native
    inline def selectorToType_=(x: SelectorToType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorToType")(x.asInstanceOf[js.Any])
  }
  
  inline def gsCreateNgComponents(host: GridCompHTMLElement, w: NgGridStackWidget, add: Boolean, isGrid: Boolean): js.UndefOr[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("gsCreateNgComponents")(host.asInstanceOf[js.Any], w.asInstanceOf[js.Any], add.asInstanceOf[js.Any], isGrid.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLElement]]
  inline def gsCreateNgComponents(host: GridCompHTMLElement, w: GridStackOptions, add: Boolean, isGrid: Boolean): js.UndefOr[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("gsCreateNgComponents")(host.asInstanceOf[js.Any], w.asInstanceOf[js.Any], add.asInstanceOf[js.Any], isGrid.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLElement]]
  inline def gsCreateNgComponents(host: HTMLElement, w: NgGridStackWidget, add: Boolean, isGrid: Boolean): js.UndefOr[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("gsCreateNgComponents")(host.asInstanceOf[js.Any], w.asInstanceOf[js.Any], add.asInstanceOf[js.Any], isGrid.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLElement]]
  inline def gsCreateNgComponents(host: HTMLElement, w: GridStackOptions, add: Boolean, isGrid: Boolean): js.UndefOr[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("gsCreateNgComponents")(host.asInstanceOf[js.Any], w.asInstanceOf[js.Any], add.asInstanceOf[js.Any], isGrid.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLElement]]
  
  inline def gsSaveAdditionalNgInfo(n: NgGridStackNode, w: NgGridStackWidget): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gsSaveAdditionalNgInfo")(n.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait GridCompHTMLElement
    extends StObject
       with GridHTMLElement {
    
    var _gridComp: js.UndefOr[GridstackComponent] = js.native
  }
  
  trait NgGridStackNode
    extends StObject
       with GridStackNode {
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NgGridStackNode {
    
    inline def apply(): NgGridStackNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NgGridStackNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NgGridStackNode] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NgGridStackOptions
    extends StObject
       with GridStackOptions {
    
    @JSName("children")
    var children_NgGridStackOptions: js.UndefOr[js.Array[NgGridStackWidget]] = js.undefined
    
    @JSName("subGridOpts")
    var subGridOpts_NgGridStackOptions: js.UndefOr[NgGridStackOptions] = js.undefined
  }
  object NgGridStackOptions {
    
    inline def apply(): NgGridStackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NgGridStackOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NgGridStackOptions] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[NgGridStackWidget]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: NgGridStackWidget*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setSubGridOpts(value: NgGridStackOptions): Self = StObject.set(x, "subGridOpts", value.asInstanceOf[js.Any])
      
      inline def setSubGridOptsUndefined: Self = StObject.set(x, "subGridOpts", js.undefined)
    }
  }
  
  trait NgGridStackWidget
    extends StObject
       with GridStackWidget {
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NgGridStackWidget {
    
    inline def apply(): NgGridStackWidget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NgGridStackWidget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NgGridStackWidget] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type SelectorToType = StringDictionary[Type[js.Object]]
  
  trait droppedCB extends StObject {
    
    var event: Event
    
    var newNode: GridStackNode
    
    var previousNode: GridStackNode
  }
  object droppedCB {
    
    inline def apply(event: Event, newNode: GridStackNode, previousNode: GridStackNode): droppedCB = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], newNode = newNode.asInstanceOf[js.Any], previousNode = previousNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[droppedCB]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: droppedCB] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setNewNode(value: GridStackNode): Self = StObject.set(x, "newNode", value.asInstanceOf[js.Any])
      
      inline def setPreviousNode(value: GridStackNode): Self = StObject.set(x, "previousNode", value.asInstanceOf[js.Any])
    }
  }
  
  trait elementCB extends StObject {
    
    var el: GridItemHTMLElement
    
    var event: Event
  }
  object elementCB {
    
    inline def apply(el: GridItemHTMLElement, event: Event): elementCB = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[elementCB]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: elementCB] (val x: Self) extends AnyVal {
      
      inline def setEl(value: GridItemHTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  trait eventCB extends StObject {
    
    var event: Event
  }
  object eventCB {
    
    inline def apply(event: Event): eventCB = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[eventCB]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: eventCB] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  trait nodesCB extends StObject {
    
    var event: Event
    
    var nodes: js.Array[GridStackNode]
  }
  object nodesCB {
    
    inline def apply(event: Event, nodes: js.Array[GridStackNode]): nodesCB = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[nodesCB]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: nodesCB] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[GridStackNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: GridStackNode*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
}
