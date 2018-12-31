package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/////////////////////////////////
@js.native
trait KnockoutStatic extends js.Object {
  var bindingHandlers: KnockoutBindingHandlers = js.native
  /////////////////////////////////
  var bindingProvider: Anon_Instance = js.native
  var components: KnockoutComponents = js.native
  /**
    * Get information about the current computed property during the execution of a computed observable’s evaluator function.
    */
  var computedContext: KnockoutComputedContext = js.native
  @JSName("computed")
  var computed_Original: KnockoutComputedStatic = js.native
  var expressionRewriting: Anon_WriteValueToProperty = js.native
  var extenders: KnockoutExtenders = js.native
  //////////////////////////////////
  // jqueryTmplTemplateEngine.js
  //////////////////////////////////
  var jqueryTmplTemplateEngine: Anon_RenderTemplateSource = js.native
  var memoization: KnockoutMemoization = js.native
  //////////////////////////////////
  // nativeTemplateEngine.js
  //////////////////////////////////
  var nativeTemplateEngine: Anon_InstanceKnockoutNativeTemplateEngine = js.native
  @JSName("observableArray")
  var observableArray_Original: KnockoutObservableArrayStatic = js.native
  @JSName("observable")
  var observable_Original: KnockoutObservableStatic = js.native
  /////////////////////////////////
  // utils.js
  /////////////////////////////////
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.native
  /////////////////////////////////
  // options.js
  /////////////////////////////////
  var options: Anon_UseOnlyNativeEvents = js.native
  /////////////////////////////////
  // selectExtensions.js
  /////////////////////////////////
  var selectExtensions: Anon_ReadValue = js.native
  var subscribable: KnockoutSubscribableStatic = js.native
  /////////////////////////////////
  // tasks.js
  /////////////////////////////////
  var tasks: KnockoutTasks = js.native
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
  def cleanNode(node: stdLib.Node): stdLib.Node = js.native
  /**
    * Creates computed observable
    */
  def computed[T](): KnockoutComputed[T] = js.native
  /**
    * Creates computed observable
    * @param evaluatorFunction Function that computes the observable value
    * @param context Defines the value of 'this' when evaluating the computed observable
    * @param options An object with further properties for the computed observable
    */
  def computed[T](evaluatorFunction: js.Function0[T]): KnockoutComputed[T] = js.native
  def computed[T](evaluatorFunction: js.Function0[T], context: js.Any): KnockoutComputed[T] = js.native
  def computed[T](evaluatorFunction: js.Function0[T], context: js.Any, options: KnockoutComputedOptions[T]): KnockoutComputed[T] = js.native
  /**
    * Creates computed observable
    * @param options An object that defines the computed observable options and behavior
    * @param context Defines the value of 'this' when evaluating the computed observable
    */
  def computed[T](options: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def computed[T](options: KnockoutComputedDefine[T], context: js.Any): KnockoutComputed[T] = js.native
  def contextFor(node: js.Any): js.Any = js.native
  def dataFor(node: js.Any): js.Any = js.native
  def getBindingHandler(handler: java.lang.String): KnockoutBindingHandler[_, _, _] = js.native
  /**
    * Executes a callback function inside a computed observable, without creating a dependecy between it and the observables inside the function
    * @param callback Function to be called.
    * @param callbackTarget Defines the value of 'this' in the callback function
    * @param callbackArgs Arguments for the callback Function
    */
  def ignoreDependencies[T](callback: js.Function0[T]): T = js.native
  def ignoreDependencies[T](callback: js.Function0[T], callbackTarget: js.Any): T = js.native
  def ignoreDependencies[T](callback: js.Function0[T], callbackTarget: js.Any, callbackArgs: js.Any): T = js.native
  /**
    * Determine if argument is a computed observable
    * @param instance Object to be checked
    */
  def isComputed(instance: js.Any): /* is knockout.KnockoutComputed<any> */ scala.Boolean = js.native
  def isComputed[T](instance: T): /* is knockout.KnockoutComputed<T> */ scala.Boolean = js.native
  /**
    * Determine if argument is a computed observable
    * @param instance Object to be checked
    */
  def isComputed[T](instance: KnockoutObservable[T]): /* is knockout.KnockoutComputed<T> */ scala.Boolean = js.native
  /**
    * Determine if argument is an observable. Returns true for observables, observable arrays, and all computed observables.
    * @param instance Object to be checked
    */
  def isObservable(instance: js.Any): /* is knockout.KnockoutObservable<any> */ scala.Boolean = js.native
  def isObservable[T](instance: T): /* is knockout.KnockoutObservable<T> */ scala.Boolean = js.native
  /**
    * Determine if argument is an observable. Returns true for observables, observable arrays, and all computed observables.
    * @param instance Object to be checked
    */
  def isObservable[T](instance: KnockoutObservable[T]): /* is knockout.KnockoutObservable<T> */ scala.Boolean = js.native
  def isSubscribable(instance: js.Any): /* is knockout.KnockoutSubscribable<any> */ scala.Boolean = js.native
  /**
    * Determine if argument is a writable observable. Returns true for observables, observable arrays, and writable computed observables.
    * @param instance Object to be checked
    */
  def isWriteableObservable(instance: js.Any): /* is knockout.KnockoutObservable<any> */ scala.Boolean = js.native
  def isWriteableObservable[T](instance: T): /* is knockout.KnockoutObservable<T> */ scala.Boolean = js.native
  /**
    * Determine if argument is a writable observable. Returns true for observables, observable arrays, and writable computed observables.
    * @param instance Object to be checked
    */
  def isWriteableObservable[T](instance: KnockoutObservable[T]): /* is knockout.KnockoutObservable<T> */ scala.Boolean = js.native
  def observable[T](): KnockoutObservable[T | scala.Null] = js.native
  def observable[T](value: T): KnockoutObservable[T] = js.native
  def observableArray[T](): KnockoutObservableArray[T] = js.native
  def observableArray[T](value: js.Array[T]): KnockoutObservableArray[T] = js.native
  /**
    * Creates a pure computed observable
    * @param evaluatorFunction Function that computes the observable value
    * @param context Defines the value of 'this' when evaluating the computed observable
    */
  def pureComputed[T](evaluatorFunction: js.Function0[T]): KnockoutComputed[T] = js.native
  def pureComputed[T](evaluatorFunction: js.Function0[T], context: js.Any): KnockoutComputed[T] = js.native
  /**
    * Creates a pure computed observable
    * @param options An object that defines the computed observable options and behavior
    * @param context Defines the value of 'this' when evaluating the computed observable
    */
  def pureComputed[T](options: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def pureComputed[T](options: KnockoutComputedDefine[T], context: js.Any): KnockoutComputed[T] = js.native
  def removeNode(node: stdLib.Node): scala.Unit = js.native
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
  def setTemplateEngine(): scala.Unit = js.native
  //////////////////////////////////
  // templating.js
  //////////////////////////////////
  def setTemplateEngine(templateEngine: KnockoutNativeTemplateEngine): scala.Unit = js.native
  def toJS(viewModel: js.Any): js.Any = js.native
  def toJSON(viewModel: js.Any): java.lang.String = js.native
  def toJSON(viewModel: js.Any, replacer: js.Function): java.lang.String = js.native
  def toJSON(viewModel: js.Any, replacer: js.Function, space: js.Any): java.lang.String = js.native
  def unwrap[T](value: T): T = js.native
  def unwrap[T](value: js.Array[T]): js.Array[T] = js.native
  def unwrap[T](value: KnockoutObservable[T]): T = js.native
  def unwrap[T](value: KnockoutObservableArray[T]): js.Array[T] = js.native
}

