package typings.knockoutPaging

import typings.knockoutPaging.anon.AddTemplate
import typings.knockoutPaging.anon.ApplyMemoizedBindingsToNextSibling
import typings.knockoutPaging.anon.BindingRewriteValidators
import typings.knockoutPaging.anon.Instance
import typings.knockoutPaging.anon.Instantiable
import typings.knockoutPaging.anon.InstantiableInstance
import typings.knockoutPaging.anon.ReadValue
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////////
@js.native
trait KnockoutStatic extends StObject {
  
  def applyBindingAccessorsToNode(
    node: Node,
    bindings: js.Function2[/* bindingContext */ KnockoutBindingContext, /* node */ Node, js.Object],
    bindingContext: KnockoutBindingContext
  ): Unit = js.native
  def applyBindingAccessorsToNode(
    node: Node,
    bindings: js.Function2[/* bindingContext */ KnockoutBindingContext, /* node */ Node, js.Object],
    viewModel: js.Any
  ): Unit = js.native
  def applyBindingAccessorsToNode(node: Node, bindings: js.Object, bindingContext: KnockoutBindingContext): Unit = js.native
  def applyBindingAccessorsToNode(node: Node, bindings: js.Object, viewModel: js.Any): Unit = js.native
  
  def applyBindings(): Unit = js.native
  def applyBindings(viewModelOrBindingContext: js.UndefOr[scala.Nothing], rootNode: js.Any): Unit = js.native
  def applyBindings(viewModelOrBindingContext: js.Any): Unit = js.native
  def applyBindings(viewModelOrBindingContext: js.Any, rootNode: js.Any): Unit = js.native
  
  def applyBindingsToDescendants(viewModelOrBindingContext: js.Any, rootNode: js.Any): Unit = js.native
  
  def applyBindingsToNode(node: Node, bindings: js.Any): js.Any = js.native
  def applyBindingsToNode(node: Node, bindings: js.Any, viewModelOrBindingContext: js.Any): js.Any = js.native
  
  var bindingHandlers: KnockoutBindingHandlers = js.native
  
  /////////////////////////////////
  var bindingProvider: InstantiableInstance = js.native
  
  def cleanNode(node: Element): Element = js.native
  
  var components: KnockoutComponents = js.native
  
