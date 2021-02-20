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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("knockout", "utils.addOrRemoveItem")
  @js.native
  def addOrRemoveItem[T](array: MaybeObservableArray[T], value: T): js.Array[T] = js.native
  @JSImport("knockout", "utils.addOrRemoveItem")
  @js.native
  def addOrRemoveItem[T](array: MaybeObservableArray[T], value: T, included: Boolean): js.Array[T] = js.native
  
  @JSImport("knockout", "utils.arrayFilter")
  @js.native
  def arrayFilter[T](array: js.Array[T], predicate: js.Function2[/* item */ T, /* index */ Double, Boolean]): js.Array[T] = js.native
  @JSImport("knockout", "utils.arrayFilter")
  @js.native
  def arrayFilter[T](
    array: js.Array[T],
    predicate: js.Function2[/* item */ T, /* index */ Double, Boolean],
    predicateOwner: js.Any
  ): js.Array[T] = js.native
  
  @JSImport("knockout", "utils.arrayFirst")
  @js.native
  def arrayFirst[T](array: js.Array[T], predicate: js.Function2[/* item */ T, /* index */ Double, Boolean]): T = js.native
  @JSImport("knockout", "utils.arrayFirst")
  @js.native
  def arrayFirst[T](
    array: js.Array[T],
    predicate: js.Function2[/* item */ T, /* index */ Double, Boolean],
    predicateOwner: js.Any
  ): T = js.native
  
  @JSImport("knockout", "utils.arrayForEach")
  @js.native
  def arrayForEach[T](array: js.Array[T], action: js.Function2[/* item */ T, /* index */ Double, Unit]): Unit = js.native
  @JSImport("knockout", "utils.arrayForEach")
  @js.native
  def arrayForEach[T](
    array: js.Array[T],
    action: js.Function2[/* item */ T, /* index */ Double, Unit],
    actionOwner: js.Any
  ): Unit = js.native
  
  @JSImport("knockout", "utils.arrayGetDistinctValues")
  @js.native
  def arrayGetDistinctValues[T](array: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("knockout", "utils.arrayIndexOf")
  @js.native
  def arrayIndexOf[T](array: MaybeObservableArray[T], item: T): Double = js.native
  
  @JSImport("knockout", "utils.arrayMap")
  @js.native
  def arrayMap[T, U](array: js.Array[T], mapping: js.Function2[/* item */ T, /* index */ Double, U]): js.Array[U] = js.native
  @JSImport("knockout", "utils.arrayMap")
  @js.native
  def arrayMap[T, U](
    array: js.Array[T],
    mapping: js.Function2[/* item */ T, /* index */ Double, U],
    mappingOwner: js.Any
  ): js.Array[U] = js.native
  
  @JSImport("knockout", "utils.arrayPushAll")
  @js.native
  def arrayPushAll[T](array: MaybeObservableArray[T], valuesToPush: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("knockout", "utils.arrayRemoveItem")
  @js.native
  def arrayRemoveItem[T](array: MaybeObservableArray[T], itemToRemove: T): Unit = js.native
  
  @JSImport("knockout", "utils.compareArrays")
  @js.native
  def compareArrays[T](a: js.Array[T], b: js.Array[T]): ArrayChanges[T] = js.native
  @JSImport("knockout", "utils.compareArrays")
  @js.native
  def compareArrays[T](a: js.Array[T], b: js.Array[T], dontLimitMoves: Boolean): ArrayChanges[T] = js.native
  @JSImport("knockout", "utils.compareArrays")
  @js.native
  def compareArrays[T](a: js.Array[T], b: js.Array[T], options: CompareArraysOptions): ArrayChanges[T] = js.native
  
  object domData {
    
    @JSImport("knockout", "utils.domData.clear")
    @js.native
    def clear(node: Node): Boolean = js.native
    
    @JSImport("knockout", "utils.domData.get")
    @js.native
    def get[T](node: Node, key: String): T = js.native
    
    @JSImport("knockout", "utils.domData.set")
    @js.native
    def set[T](node: Node, key: String, value: T): Unit = js.native
  }
  
  object domNodeDisposal {
    
    @JSImport("knockout", "utils.domNodeDisposal.addDisposeCallback")
    @js.native
    def addDisposeCallback(node: Node, callback: js.Function1[/* node */ Node, Unit]): Unit = js.native
    
    @JSImport("knockout", "utils.domNodeDisposal.cleanExternalData")
    @js.native
    def cleanExternalData(node: Node): Unit = js.native
    
    @JSImport("knockout", "utils.domNodeDisposal.removeDisposeCallback")
    @js.native
    def removeDisposeCallback(node: Node, callback: js.Function1[/* node */ Node, Unit]): Unit = js.native
  }
  
  @JSImport("knockout", "utils.extend")
  @js.native
  def extend[T, U](target: T, source: U): T with U = js.native
  
  @JSImport("knockout", "utils.fieldsIncludedWithJsonPost")
  @js.native
  val fieldsIncludedWithJsonPost: js.Array[String | RegExp] = js.native
  
  @JSImport("knockout", "utils.getFormFields")
  @js.native
  def getFormFields(form: HTMLFormElement, fieldName: String): js.Array[_] = js.native
  @JSImport("knockout", "utils.getFormFields")
  @js.native
  def getFormFields(form: HTMLFormElement, fieldName: RegExp): js.Array[_] = js.native
  
  @JSImport("knockout", "utils.objectForEach")
  @js.native
  def objectForEach(obj: js.Object, action: js.Function2[/* key */ String, /* value */ js.Any, Unit]): Unit = js.native
  @JSImport("knockout", "utils.objectForEach")
  @js.native
  def objectForEach[T](obj: StringDictionary[T], action: js.Function2[/* key */ String, /* value */ T, Unit]): Unit = js.native
  
  @JSImport("knockout", "utils.parseHtmlFragment")
  @js.native
  def parseHtmlFragment(html: String): js.Array[Node] = js.native
  @JSImport("knockout", "utils.parseHtmlFragment")
  @js.native
  def parseHtmlFragment(html: String, documentContext: Document): js.Array[Node] = js.native
  
  @JSImport("knockout", "utils.parseJson")
  @js.native
  def parseJson(jsonString: String): js.Any = js.native
  @JSImport("knockout", "utils.parseJson")
  @js.native
  def parseJson_T_T[T](jsonString: String): T = js.native
  
  @JSImport("knockout", "utils.peekObservable")
  @js.native
  def peekObservable[T](value: MaybeSubscribable[T]): T = js.native
  
  @JSImport("knockout", "utils.postJson")
  @js.native
  def postJson(urlOrForm: String, data: MaybeSubscribable[js.Object]): Unit = js.native
  @JSImport("knockout", "utils.postJson")
  @js.native
  def postJson(urlOrForm: String, data: MaybeSubscribable[js.Object], options: PostJsonOptions): Unit = js.native
  @JSImport("knockout", "utils.postJson")
  @js.native
  def postJson(urlOrForm: HTMLFormElement, data: MaybeSubscribable[js.Object]): Unit = js.native
  @JSImport("knockout", "utils.postJson")
  @js.native
  def postJson(urlOrForm: HTMLFormElement, data: MaybeSubscribable[js.Object], options: PostJsonOptions): Unit = js.native
  
  @JSImport("knockout", "utils.range")
  @js.native
  def range(min: MaybeSubscribable[Double], max: MaybeSubscribable[Double]): js.Array[Double] = js.native
  
  @JSImport("knockout", "utils.registerEventHandler")
  @js.native
  def registerEventHandler(element: Element, eventType: String, handler: EventListener): Unit = js.native
  
  @JSImport("knockout", "utils.setDomNodeChildrenFromArrayMapping")
  @js.native
  def setDomNodeChildrenFromArrayMapping[T](domNode: Node, array: js.Array[T], mapping: MappingFunction[T]): Unit = js.native
  @JSImport("knockout", "utils.setDomNodeChildrenFromArrayMapping")
  @js.native
  def setDomNodeChildrenFromArrayMapping[T](
    domNode: Node,
    array: js.Array[T],
    mapping: MappingFunction[T],
    options: js.UndefOr[scala.Nothing],
    callbackAfterAddingNodes: MappingAfterAddFunction[T]
  ): Unit = js.native
  @JSImport("knockout", "utils.setDomNodeChildrenFromArrayMapping")
  @js.native
  def setDomNodeChildrenFromArrayMapping[T](domNode: Node, array: js.Array[T], mapping: MappingFunction[T], options: MappingOptions[T]): Unit = js.native
  @JSImport("knockout", "utils.setDomNodeChildrenFromArrayMapping")
  @js.native
  def setDomNodeChildrenFromArrayMapping[T](
    domNode: Node,
    array: js.Array[T],
    mapping: MappingFunction[T],
    options: MappingOptions[T],
    callbackAfterAddingNodes: MappingAfterAddFunction[T]
  ): Unit = js.native
  
  @JSImport("knockout", "utils.setHtml")
  @js.native
  def setHtml(node: Node, html: MaybeSubscribable[String]): Unit = js.native
  
  @JSImport("knockout", "utils.setTextContent")
  @js.native
  def setTextContent(element: Node, textContent: MaybeSubscribable[String]): Unit = js.native
  
  @JSImport("knockout", "utils.stringifyJson")
  @js.native
  def stringifyJson(data: MaybeSubscribable[_]): String = js.native
  @JSImport("knockout", "utils.stringifyJson")
  @js.native
  def stringifyJson(data: MaybeSubscribable[_], replacer: js.UndefOr[scala.Nothing], space: String): String = js.native
  @JSImport("knockout", "utils.stringifyJson")
  @js.native
  def stringifyJson(data: MaybeSubscribable[_], replacer: js.UndefOr[scala.Nothing], space: Double): String = js.native
  @JSImport("knockout", "utils.stringifyJson")
  @js.native
  def stringifyJson(data: MaybeSubscribable[_], replacer: js.Function): String = js.native
  @JSImport("knockout", "utils.stringifyJson")
  @js.native
  def stringifyJson(data: MaybeSubscribable[_], replacer: js.Function, space: String): String = js.native
  @JSImport("knockout", "utils.stringifyJson")
  @js.native
  def stringifyJson(data: MaybeSubscribable[_], replacer: js.Function, space: Double): String = js.native
  
  @JSImport("knockout", "utils.toggleDomNodeCssClass")
  @js.native
  def toggleDomNodeCssClass(node: Element, className: String): Unit = js.native
  @JSImport("knockout", "utils.toggleDomNodeCssClass")
  @js.native
  def toggleDomNodeCssClass(node: Element, className: String, shouldHaveClass: Boolean): Unit = js.native
  
  @JSImport("knockout", "utils.triggerEvent")
  @js.native
  def triggerEvent(element: Element, eventType: String): Unit = js.native
  
  @JSImport("knockout", "utils.unwrapObservable")
  @js.native
  def unwrapObservable[T](value: MaybeSubscribable[T]): T = js.native
  
  @js.native
  trait ArrayChange[T] extends StObject {
    
    var index: Double = js.native
    
    var moved: js.UndefOr[Double] = js.native
    
    var status: added | deleted | retained = js.native
    
    var value: T = js.native
  }
  object ArrayChange {
    
    @scala.inline
    def apply[T](index: Double, status: added | deleted | retained, value: T): ArrayChange[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayChange[T]]
    }
    
    @scala.inline
    implicit class ArrayChangeMutableBuilder[Self <: ArrayChange[_], T] (val x: Self with ArrayChange[T]) extends AnyVal {
      
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
  
  @js.native
  trait CompareArraysOptions extends StObject {
    
    var dontLimitMoves: js.UndefOr[Boolean] = js.native
    
    var sparse: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait MappingOptions[T] extends StObject {
    
    var afterAdd: js.UndefOr[MappingHookFunction[T]] = js.native
    
    var afterMove: js.UndefOr[MappingHookFunction[T]] = js.native
    
    var afterRemove: js.UndefOr[MappingHookFunction[T]] = js.native
    
    var beforeMove: js.UndefOr[MappingHookFunction[T]] = js.native
    
    var beforeRemove: js.UndefOr[MappingHookFunction[T]] = js.native
    
    var dontLimitMoves: js.UndefOr[Boolean] = js.native
  }
  object MappingOptions {
    
    @scala.inline
    def apply[T](): MappingOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MappingOptions[T]]
    }
    
    @scala.inline
    implicit class MappingOptionsMutableBuilder[Self <: MappingOptions[_], T] (val x: Self with MappingOptions[T]) extends AnyVal {
      
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
  
  @js.native
  trait PostJsonOptions extends StObject {
    
    var includeFields: js.UndefOr[js.Array[String]] = js.native
    
    var params: js.UndefOr[js.Object] = js.native
    
    var submitter: js.UndefOr[js.Function1[/* form */ HTMLFormElement, Unit]] = js.native
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
