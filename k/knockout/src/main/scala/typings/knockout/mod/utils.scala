package typings.knockout.mod

import org.scalablytyped.runtime.StringDictionary
import typings.knockout.knockoutStrings.added
import typings.knockout.knockoutStrings.deleted
import typings.knockout.knockoutStrings.retained
import typings.std.Document
import typings.std.Element
import typings.std.EventListener
import typings.std.HTMLFormElement
import typings.std.Node
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("knockout", "utils")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addOrRemoveItem[T](array: MaybeObservableArray[T], value: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addOrRemoveItem")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def addOrRemoveItem[T](array: MaybeObservableArray[T], value: T, included: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addOrRemoveItem")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], included.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def arrayFilter[T](array: js.Array[T], predicate: js.Function2[/* item */ T, /* index */ Double, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayFilter")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def arrayFilter[T](
    array: js.Array[T],
    predicate: js.Function2[/* item */ T, /* index */ Double, Boolean],
    predicateOwner: js.Any
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayFilter")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], predicateOwner.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def arrayFirst[T](array: js.Array[T], predicate: js.Function2[/* item */ T, /* index */ Double, Boolean]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayFirst")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def arrayFirst[T](
    array: js.Array[T],
    predicate: js.Function2[/* item */ T, /* index */ Double, Boolean],
    predicateOwner: js.Any
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayFirst")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], predicateOwner.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def arrayForEach[T](array: js.Array[T], action: js.Function2[/* item */ T, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayForEach")(array.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def arrayForEach[T](
    array: js.Array[T],
    action: js.Function2[/* item */ T, /* index */ Double, Unit],
    actionOwner: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayForEach")(array.asInstanceOf[js.Any], action.asInstanceOf[js.Any], actionOwner.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def arrayGetDistinctValues[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayGetDistinctValues")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def arrayIndexOf[T](array: MaybeObservableArray[T], item: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayIndexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def arrayMap[T, U](array: js.Array[T], mapping: js.Function2[/* item */ T, /* index */ Double, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMap")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  @scala.inline
  def arrayMap[T, U](
    array: js.Array[T],
    mapping: js.Function2[/* item */ T, /* index */ Double, U],
    mappingOwner: js.Any
  ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMap")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], mappingOwner.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  @scala.inline
  def arrayPushAll[T](array: MaybeObservableArray[T], valuesToPush: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPushAll")(array.asInstanceOf[js.Any], valuesToPush.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def arrayRemoveItem[T](array: MaybeObservableArray[T], itemToRemove: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemoveItem")(array.asInstanceOf[js.Any], itemToRemove.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def compareArrays[T](a: js.Array[T], b: js.Array[T]): ArrayChanges[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compareArrays")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[ArrayChanges[T]]
  @scala.inline
  def compareArrays[T](a: js.Array[T], b: js.Array[T], dontLimitMoves: Boolean): ArrayChanges[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compareArrays")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], dontLimitMoves.asInstanceOf[js.Any])).asInstanceOf[ArrayChanges[T]]
  @scala.inline
  def compareArrays[T](a: js.Array[T], b: js.Array[T], options: CompareArraysOptions): ArrayChanges[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compareArrays")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ArrayChanges[T]]
  
  object domData {
    
    @JSImport("knockout", "utils.domData")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def clear(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def get[T](node: Node, key: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @scala.inline
    def set[T](node: Node, key: String, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object domNodeDisposal {
    
    @JSImport("knockout", "utils.domNodeDisposal")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def addDisposeCallback(node: Node, callback: js.Function1[/* node */ Node, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addDisposeCallback")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def cleanExternalData(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanExternalData")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def removeDisposeCallback(node: Node, callback: js.Function1[/* node */ Node, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDisposeCallback")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @scala.inline
  def extend[T, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
  
  @JSImport("knockout", "utils.fieldsIncludedWithJsonPost")
  @js.native
  val fieldsIncludedWithJsonPost: js.Array[String | RegExp] = js.native
  
  @scala.inline
  def getFormFields(form: HTMLFormElement, fieldName: String): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormFields")(form.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def getFormFields(form: HTMLFormElement, fieldName: RegExp): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormFields")(form.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def objectForEach(obj: js.Object, action: js.Function2[/* key */ String, /* value */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("objectForEach")(obj.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def objectForEach[T](obj: StringDictionary[T], action: js.Function2[/* key */ String, /* value */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("objectForEach")(obj.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def parseHtmlFragment(html: String): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHtmlFragment")(html.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
  @scala.inline
  def parseHtmlFragment(html: String, documentContext: Document): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHtmlFragment")(html.asInstanceOf[js.Any], documentContext.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  @scala.inline
  def parseJson(jsonString: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJson")(jsonString.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def parseJson_T_T[T](jsonString: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJson")(jsonString.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def peekObservable[T](value: MaybeSubscribable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("peekObservable")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def postJson(urlOrForm: String, data: MaybeSubscribable[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postJson")(urlOrForm.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def postJson(urlOrForm: String, data: MaybeSubscribable[js.Object], options: PostJsonOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postJson")(urlOrForm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def postJson(urlOrForm: HTMLFormElement, data: MaybeSubscribable[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postJson")(urlOrForm.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def postJson(urlOrForm: HTMLFormElement, data: MaybeSubscribable[js.Object], options: PostJsonOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postJson")(urlOrForm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def range(min: MaybeSubscribable[Double], max: MaybeSubscribable[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def registerEventHandler(element: Element, eventType: String, handler: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEventHandler")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setDomNodeChildrenFromArrayMapping[T](domNode: Node, array: js.Array[T], mapping: MappingFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDomNodeChildrenFromArrayMapping")(domNode.asInstanceOf[js.Any], array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setDomNodeChildrenFromArrayMapping[T](
    domNode: Node,
    array: js.Array[T],
    mapping: MappingFunction[T],
    options: Unit,
    callbackAfterAddingNodes: MappingAfterAddFunction[T]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDomNodeChildrenFromArrayMapping")(domNode.asInstanceOf[js.Any], array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callbackAfterAddingNodes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setDomNodeChildrenFromArrayMapping[T](domNode: Node, array: js.Array[T], mapping: MappingFunction[T], options: MappingOptions[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDomNodeChildrenFromArrayMapping")(domNode.asInstanceOf[js.Any], array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setDomNodeChildrenFromArrayMapping[T](
    domNode: Node,
    array: js.Array[T],
    mapping: MappingFunction[T],
    options: MappingOptions[T],
    callbackAfterAddingNodes: MappingAfterAddFunction[T]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDomNodeChildrenFromArrayMapping")(domNode.asInstanceOf[js.Any], array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callbackAfterAddingNodes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setHtml(node: Node, html: MaybeSubscribable[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setHtml")(node.asInstanceOf[js.Any], html.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setTextContent(element: Node, textContent: MaybeSubscribable[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTextContent")(element.asInstanceOf[js.Any], textContent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def stringifyJson(data: MaybeSubscribable[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJson")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringifyJson(data: MaybeSubscribable[js.Any], replacer: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJson")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringifyJson(data: MaybeSubscribable[js.Any], replacer: js.Function, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJson")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringifyJson(data: MaybeSubscribable[js.Any], replacer: js.Function, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJson")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringifyJson(data: MaybeSubscribable[js.Any], replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJson")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringifyJson(data: MaybeSubscribable[js.Any], replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJson")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toggleDomNodeCssClass(node: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleDomNodeCssClass")(node.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def toggleDomNodeCssClass(node: Element, className: String, shouldHaveClass: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleDomNodeCssClass")(node.asInstanceOf[js.Any], className.asInstanceOf[js.Any], shouldHaveClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def triggerEvent(element: Element, eventType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEvent")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def unwrapObservable[T](value: MaybeSubscribable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapObservable")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  trait ArrayChange[T] extends StObject {
    
    var index: Double
    
    var moved: js.UndefOr[Double] = js.undefined
    
    var status: added | deleted | retained
    
    var value: T
  }
  object ArrayChange {
    
    @scala.inline
    def apply[T](index: Double, status: added | deleted | retained, value: T): ArrayChange[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayChange[T]]
    }
    
    @scala.inline
    implicit class ArrayChangeMutableBuilder[Self <: ArrayChange[?], T] (val x: Self & ArrayChange[T]) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoved(value: Double): Self = StObject.set(x, "moved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
      
      @scala.inline
      def setStatus(value: added | deleted | retained): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type ArrayChanges[T] = js.Array[ArrayChange[T]]
  
  trait CompareArraysOptions extends StObject {
    
    var dontLimitMoves: js.UndefOr[Boolean] = js.undefined
    
    var sparse: js.UndefOr[Boolean] = js.undefined
  }
  object CompareArraysOptions {
    
    @scala.inline
    def apply(): CompareArraysOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompareArraysOptions]
    }
    
    @scala.inline
    implicit class CompareArraysOptionsMutableBuilder[Self <: CompareArraysOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDontLimitMoves(value: Boolean): Self = StObject.set(x, "dontLimitMoves", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDontLimitMovesUndefined: Self = StObject.set(x, "dontLimitMoves", js.undefined)
      
      @scala.inline
      def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
    }
  }
  
  type MappingAfterAddFunction[T] = js.Function3[
    /* arrayEntry */ T, 
    /* nodes */ js.Array[Node], 
    /* index */ Observable_[Double], 
    js.Array[Node]
  ]
  
  type MappingFunction[T] = js.Function3[/* valueToMap */ T, /* index */ Double, /* nodes */ js.Array[Node], js.Array[Node]]
  
  type MappingHookFunction[T] = js.Function3[/* nodes */ js.Array[Node], /* index */ Double, /* arrayEntry */ T, Unit]
  
  trait MappingOptions[T] extends StObject {
    
    var afterAdd: js.UndefOr[MappingHookFunction[T]] = js.undefined
    
    var afterMove: js.UndefOr[MappingHookFunction[T]] = js.undefined
    
    var afterRemove: js.UndefOr[MappingHookFunction[T]] = js.undefined
    
    var beforeMove: js.UndefOr[MappingHookFunction[T]] = js.undefined
    
    var beforeRemove: js.UndefOr[MappingHookFunction[T]] = js.undefined
    
    var dontLimitMoves: js.UndefOr[Boolean] = js.undefined
  }
  object MappingOptions {
    
    @scala.inline
    def apply[T](): MappingOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MappingOptions[T]]
    }
    
    @scala.inline
    implicit class MappingOptionsMutableBuilder[Self <: MappingOptions[?], T] (val x: Self & MappingOptions[T]) extends AnyVal {
      
      @scala.inline
      def setAfterAdd(value: (/* nodes */ js.Array[Node], /* index */ Double, T) => Unit): Self = StObject.set(x, "afterAdd", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAfterAddUndefined: Self = StObject.set(x, "afterAdd", js.undefined)
      
      @scala.inline
      def setAfterMove(value: (/* nodes */ js.Array[Node], /* index */ Double, T) => Unit): Self = StObject.set(x, "afterMove", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAfterMoveUndefined: Self = StObject.set(x, "afterMove", js.undefined)
      
      @scala.inline
      def setAfterRemove(value: (/* nodes */ js.Array[Node], /* index */ Double, T) => Unit): Self = StObject.set(x, "afterRemove", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAfterRemoveUndefined: Self = StObject.set(x, "afterRemove", js.undefined)
      
      @scala.inline
      def setBeforeMove(value: (/* nodes */ js.Array[Node], /* index */ Double, T) => Unit): Self = StObject.set(x, "beforeMove", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBeforeMoveUndefined: Self = StObject.set(x, "beforeMove", js.undefined)
      
      @scala.inline
      def setBeforeRemove(value: (/* nodes */ js.Array[Node], /* index */ Double, T) => Unit): Self = StObject.set(x, "beforeRemove", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBeforeRemoveUndefined: Self = StObject.set(x, "beforeRemove", js.undefined)
      
      @scala.inline
      def setDontLimitMoves(value: Boolean): Self = StObject.set(x, "dontLimitMoves", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDontLimitMovesUndefined: Self = StObject.set(x, "dontLimitMoves", js.undefined)
    }
  }
  
  trait PostJsonOptions extends StObject {
    
    var includeFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var submitter: js.UndefOr[js.Function1[/* form */ HTMLFormElement, Unit]] = js.undefined
  }
  object PostJsonOptions {
    
    @scala.inline
    def apply(): PostJsonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostJsonOptions]
    }
    
    @scala.inline
    implicit class PostJsonOptionsMutableBuilder[Self <: PostJsonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeFields(value: js.Array[String]): Self = StObject.set(x, "includeFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeFieldsUndefined: Self = StObject.set(x, "includeFields", js.undefined)
      
      @scala.inline
      def setIncludeFieldsVarargs(value: String*): Self = StObject.set(x, "includeFields", js.Array(value :_*))
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setSubmitter(value: /* form */ HTMLFormElement => Unit): Self = StObject.set(x, "submitter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubmitterUndefined: Self = StObject.set(x, "submitter", js.undefined)
    }
  }
}
