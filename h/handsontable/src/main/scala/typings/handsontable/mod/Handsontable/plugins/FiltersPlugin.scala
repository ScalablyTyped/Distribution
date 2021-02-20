package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.anon.Col
import typings.handsontable.anon.Key
import typings.handsontable.mod._Handsontable.Core
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// utils for Filters
object FiltersPlugin {
  
  @js.native
  trait ActionBarComponent extends BaseComponent {
    
    def accept(): Unit = js.native
    
    def cancel(): Unit = js.native
    
    def getMenuItemDescriptor(): js.Object = js.native
  }
  object ActionBarComponent {
    
    @scala.inline
    def apply(
      accept: () => Unit,
      cancel: () => Unit,
      destroy: () => Boolean,
      elements: js.Array[_],
      getMenuItemDescriptor: () => js.Object,
      hidden: Boolean,
      hide: () => Unit,
      isHidden: () => Boolean,
      reset: () => Unit,
      show: () => Unit
    ): ActionBarComponent = {
      val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), cancel = js.Any.fromFunction0(cancel), destroy = js.Any.fromFunction0(destroy), elements = elements.asInstanceOf[js.Any], getMenuItemDescriptor = js.Any.fromFunction0(getMenuItemDescriptor), hidden = hidden.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), reset = js.Any.fromFunction0(reset), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ActionBarComponent]
    }
    
    @scala.inline
    implicit class ActionBarComponentMutableBuilder[Self <: ActionBarComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: () => Unit): Self = StObject.set(x, "accept", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMenuItemDescriptor(value: () => js.Object): Self = StObject.set(x, "getMenuItemDescriptor", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait BaseComponent extends StObject {
    
    def destroy(): Boolean = js.native
    
    var elements: js.Array[_] = js.native
    
    var hidden: Boolean = js.native
    
    def hide(): Unit = js.native
    
    def isHidden(): Boolean = js.native
    
    def reset(): Unit = js.native
    
    def show(): Unit = js.native
  }
  object BaseComponent {
    
    @scala.inline
    def apply(
      destroy: () => Boolean,
      elements: js.Array[_],
      hidden: Boolean,
      hide: () => Unit,
      isHidden: () => Boolean,
      reset: () => Unit,
      show: () => Unit
    ): BaseComponent = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), elements = elements.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), reset = js.Any.fromFunction0(reset), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[BaseComponent]
    }
    
    @scala.inline
    implicit class BaseComponentMutableBuilder[Self <: BaseComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Boolean): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setElements(value: js.Array[_]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsVarargs(value: js.Any*): Self = StObject.set(x, "elements", js.Array(value :_*))
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsHidden(value: () => Boolean): Self = StObject.set(x, "isHidden", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait BaseUI extends StObject {
    
    def build(): Unit = js.native
    
    var buildState: Boolean = js.native
    
    def destroy(): Unit = js.native
    
    def element(): Element = js.native
    
    var eventManager: EventManager = js.native
    
    def focus(): Unit = js.native
    
    def getValue(): js.Any = js.native
    
    def hide(): Unit = js.native
    
    var hot: Core = js.native
    
    def isBuilt(): Boolean = js.native
    
    var options: js.Object = js.native
    
    def reset(): Unit = js.native
    
    def setValue(value: js.Any): js.Any = js.native
    
    def show(): Unit = js.native
    
    def update(): Unit = js.native
  }
  object BaseUI {
    
    @scala.inline
    def apply(
      build: () => Unit,
      buildState: Boolean,
      destroy: () => Unit,
      element: () => Element,
      eventManager: EventManager,
      focus: () => Unit,
      getValue: () => js.Any,
      hide: () => Unit,
      hot: Core,
      isBuilt: () => Boolean,
      options: js.Object,
      reset: () => Unit,
      setValue: js.Any => js.Any,
      show: () => Unit,
      update: () => Unit
    ): BaseUI = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), buildState = buildState.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), element = js.Any.fromFunction0(element), eventManager = eventManager.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getValue = js.Any.fromFunction0(getValue), hide = js.Any.fromFunction0(hide), hot = hot.asInstanceOf[js.Any], isBuilt = js.Any.fromFunction0(isBuilt), options = options.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), setValue = js.Any.fromFunction1(setValue), show = js.Any.fromFunction0(show), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[BaseUI]
    }
    
    @scala.inline
    implicit class BaseUIMutableBuilder[Self <: BaseUI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuild(value: () => Unit): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBuildState(value: Boolean): Self = StObject.set(x, "buildState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setElement(value: () => Element): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEventManager(value: EventManager): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHot(value: Core): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBuilt(value: () => Boolean): Self = StObject.set(x, "isBuilt", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetValue(value: js.Any => js.Any): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CellLikeData extends StObject {
    
    var meta: Col = js.native
    
    var value: String = js.native
  }
  object CellLikeData {
    
    @scala.inline
    def apply(meta: Col, value: String): CellLikeData = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellLikeData]
    }
    
    @scala.inline
    implicit class CellLikeDataMutableBuilder[Self <: CellLikeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: Col): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ColumnConditions extends StObject {
    
    var column: Double = js.native
    
    var conditions: js.Array[ConditionId] = js.native
    
    var operation: OperationType = js.native
  }
  object ColumnConditions {
    
    @scala.inline
    def apply(column: Double, conditions: js.Array[ConditionId], operation: OperationType): ColumnConditions = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnConditions]
    }
    
    @scala.inline
    implicit class ColumnConditionsMutableBuilder[Self <: ColumnConditions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditions(value: js.Array[ConditionId]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionsVarargs(value: ConditionId*): Self = StObject.set(x, "conditions", js.Array(value :_*))
      
      @scala.inline
      def setOperation(value: OperationType): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Condition extends StObject {
    
    var args: js.Array[_] = js.native
    
    def func(dataRow: CellValue, values: js.Array[_]): Boolean = js.native
    
    var name: ConditionName = js.native
  }
  object Condition {
    
    @scala.inline
    def apply(args: js.Array[_], func: (CellValue, js.Array[_]) => Boolean, name: ConditionName): Condition = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], func = js.Any.fromFunction2(func), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Condition]
    }
    
    @scala.inline
    implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setFunc(value: (CellValue, js.Array[_]) => Boolean): Self = StObject.set(x, "func", js.Any.fromFunction2(value))
      
      @scala.inline
      def setName(value: ConditionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConditionCollection extends StObject {
    
    def addCondition(column: Double, conditionDefinition: ConditionId): Unit = js.native
    def addCondition(column: Double, conditionDefinition: ConditionId, operation: OperationType): Unit = js.native
    
    def clean(): Unit = js.native
    
    def clearConditions(column: Double): Unit = js.native
    
    var conditions: js.Object = js.native
    
    def destroy(): Unit = js.native
    
    def exportAllConditions(): js.Array[ConditionId] = js.native
    
    def getConditions(column: Double): js.Array[Condition] = js.native
    
    def hasConditions(column: Double, name: String): Boolean = js.native
    
    def importAllConditions(conditions: js.Array[ConditionId]): Unit = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isMatch(value: CellLikeData, column: Double): Boolean = js.native
    
    def isMatchInConditions(conditions: js.Array[Condition], value: CellLikeData): Boolean = js.native
    def isMatchInConditions(conditions: js.Array[Condition], value: CellLikeData, operationType: OperationType): Boolean = js.native
    
    var orderStack: js.Array[_] = js.native
    
    def removeConditions(column: Double): Unit = js.native
  }
  
  @js.native
  trait ConditionComponent extends BaseComponent {
    
    def getInputElement(): InputUI = js.native
    def getInputElement(index: Double): InputUI = js.native
    
    def getInputElements(): js.Array[InputUI] = js.native
    
    def getMenuItemDescriptor(): js.Object = js.native
    
    def getSelectElement(): SelectUI = js.native
    
    def getState(): js.Object = js.native
    
    def setState(value: js.Object): Unit = js.native
    
    def updateState(stateInfo: js.Object): Unit = js.native
  }
  
  @js.native
  trait ConditionId extends StObject {
    
    var args: js.Array[_] = js.native
    
    var command: js.UndefOr[Key] = js.native
    
    var name: js.UndefOr[ConditionName] = js.native
  }
  object ConditionId {
    
    @scala.inline
    def apply(args: js.Array[_]): ConditionId = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConditionId]
    }
    
    @scala.inline
    implicit class ConditionIdMutableBuilder[Self <: ConditionId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setCommand(value: Key): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      @scala.inline
      def setName(value: ConditionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.begins_with
    - typings.handsontable.handsontableStrings.between
    - typings.handsontable.handsontableStrings.by_value
    - typings.handsontable.handsontableStrings.contains
    - typings.handsontable.handsontableStrings.empty
    - typings.handsontable.handsontableStrings.ends_with
    - typings.handsontable.handsontableStrings.eq
    - typings.handsontable.handsontableStrings.gt
    - typings.handsontable.handsontableStrings.gte
    - typings.handsontable.handsontableStrings.lt
    - typings.handsontable.handsontableStrings.lte
    - typings.handsontable.handsontableStrings.not_between
    - typings.handsontable.handsontableStrings.not_contains
    - typings.handsontable.handsontableStrings.not_empty
    - typings.handsontable.handsontableStrings.neq
  */
  trait ConditionName extends StObject
  object ConditionName {
    
    @scala.inline
    def begins_with: typings.handsontable.handsontableStrings.begins_with = "begins_with".asInstanceOf[typings.handsontable.handsontableStrings.begins_with]
    
    @scala.inline
    def between: typings.handsontable.handsontableStrings.between = "between".asInstanceOf[typings.handsontable.handsontableStrings.between]
    
    @scala.inline
    def by_value: typings.handsontable.handsontableStrings.by_value = "by_value".asInstanceOf[typings.handsontable.handsontableStrings.by_value]
    
    @scala.inline
    def contains: typings.handsontable.handsontableStrings.contains = "contains".asInstanceOf[typings.handsontable.handsontableStrings.contains]
    
    @scala.inline
    def empty: typings.handsontable.handsontableStrings.empty = "empty".asInstanceOf[typings.handsontable.handsontableStrings.empty]
    
    @scala.inline
    def ends_with: typings.handsontable.handsontableStrings.ends_with = "ends_with".asInstanceOf[typings.handsontable.handsontableStrings.ends_with]
    
    @scala.inline
    def eq: typings.handsontable.handsontableStrings.eq = "eq".asInstanceOf[typings.handsontable.handsontableStrings.eq]
    
    @scala.inline
    def gt: typings.handsontable.handsontableStrings.gt = "gt".asInstanceOf[typings.handsontable.handsontableStrings.gt]
    
    @scala.inline
    def gte: typings.handsontable.handsontableStrings.gte = "gte".asInstanceOf[typings.handsontable.handsontableStrings.gte]
    
    @scala.inline
    def lt: typings.handsontable.handsontableStrings.lt = "lt".asInstanceOf[typings.handsontable.handsontableStrings.lt]
    
    @scala.inline
    def lte: typings.handsontable.handsontableStrings.lte = "lte".asInstanceOf[typings.handsontable.handsontableStrings.lte]
    
    @scala.inline
    def neq: typings.handsontable.handsontableStrings.neq = "neq".asInstanceOf[typings.handsontable.handsontableStrings.neq]
    
    @scala.inline
    def not_between: typings.handsontable.handsontableStrings.not_between = "not_between".asInstanceOf[typings.handsontable.handsontableStrings.not_between]
    
    @scala.inline
    def not_contains: typings.handsontable.handsontableStrings.not_contains = "not_contains".asInstanceOf[typings.handsontable.handsontableStrings.not_contains]
    
    @scala.inline
    def not_empty: typings.handsontable.handsontableStrings.not_empty = "not_empty".asInstanceOf[typings.handsontable.handsontableStrings.not_empty]
  }
  
  @js.native
  trait ConditionUpdateObserver extends StObject {
    
    var changes: js.Array[Double] = js.native
    
    def columnDataFactory(column: Double): js.Array[js.Object] = js.native
    
    var conditionCollection: ConditionCollection = js.native
    
    def destroy(): Unit = js.native
    
    def flush(): Unit = js.native
    
    def groupChanges(): Unit = js.native
    
    var grouping: Boolean = js.native
    
    var latestEditedColumnPosition: Double = js.native
    
    var latestOrderStack: js.Array[Double] = js.native
    
    def updateStatesAtColumn(column: Double, conditionArgsChange: js.Object): Unit = js.native
  }
  object ConditionUpdateObserver {
    
    @scala.inline
    def apply(
      changes: js.Array[Double],
      columnDataFactory: Double => js.Array[js.Object],
      conditionCollection: ConditionCollection,
      destroy: () => Unit,
      flush: () => Unit,
      groupChanges: () => Unit,
      grouping: Boolean,
      latestEditedColumnPosition: Double,
      latestOrderStack: js.Array[Double],
      updateStatesAtColumn: (Double, js.Object) => Unit
    ): ConditionUpdateObserver = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], columnDataFactory = js.Any.fromFunction1(columnDataFactory), conditionCollection = conditionCollection.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), groupChanges = js.Any.fromFunction0(groupChanges), grouping = grouping.asInstanceOf[js.Any], latestEditedColumnPosition = latestEditedColumnPosition.asInstanceOf[js.Any], latestOrderStack = latestOrderStack.asInstanceOf[js.Any], updateStatesAtColumn = js.Any.fromFunction2(updateStatesAtColumn))
      __obj.asInstanceOf[ConditionUpdateObserver]
    }
    
    @scala.inline
    implicit class ConditionUpdateObserverMutableBuilder[Self <: ConditionUpdateObserver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanges(value: js.Array[Double]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangesVarargs(value: Double*): Self = StObject.set(x, "changes", js.Array(value :_*))
      
      @scala.inline
      def setColumnDataFactory(value: Double => js.Array[js.Object]): Self = StObject.set(x, "columnDataFactory", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConditionCollection(value: ConditionCollection): Self = StObject.set(x, "conditionCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGroupChanges(value: () => Unit): Self = StObject.set(x, "groupChanges", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGrouping(value: Boolean): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestEditedColumnPosition(value: Double): Self = StObject.set(x, "latestEditedColumnPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestOrderStack(value: js.Array[Double]): Self = StObject.set(x, "latestOrderStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestOrderStackVarargs(value: Double*): Self = StObject.set(x, "latestOrderStack", js.Array(value :_*))
      
      @scala.inline
      def setUpdateStatesAtColumn(value: (Double, js.Object) => Unit): Self = StObject.set(x, "updateStatesAtColumn", js.Any.fromFunction2(value))
    }
  }
  
  type InputUI = BaseUI
  
  @js.native
  trait MultipleSelectUI extends BaseUI {
    
    var clearAllUI: BaseUI = js.native
    
    def getItems(): Unit = js.native
    
    def isSelectedAllValues(): Boolean = js.native
    
    var items: js.Array[_] = js.native
    
    var itemsBox: Core = js.native
    
    var searchInput: InputUI = js.native
    
    var selectAllUI: BaseUI = js.native
    
    def setItems(items: js.Array[_]): Unit = js.native
  }
  object MultipleSelectUI {
    
    @scala.inline
    def apply(
      build: () => Unit,
      buildState: Boolean,
      clearAllUI: BaseUI,
      destroy: () => Unit,
      element: () => Element,
      eventManager: EventManager,
      focus: () => Unit,
      getItems: () => Unit,
      getValue: () => js.Any,
      hide: () => Unit,
      hot: Core,
      isBuilt: () => Boolean,
      isSelectedAllValues: () => Boolean,
      items: js.Array[_],
      itemsBox: Core,
      options: js.Object,
      reset: () => Unit,
      searchInput: InputUI,
      selectAllUI: BaseUI,
      setItems: js.Array[_] => Unit,
      setValue: js.Any => js.Any,
      show: () => Unit,
      update: () => Unit
    ): MultipleSelectUI = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), buildState = buildState.asInstanceOf[js.Any], clearAllUI = clearAllUI.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), element = js.Any.fromFunction0(element), eventManager = eventManager.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getItems = js.Any.fromFunction0(getItems), getValue = js.Any.fromFunction0(getValue), hide = js.Any.fromFunction0(hide), hot = hot.asInstanceOf[js.Any], isBuilt = js.Any.fromFunction0(isBuilt), isSelectedAllValues = js.Any.fromFunction0(isSelectedAllValues), items = items.asInstanceOf[js.Any], itemsBox = itemsBox.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), searchInput = searchInput.asInstanceOf[js.Any], selectAllUI = selectAllUI.asInstanceOf[js.Any], setItems = js.Any.fromFunction1(setItems), setValue = js.Any.fromFunction1(setValue), show = js.Any.fromFunction0(show), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[MultipleSelectUI]
    }
    
    @scala.inline
    implicit class MultipleSelectUIMutableBuilder[Self <: MultipleSelectUI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearAllUI(value: BaseUI): Self = StObject.set(x, "clearAllUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetItems(value: () => Unit): Self = StObject.set(x, "getItems", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSelectedAllValues(value: () => Boolean): Self = StObject.set(x, "isSelectedAllValues", js.Any.fromFunction0(value))
      
      @scala.inline
      def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsBox(value: Core): Self = StObject.set(x, "itemsBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setSearchInput(value: InputUI): Self = StObject.set(x, "searchInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllUI(value: BaseUI): Self = StObject.set(x, "selectAllUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetItems(value: js.Array[_] => Unit): Self = StObject.set(x, "setItems", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.conjunction
    - typings.handsontable.handsontableStrings.disjunction
  */
  trait OperationType extends StObject
  object OperationType {
    
    @scala.inline
    def conjunction: typings.handsontable.handsontableStrings.conjunction = "conjunction".asInstanceOf[typings.handsontable.handsontableStrings.conjunction]
    
    @scala.inline
    def disjunction: typings.handsontable.handsontableStrings.disjunction = "disjunction".asInstanceOf[typings.handsontable.handsontableStrings.disjunction]
  }
  
  @js.native
  trait SelectUI extends BaseUI {
    
    def closeOptions(): Unit = js.native
    
    var items: js.Array[_] = js.native
    
    var menu: Menu | Unit = js.native
    
    def openOptions(): Unit = js.native
    
    def setItems(items: js.Array[_]): Unit = js.native
  }
  object SelectUI {
    
    @scala.inline
    def apply(
      build: () => Unit,
      buildState: Boolean,
      closeOptions: () => Unit,
      destroy: () => Unit,
      element: () => Element,
      eventManager: EventManager,
      focus: () => Unit,
      getValue: () => js.Any,
      hide: () => Unit,
      hot: Core,
      isBuilt: () => Boolean,
      items: js.Array[_],
      menu: Menu | Unit,
      openOptions: () => Unit,
      options: js.Object,
      reset: () => Unit,
      setItems: js.Array[_] => Unit,
      setValue: js.Any => js.Any,
      show: () => Unit,
      update: () => Unit
    ): SelectUI = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), buildState = buildState.asInstanceOf[js.Any], closeOptions = js.Any.fromFunction0(closeOptions), destroy = js.Any.fromFunction0(destroy), element = js.Any.fromFunction0(element), eventManager = eventManager.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getValue = js.Any.fromFunction0(getValue), hide = js.Any.fromFunction0(hide), hot = hot.asInstanceOf[js.Any], isBuilt = js.Any.fromFunction0(isBuilt), items = items.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], openOptions = js.Any.fromFunction0(openOptions), options = options.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), setItems = js.Any.fromFunction1(setItems), setValue = js.Any.fromFunction1(setValue), show = js.Any.fromFunction0(show), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[SelectUI]
    }
    
    @scala.inline
    implicit class SelectUIMutableBuilder[Self <: SelectUI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseOptions(value: () => Unit): Self = StObject.set(x, "closeOptions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMenu(value: Menu | Unit): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOptions(value: () => Unit): Self = StObject.set(x, "openOptions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetItems(value: js.Array[_] => Unit): Self = StObject.set(x, "setItems", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ValueComponent extends BaseComponent {
    
    def getMenuItemDescriptor(): js.Object = js.native
    
    def getMultipleSelectElement(): MultipleSelectUI = js.native
    
    def getState(): js.Object = js.native
    
    def setState(value: js.Object): Unit = js.native
    
    def updateState(stateInfo: js.Object): Unit = js.native
  }
  object ValueComponent {
    
    @scala.inline
    def apply(
      destroy: () => Boolean,
      elements: js.Array[_],
      getMenuItemDescriptor: () => js.Object,
      getMultipleSelectElement: () => MultipleSelectUI,
      getState: () => js.Object,
      hidden: Boolean,
      hide: () => Unit,
      isHidden: () => Boolean,
      reset: () => Unit,
      setState: js.Object => Unit,
      show: () => Unit,
      updateState: js.Object => Unit
    ): ValueComponent = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), elements = elements.asInstanceOf[js.Any], getMenuItemDescriptor = js.Any.fromFunction0(getMenuItemDescriptor), getMultipleSelectElement = js.Any.fromFunction0(getMultipleSelectElement), getState = js.Any.fromFunction0(getState), hidden = hidden.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), reset = js.Any.fromFunction0(reset), setState = js.Any.fromFunction1(setState), show = js.Any.fromFunction0(show), updateState = js.Any.fromFunction1(updateState))
      __obj.asInstanceOf[ValueComponent]
    }
    
    @scala.inline
    implicit class ValueComponentMutableBuilder[Self <: ValueComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetMenuItemDescriptor(value: () => js.Object): Self = StObject.set(x, "getMenuItemDescriptor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMultipleSelectElement(value: () => MultipleSelectUI): Self = StObject.set(x, "getMultipleSelectElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetState(value: () => js.Object): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetState(value: js.Object => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateState(value: js.Object => Unit): Self = StObject.set(x, "updateState", js.Any.fromFunction1(value))
    }
  }
}
