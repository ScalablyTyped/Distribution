package typings.knockout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsExtenders[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: knockout.knockout.Extender<knockout.knockout.Subscribable<any>, T[P]>}
    */ typings.knockout.knockoutStrings.AsExtenders with org.scalablytyped.runtime.TopLevel[T]
  
  type BindingAccessors = org.scalablytyped.runtime.StringDictionary[js.Function]
  
  type BindingContextExtendCallback[T] = js.Function3[
    /* self */ typings.knockout.mod.BindingContext[T], 
    /* parentContext */ typings.knockout.mod.BindingContext[T] | scala.Null, 
    /* dataItem */ T, 
    scala.Unit
  ]
  
  type BindingHandlerAddBinding = js.Function2[/* name */ java.lang.String, /* value */ js.Any, scala.Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.knockout.mod.Subscribable_[T]
    - typings.knockout.mod.Observable_[T]
    - typings.knockout.mod.Computed_[T]
    - js.ThisFunction0[/ * this * / TTarget, T]
  */
  type ComputedReadFunction[T, TTarget] = (typings.knockout.mod._ComputedReadFunction[T, TTarget]) | typings.knockout.mod.Subscribable_[T] | (js.ThisFunction0[/* this */ TTarget, T])
  
  type ComputedWriteFunction[T, TTarget] = js.ThisFunction1[/* this */ TTarget, /* val */ T, scala.Unit]
  
  type Extender[T /* <: typings.knockout.mod.Subscribable_[_] */, O] = js.Function2[/* target */ T, /* options */ O, T]
  
  type Flatten[T] = T
  
  type MaybeComputed[T] = T | typings.knockout.mod.Computed_[T]
  
  type MaybeObservable[T] = T | typings.knockout.mod.Observable_[T]
  
  type MaybeObservableArray[T] = js.Array[T] | typings.knockout.mod.ObservableArray_[T]
  
  type MaybeSubscribable[T] = T | typings.knockout.mod.Subscribable_[T]
  
  type PureComputed_[T] = typings.knockout.mod.Computed_[T]
  
  type RateLimitMethod = js.Function3[
    /* callback */ js.Function0[scala.Unit], 
    /* timeout */ scala.Double, 
    /* options */ js.Any, 
    js.Function0[scala.Unit]
  ]
  
  type Subscribable_[T] = typings.knockout.mod.SubscribableFunctions[T]
  
  type SubscriptionCallback[T, TTarget] = js.ThisFunction1[/* this */ TTarget, /* val */ T, scala.Unit]
  
  //#endregion
  //#region subscribables/mappingHelpers.js
  type Unwrapped[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias knockout.knockout.Unwrapped<T[P]> * / object}
    */ typings.knockout.knockoutStrings.Unwrapped with org.scalablytyped.runtime.TopLevel[js.Any])
  
  @scala.inline
  def applyBindingAccessorsToNode[T](
    node: typings.std.Node,
    bindings: js.Function0[typings.knockout.mod.BindingAccessors],
    viewModel: T
  ): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingAccessorsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingAccessorsToNode[T](
    node: typings.std.Node,
    bindings: js.Function0[typings.knockout.mod.BindingAccessors],
    viewModel: typings.knockout.mod.BindingContext[T]
  ): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingAccessorsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingAccessorsToNode[T](node: typings.std.Node, bindings: typings.knockout.mod.BindingAccessors, viewModel: T): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingAccessorsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingAccessorsToNode[T](
    node: typings.std.Node,
    bindings: typings.knockout.mod.BindingAccessors,
    viewModel: typings.knockout.mod.BindingContext[T]
  ): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingAccessorsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def applyBindings[T](bindingContext: T): scala.Unit = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindings[T](
    bindingContext: T,
    rootNode: scala.Null,
    extendCallback: typings.knockout.mod.BindingContextExtendCallback[T]
  ): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any], extendCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindings[T](bindingContext: T, rootNode: typings.std.Node): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindings[T](
    bindingContext: T,
    rootNode: typings.std.Node,
    extendCallback: typings.knockout.mod.BindingContextExtendCallback[T]
  ): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any], extendCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindings[T](bindingContext: typings.knockout.mod.BindingContext[T]): scala.Unit = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindings[T](
    bindingContext: typings.knockout.mod.BindingContext[T],
    rootNode: scala.Null,
    extendCallback: typings.knockout.mod.BindingContextExtendCallback[T]
  ): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any], extendCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindings[T](bindingContext: typings.knockout.mod.BindingContext[T], rootNode: typings.std.Node): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindings[T](
    bindingContext: typings.knockout.mod.BindingContext[T],
    rootNode: typings.std.Node,
    extendCallback: typings.knockout.mod.BindingContextExtendCallback[T]
  ): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any], extendCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def applyBindingsToDescendants[T](bindingContext: T): scala.Unit = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToDescendants")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingsToDescendants[T](bindingContext: T, rootNode: typings.std.Node): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToDescendants")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingsToDescendants[T](bindingContext: typings.knockout.mod.BindingContext[T]): scala.Unit = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToDescendants")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingsToDescendants[T](bindingContext: typings.knockout.mod.BindingContext[T], rootNode: typings.std.Node): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToDescendants")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def applyBindingsToNode[T](node: typings.std.Node, bindings: js.Function0[js.Object], viewModel: T): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingsToNode[T](
    node: typings.std.Node,
    bindings: js.Function0[js.Object],
    viewModel: typings.knockout.mod.BindingContext[T]
  ): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingsToNode[T](node: typings.std.Node, bindings: js.Object, viewModel: T): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingsToNode[T](node: typings.std.Node, bindings: js.Object, viewModel: typings.knockout.mod.BindingContext[T]): scala.Unit = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def bindingHandlers: typings.knockout.mod.BindingHandlers_ = typings.knockout.mod.^.asInstanceOf[js.Dynamic].selectDynamic("bindingHandlers").asInstanceOf[typings.knockout.mod.BindingHandlers_]
  
  @scala.inline
  def cleanNode(node: typings.std.Node): js.Any = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cleanNode")(node.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def computedContext: typings.knockout.mod.ComputedContext_ = typings.knockout.mod.^.asInstanceOf[js.Dynamic].selectDynamic("computedContext").asInstanceOf[typings.knockout.mod.ComputedContext_]
  
  @scala.inline
  def contextFor[T](node: typings.std.Node): typings.knockout.mod.BindingContext[T] = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("contextFor")(node.asInstanceOf[js.Any]).asInstanceOf[typings.knockout.mod.BindingContext[T]]
  
  @scala.inline
  def dataFor[T](node: typings.std.Node): T = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dataFor")(node.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def extenders: typings.knockout.mod.Extenders_[js.Any] = typings.knockout.mod.^.asInstanceOf[js.Dynamic].selectDynamic("extenders").asInstanceOf[typings.knockout.mod.Extenders_[js.Any]]
  
  @scala.inline
  def getBindingHandler(handler: java.lang.String): typings.knockout.mod.BindingHandler[_] = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBindingHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[typings.knockout.mod.BindingHandler[_]]
  
  @scala.inline
  def ignoreDependencies[Return, Target, Args /* <: js.Array[_] */](callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return]): Return = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ignoreDependencies")(callback.asInstanceOf[js.Any]).asInstanceOf[Return]
  @scala.inline
  def ignoreDependencies[Return, Target, Args /* <: js.Array[_] */](callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return], callbackTarget: Target): Return = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ignoreDependencies")(callback.asInstanceOf[js.Any], callbackTarget.asInstanceOf[js.Any])).asInstanceOf[Return]
  @scala.inline
  def ignoreDependencies[Return, Target, Args /* <: js.Array[_] */](
    callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return],
    callbackTarget: Target,
    callbackArgs: Args
  ): Return = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ignoreDependencies")(callback.asInstanceOf[js.Any], callbackTarget.asInstanceOf[js.Any], callbackArgs.asInstanceOf[js.Any])).asInstanceOf[Return]
  @scala.inline
  def ignoreDependencies[Return, Target, Args /* <: js.Array[_] */](
    callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return],
    callbackTarget: js.UndefOr[scala.Nothing],
    callbackArgs: Args
  ): Return = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ignoreDependencies")(callback.asInstanceOf[js.Any], callbackTarget.asInstanceOf[js.Any], callbackArgs.asInstanceOf[js.Any])).asInstanceOf[Return]
  
  @scala.inline
  def isComputed[T](instance: js.Any): /* is knockout.knockout.Computed<T> */ scala.Boolean = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isComputed")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.Computed<T> */ scala.Boolean]
  
  @scala.inline
  def isObservable[T](instance: js.Any): /* is knockout.knockout.Observable<T> */ scala.Boolean = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.Observable<T> */ scala.Boolean]
  
  @scala.inline
  def isObservableArray[T](instance: js.Any): /* is knockout.knockout.ObservableArray<T> */ scala.Boolean = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isObservableArray")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.ObservableArray<T> */ scala.Boolean]
  
  @scala.inline
  def isPureComputed[T](instance: js.Any): /* is knockout.knockout.PureComputed<T> */ scala.Boolean = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPureComputed")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.PureComputed<T> */ scala.Boolean]
  
  @scala.inline
  def isSubscribable[T](instance: js.Any): /* is knockout.knockout.Subscribable<T> */ scala.Boolean = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isSubscribable")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.Subscribable<T> */ scala.Boolean]
  
  @scala.inline
  def isWritableObservable[T](instance: js.Any): /* is knockout.knockout.Observable<T> */ scala.Boolean = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isWritableObservable")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.Observable<T> */ scala.Boolean]
  
  @scala.inline
  def isWriteableObservable[T](instance: js.Any): /* is knockout.knockout.Observable<T> */ scala.Boolean = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isWriteableObservable")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.Observable<T> */ scala.Boolean]
  
  @scala.inline
  def onError(error: typings.std.Error): scala.Unit = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onError")(error.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def options: typings.knockout.mod.Options_ = typings.knockout.mod.^.asInstanceOf[js.Dynamic].selectDynamic("options").asInstanceOf[typings.knockout.mod.Options_]
  
  @scala.inline
  def pureComputed[T](evaluator: typings.knockout.mod.ComputedReadFunction[T, scala.Unit]): typings.knockout.mod.PureComputed_[T] = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pureComputed")(evaluator.asInstanceOf[js.Any]).asInstanceOf[typings.knockout.mod.PureComputed_[T]]
  @scala.inline
  def pureComputed[T, TTarget](evaluator: typings.knockout.mod.ComputedReadFunction[T, TTarget], evaluatorTarget: TTarget): typings.knockout.mod.PureComputed_[T] = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pureComputed")(evaluator.asInstanceOf[js.Any], evaluatorTarget.asInstanceOf[js.Any])).asInstanceOf[typings.knockout.mod.PureComputed_[T]]
  @scala.inline
  def pureComputed[T, TTarget](options: typings.knockout.mod.ComputedOptions[T, TTarget]): typings.knockout.mod.PureComputed_[T] = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pureComputed")(options.asInstanceOf[js.Any]).asInstanceOf[typings.knockout.mod.PureComputed_[T]]
  
  @scala.inline
  def removeNode(node: typings.std.Node): scala.Unit = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeNode")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def renderTemplate(template: java.lang.String): java.lang.String = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate(template: js.Function0[java.lang.String | typings.std.Node]): java.lang.String = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate(template: typings.std.Node): java.lang.String = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: java.lang.String | typings.std.Node | (js.Function0[java.lang.String | typings.std.Node]),
    dataOrBindingContext: js.UndefOr[T | typings.knockout.mod.BindingContext[T] | scala.Null],
    options: js.UndefOr[typings.knockout.mod.TemplateOptions[T] | scala.Null],
    targetNodeOrNodeArray: typings.std.Node | js.Array[typings.std.Node],
    renderMode: js.UndefOr[
      typings.knockout.knockoutStrings.replaceChildren | typings.knockout.knockoutStrings.replaceNode | typings.knockout.knockoutStrings.ignoreTargetNode
    ]
  ): typings.knockout.mod.Computed_[scala.Unit] = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetNodeOrNodeArray.asInstanceOf[js.Any], renderMode.asInstanceOf[js.Any])).asInstanceOf[typings.knockout.mod.Computed_[scala.Unit]]
  @scala.inline
  def renderTemplate[T](template: java.lang.String, dataOrBindingContext: T): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: java.lang.String,
    dataOrBindingContext: T,
    options: typings.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: java.lang.String,
    dataOrBindingContext: js.UndefOr[scala.Nothing],
    options: typings.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: java.lang.String,
    dataOrBindingContext: scala.Null,
    options: typings.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](template: java.lang.String, dataOrBindingContext: typings.knockout.mod.BindingContext[T]): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: java.lang.String,
    dataOrBindingContext: typings.knockout.mod.BindingContext[T],
    options: typings.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](template: js.Function0[typings.std.Node | java.lang.String], dataOrBindingContext: T): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: js.Function0[java.lang.String | typings.std.Node],
    dataOrBindingContext: T,
    options: typings.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: js.Function0[java.lang.String | typings.std.Node],
    dataOrBindingContext: js.UndefOr[scala.Nothing],
    options: typings.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: js.Function0[java.lang.String | typings.std.Node],
    dataOrBindingContext: scala.Null,
    options: typings.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: js.Function0[typings.std.Node | java.lang.String],
    dataOrBindingContext: typings.knockout.mod.BindingContext[T]
  ): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: js.Function0[java.lang.String | typings.std.Node],
    dataOrBindingContext: typings.knockout.mod.BindingContext[T],
    options: typings.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](template: typings.std.Node, dataOrBindingContext: T): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: typings.std.Node,
    dataOrBindingContext: T,
    options: typings.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: typings.std.Node,
    dataOrBindingContext: js.UndefOr[scala.Nothing],
    options: typings.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: typings.std.Node,
    dataOrBindingContext: scala.Null,
    options: typings.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](template: typings.std.Node, dataOrBindingContext: typings.knockout.mod.BindingContext[T]): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: typings.std.Node,
    dataOrBindingContext: typings.knockout.mod.BindingContext[T],
    options: typings.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def renderTemplate_T[T](template: java.lang.String): java.lang.String = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate_T[T](template: js.Function0[typings.std.Node | java.lang.String]): java.lang.String = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate_T[T](template: typings.std.Node): java.lang.String = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def setTemplateEngine(): scala.Unit = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateEngine")().asInstanceOf[scala.Unit]
  @scala.inline
  def setTemplateEngine(templateEngine: typings.knockout.mod.templateEngine): scala.Unit = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateEngine")(templateEngine.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def toJS[T](rootObject: T): typings.knockout.mod.Unwrapped[T] = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(rootObject.asInstanceOf[js.Any]).asInstanceOf[typings.knockout.mod.Unwrapped[T]]
  
  @scala.inline
  def toJSON(rootObject: js.Any): java.lang.String = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(rootObject.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def toJSON(rootObject: js.Any, replacer: js.UndefOr[scala.Nothing], space: scala.Double): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(rootObject.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def toJSON(rootObject: js.Any, replacer: js.Function): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(rootObject.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def toJSON(rootObject: js.Any, replacer: js.Function, space: scala.Double): java.lang.String = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(rootObject.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def unwrap[T](value: typings.knockout.mod.MaybeSubscribable[T]): T = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def version: java.lang.String = typings.knockout.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  
  @scala.inline
  def when[T](predicate: typings.knockout.mod.ComputedReadFunction[T, scala.Unit]): js.Promise[T] = typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def when[T, TTarget](
    predicate: typings.knockout.mod.ComputedReadFunction[T, TTarget],
    callback: typings.knockout.mod.SubscriptionCallback[T, TTarget]
  ): typings.knockout.mod.Subscription = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.knockout.mod.Subscription]
  @scala.inline
  def when[T, TTarget](
    predicate: typings.knockout.mod.ComputedReadFunction[T, TTarget],
    callback: typings.knockout.mod.SubscriptionCallback[T, TTarget],
    context: TTarget
  ): typings.knockout.mod.Subscription = (typings.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.knockout.mod.Subscription]
}
