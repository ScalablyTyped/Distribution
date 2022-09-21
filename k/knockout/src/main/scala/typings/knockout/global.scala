package typings.knockout

import org.scalablytyped.runtime.StringDictionary
import typings.knockout.knockoutStrings.childrenComplete
import typings.knockout.knockoutStrings.descendantsComplete
import typings.knockout.knockoutStrings.ignoreTargetNode
import typings.knockout.knockoutStrings.replaceChildren
import typings.knockout.knockoutStrings.replaceNode
import typings.knockout.mod.BindingAccessors
import typings.knockout.mod.BindingContext
import typings.knockout.mod.BindingContextExtendCallback
import typings.knockout.mod.BindingHandler
import typings.knockout.mod.BindingHandlers_
import typings.knockout.mod.BindingOptions
import typings.knockout.mod.ComputedContext_
import typings.knockout.mod.ComputedFunctions
import typings.knockout.mod.ComputedOptions
import typings.knockout.mod.ComputedReadFunction
import typings.knockout.mod.Computed_
import typings.knockout.mod.Extenders_
import typings.knockout.mod.IBindingProvider
import typings.knockout.mod.MaybeObservableArray
import typings.knockout.mod.MaybeSubscribable
import typings.knockout.mod.ObservableArrayFunctions
import typings.knockout.mod.ObservableArray_
import typings.knockout.mod.ObservableFunctions
import typings.knockout.mod.Observable_
import typings.knockout.mod.Options_
import typings.knockout.mod.PureComputed_
import typings.knockout.mod.SubscribableFunctions
import typings.knockout.mod.Subscription
import typings.knockout.mod.SubscriptionCallback
import typings.knockout.mod.TemplateOptions
import typings.knockout.mod.Unwrapped
import typings.knockout.mod.VirtualElementsAllowedBindings
import typings.knockout.mod.components.Config
import typings.knockout.mod.components.DefaultLoader_
import typings.knockout.mod.components.Loader
import typings.knockout.mod.expressionRewriting.KeyValue
import typings.knockout.mod.expressionRewriting.TwoWayBindings
import typings.knockout.mod.utils.ArrayChanges
import typings.knockout.mod.utils.CompareArraysOptions
import typings.knockout.mod.utils.MappingAfterAddFunction
import typings.knockout.mod.utils.MappingFunction
import typings.knockout.mod.utils.MappingOptions
import typings.knockout.mod.utils.PostJsonOptions
import typings.std.Document
import typings.std.Element
import typings.std.EventListener
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ko {
    
    @JSGlobal("ko")
    @js.native
    val ^ : js.Any = js.native
    
    inline def applyBindingAccessorsToNode[T](node: Node, bindings: js.Function0[BindingAccessors], viewModel: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingAccessorsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def applyBindingAccessorsToNode[T](node: Node, bindings: js.Function0[BindingAccessors], viewModel: BindingContext[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingAccessorsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def applyBindingAccessorsToNode[T](node: Node, bindings: BindingAccessors, viewModel: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingAccessorsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def applyBindingAccessorsToNode[T](node: Node, bindings: BindingAccessors, viewModel: BindingContext[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingAccessorsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def applyBindings[T](bindingContext: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def applyBindings[T](bindingContext: T, rootNode: Null, extendCallback: BindingContextExtendCallback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any], extendCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def applyBindings[T](bindingContext: T, rootNode: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def applyBindings[T](bindingContext: T, rootNode: Node, extendCallback: BindingContextExtendCallback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any], extendCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def applyBindings[T](bindingContext: BindingContext[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def applyBindings[T](bindingContext: BindingContext[T], rootNode: Null, extendCallback: BindingContextExtendCallback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any], extendCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def applyBindings[T](bindingContext: BindingContext[T], rootNode: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def applyBindings[T](bindingContext: BindingContext[T], rootNode: Node, extendCallback: BindingContextExtendCallback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any], extendCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def applyBindingsToDescendants[T](bindingContext: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToDescendants")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def applyBindingsToDescendants[T](bindingContext: T, rootNode: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToDescendants")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def applyBindingsToDescendants[T](bindingContext: BindingContext[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToDescendants")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def applyBindingsToDescendants[T](bindingContext: BindingContext[T], rootNode: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToDescendants")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def applyBindingsToNode[T](node: Node, bindings: js.Function0[js.Object], viewModel: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def applyBindingsToNode[T](node: Node, bindings: js.Function0[js.Object], viewModel: BindingContext[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def applyBindingsToNode[T](node: Node, bindings: js.Object, viewModel: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def applyBindingsToNode[T](node: Node, bindings: js.Object, viewModel: BindingContext[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object bindingEvent {
      
      @JSGlobal("ko.bindingEvent")
      @js.native
      val ^ : js.Any = js.native
      
      inline def startPossiblyAsyncContentBinding(node: Element, bindingContext: BindingContext[Any]): BindingContext[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("startPossiblyAsyncContentBinding")(node.asInstanceOf[js.Any], bindingContext.asInstanceOf[js.Any])).asInstanceOf[BindingContext[Any]]
      
      inline def subscribe(
        node: Node,
        event: childrenComplete | descendantsComplete,
        callback: js.Function1[/* node */ Node, Unit]
      ): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Subscription]
      inline def subscribe(
        node: Node,
        event: childrenComplete | descendantsComplete,
        callback: js.Function1[/* node */ Node, Unit],
        callbackContext: Any
      ): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], callbackContext.asInstanceOf[js.Any])).asInstanceOf[Subscription]
    }
    
    @JSGlobal("ko.bindingHandlers")
    @js.native
    val bindingHandlers: BindingHandlers_ = js.native
    
    @JSGlobal("ko.bindingProvider")
    @js.native
    open class bindingProvider ()
      extends typings.knockout.mod.bindingProvider
    /* static members */
    object bindingProvider {
      
      @JSGlobal("ko.bindingProvider")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("ko.bindingProvider.instance")
      @js.native
      def instance: IBindingProvider = js.native
      inline def instance_=(x: IBindingProvider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
    }
    
    inline def cleanNode(node: Node): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanNode")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    object components {
      
      @JSGlobal("ko.components")
      @js.native
      val ^ : js.Any = js.native
      
      inline def clearCachedDefinition(componentName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCachedDefinition")(componentName.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @JSGlobal("ko.components.defaultLoader")
      @js.native
      val defaultLoader: DefaultLoader_ = js.native
      
      inline def get(
        componentName: String,
        callback: js.Function2[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ /* definition */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Config */ /* config */ Any, 
              Unit
            ]
      ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(componentName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def getComponentNameForNode(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponentNameForNode")(node.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def isRegistered(componentName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")(componentName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      @JSGlobal("ko.components.loaders")
      @js.native
      val loaders: js.Array[Loader] = js.native
      
      inline def register(componentName: String, config: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(componentName.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def register(componentName: String, config: Config): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(componentName.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def unregister(componentName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(componentName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    object computed {
      
      inline def apply[T](evaluator: ComputedReadFunction[T, Unit]): Computed_[T] = ^.asInstanceOf[js.Dynamic].apply(evaluator.asInstanceOf[js.Any]).asInstanceOf[Computed_[T]]
      inline def apply[T, TTarget](evaluator: ComputedReadFunction[T, TTarget], evaluatorTarget: TTarget): Computed_[T] = (^.asInstanceOf[js.Dynamic].apply(evaluator.asInstanceOf[js.Any], evaluatorTarget.asInstanceOf[js.Any])).asInstanceOf[Computed_[T]]
      inline def apply[T, TTarget](
        evaluator: ComputedReadFunction[T, TTarget],
        evaluatorTarget: TTarget,
        options: ComputedOptions[T, TTarget]
      ): Computed_[T] = (^.asInstanceOf[js.Dynamic].apply(evaluator.asInstanceOf[js.Any], evaluatorTarget.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Computed_[T]]
      inline def apply[T, TTarget](options: ComputedOptions[T, TTarget]): Computed_[T] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Computed_[T]]
      
      @JSGlobal("ko.computed")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("ko.computed.fn")
      @js.native
      val fn: ComputedFunctions[Any] = js.native
    }
    
    @JSGlobal("ko.computedContext")
    @js.native
    val computedContext: ComputedContext_ = js.native
    
    inline def contextFor[T](node: Node): BindingContext[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("contextFor")(node.asInstanceOf[js.Any]).asInstanceOf[BindingContext[T]]
    
    inline def dataFor[T](node: Node): T = ^.asInstanceOf[js.Dynamic].applyDynamic("dataFor")(node.asInstanceOf[js.Any]).asInstanceOf[T]
    
    object expressionRewriting {
      
      @JSGlobal("ko.expressionRewriting")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("ko.expressionRewriting.bindingRewriteValidators")
      @js.native
      val bindingRewriteValidators: js.Array[Any] = js.native
      
      inline def parseObjectLiteral(objectLiteralString: String): js.Array[KeyValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseObjectLiteral")(objectLiteralString.asInstanceOf[js.Any]).asInstanceOf[js.Array[KeyValue]]
      
      inline def preProcessBindings(bindingsString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("preProcessBindings")(bindingsString.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def preProcessBindings(bindingsString: String, bindingOptions: BindingOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("preProcessBindings")(bindingsString.asInstanceOf[js.Any], bindingOptions.asInstanceOf[js.Any])).asInstanceOf[String]
      inline def preProcessBindings(keyValueArray: js.Array[KeyValue]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("preProcessBindings")(keyValueArray.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def preProcessBindings(keyValueArray: js.Array[KeyValue], bindingOptions: BindingOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("preProcessBindings")(keyValueArray.asInstanceOf[js.Any], bindingOptions.asInstanceOf[js.Any])).asInstanceOf[String]
      
      @JSGlobal("ko.expressionRewriting._twoWayBindings")
      @js.native
      val twoWayBindings: TwoWayBindings = js.native
    }
    
    @JSGlobal("ko.extenders")
    @js.native
    val extenders: Extenders_[Any] = js.native
    
    inline def getBindingHandler(handler: String): BindingHandler[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBindingHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[BindingHandler[Any]]
    
    inline def ignoreDependencies[Return, Target, Args /* <: js.Array[Any] */](callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return]): Return = ^.asInstanceOf[js.Dynamic].applyDynamic("ignoreDependencies")(callback.asInstanceOf[js.Any]).asInstanceOf[Return]
    inline def ignoreDependencies[Return, Target, Args /* <: js.Array[Any] */](callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return], callbackTarget: Target): Return = (^.asInstanceOf[js.Dynamic].applyDynamic("ignoreDependencies")(callback.asInstanceOf[js.Any], callbackTarget.asInstanceOf[js.Any])).asInstanceOf[Return]
    inline def ignoreDependencies[Return, Target, Args /* <: js.Array[Any] */](
      callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return],
      callbackTarget: Target,
      callbackArgs: Args
    ): Return = (^.asInstanceOf[js.Dynamic].applyDynamic("ignoreDependencies")(callback.asInstanceOf[js.Any], callbackTarget.asInstanceOf[js.Any], callbackArgs.asInstanceOf[js.Any])).asInstanceOf[Return]
    inline def ignoreDependencies[Return, Target, Args /* <: js.Array[Any] */](
      callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return],
      callbackTarget: Unit,
      callbackArgs: Args
    ): Return = (^.asInstanceOf[js.Dynamic].applyDynamic("ignoreDependencies")(callback.asInstanceOf[js.Any], callbackTarget.asInstanceOf[js.Any], callbackArgs.asInstanceOf[js.Any])).asInstanceOf[Return]
    
    inline def isComputed[T](instance: Any): /* is knockout.knockout.Computed<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputed")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.Computed<T> */ Boolean]
    
    inline def isObservable[T](instance: Any): /* is knockout.knockout.Observable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.Observable<T> */ Boolean]
    
    inline def isObservableArray[T](instance: Any): /* is knockout.knockout.ObservableArray<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableArray")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.ObservableArray<T> */ Boolean]
    
    inline def isPureComputed[T](instance: Any): /* is knockout.knockout.PureComputed<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPureComputed")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.PureComputed<T> */ Boolean]
    
    inline def isSubscribable[T](instance: Any): /* is knockout.knockout.Subscribable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSubscribable")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.Subscribable<T> */ Boolean]
    
    inline def isWritableObservable[T](instance: Any): /* is knockout.knockout.Observable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWritableObservable")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.Observable<T> */ Boolean]
    
    inline def isWriteableObservable[T](instance: Any): /* is knockout.knockout.Observable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWriteableObservable")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.Observable<T> */ Boolean]
    
    @JSGlobal("ko.jqueryTmplTemplateEngine")
    @js.native
    open class jqueryTmplTemplateEngine ()
      extends typings.knockout.mod.jqueryTmplTemplateEngine
    
    object memoization {
      
      @JSGlobal("ko.memoization")
      @js.native
      val ^ : js.Any = js.native
      
      inline def memoize(callback: js.Function1[/* val */ Any, Unit]): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
      
      inline def parseMemoText(memoText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMemoText")(memoText.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def unmemoize(memoId: String, callbackParams: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unmemoize")(memoId.asInstanceOf[js.Any], callbackParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def unmemoizeDomNodeAndDescendants(domNode: Node, extraCallbackParamsArray: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unmemoizeDomNodeAndDescendants")(domNode.asInstanceOf[js.Any], extraCallbackParamsArray.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    @JSGlobal("ko.nativeTemplateEngine")
    @js.native
    open class nativeTemplateEngine ()
      extends typings.knockout.mod.nativeTemplateEngine
    
    object observable {
      
      inline def apply[T](): Observable_[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Observable_[js.UndefOr[T]]]
      inline def apply[T](value: T): Observable_[T] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
      inline def apply[T](value: Null): Observable_[T | Null] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Observable_[T | Null]]
      
      @JSGlobal("ko.observable")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("ko.observable.fn")
      @js.native
      val fn: ObservableFunctions[Any] = js.native
    }
    
    object observableArray {
      
      inline def apply[T](): ObservableArray_[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ObservableArray_[T]]
      inline def apply[T](initialValue: js.Array[T]): ObservableArray_[T] = ^.asInstanceOf[js.Dynamic].apply(initialValue.asInstanceOf[js.Any]).asInstanceOf[ObservableArray_[T]]
      
      @JSGlobal("ko.observableArray")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("ko.observableArray.fn")
      @js.native
      val fn: ObservableArrayFunctions[Any] = js.native
    }
    
    inline def onError(error: js.Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("ko.options")
    @js.native
    val options: Options_ = js.native
    
    inline def pureComputed[T](evaluator: ComputedReadFunction[T, Unit]): PureComputed_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pureComputed")(evaluator.asInstanceOf[js.Any]).asInstanceOf[PureComputed_[T]]
    inline def pureComputed[T, TTarget](evaluator: ComputedReadFunction[T, TTarget], evaluatorTarget: TTarget): PureComputed_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pureComputed")(evaluator.asInstanceOf[js.Any], evaluatorTarget.asInstanceOf[js.Any])).asInstanceOf[PureComputed_[T]]
    inline def pureComputed[T, TTarget](options: ComputedOptions[T, TTarget]): PureComputed_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pureComputed")(options.asInstanceOf[js.Any]).asInstanceOf[PureComputed_[T]]
    
    inline def removeNode(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def renderTemplate(template: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def renderTemplate(template: js.Function0[String | Node]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def renderTemplate(template: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def renderTemplate[T](
      template: String | Node | (js.Function0[String | Node]),
      dataOrBindingContext: js.UndefOr[T | BindingContext[T] | Null],
      options: js.UndefOr[TemplateOptions[T] | Null],
      targetNodeOrNodeArray: Node | js.Array[Node],
      renderMode: js.UndefOr[replaceChildren | replaceNode | ignoreTargetNode]
    ): Computed_[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetNodeOrNodeArray.asInstanceOf[js.Any], renderMode.asInstanceOf[js.Any])).asInstanceOf[Computed_[Unit]]
    inline def renderTemplate[T](template: String, dataOrBindingContext: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: String, dataOrBindingContext: T, options: TemplateOptions[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: String, dataOrBindingContext: Null, options: TemplateOptions[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: String, dataOrBindingContext: Unit, options: TemplateOptions[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: String, dataOrBindingContext: BindingContext[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: String, dataOrBindingContext: BindingContext[T], options: TemplateOptions[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: js.Function0[Node | String], dataOrBindingContext: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: js.Function0[String | Node], dataOrBindingContext: T, options: TemplateOptions[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: js.Function0[String | Node], dataOrBindingContext: Null, options: TemplateOptions[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: js.Function0[String | Node], dataOrBindingContext: Unit, options: TemplateOptions[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: js.Function0[Node | String], dataOrBindingContext: BindingContext[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](
      template: js.Function0[String | Node],
      dataOrBindingContext: BindingContext[T],
      options: TemplateOptions[T]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: Node, dataOrBindingContext: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: Node, dataOrBindingContext: T, options: TemplateOptions[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: Node, dataOrBindingContext: Null, options: TemplateOptions[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: Node, dataOrBindingContext: Unit, options: TemplateOptions[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: Node, dataOrBindingContext: BindingContext[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def renderTemplate[T](template: Node, dataOrBindingContext: BindingContext[T], options: TemplateOptions[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def renderTemplate_T[T](template: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def renderTemplate_T[T](template: js.Function0[Node | String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def renderTemplate_T[T](template: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[String]
    
    object selectExtensions {
      
      @JSGlobal("ko.selectExtensions")
      @js.native
      val ^ : js.Any = js.native
      
      inline def readValue(element: HTMLElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readValue")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      inline def writeValue(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeValue")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def writeValue(element: HTMLElement, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeValue")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def writeValue(element: HTMLElement, value: Any, allowUnset: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeValue")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allowUnset.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def writeValue(element: HTMLElement, value: Unit, allowUnset: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeValue")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allowUnset.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    inline def setTemplateEngine(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateEngine")().asInstanceOf[Unit]
    inline def setTemplateEngine(templateEngine: typings.knockout.mod.templateEngine): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateEngine")(templateEngine.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.subscribable")
    @js.native
    open class subscribable[T] () extends SubscribableFunctions[T]
    object subscribable {
      
      @JSGlobal("ko.subscribable")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("ko.subscribable.fn")
      @js.native
      def fn: SubscribableFunctions[Any] = js.native
      inline def fn_=(x: SubscribableFunctions[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
    }
    
    object tasks {
      
      @JSGlobal("ko.tasks")
      @js.native
      val ^ : js.Any = js.native
      
      inline def cancel(handle: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def runEarly(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runEarly")().asInstanceOf[Unit]
      
      inline def schedule(callback: js.Function0[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      @JSGlobal("ko.tasks.scheduler")
      @js.native
      def scheduler: js.Function1[/* callback */ js.Function0[Any], Unit] = js.native
      inline def scheduler_=(x: js.Function1[/* callback */ js.Function0[Any], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("ko.templateEngine")
    @js.native
    abstract class templateEngine ()
      extends typings.knockout.mod.templateEngine
    
    object templateSources {
      
      @JSGlobal("ko.templateSources.anonymousTemplate")
      @js.native
      open class anonymousTemplate protected ()
        extends typings.knockout.mod.templateSources.anonymousTemplate {
        def this(element: Node) = this()
      }
      
      @JSGlobal("ko.templateSources.domElement")
      @js.native
      open class domElement protected ()
        extends typings.knockout.mod.templateSources.domElement {
        def this(element: Node) = this()
      }
    }
    
    inline def toJS[T](rootObject: T): Unwrapped[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(rootObject.asInstanceOf[js.Any]).asInstanceOf[Unwrapped[T]]
    
    inline def toJSON(rootObject: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(rootObject.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toJSON(rootObject: Any, replacer: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(rootObject.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toJSON(rootObject: Any, replacer: js.Function, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(rootObject.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toJSON(rootObject: Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(rootObject.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def unwrap[T](value: MaybeSubscribable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(value.asInstanceOf[js.Any]).asInstanceOf[T]
    
    object utils {
      
      @JSGlobal("ko.utils")
      @js.native
      val ^ : js.Any = js.native
      
      inline def addOrRemoveItem[T](array: MaybeObservableArray[T], value: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addOrRemoveItem")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
      inline def addOrRemoveItem[T](array: MaybeObservableArray[T], value: T, included: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addOrRemoveItem")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], included.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
      
      inline def arrayFilter[T](array: js.Array[T], predicate: js.Function2[/* item */ T, /* index */ Double, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayFilter")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
      inline def arrayFilter[T](
        array: js.Array[T],
        predicate: js.Function2[/* item */ T, /* index */ Double, Boolean],
        predicateOwner: Any
      ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayFilter")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], predicateOwner.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
      
      inline def arrayFirst[T](array: js.Array[T], predicate: js.Function2[/* item */ T, /* index */ Double, Boolean]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayFirst")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
      inline def arrayFirst[T](
        array: js.Array[T],
        predicate: js.Function2[/* item */ T, /* index */ Double, Boolean],
        predicateOwner: Any
      ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayFirst")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], predicateOwner.asInstanceOf[js.Any])).asInstanceOf[T]
      
      inline def arrayForEach[T](array: js.Array[T], action: js.Function2[/* item */ T, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayForEach")(array.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def arrayForEach[T](array: js.Array[T], action: js.Function2[/* item */ T, /* index */ Double, Unit], actionOwner: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayForEach")(array.asInstanceOf[js.Any], action.asInstanceOf[js.Any], actionOwner.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def arrayGetDistinctValues[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayGetDistinctValues")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
      
      inline def arrayIndexOf[T](array: MaybeObservableArray[T], item: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayIndexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def arrayMap[T, U](array: js.Array[T], mapping: js.Function2[/* item */ T, /* index */ Double, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMap")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
      inline def arrayMap[T, U](array: js.Array[T], mapping: js.Function2[/* item */ T, /* index */ Double, U], mappingOwner: Any): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMap")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], mappingOwner.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
      
      inline def arrayPushAll[T](array: MaybeObservableArray[T], valuesToPush: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPushAll")(array.asInstanceOf[js.Any], valuesToPush.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
      
      inline def arrayRemoveItem[T](array: MaybeObservableArray[T], itemToRemove: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemoveItem")(array.asInstanceOf[js.Any], itemToRemove.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def compareArrays[T](a: js.Array[T], b: js.Array[T]): ArrayChanges[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compareArrays")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[ArrayChanges[T]]
      inline def compareArrays[T](a: js.Array[T], b: js.Array[T], dontLimitMoves: Boolean): ArrayChanges[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compareArrays")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], dontLimitMoves.asInstanceOf[js.Any])).asInstanceOf[ArrayChanges[T]]
      inline def compareArrays[T](a: js.Array[T], b: js.Array[T], options: CompareArraysOptions): ArrayChanges[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compareArrays")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ArrayChanges[T]]
      
      object domData {
        
        @JSGlobal("ko.utils.domData")
        @js.native
        val ^ : js.Any = js.native
        
        inline def clear(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
        
        inline def get[T](node: Node, key: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[T]
        
        inline def set[T](node: Node, key: String, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      }
      
      object domNodeDisposal {
        
        @JSGlobal("ko.utils.domNodeDisposal")
        @js.native
        val ^ : js.Any = js.native
        
        inline def addDisposeCallback(node: Node, callback: js.Function1[/* node */ Node, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addDisposeCallback")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def cleanExternalData(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanExternalData")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def removeDisposeCallback(node: Node, callback: js.Function1[/* node */ Node, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDisposeCallback")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      }
      
      inline def extend[T, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
      
      @JSGlobal("ko.utils.fieldsIncludedWithJsonPost")
      @js.native
      val fieldsIncludedWithJsonPost: js.Array[String | js.RegExp] = js.native
      
      inline def getFormFields(form: HTMLFormElement, fieldName: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormFields")(form.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
      inline def getFormFields(form: HTMLFormElement, fieldName: js.RegExp): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormFields")(form.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
      
      inline def objectForEach(obj: js.Object, action: js.Function2[/* key */ String, /* value */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("objectForEach")(obj.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def objectForEach[T](obj: StringDictionary[T], action: js.Function2[/* key */ String, /* value */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("objectForEach")(obj.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def parseHtmlFragment(html: String): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHtmlFragment")(html.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
      inline def parseHtmlFragment(html: String, documentContext: Document): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHtmlFragment")(html.asInstanceOf[js.Any], documentContext.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
      
      inline def parseJson(jsonString: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJson")(jsonString.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      inline def parseJson_T_T[T](jsonString: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJson")(jsonString.asInstanceOf[js.Any]).asInstanceOf[T]
      
      inline def peekObservable[T](value: MaybeSubscribable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("peekObservable")(value.asInstanceOf[js.Any]).asInstanceOf[T]
      
      inline def postJson(urlOrForm: String, data: MaybeSubscribable[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postJson")(urlOrForm.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def postJson(urlOrForm: String, data: MaybeSubscribable[js.Object], options: PostJsonOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postJson")(urlOrForm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def postJson(urlOrForm: HTMLFormElement, data: MaybeSubscribable[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postJson")(urlOrForm.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def postJson(urlOrForm: HTMLFormElement, data: MaybeSubscribable[js.Object], options: PostJsonOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postJson")(urlOrForm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def range(min: MaybeSubscribable[Double], max: MaybeSubscribable[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
      
      inline def registerEventHandler(element: Element, eventType: String, handler: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEventHandler")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def setDomNodeChildrenFromArrayMapping[T](domNode: Node, array: js.Array[T], mapping: MappingFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDomNodeChildrenFromArrayMapping")(domNode.asInstanceOf[js.Any], array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def setDomNodeChildrenFromArrayMapping[T](
        domNode: Node,
        array: js.Array[T],
        mapping: MappingFunction[T],
        options: Unit,
        callbackAfterAddingNodes: MappingAfterAddFunction[T]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDomNodeChildrenFromArrayMapping")(domNode.asInstanceOf[js.Any], array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callbackAfterAddingNodes.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def setDomNodeChildrenFromArrayMapping[T](domNode: Node, array: js.Array[T], mapping: MappingFunction[T], options: MappingOptions[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDomNodeChildrenFromArrayMapping")(domNode.asInstanceOf[js.Any], array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def setDomNodeChildrenFromArrayMapping[T](
        domNode: Node,
        array: js.Array[T],
        mapping: MappingFunction[T],
        options: MappingOptions[T],
        callbackAfterAddingNodes: MappingAfterAddFunction[T]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDomNodeChildrenFromArrayMapping")(domNode.asInstanceOf[js.Any], array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callbackAfterAddingNodes.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def setHtml(node: Node, html: MaybeSubscribable[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setHtml")(node.asInstanceOf[js.Any], html.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def setTextContent(element: Node, textContent: MaybeSubscribable[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTextContent")(element.asInstanceOf[js.Any], textContent.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def stringifyJson(data: MaybeSubscribable[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJson")(data.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def stringifyJson(data: MaybeSubscribable[Any], replacer: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJson")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
      inline def stringifyJson(data: MaybeSubscribable[Any], replacer: js.Function, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJson")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
      inline def stringifyJson(data: MaybeSubscribable[Any], replacer: js.Function, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJson")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
      inline def stringifyJson(data: MaybeSubscribable[Any], replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJson")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
      inline def stringifyJson(data: MaybeSubscribable[Any], replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJson")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def toggleDomNodeCssClass(node: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleDomNodeCssClass")(node.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def toggleDomNodeCssClass(node: Element, className: String, shouldHaveClass: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleDomNodeCssClass")(node.asInstanceOf[js.Any], className.asInstanceOf[js.Any], shouldHaveClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def triggerEvent(element: Element, eventType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEvent")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def unwrapObservable[T](value: MaybeSubscribable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapObservable")(value.asInstanceOf[js.Any]).asInstanceOf[T]
    }
    
    @JSGlobal("ko.version")
    @js.native
    val version: String = js.native
    
    object virtualElements {
      
      @JSGlobal("ko.virtualElements")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("ko.virtualElements.allowedBindings")
      @js.native
      val allowedBindings: VirtualElementsAllowedBindings = js.native
      
      inline def childNodes(node: Node): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("childNodes")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
      
      inline def emptyNode(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def firstChild(node: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("firstChild")(node.asInstanceOf[js.Any]).asInstanceOf[Node]
      
      inline def insertAfter(node: Node, nodeToInsert: Node, insertAfterNode: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")(node.asInstanceOf[js.Any], nodeToInsert.asInstanceOf[js.Any], insertAfterNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def nextSibling(node: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("nextSibling")(node.asInstanceOf[js.Any]).asInstanceOf[Node]
      
      inline def prepend(node: Node, nodeToPrepend: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prepend")(node.asInstanceOf[js.Any], nodeToPrepend.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def setDomNodeChildren(node: Node, childNodes: js.Array[Node]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDomNodeChildren")(node.asInstanceOf[js.Any], childNodes.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    inline def when[T](predicate: ComputedReadFunction[T, Unit]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
    inline def when[T, TTarget](predicate: ComputedReadFunction[T, TTarget], callback: SubscriptionCallback[T, TTarget]): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Subscription]
    inline def when[T, TTarget](
      predicate: ComputedReadFunction[T, TTarget],
      callback: SubscriptionCallback[T, TTarget],
      context: TTarget
    ): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  }
}
