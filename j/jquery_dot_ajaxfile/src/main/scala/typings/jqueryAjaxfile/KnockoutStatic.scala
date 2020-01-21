package typings.jqueryAjaxfile

import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/////////////////////////////////
@js.native
trait KnockoutStatic extends js.Object {
  var bindingHandlers: KnockoutBindingHandlers = js.native
  /////////////////////////////////
  var bindingProvider: AnonInstanceKnockoutBindingProvider = js.native
  var components: KnockoutComponents = js.native
  var computedContext: KnockoutComputedContext = js.native
  @JSName("computed")
  var computed_Original: KnockoutComputedStatic = js.native
  var expressionRewriting: AnonBindingRewriteValidators = js.native
  var extenders: KnockoutExtenders = js.native
  //////////////////////////////////
  // jqueryTmplTemplateEngine.js
  //////////////////////////////////
  var jqueryTmplTemplateEngine: AnonAddTemplate = js.native
  var memoization: KnockoutMemoization = js.native
  //////////////////////////////////
  // nativeTemplateEngine.js
  //////////////////////////////////
  var nativeTemplateEngine: AnonInstance = js.native
  @JSName("observableArray")
  var observableArray_Original: KnockoutObservableArrayStatic = js.native
  @JSName("observable")
  var observable_Original: KnockoutObservableStatic = js.native
  /////////////////////////////////
  // selectExtensions.js
  /////////////////////////////////
  var selectExtensions: AnonElementReadValue = js.native
  var subscribable: KnockoutSubscribableStatic = js.native
  //////////////////////////////////
  // templateEngine.js
  //////////////////////////////////
  var templateEngine: AnonKnockoutTemplateEngine = js.native
  //////////////////////////////////
  // templateRewriting.js
  //////////////////////////////////
  var templateRewriting: AnonApplyMemoizedBindingsToNextSibling = js.native
  //////////////////////////////////
  // templateSources.js
  //////////////////////////////////
  var templateSources: KnockoutTemplateSources = js.native
  var utils: KnockoutUtils = js.native
  var virtualElements: KnockoutVirtualElements = js.native
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
  def applyBindings(viewModelOrBindingContext: js.Any): Unit = js.native
  def applyBindings(viewModelOrBindingContext: js.Any, rootNode: js.Any): Unit = js.native
  def applyBindingsToDescendants(viewModelOrBindingContext: js.Any, rootNode: js.Any): Unit = js.native
  def applyBindingsToNode(node: Node, bindings: js.Any): js.Any = js.native
  def applyBindingsToNode(node: Node, bindings: js.Any, viewModelOrBindingContext: js.Any): js.Any = js.native
  def cleanNode(node: Element): Element = js.native
  def computed[T](): KnockoutComputed[T] = js.native
  def computed[T](`def`: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def computed[T](`def`: KnockoutComputedDefine[T], context: js.Any): KnockoutComputed[T] = js.native
  def computed[T](func: js.Function0[T]): KnockoutComputed[T] = js.native
  def computed[T](func: js.Function0[T], context: js.Any): KnockoutComputed[T] = js.native
  def computed[T](func: js.Function0[T], context: js.Any, options: js.Any): KnockoutComputed[T] = js.native
  def contextFor(node: js.Any): js.Any = js.native
  def dataFor(node: js.Any): js.Any = js.native
  def getBindingHandler(handler: String): KnockoutBindingHandler = js.native
  def isComputed(instance: js.Any): Boolean = js.native
  def isObservable(instance: js.Any): Boolean = js.native
  def isSubscribable(instance: js.Any): Boolean = js.native
  def isWriteableObservable(instance: js.Any): Boolean = js.native
  def observable[T](): KnockoutObservable[T] = js.native
  def observable[T](value: T): KnockoutObservable[T] = js.native
  def observableArray[T](): KnockoutObservableArray[T] = js.native
  def observableArray[T](value: js.Array[T]): KnockoutObservableArray[T] = js.native
  def pureComputed[T](evaluatorFunction: js.Function0[T]): KnockoutComputed[T] = js.native
  def pureComputed[T](evaluatorFunction: js.Function0[T], context: js.Any): KnockoutComputed[T] = js.native
  def pureComputed[T](options: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def pureComputed[T](options: KnockoutComputedDefine[T], context: js.Any): KnockoutComputed[T] = js.native
  def removeNode(node: Element): Unit = js.native
  def renderTemplate(template: String, viewModel: js.Any): js.Any = js.native
  def renderTemplate(template: String, viewModel: js.Any, options: js.Any): js.Any = js.native
  def renderTemplate(template: String, viewModel: js.Any, options: js.Any, target: js.Any): js.Any = js.native
  def renderTemplate(template: String, viewModel: js.Any, options: js.Any, target: js.Any, renderMode: js.Any): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: js.Any,
    options: Object,
    targetNodeOrNodeArray: js.Array[Node],
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: js.Any,
    options: Object,
    targetNodeOrNodeArray: Node,
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: KnockoutBindingContext,
    options: Object,
    targetNodeOrNodeArray: js.Array[Node],
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: KnockoutBindingContext,
    options: Object,
    targetNodeOrNodeArray: Node,
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: js.Any,
    options: Object,
    targetNodeOrNodeArray: js.Array[Node],
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: js.Any,
    options: Object,
    targetNodeOrNodeArray: Node,
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: KnockoutBindingContext,
    options: Object,
    targetNodeOrNodeArray: js.Array[Node],
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: KnockoutBindingContext,
    options: Object,
    targetNodeOrNodeArray: Node,
    renderMode: String
  ): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any, options: js.Any): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any, options: js.Any, target: js.Any): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any, options: js.Any, target: js.Any, renderMode: js.Any): js.Any = js.native
  def renderTemplateForEach(
    template: js.Any,
    arrayOrObservableArray: js.Array[_],
    options: Object,
    targetNode: Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  def renderTemplateForEach(
    template: js.Any,
    arrayOrObservableArray: KnockoutObservable[_],
    options: Object,
    targetNode: Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  def renderTemplateForEach(
    template: js.Function,
    arrayOrObservableArray: js.Array[_],
    options: Object,
    targetNode: Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  def renderTemplateForEach(
    template: js.Function,
    arrayOrObservableArray: KnockoutObservable[_],
    options: Object,
    targetNode: Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  //////////////////////////////////
  // templating.js
  //////////////////////////////////
  def setTemplateEngine(templateEngine: KnockoutNativeTemplateEngine): Unit = js.native
  def toJS(viewModel: js.Any): js.Any = js.native
  def toJSON(viewModel: js.Any): String = js.native
  def toJSON(viewModel: js.Any, replacer: js.Function): String = js.native
  def toJSON(viewModel: js.Any, replacer: js.Function, space: js.Any): String = js.native
  def unwrap[T](value: T): T = js.native
  def unwrap[T](value: KnockoutObservable[T]): T = js.native
}

