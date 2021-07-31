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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEl(value: JQuery): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup(value: ContainerGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemDimensions(value: js.Array[Dimensions]): Self = StObject.set(x, "itemDimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemDimensionsVarargs(value: Dimensions*): Self = StObject.set(x, "itemDimensions", js.Array(value :_*))
      
      @scala.inline
      def setItems(value: js.Array[HTMLElement]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: HTMLElement*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootGroup(value: ContainerGroup): Self = StObject.set(x, "rootGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContainerGroup extends StObject {
    
    @JSName("$document")
    var $document: JQuery
    
    var containerDimensions: js.Array[Dimensions]
    
    var containers: js.Array[Container]
    
    var delayMet: Boolean
    
    var dragInitDone: Boolean
    
    var dragProxy: js.Any
    
    var dragging: Boolean
    
    var dropProxy: js.Any
    
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
    
    var scrollProxy: js.Any
  }
  object ContainerGroup {
    
    @scala.inline
    def apply(
      $document: JQuery,
      containerDimensions: js.Array[Dimensions],
      containers: js.Array[Container],
      delayMet: Boolean,
      dragInitDone: Boolean,
      dragProxy: js.Any,
      dragging: Boolean,
      dropProxy: js.Any,
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
      scrollProxy: js.Any
    ): ContainerGroup = {
      val __obj = js.Dynamic.literal($document = $document.asInstanceOf[js.Any], containerDimensions = containerDimensions.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], delayMet = delayMet.asInstanceOf[js.Any], dragInitDone = dragInitDone.asInstanceOf[js.Any], dragProxy = dragProxy.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dropProxy = dropProxy.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemContainer = itemContainer.asInstanceOf[js.Any], lastAppendedItem = lastAppendedItem.asInstanceOf[js.Any], lastPointer = lastPointer.asInstanceOf[js.Any], lastRelativePointer = lastRelativePointer.asInstanceOf[js.Any], offsetParent = offsetParent.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], relativePointer = relativePointer.asInstanceOf[js.Any], sameResultBox = sameResultBox.asInstanceOf[js.Any], scrollProxy = scrollProxy.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerGroup]
    }
    
    @scala.inline
    implicit class ContainerGroupMutableBuilder[Self <: ContainerGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$document(value: JQuery): Self = StObject.set(x, "$document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerDimensions(value: js.Array[Dimensions]): Self = StObject.set(x, "containerDimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerDimensionsVarargs(value: Dimensions*): Self = StObject.set(x, "containerDimensions", js.Array(value :_*))
      
      @scala.inline
      def setContainers(value: js.Array[Container]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainersVarargs(value: Container*): Self = StObject.set(x, "containers", js.Array(value :_*))
      
      @scala.inline
      def setDelayMet(value: Boolean): Self = StObject.set(x, "delayMet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragInitDone(value: Boolean): Self = StObject.set(x, "dragInitDone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragProxy(value: js.Any): Self = StObject.set(x, "dragProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropProxy(value: js.Any): Self = StObject.set(x, "dropProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemContainer(value: Container): Self = StObject.set(x, "itemContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastAppendedItem(value: JQuery): Self = StObject.set(x, "lastAppendedItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPointer(value: Position): Self = StObject.set(x, "lastPointer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastRelativePointer(value: Position): Self = StObject.set(x, "lastRelativePointer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetParent(value: JQuery): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholder(value: JQuery): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointer(value: Position): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePointer(value: Position): Self = StObject.set(x, "relativePointer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameResultBox(value: Bottom): Self = StObject.set(x, "sameResultBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollProxy(value: js.Any): Self = StObject.set(x, "scrollProxy", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): ContainerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerOptions]
    }
    
    @scala.inline
    implicit class ContainerOptionsMutableBuilder[Self <: ContainerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      @scala.inline
      def setDrop(value: Boolean): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      @scala.inline
      def setExclude(value: String): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type Dimensions = js.Array[Double]
  
  type GenericEventHandler = js.Function4[
    /* $item */ js.UndefOr[JQuery], 
    /* container */ js.UndefOr[Container], 
    /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object
    ], 
    /* event */ js.UndefOr[Event], 
    Unit
  ]
  
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
    
    var placeholder: js.UndefOr[JQuery | js.Array[js.Any] | Element | String] = js.undefined
    
    var pullPlaceholder: js.UndefOr[Boolean] = js.undefined
    
    var serialize: js.UndefOr[SerializeFunc] = js.undefined
    
    var tolerance: js.UndefOr[Double] = js.undefined
  }
  object GroupOptions {
    
    @scala.inline
    def apply(): GroupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupOptions]
    }
    
    @scala.inline
    implicit class GroupOptionsMutableBuilder[Self <: GroupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterMove(
        value: (/* $placeholder */ JQuery, /* container */ Container, /* $closestItemOrContainer */ JQuery) => Unit
      ): Self = StObject.set(x, "afterMove", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAfterMoveUndefined: Self = StObject.set(x, "afterMove", js.undefined)
      
      @scala.inline
      def setContainerPath(value: String): Self = StObject.set(x, "containerPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerPathUndefined: Self = StObject.set(x, "containerPath", js.undefined)
      
      @scala.inline
      def setContainerSelector(value: String): Self = StObject.set(x, "containerSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerSelectorUndefined: Self = StObject.set(x, "containerSelector", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      @scala.inline
      def setIsValidTarget(value: (/* $item */ JQuery, /* container */ Container) => Boolean): Self = StObject.set(x, "isValidTarget", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsValidTargetUndefined: Self = StObject.set(x, "isValidTarget", js.undefined)
      
      @scala.inline
      def setItemPath(value: String): Self = StObject.set(x, "itemPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPathUndefined: Self = StObject.set(x, "itemPath", js.undefined)
      
      @scala.inline
      def setItemSelector(value: String): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
      
      @scala.inline
      def setOnCancel(
        value: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnCancelHandler */ js.Object
            ], /* event */ js.UndefOr[Event]) => Unit
      ): Self = StObject.set(x, "onCancel", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnDrag(
        value: (/* $item */ js.UndefOr[JQuery], /* position */ js.UndefOr[Position], /* _super */ js.UndefOr[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnDragEventHandler */ js.Object
            ], /* event */ js.UndefOr[Event]) => Unit
      ): Self = StObject.set(x, "onDrag", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnDragStart(
        value: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object
            ], /* event */ js.UndefOr[Event]) => Unit
      ): Self = StObject.set(x, "onDragStart", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(
        value: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object
            ], /* event */ js.UndefOr[Event]) => Unit
      ): Self = StObject.set(x, "onDrop", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnMousedown(
        value: (/* $item */ js.UndefOr[JQuery], /* _super */ js.UndefOr[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnMousedownHandler */ js.Object
            ], /* event */ js.UndefOr[Event]) => Unit
      ): Self = StObject.set(x, "onMousedown", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnMousedownUndefined: Self = StObject.set(x, "onMousedown", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: JQuery | js.Array[js.Any] | Element | String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlaceholderVarargs(value: js.Any*): Self = StObject.set(x, "placeholder", js.Array(value :_*))
      
      @scala.inline
      def setPullPlaceholder(value: Boolean): Self = StObject.set(x, "pullPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullPlaceholderUndefined: Self = StObject.set(x, "pullPlaceholder", js.undefined)
      
      @scala.inline
      def setSerialize(value: (/* $parent */ JQuery, /* $children */ js.Any, /* parentIsContainer */ Boolean) => Unit): Self = StObject.set(x, "serialize", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      @scala.inline
      def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    }
  }
  
  type OnCancelHandler = js.Function4[
    /* $item */ js.UndefOr[JQuery], 
    /* container */ js.UndefOr[Container], 
    /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnCancelHandler */ js.Object
    ], 
    /* event */ js.UndefOr[Event], 
    Unit
  ]
  
  type OnDragEventHandler = js.Function4[
    /* $item */ js.UndefOr[JQuery], 
    /* position */ js.UndefOr[Position], 
    /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnDragEventHandler */ js.Object
    ], 
    /* event */ js.UndefOr[Event], 
    Unit
  ]
  
  type OnMousedownHandler = js.Function3[
    /* $item */ js.UndefOr[JQuery], 
    /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnMousedownHandler */ js.Object
    ], 
    /* event */ js.UndefOr[Event], 
    Unit
  ]
  
  trait Options
    extends StObject
       with GroupOptions
       with ContainerOptions {
    
    var group: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object Position {
    
    @scala.inline
    def apply(left: Double, top: Double): Position = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  // Deliberately typing $children as an any here as it makes it much easier to use. Actual type is JQuery | any[]
  type SerializeFunc = js.Function3[/* $parent */ JQuery, /* $children */ js.Any, /* parentIsContainer */ Boolean, Unit]
}
