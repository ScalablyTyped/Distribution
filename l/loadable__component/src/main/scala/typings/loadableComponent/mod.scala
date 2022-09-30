package typings.loadableComponent

import typings.loadableComponent.anon.Children
import typings.loadableComponent.anon.Default
import typings.loadableComponent.anon.FnCall
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.LegacyRef
import typings.react.mod.global.JSX.Element
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@loadable/component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined {None <Component extends react.react.ComponentClass<any, react.react.ComponentState>>(loadFn : (props : react.react.ComponentProps<Component>): std.Promise<Component | {  default :Component}>, options : @loadable/component.@loadable/component.Options<react.react.ComponentProps<Component>, Component> | undefined): @loadable/component.@loadable/component.LoadableClassComponent<Component>, None <Props>(loadFn : (props : Props): std.Promise<@loadable/component.@loadable/component.DefaultComponent<Props>>, options : @loadable/component.@loadable/component.OptionsWithoutResolver<Props> | undefined): @loadable/component.@loadable/component.LoadableComponent<Props>, None <Props, Module = @loadable/component.@loadable/component.DefaultComponent<Props>>(loadFn : (props : Props): std.Promise<Module>, options : @loadable/component.@loadable/component.OptionsWithResolver<Props, Module>): @loadable/component.@loadable/component.LoadableComponent<Props>} & {  lib :{None <Props, Module>(loadFn : (props : Props): std.Promise<Module>, options : @loadable/component.@loadable/component.OptionsWithoutResolver<Props> | undefined): @loadable/component.@loadable/component.LoadableLibrary<Module>}} */
  object default {
    
    inline def apply[Component /* <: ComponentClass[Any, ComponentState] */](
      loadFn: js.Function1[/* props */ ComponentProps[Component], js.Promise[Component | Default[Component]]]
    ): LoadableClassComponent[Component] = ^.asInstanceOf[js.Dynamic].apply(loadFn.asInstanceOf[js.Any]).asInstanceOf[LoadableClassComponent[Component]]
    inline def apply[Component /* <: ComponentClass[Any, ComponentState] */](
      loadFn: js.Function1[/* props */ ComponentProps[Component], js.Promise[Component | Default[Component]]],
      options: Options[ComponentProps[Component], Component]
    ): LoadableClassComponent[Component] = (^.asInstanceOf[js.Dynamic].apply(loadFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LoadableClassComponent[Component]]
    inline def apply[Props](
      loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]],
      options: OptionsWithoutResolver[Props]
    ): LoadableComponent[Props] = (^.asInstanceOf[js.Dynamic].apply(loadFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LoadableComponent[Props]]
    inline def apply[Props, Module](
      loadFn: js.Function1[/* props */ Props, js.Promise[Module]],
      options: OptionsWithResolver[Props, Module]
    ): LoadableComponent[Props] = (^.asInstanceOf[js.Dynamic].apply(loadFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LoadableComponent[Props]]
    
    @JSImport("@loadable/component", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@loadable/component", "default.lib")
    @js.native
    def lib: FnCall = js.native
    inline def lib_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lib")(x.asInstanceOf[js.Any])
  }
  
  object `lazy` {
    
    inline def apply[Props](loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]]): LoadableComponent[Props] = ^.asInstanceOf[js.Dynamic].apply(loadFn.asInstanceOf[js.Any]).asInstanceOf[LoadableComponent[Props]]
    
    @JSImport("@loadable/component", "lazy")
    @js.native
    val ^ : js.Any = js.native
    
    inline def lib[Module](loadFn: js.Function1[/* props */ js.Object, js.Promise[Module]]): LoadableLibrary[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("lib")(loadFn.asInstanceOf[js.Any]).asInstanceOf[LoadableLibrary[Module]]
  }
  
  inline def loadableReady(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadableReady")().asInstanceOf[js.Promise[Unit]]
  inline def loadableReady(done: js.Function0[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadableReady")(done.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def loadableReady(done: js.Function0[Any], options: LoadableReadyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadableReady")(done.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def loadableReady(done: Unit, options: LoadableReadyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadableReady")(done.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  type ComponentResolver[Props, Module] = js.Function2[/* module */ Module, /* props */ Props, ComponentType[Props]]
  
  type DefaultComponent[Props] = ComponentType[Props] | DefaultImportedComponent[Props]
  
  trait DefaultImportedComponent[Props] extends StObject {
    
    var default: ComponentType[Props]
  }
  object DefaultImportedComponent {
    
    inline def apply[Props](default: ComponentType[Props]): DefaultImportedComponent[Props] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultImportedComponent[Props]]
    }
    
    extension [Self <: DefaultImportedComponent[?], Props](x: Self & DefaultImportedComponent[Props]) {
      
      inline def setDefault(value: ComponentType[Props]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtraClassComponentProps[Component /* <: ComponentClass[js.Object, ComponentState] */]
    extends StObject
       with ExtraComponentProps {
    
    var ref: js.UndefOr[LegacyRef[InstanceType[Component]]] = js.undefined
  }
  object ExtraClassComponentProps {
    
    inline def apply[Component /* <: ComponentClass[js.Object, ComponentState] */](): ExtraClassComponentProps[Component] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtraClassComponentProps[Component]]
    }
    
    extension [Self <: ExtraClassComponentProps[?], Component /* <: ComponentClass[js.Object, ComponentState] */](x: Self & ExtraClassComponentProps[Component]) {
      
      inline def setRef(value: LegacyRef[InstanceType[Component]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ InstanceType[Component] | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait ExtraComponentProps extends StObject {
    
    var fallback: js.UndefOr[Element] = js.undefined
  }
  object ExtraComponentProps {
    
    inline def apply(): ExtraComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtraComponentProps]
    }
    
    extension [Self <: ExtraComponentProps](x: Self) {
      
      inline def setFallback(value: Element): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
  
  type LoadableClassComponent[Component /* <: ComponentClass[js.Object, ComponentState] */] = (ComponentType[ComponentProps[Component] & ExtraClassComponentProps[Component]]) & LoadableComponentMethods[ComponentProps[Component]]
  
  type LoadableComponent[Props] = (ComponentType[Props & ExtraComponentProps]) & LoadableComponentMethods[Props]
  
  @js.native
  trait LoadableComponentMethods[Props] extends StObject {
    
    def load(): js.Promise[ComponentType[Props]] = js.native
    def load(props: Props): js.Promise[ComponentType[Props]] = js.native
    
    def preload(): Unit = js.native
    def preload(props: Props): Unit = js.native
  }
  
  type LoadableLibrary[Module] = ComponentType[Children[Module]] & Module & LoadableComponentMethods[js.Object]
  
  trait LoadableReadyOptions extends StObject {
    
    var namespace: js.UndefOr[String] = js.undefined
  }
  object LoadableReadyOptions {
    
    inline def apply(): LoadableReadyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadableReadyOptions]
    }
    
    extension [Self <: LoadableReadyOptions](x: Self) {
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    }
  }
  
  trait Options[Props, Module]
    extends StObject
       with OptionsWithoutResolver[Props] {
    
    var resolveComponent: js.UndefOr[ComponentResolver[Props, Module]] = js.undefined
  }
  object Options {
    
    inline def apply[Props, Module](): Options[Props, Module] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Props, Module]]
    }
    
    extension [Self <: Options[?, ?], Props, Module](x: Self & (Options[Props, Module])) {
      
      inline def setResolveComponent(value: (Module, Props) => ComponentType[Props]): Self = StObject.set(x, "resolveComponent", js.Any.fromFunction2(value))
      
      inline def setResolveComponentUndefined: Self = StObject.set(x, "resolveComponent", js.undefined)
    }
  }
  
  trait OptionsWithResolver[Props, Module]
    extends StObject
       with OptionsWithoutResolver[Props] {
    
    var resolveComponent: ComponentResolver[Props, Module]
  }
  object OptionsWithResolver {
    
    inline def apply[Props, Module](resolveComponent: (Module, Props) => ComponentType[Props]): OptionsWithResolver[Props, Module] = {
      val __obj = js.Dynamic.literal(resolveComponent = js.Any.fromFunction2(resolveComponent))
      __obj.asInstanceOf[OptionsWithResolver[Props, Module]]
    }
    
    extension [Self <: OptionsWithResolver[?, ?], Props, Module](x: Self & (OptionsWithResolver[Props, Module])) {
      
      inline def setResolveComponent(value: (Module, Props) => ComponentType[Props]): Self = StObject.set(x, "resolveComponent", js.Any.fromFunction2(value))
    }
  }
  
  trait OptionsWithoutResolver[Props] extends StObject {
    
    var cacheKey: js.UndefOr[js.Function1[/* props */ Props, Any]] = js.undefined
    
    var fallback: js.UndefOr[Element] = js.undefined
    
    var ssr: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsWithoutResolver {
    
    inline def apply[Props](): OptionsWithoutResolver[Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsWithoutResolver[Props]]
    }
    
    extension [Self <: OptionsWithoutResolver[?], Props](x: Self & OptionsWithoutResolver[Props]) {
      
      inline def setCacheKey(value: /* props */ Props => Any): Self = StObject.set(x, "cacheKey", js.Any.fromFunction1(value))
      
      inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
      
      inline def setFallback(value: Element): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    }
  }
}