  def computed[T](): KnockoutComputed[T] = js.native
  def computed[T](`def`: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def computed[T](`def`: KnockoutComputedDefine[T], context: js.Any): KnockoutComputed[T] = js.native
  def computed[T](func: js.Function0[T]): KnockoutComputed[T] = js.native
  def computed[T](func: js.Function0[T], context: js.UndefOr[scala.Nothing], options: js.Any): KnockoutComputed[T] = js.native
  def computed[T](func: js.Function0[T], context: js.Any): KnockoutComputed[T] = js.native
  def computed[T](func: js.Function0[T], context: js.Any, options: js.Any): KnockoutComputed[T] = js.native
  
  var computedContext: KnockoutComputedContext = js.native
  
  @JSName("computed")
  var computed_Original: KnockoutComputedStatic = js.native
  
  def contextFor(node: js.Any): js.Any = js.native
  
  def dataFor(node: js.Any): js.Any = js.native
  
  var expressionRewriting: BindingRewriteValidators = js.native
  
  var extenders: KnockoutExtenders = js.native
  
  def getBindingHandler(handler: String): KnockoutBindingHandler = js.native
  
  def isComputed(instance: js.Any): Boolean = js.native
  
  def isObservable(instance: js.Any): Boolean = js.native
  
  def isSubscribable(instance: js.Any): Boolean = js.native
  
  def isWriteableObservable(instance: js.Any): Boolean = js.native
  
  //////////////////////////////////
  // jqueryTmplTemplateEngine.js
  //////////////////////////////////
  var jqueryTmplTemplateEngine: AddTemplate = js.native
  
  var memoization: KnockoutMemoization = js.native
  
  //////////////////////////////////
  // nativeTemplateEngine.js
  //////////////////////////////////
  var nativeTemplateEngine: Instance = js.native
  
  def observable[T](): KnockoutObservable[T] = js.native
  def observable[T](value: T): KnockoutObservable[T] = js.native
  
  def observableArray[T](): KnockoutObservableArray[T] = js.native
  def observableArray[T](value: js.Array[T]): KnockoutObservableArray[T] = js.native
  @JSName("observableArray")
  var observableArray_Original: KnockoutObservableArrayStatic = js.native
  
  @JSName("observable")
  var observable_Original: KnockoutObservableStatic = js.native
  
  def pagedObservableArray[T](): KnockoutPagedObservableArray[T] = js.native
  def pagedObservableArray[T](initialValue: js.UndefOr[scala.Nothing], options: KnockoutPagedOptions): KnockoutPagedObservableArray[T] = js.native
  def pagedObservableArray[T](initialValue: js.Array[T]): KnockoutPagedObservableArray[T] = js.native
  def pagedObservableArray[T](initialValue: js.Array[T], options: KnockoutPagedOptions): KnockoutPagedObservableArray[T] = js.native
  
  var paging: KnockoutPagingOptions = js.native
  
  def pureComputed[T](evaluatorFunction: js.Function0[T]): KnockoutComputed[T] = js.native
  def pureComputed[T](evaluatorFunction: js.Function0[T], context: js.Any): KnockoutComputed[T] = js.native
  def pureComputed[T](options: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def pureComputed[T](options: KnockoutComputedDefine[T], context: js.Any): KnockoutComputed[T] = js.native
  
  def removeNode(node: Element): Unit = js.native
  
  def renderTemplate(template: String, viewModel: js.Any): js.Any = js.native
  def renderTemplate(
    template: String,
    viewModel: js.Any,
    options: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    renderMode: js.Any
  ): js.Any = js.native
  def renderTemplate(template: String, viewModel: js.Any, options: js.UndefOr[scala.Nothing], target: js.Any): js.Any = js.native
  def renderTemplate(
    template: String,
    viewModel: js.Any,
    options: js.UndefOr[scala.Nothing],
    target: js.Any,
    renderMode: js.Any
  ): js.Any = js.native
  def renderTemplate(template: String, viewModel: js.Any, options: js.Any): js.Any = js.native
  def renderTemplate(
    template: String,
    viewModel: js.Any,
    options: js.Any,
    target: js.UndefOr[scala.Nothing],
    renderMode: js.Any
  ): js.Any = js.native
  def renderTemplate(template: String, viewModel: js.Any, options: js.Any, target: js.Any): js.Any = js.native
  def renderTemplate(template: String, viewModel: js.Any, options: js.Any, target: js.Any, renderMode: js.Any): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: js.Any,
    options: js.Object,
    targetNodeOrNodeArray: js.Array[Node],
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: js.Any,
    options: js.Object,
    targetNodeOrNodeArray: Node,
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: KnockoutBindingContext,
    options: js.Object,
    targetNodeOrNodeArray: js.Array[Node],
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: KnockoutBindingContext,
    options: js.Object,
    targetNodeOrNodeArray: Node,
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: js.Any,
    options: js.Object,
    targetNodeOrNodeArray: js.Array[Node],
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: js.Any,
    options: js.Object,
    targetNodeOrNodeArray: Node,
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: KnockoutBindingContext,
    options: js.Object,
    targetNodeOrNodeArray: js.Array[Node],
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: KnockoutBindingContext,
    options: js.Object,
    targetNodeOrNodeArray: Node,
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    viewModel: js.Any,
    options: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    renderMode: js.Any
  ): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any, options: js.UndefOr[scala.Nothing], target: js.Any): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    viewModel: js.Any,
    options: js.UndefOr[scala.Nothing],
    target: js.Any,
    renderMode: js.Any
  ): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any, options: js.Any): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    viewModel: js.Any,
    options: js.Any,
    target: js.UndefOr[scala.Nothing],
    renderMode: js.Any
  ): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any, options: js.Any, target: js.Any): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any, options: js.Any, target: js.Any, renderMode: js.Any): js.Any = js.native
  
  def renderTemplateForEach(
    template: js.Any,
    arrayOrObservableArray: js.Array[_],
    options: js.Object,
    targetNode: Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  def renderTemplateForEach(
    template: js.Any,
    arrayOrObservableArray: KnockoutObservable[_],
    options: js.Object,
    targetNode: Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  def renderTemplateForEach(
    template: js.Function,
    arrayOrObservableArray: js.Array[_],
    options: js.Object,
    targetNode: Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  def renderTemplateForEach(
    template: js.Function,
    arrayOrObservableArray: KnockoutObservable[_],
    options: js.Object,
    targetNode: Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  
  /////////////////////////////////
  // selectExtensions.js
  /////////////////////////////////
  var selectExtensions: ReadValue = js.native
  
  //////////////////////////////////
  // templating.js
  //////////////////////////////////
  def setTemplateEngine(templateEngine: KnockoutNativeTemplateEngine): Unit = js.native
  
  var subscribable: KnockoutSubscribableStatic = js.native
  
  //////////////////////////////////
  // templateEngine.js
  //////////////////////////////////
  var templateEngine: Instantiable = js.native
  
  //////////////////////////////////
  // templateRewriting.js
  //////////////////////////////////
  var templateRewriting: ApplyMemoizedBindingsToNextSibling = js.native
  
  //////////////////////////////////
  // templateSources.js
  //////////////////////////////////
  var templateSources: KnockoutTemplateSources = js.native
  
  def toJS(viewModel: js.Any): js.Any = js.native
  
  def toJSON(viewModel: js.Any): String = js.native
  def toJSON(viewModel: js.Any, replacer: js.UndefOr[scala.Nothing], space: js.Any): String = js.native
  def toJSON(viewModel: js.Any, replacer: js.Function): String = js.native
  def toJSON(viewModel: js.Any, replacer: js.Function, space: js.Any): String = js.native
  
  def unwrap[T](value: T): T = js.native
  def unwrap[T](value: KnockoutObservable[T]): T = js.native
  
  var utils: KnockoutUtils = js.native
  
  var virtualElements: KnockoutVirtualElements = js.native
}
