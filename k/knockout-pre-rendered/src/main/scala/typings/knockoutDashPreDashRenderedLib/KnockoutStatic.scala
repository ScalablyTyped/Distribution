package typings
package knockoutDashPreDashRenderedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/////////////////////////////////
@js.native
trait KnockoutStatic extends js.Object {
  var bindingHandlers: KnockoutBindingHandlers = js.native
  /////////////////////////////////
  var bindingProvider: Anon_InstanceKnockoutBindingProvider = js.native
  var components: KnockoutComponents = js.native
  var computedContext: KnockoutComputedContext = js.native
  @JSName("computed")
  var computed_Original: KnockoutComputedStatic = js.native
  var expressionRewriting: Anon_BindingRewriteValidators = js.native
  var extenders: KnockoutExtenders = js.native
  //////////////////////////////////
  // jqueryTmplTemplateEngine.js
  //////////////////////////////////
  var jqueryTmplTemplateEngine: Anon_AddTemplate = js.native
  var memoization: KnockoutMemoization = js.native
  //////////////////////////////////
  // nativeTemplateEngine.js
  //////////////////////////////////
  var nativeTemplateEngine: Anon_Instance = js.native
  @JSName("observableArray")
  var observableArray_Original: KnockoutObservableArrayStatic = js.native
  @JSName("observable")
  var observable_Original: KnockoutObservableStatic = js.native
  /////////////////////////////////
  // selectExtensions.js
  /////////////////////////////////
  var selectExtensions: Anon_ElementReadValue = js.native
  var subscribable: KnockoutSubscribableStatic = js.native
  //////////////////////////////////
  // templateEngine.js
  //////////////////////////////////
  var templateEngine: Anon_KnockoutTemplateEngine = js.native
  //////////////////////////////////
  // templateRewriting.js
  //////////////////////////////////
  var templateRewriting: Anon_ApplyMemoizedBindingsToNextSibling = js.native
  //////////////////////////////////
  // templateSources.js
  //////////////////////////////////
  var templateSources: KnockoutTemplateSources = js.native
  var utils: KnockoutUtils = js.native
  var virtualElements: KnockoutVirtualElements = js.native
  def applyBindingAccessorsToNode(
    node: stdLib.Node,
    bindings: js.Function2[/* bindingContext */ KnockoutBindingContext, /* node */ stdLib.Node, js.Object],
    bindingContext: KnockoutBindingContext
  ): scala.Unit = js.native
  def applyBindingAccessorsToNode(
    node: stdLib.Node,
    bindings: js.Function2[/* bindingContext */ KnockoutBindingContext, /* node */ stdLib.Node, js.Object],
    viewModel: js.Any
  ): scala.Unit = js.native
  def applyBindingAccessorsToNode(node: stdLib.Node, bindings: js.Object, bindingContext: KnockoutBindingContext): scala.Unit = js.native
  def applyBindingAccessorsToNode(node: stdLib.Node, bindings: js.Object, viewModel: js.Any): scala.Unit = js.native
  def applyBindings(): scala.Unit = js.native
  def applyBindings(viewModelOrBindingContext: js.Any): scala.Unit = js.native
  def applyBindings(viewModelOrBindingContext: js.Any, rootNode: js.Any): scala.Unit = js.native
  def applyBindingsToDescendants(viewModelOrBindingContext: js.Any, rootNode: js.Any): scala.Unit = js.native
  def applyBindingsToNode(node: stdLib.Node, bindings: js.Any): js.Any = js.native
  def applyBindingsToNode(node: stdLib.Node, bindings: js.Any, viewModelOrBindingContext: js.Any): js.Any = js.native
  def cleanNode(node: stdLib.Element): stdLib.Element = js.native
  def computed[T](): KnockoutComputed[T] = js.native
  def computed[T](`def`: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def computed[T](`def`: KnockoutComputedDefine[T], context: js.Any): KnockoutComputed[T] = js.native
  def computed[T](func: js.Function0[T]): KnockoutComputed[T] = js.native
  def computed[T](func: js.Function0[T], context: js.Any): KnockoutComputed[T] = js.native
  def computed[T](func: js.Function0[T], context: js.Any, options: js.Any): KnockoutComputed[T] = js.native
  def contextFor(node: js.Any): js.Any = js.native
  def dataFor(node: js.Any): js.Any = js.native
  def getBindingHandler(handler: java.lang.String): KnockoutBindingHandler = js.native
  def isComputed(instance: js.Any): scala.Boolean = js.native
  def isObservable(instance: js.Any): scala.Boolean = js.native
  def isSubscribable(instance: js.Any): scala.Boolean = js.native
  def isWriteableObservable(instance: js.Any): scala.Boolean = js.native
  def observable[T](): KnockoutObservable[T] = js.native
  def observable[T](value: T): KnockoutObservable[T] = js.native
  def observableArray[T](): KnockoutObservableArray[T] = js.native
  def observableArray[T](value: js.Array[T]): KnockoutObservableArray[T] = js.native
  def pureComputed[T](evaluatorFunction: js.Function0[T]): KnockoutComputed[T] = js.native
  def pureComputed[T](evaluatorFunction: js.Function0[T], context: js.Any): KnockoutComputed[T] = js.native
  def pureComputed[T](options: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def pureComputed[T](options: KnockoutComputedDefine[T], context: js.Any): KnockoutComputed[T] = js.native
  def removeNode(node: stdLib.Element): scala.Unit = js.native
  def renderTemplate(template: java.lang.String, viewModel: js.Any): js.Any = js.native
  def renderTemplate(template: java.lang.String, viewModel: js.Any, options: js.Any): js.Any = js.native
  def renderTemplate(template: java.lang.String, viewModel: js.Any, options: js.Any, target: js.Any): js.Any = js.native
  def renderTemplate(template: java.lang.String, viewModel: js.Any, options: js.Any, target: js.Any, renderMode: js.Any): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: js.Any,
    options: js.Object,
    targetNodeOrNodeArray: js.Array[stdLib.Node],
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: js.Any,
    options: js.Object,
    targetNodeOrNodeArray: stdLib.Node,
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: KnockoutBindingContext,
    options: js.Object,
    targetNodeOrNodeArray: js.Array[stdLib.Node],
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: KnockoutBindingContext,
    options: js.Object,
    targetNodeOrNodeArray: stdLib.Node,
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: js.Any,
    options: js.Object,
    targetNodeOrNodeArray: js.Array[stdLib.Node],
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: js.Any,
    options: js.Object,
    targetNodeOrNodeArray: stdLib.Node,
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: KnockoutBindingContext,
    options: js.Object,
    targetNodeOrNodeArray: js.Array[stdLib.Node],
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: KnockoutBindingContext,
    options: js.Object,
    targetNodeOrNodeArray: stdLib.Node,
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any, options: js.Any): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any, options: js.Any, target: js.Any): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any, options: js.Any, target: js.Any, renderMode: js.Any): js.Any = js.native
  def renderTemplateForEach(
    template: js.Any,
    arrayOrObservableArray: js.Array[_],
    options: js.Object,
    targetNode: stdLib.Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  def renderTemplateForEach(
    template: js.Any,
    arrayOrObservableArray: KnockoutObservable[_],
    options: js.Object,
    targetNode: stdLib.Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  def renderTemplateForEach(
    template: js.Function,
    arrayOrObservableArray: js.Array[_],
    options: js.Object,
    targetNode: stdLib.Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  def renderTemplateForEach(
    template: js.Function,
    arrayOrObservableArray: KnockoutObservable[_],
    options: js.Object,
    targetNode: stdLib.Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  //////////////////////////////////
  // templating.js
  //////////////////////////////////
  def setTemplateEngine(templateEngine: KnockoutNativeTemplateEngine): scala.Unit = js.native
  def toJS(viewModel: js.Any): js.Any = js.native
  def toJSON(viewModel: js.Any): java.lang.String = js.native
  def toJSON(viewModel: js.Any, replacer: js.Function): java.lang.String = js.native
  def toJSON(viewModel: js.Any, replacer: js.Function, space: js.Any): java.lang.String = js.native
  def unwrap[T](value: T): T = js.native
  def unwrap[T](value: KnockoutObservable[T]): T = js.native
}

