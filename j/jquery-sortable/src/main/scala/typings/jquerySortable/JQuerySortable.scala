package typings.jquerySortable

import typings.jquerySortable.anon.Bottom
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQuerySortable {
  
  trait Container extends StObject {
    
    var el: JQuery
    
    var group: ContainerGroup
    
    var handle: String
    
    var itemDimensions: js.Array[Dimensions]
    
    var items: js.Array[HTMLElement]
    
    var options: Options
    
    var rootGroup: ContainerGroup
    
    var target: JQuery
  }
  object Container {
    
    inline def apply(
      el: JQuery,
      group: ContainerGroup,
      handle: String,
      itemDimensions: js.Array[Dimensions],
      items: js.Array[HTMLElement],
      options: Options,
      rootGroup: ContainerGroup,
      target: JQuery
    ): Container = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], itemDimensions = itemDimensions.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rootGroup = rootGroup.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Container]
    }
    
    extension [Self <: Container](x: Self) {
      
      inline def setEl(value: JQuery): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: ContainerGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setItemDimensions(value: js.Array[Dimensions]): Self = StObject.set(x, "itemDimensions", value.asInstanceOf[js.Any])
      
      inline def setItemDimensionsVarargs(value: Dimensions*): Self = StObject.set(x, "itemDimensions", js.Array(value*))
      
      inline def setItems(value: js.Array[HTMLElement]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: HTMLElement*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRootGroup(value: ContainerGroup): Self = StObject.set(x, "rootGroup", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContainerGroup extends StObject {
    
    @JSName("$document")
    var $document: JQuery
    
    var containerDimensions: js.Array[Dimensions]
    
    var containers: js.Array[Container]
    
    var delayMet: Boolean
    
    var dragInitDone: Boolean
    
    var dragProxy: Any
    
    var dragging: Boolean
    
    var dropProxy: Any
    
    var item: JQuery
    
    var itemContainer: Container
    
    var lastAppendedItem: JQuery
    
    var lastPointer: Position
    
    var lastRelativePointer: Position
    
    var offsetParent: JQuery
    
    var options: Options
    
    var placeholder: JQuery
    
    var pointer: Position
    
    var relativePointer: Position
    
    var sameResultBox: Bottom
    
    var scrollProxy: Any
  }
  object ContainerGroup {
    
    inline def apply(
      $document: JQuery,
      containerDimensions: js.Array[Dimensions],
      containers: js.Array[Container],
      delayMet: Boolean,
      dragInitDone: Boolean,
      dragProxy: Any,
      dragging: Boolean,
      dropProxy: Any,
      item: JQuery,
      itemContainer: Container,
      lastAppendedItem: JQuery,
      lastPointer: Position,
      lastRelativePointer: Position,
      offsetParent: JQuery,
      options: Options,
      placeholder: JQuery,
      pointer: Position,
      relativePointer: Position,
      sameResultBox: Bottom,
      scrollProxy: Any
    ): ContainerGroup = {
      val __obj = js.Dynamic.literal($document = $document.asInstanceOf[js.Any], containerDimensions = containerDimensions.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], delayMet = delayMet.asInstanceOf[js.Any], dragInitDone = dragInitDone.asInstanceOf[js.Any], dragProxy = dragProxy.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dropProxy = dropProxy.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemContainer = itemContainer.asInstanceOf[js.Any], lastAppendedItem = lastAppendedItem.asInstanceOf[js.Any], lastPointer = lastPointer.asInstanceOf[js.Any], lastRelativePointer = lastRelativePointer.asInstanceOf[js.Any], offsetParent = offsetParent.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], relativePointer = relativePointer.asInstanceOf[js.Any], sameResultBox = sameResultBox.asInstanceOf[js.Any], scrollProxy = scrollProxy.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerGroup]
    }
    
    extension [Self <: ContainerGroup](x: Self) {
      
      inline def set$document(value: JQuery): Self = StObject.set(x, "$document", value.asInstanceOf[js.Any])
      
      inline def setContainerDimensions(value: js.Array[Dimensions]): Self = StObject.set(x, "containerDimensions", value.asInstanceOf[js.Any])
      
      inline def setContainerDimensionsVarargs(value: Dimensions*): Self = StObject.set(x, "containerDimensions", js.Array(value*))
      
      inline def setContainers(value: js.Array[Container]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
      
      inline def setContainersVarargs(value: Container*): Self = StObject.set(x, "containers", js.Array(value*))
      
      inline def setDelayMet(value: Boolean): Self = StObject.set(x, "delayMet", value.asInstanceOf[js.Any])
      
      inline def setDragInitDone(value: Boolean): Self = StObject.set(x, "dragInitDone", value.asInstanceOf[js.Any])
      
      inline def setDragProxy(value: Any): Self = StObject.set(x, "dragProxy", value.asInstanceOf[js.Any])
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDropProxy(value: Any): Self = StObject.set(x, "dropProxy", value.asInstanceOf[js.Any])
      
      inline def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemContainer(value: Container): Self = StObject.set(x, "itemContainer", value.asInstanceOf[js.Any])
      
      inline def setLastAppendedItem(value: JQuery): Self = StObject.set(x, "lastAppendedItem", value.asInstanceOf[js.Any])
      
      inline def setLastPointer(value: Position): Self = StObject.set(x, "lastPointer", value.asInstanceOf[js.Any])
      
      inline def setLastRelativePointer(value: Position): Self = StObject.set(x, "lastRelativePointer", value.asInstanceOf[js.Any])
      
      inline def setOffsetParent(value: JQuery): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: JQuery): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPointer(value: Position): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setRelativePointer(value: Position): Self = StObject.set(x, "relativePointer", value.asInstanceOf[js.Any])
      
      inline def setSameResultBox(value: Bottom): Self = StObject.set(x, "sameResultBox", value.asInstanceOf[js.Any])
      
      inline def setScrollProxy(value: Any): Self = StObject.set(x, "scrollProxy", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContainerOptions extends StObject {
    
    var drag: js.UndefOr[Boolean] = js.undefined
    
    var drop: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[String] = js.undefined
    
    var nested: js.UndefOr[Boolean] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object ContainerOptions {
    
    inline def apply(): ContainerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerOptions]
    }
    
    extension [Self <: ContainerOptions](x: Self) {
      
      inline def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setDrop(value: Boolean): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setExclude(value: String): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type Dimensions = js.Array[Double]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type GenericEventHandler = ($item : jquery-sortable.JQuery | undefined, container : jquery-sortable.JQuerySortable.Container | undefined, _super : jquery-sortable.JQuerySortable.GenericEventHandler | undefined, event : std.Event | undefined): void
  }}}
  to avoid circular code involving: 
  - jquery-sortable.JQuerySortable.GenericEventHandler
  */
  @js.native
  trait GenericEventHandler extends StObject {
    
    def apply(): Unit = js.native
    def apply($item: Unit, container: Unit, _super: Unit, event: Event): Unit = js.native
    def apply($item: Unit, container: Unit, _super: GenericEventHandler): Unit = js.native
    def apply($item: Unit, container: Unit, _super: GenericEventHandler, event: Event): Unit = js.native
    def apply($item: Unit, container: Container): Unit = js.native
    def apply($item: Unit, container: Container, _super: Unit, event: Event): Unit = js.native
    def apply($item: Unit, container: Container, _super: GenericEventHandler): Unit = js.native
    def apply($item: Unit, container: Container, _super: GenericEventHandler, event: Event): Unit = js.native
    def apply($item: JQuery): Unit = js.native
    def apply($item: JQuery, container: Unit, _super: Unit, event: Event): Unit = js.native
    def apply($item: JQuery, container: Unit, _super: GenericEventHandler): Unit = js.native
    def apply($item: JQuery, container: Unit, _super: GenericEventHandler, event: Event): Unit = js.native
    def apply($item: JQuery, container: Container): Unit = js.native
    def apply($item: JQuery, container: Container, _super: Unit, event: Event): Unit = js.native
    def apply($item: JQuery, container: Container, _super: GenericEventHandler): Unit = js.native
    def apply($item: JQuery, container: Container, _super: GenericEventHandler, event: Event): Unit = js.native
  }
  
  trait GroupOptions extends StObject {
    
    var afterMove: js.UndefOr[
        js.Function3[
          /* $placeholder */ JQuery, 
          /* container */ Container, 
          /* $closestItemOrContainer */ JQuery, 
          Unit
        ]
      ] = js.undefined
    
    var containerPath: js.UndefOr[String] = js.undefined
    
    var containerSelector: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var distance: js.UndefOr[Double] = js.undefined
    
    var handle: js.UndefOr[String] = js.undefined
    
    var isValidTarget: js.UndefOr[js.Function2[/* $item */ JQuery, /* container */ Container, Boolean]] = js.undefined
    
    var itemPath: js.UndefOr[String] = js.undefined
    
    var itemSelector: js.UndefOr[String] = js.undefined
    
    var onCancel: js.UndefOr[OnCancelHandler] = js.undefined
    
    var onDrag: js.UndefOr[OnDragEventHandler] = js.undefined
    
    var onDragStart: js.UndefOr[GenericEventHandler] = js.undefined
    
    var onDrop: js.UndefOr[GenericEventHandler] = js.undefined
    
    var onMousedown: js.UndefOr[OnMousedownHandler] = js.undefined
    
    var placeholder: js.UndefOr[JQuery | js.Array[Any] | Element | String] = js.undefined
    
    var pullPlaceholder: js.UndefOr[Boolean] = js.undefined
    
    var serialize: js.UndefOr[SerializeFunc] = js.undefined
    
    var tolerance: js.UndefOr[Double] = js.undefined
  }
  object GroupOptions {
    
    inline def apply(): GroupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupOptions]
    }
    
    extension [Self <: GroupOptions](x: Self) {
      
      inline def setAfterMove(
        value: (/* $placeholder */ JQuery, /* container */ Container, /* $closestItemOrContainer */ JQuery) => Unit
      ): Self = StObject.set(x, "afterMove", js.Any.fromFunction3(value))
      
      inline def setAfterMoveUndefined: Self = StObject.set(x, "afterMove", js.undefined)
      
      inline def setContainerPath(value: String): Self = StObject.set(x, "containerPath", value.asInstanceOf[js.Any])
      
      inline def setContainerPathUndefined: Self = StObject.set(x, "containerPath", js.undefined)
      
      inline def setContainerSelector(value: String): Self = StObject.set(x, "containerSelector", value.asInstanceOf[js.Any])
      
      inline def setContainerSelectorUndefined: Self = StObject.set(x, "containerSelector", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setIsValidTarget(value: (/* $item */ JQuery, /* container */ Container) => Boolean): Self = StObject.set(x, "isValidTarget", js.Any.fromFunction2(value))
      
      inline def setIsValidTargetUndefined: Self = StObject.set(x, "isValidTarget", js.undefined)
      
      inline def setItemPath(value: String): Self = StObject.set(x, "itemPath", value.asInstanceOf[js.Any])
      
      inline def setItemPathUndefined: Self = StObject.set(x, "itemPath", js.undefined)
      
      inline def setItemSelector(value: String): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
      
      inline def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
      
      inline def setOnCancel(value: OnCancelHandler): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnDrag(value: OnDragEventHandler): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
      
      inline def setOnDragStart(value: GenericEventHandler): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: GenericEventHandler): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnMousedown(value: OnMousedownHandler): Self = StObject.set(x, "onMousedown", value.asInstanceOf[js.Any])
      
      inline def setOnMousedownUndefined: Self = StObject.set(x, "onMousedown", js.undefined)
      
      inline def setPlaceholder(value: JQuery | js.Array[Any] | Element | String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlaceholderVarargs(value: Any*): Self = StObject.set(x, "placeholder", js.Array(value*))
      
      inline def setPullPlaceholder(value: Boolean): Self = StObject.set(x, "pullPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setPullPlaceholderUndefined: Self = StObject.set(x, "pullPlaceholder", js.undefined)
      
      inline def setSerialize(value: (/* $parent */ JQuery, /* $children */ Any, /* parentIsContainer */ Boolean) => Unit): Self = StObject.set(x, "serialize", js.Any.fromFunction3(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type OnCancelHandler = ($item : jquery-sortable.JQuery | undefined, container : jquery-sortable.JQuerySortable.Container | undefined, _super : jquery-sortable.JQuerySortable.OnCancelHandler | undefined, event : std.Event | undefined): void
  }}}
  to avoid circular code involving: 
  - jquery-sortable.JQuerySortable.OnCancelHandler
  */
  @js.native
  trait OnCancelHandler extends StObject {
    
    def apply(): Unit = js.native
    def apply($item: Unit, container: Unit, _super: Unit, event: Event): Unit = js.native
    def apply($item: Unit, container: Unit, _super: OnCancelHandler): Unit = js.native
    def apply($item: Unit, container: Unit, _super: OnCancelHandler, event: Event): Unit = js.native
    def apply($item: Unit, container: Container): Unit = js.native
    def apply($item: Unit, container: Container, _super: Unit, event: Event): Unit = js.native
    def apply($item: Unit, container: Container, _super: OnCancelHandler): Unit = js.native
    def apply($item: Unit, container: Container, _super: OnCancelHandler, event: Event): Unit = js.native
    def apply($item: JQuery): Unit = js.native
    def apply($item: JQuery, container: Unit, _super: Unit, event: Event): Unit = js.native
    def apply($item: JQuery, container: Unit, _super: OnCancelHandler): Unit = js.native
    def apply($item: JQuery, container: Unit, _super: OnCancelHandler, event: Event): Unit = js.native
    def apply($item: JQuery, container: Container): Unit = js.native
    def apply($item: JQuery, container: Container, _super: Unit, event: Event): Unit = js.native
    def apply($item: JQuery, container: Container, _super: OnCancelHandler): Unit = js.native
    def apply($item: JQuery, container: Container, _super: OnCancelHandler, event: Event): Unit = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type OnDragEventHandler = ($item : jquery-sortable.JQuery | undefined, position : jquery-sortable.JQuerySortable.Position | undefined, _super : jquery-sortable.JQuerySortable.OnDragEventHandler | undefined, event : std.Event | undefined): void
  }}}
  to avoid circular code involving: 
  - jquery-sortable.JQuerySortable.OnDragEventHandler
  */
  @js.native
  trait OnDragEventHandler extends StObject {
    
    def apply(): Unit = js.native
    def apply($item: Unit, position: Unit, _super: Unit, event: Event): Unit = js.native
    def apply($item: Unit, position: Unit, _super: OnDragEventHandler): Unit = js.native
    def apply($item: Unit, position: Unit, _super: OnDragEventHandler, event: Event): Unit = js.native
    def apply($item: Unit, position: Position): Unit = js.native
    def apply($item: Unit, position: Position, _super: Unit, event: Event): Unit = js.native
    def apply($item: Unit, position: Position, _super: OnDragEventHandler): Unit = js.native
    def apply($item: Unit, position: Position, _super: OnDragEventHandler, event: Event): Unit = js.native
    def apply($item: JQuery): Unit = js.native
    def apply($item: JQuery, position: Unit, _super: Unit, event: Event): Unit = js.native
    def apply($item: JQuery, position: Unit, _super: OnDragEventHandler): Unit = js.native
    def apply($item: JQuery, position: Unit, _super: OnDragEventHandler, event: Event): Unit = js.native
    def apply($item: JQuery, position: Position): Unit = js.native
    def apply($item: JQuery, position: Position, _super: Unit, event: Event): Unit = js.native
    def apply($item: JQuery, position: Position, _super: OnDragEventHandler): Unit = js.native
    def apply($item: JQuery, position: Position, _super: OnDragEventHandler, event: Event): Unit = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type OnMousedownHandler = ($item : jquery-sortable.JQuery | undefined, _super : jquery-sortable.JQuerySortable.OnMousedownHandler | undefined, event : std.Event | undefined): void
  }}}
  to avoid circular code involving: 
  - jquery-sortable.JQuerySortable.OnMousedownHandler
  */
  @js.native
  trait OnMousedownHandler extends StObject {
    
    def apply(): Unit = js.native
    def apply($item: Unit, _super: Unit, event: Event): Unit = js.native
    def apply($item: Unit, _super: OnMousedownHandler): Unit = js.native
    def apply($item: Unit, _super: OnMousedownHandler, event: Event): Unit = js.native
    def apply($item: JQuery): Unit = js.native
    def apply($item: JQuery, _super: Unit, event: Event): Unit = js.native
    def apply($item: JQuery, _super: OnMousedownHandler): Unit = js.native
    def apply($item: JQuery, _super: OnMousedownHandler, event: Event): Unit = js.native
  }
  
  trait Options
    extends StObject
       with GroupOptions
       with ContainerOptions {
    
    var group: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object Position {
    
    inline def apply(left: Double, top: Double): Position = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  // Deliberately typing $children as an any here as it makes it much easier to use. Actual type is JQuery | any[]
  type SerializeFunc = js.Function3[/* $parent */ JQuery, /* $children */ Any, /* parentIsContainer */ Boolean, Unit]
}
