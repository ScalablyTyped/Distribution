package typings.jqueryAjaxfile

import typings.jqueryAjaxfile.anon.AddTemplate
import typings.jqueryAjaxfile.anon.ApplyMemoizedBindingsToNextSibling
import typings.jqueryAjaxfile.anon.BindingRewriteValidators
import typings.jqueryAjaxfile.anon.Instance
import typings.jqueryAjaxfile.anon.InstantiableInstance
import typings.jqueryAjaxfile.anon.InstantiableKnockoutTemplateEngine
import typings.jqueryAjaxfile.anon.ReadValue
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    viewModel: Any
  ): Unit = js.native
  def applyBindingAccessorsToNode(node: Node, bindings: js.Object, bindingContext: KnockoutBindingContext): Unit = js.native
  def applyBindingAccessorsToNode(node: Node, bindings: js.Object, viewModel: Any): Unit = js.native
  
  def applyBindings(): Unit = js.native
  def applyBindings(viewModelOrBindingContext: Any): Unit = js.native
  def applyBindings(viewModelOrBindingContext: Any, rootNode: Any): Unit = js.native
  def applyBindings(viewModelOrBindingContext: Unit, rootNode: Any): Unit = js.native
  
  def applyBindingsToDescendants(viewModelOrBindingContext: Any, rootNode: Any): Unit = js.native
  
  def applyBindingsToNode(node: Node, bindings: Any): Any = js.native
  def applyBindingsToNode(node: Node, bindings: Any, viewModelOrBindingContext: Any): Any = js.native
  
  var bindingHandlers: KnockoutBindingHandlers = js.native
  
  /////////////////////////////////
  var bindingProvider: InstantiableInstance = js.native
  
  def cleanNode(node: Element): Element = js.native
  
  var components: KnockoutComponents = js.native
  
  def computed[T](): KnockoutComputed[T] = js.native
  def computed[T](`def`: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def computed[T](`def`: KnockoutComputedDefine[T], context: Any): KnockoutComputed[T] = js.native
  def computed[T](func: js.Function0[T]): KnockoutComputed[T] = js.native
  def computed[T](func: js.Function0[T], context: Any): KnockoutComputed[T] = js.native
  def computed[T](func: js.Function0[T], context: Any, options: Any): KnockoutComputed[T] = js.native
  def computed[T](func: js.Function0[T], context: Unit, options: Any): KnockoutComputed[T] = js.native
  
  var computedContext: KnockoutComputedContext = js.native
  
  @JSName("computed")
  var computed_Original: KnockoutComputedStatic = js.native
  
  def contextFor(node: Any): Any = js.native
  
  def dataFor(node: Any): Any = js.native
  
  var expressionRewriting: BindingRewriteValidators = js.native
  
  var extenders: KnockoutExtenders = js.native
  
  def getBindingHandler(handler: String): KnockoutBindingHandler = js.native
  
  def isComputed(instance: Any): Boolean = js.native
  
  def isObservable(instance: Any): Boolean = js.native
  
  def isSubscribable(instance: Any): Boolean = js.native
  
  def isWriteableObservable(instance: Any): Boolean = js.native
  
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
  
  def pureComputed[T](evaluatorFunction: js.Function0[T]): KnockoutComputed[T] = js.native
  def pureComputed[T](evaluatorFunction: js.Function0[T], context: Any): KnockoutComputed[T] = js.native
  def pureComputed[T](options: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def pureComputed[T](options: KnockoutComputedDefine[T], context: Any): KnockoutComputed[T] = js.native
  
  def removeNode(node: Element): Unit = js.native
  
  def renderTemplate(template: String, viewModel: Any): Any = js.native
  def renderTemplate(template: String, viewModel: Any, options: Any): Any = js.native
  def renderTemplate(template: String, viewModel: Any, options: Any, target: Any): Any = js.native
  def renderTemplate(template: String, viewModel: Any, options: Any, target: Any, renderMode: Any): Any = js.native
  def renderTemplate(template: String, viewModel: Any, options: Any, target: Unit, renderMode: Any): Any = js.native
  def renderTemplate(template: String, viewModel: Any, options: Unit, target: Any): Any = js.native
  def renderTemplate(template: String, viewModel: Any, options: Unit, target: Any, renderMode: Any): Any = js.native
  def renderTemplate(template: String, viewModel: Any, options: Unit, target: Unit, renderMode: Any): Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: Any,
    options: Object,
    targetNodeOrNodeArray: js.Array[Node],
    renderMode: String
  ): Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: Any,
    options: Object,
    targetNodeOrNodeArray: Node,
    renderMode: String
  ): Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: KnockoutBindingContext,
    options: Object,
    targetNodeOrNodeArray: js.Array[Node],
    renderMode: String
  ): Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: KnockoutBindingContext,
    options: Object,
    targetNodeOrNodeArray: Node,
    renderMode: String
  ): Any = js.native
  def renderTemplate(template: js.Function, viewModel: Any): Any = js.native
  def renderTemplate(template: js.Function, viewModel: Any, options: Any): Any = js.native
  def renderTemplate(template: js.Function, viewModel: Any, options: Any, target: Any): Any = js.native
  def renderTemplate(template: js.Function, viewModel: Any, options: Any, target: Any, renderMode: Any): Any = js.native
  def renderTemplate(template: js.Function, viewModel: Any, options: Any, target: Unit, renderMode: Any): Any = js.native
  def renderTemplate(template: js.Function, viewModel: Any, options: Unit, target: Any): Any = js.native
  def renderTemplate(template: js.Function, viewModel: Any, options: Unit, target: Any, renderMode: Any): Any = js.native
  def renderTemplate(template: js.Function, viewModel: Any, options: Unit, target: Unit, renderMode: Any): Any = js.native
  def renderTemplate(
    template: Any,
    dataOrBindingContext: Any,
    options: Object,
    targetNodeOrNodeArray: js.Array[Node],
    renderMode: String
  ): Any = js.native
  def renderTemplate(
    template: Any,
    dataOrBindingContext: Any,
    options: Object,
    targetNodeOrNodeArray: Node,
    renderMode: String
  ): Any = js.native
  def renderTemplate(
    template: Any,
    dataOrBindingContext: KnockoutBindingContext,
    options: Object,
    targetNodeOrNodeArray: js.Array[Node],
    renderMode: String
  ): Any = js.native
  def renderTemplate(
    template: Any,
    dataOrBindingContext: KnockoutBindingContext,
    options: Object,
    targetNodeOrNodeArray: Node,
    renderMode: String
  ): Any = js.native
  
  def renderTemplateForEach(
    template: js.Function,
    arrayOrObservableArray: js.Array[Any],
    options: Object,
    targetNode: Node,
    parentBindingContext: KnockoutBindingContext
  ): Any = js.native
  def renderTemplateForEach(
    template: js.Function,
    arrayOrObservableArray: KnockoutObservable[Any],
    options: Object,
    targetNode: Node,
    parentBindingContext: KnockoutBindingContext
  ): Any = js.native
  def renderTemplateForEach(
    template: Any,
    arrayOrObservableArray: js.Array[Any],
    options: Object,
    targetNode: Node,
    parentBindingContext: KnockoutBindingContext
  ): Any = js.native
  def renderTemplateForEach(
    template: Any,
    arrayOrObservableArray: KnockoutObservable[Any],
    options: Object,
    targetNode: Node,
    parentBindingContext: KnockoutBindingContext
  ): Any = js.native
  
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
  var templateEngine: InstantiableKnockoutTemplateEngine = js.native
  
  //////////////////////////////////
  // templateRewriting.js
  //////////////////////////////////
  var templateRewriting: ApplyMemoizedBindingsToNextSibling = js.native
  
  //////////////////////////////////
  // templateSources.js
  //////////////////////////////////
  var templateSources: KnockoutTemplateSources = js.native
  
  def toJS(viewModel: Any): Any = js.native
  
  def toJSON(viewModel: Any): String = js.native
  def toJSON(viewModel: Any, replacer: js.Function): String = js.native
  def toJSON(viewModel: Any, replacer: js.Function, space: Any): String = js.native
  def toJSON(viewModel: Any, replacer: Unit, space: Any): String = js.native
  
  def unwrap[T](value: T): T = js.native
  def unwrap[T](value: KnockoutObservable[T]): T = js.native
  
  var utils: KnockoutUtils = js.native
  
  var virtualElements: KnockoutVirtualElements = js.native
}
