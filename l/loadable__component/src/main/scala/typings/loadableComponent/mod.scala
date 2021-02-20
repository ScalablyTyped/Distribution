package typings.loadableComponent

import typings.loadableComponent.anon.Children
import typings.loadableComponent.anon.Fallback
import typings.loadableComponent.anon.FnCall
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined {None <Props>(loadFn : (props : Props): std.Promise<@loadable/component.@loadable/component.DefaultComponent<Props>>, options : @loadable/component.@loadable/component.OptionsWithoutResolver<Props> | undefined): @loadable/component.@loadable/component.LoadableComponent<Props>, None <Props, Module = @loadable/component.@loadable/component.DefaultComponent<Props>>(loadFn : (props : Props): std.Promise<Module>, options : @loadable/component.@loadable/component.OptionsWithResolver<Props, Module>): @loadable/component.@loadable/component.LoadableComponent<Props>} & {  lib :{None <Props, Module>(loadFn : (props : Props): std.Promise<Module>, options : @loadable/component.@loadable/component.OptionsWithoutResolver<Props> | undefined): @loadable/component.@loadable/component.LoadableLibrary<Module>}} */
  object default {
    
    @JSImport("@loadable/component", JSImport.Default)
    @js.native
    def apply[Props](loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]]): LoadableComponent[Props] = js.native
    @JSImport("@loadable/component", JSImport.Default)
    @js.native
    def apply[Props](
      loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]],
      options: OptionsWithoutResolver[Props]
    ): LoadableComponent[Props] = js.native
    @JSImport("@loadable/component", JSImport.Default)
    @js.native
    def apply[Props, Module](
      loadFn: js.Function1[/* props */ Props, js.Promise[Module]],
      options: OptionsWithResolver[Props, Module]
    ): LoadableComponent[Props] = js.native
    @JSImport("@loadable/component", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@loadable/component", "default.lib")
    @js.native
    def lib: FnCall = js.native
    @scala.inline
    def lib_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lib")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@loadable/component", "loadableReady")
  @js.native
  def loadableReady(): js.Promise[Unit] = js.native
  @JSImport("@loadable/component", "loadableReady")
  @js.native
  def loadableReady(done: js.UndefOr[scala.Nothing], options: LoadableReadyOptions): js.Promise[Unit] = js.native
  @JSImport("@loadable/component", "loadableReady")
  @js.native
  def loadableReady(done: js.Function0[_]): js.Promise[Unit] = js.native
  @JSImport("@loadable/component", "loadableReady")
  @js.native
  def loadableReady(done: js.Function0[_], options: LoadableReadyOptions): js.Promise[Unit] = js.native
  
  type ComponentResolver[Props, Module] = js.Function2[/* module */ Module, /* props */ Props, ComponentType[Props]]
  
  type DefaultComponent[Props] = ComponentType[Props] | DefaultImportedComponent[Props]
  
  @js.native
  trait DefaultImportedComponent[Props] extends StObject {
    
    var default: ComponentType[Props] = js.native
  }
  object DefaultImportedComponent {
    
    @scala.inline
    def apply[Props](default: ComponentType[Props]): DefaultImportedComponent[Props] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultImportedComponent[Props]]
    }
    
    @scala.inline
    implicit class DefaultImportedComponentMutableBuilder[Self <: DefaultImportedComponent[_], Props] (val x: Self with DefaultImportedComponent[Props]) extends AnyVal {
      
      @scala.inline
      def setDefault(value: ComponentType[Props]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  type LoadableComponent[Props] = (ComponentType[Props with Fallback]) with LoadableComponentMethods[Props]
  
  @js.native
  trait LoadableComponentMethods[Props] extends StObject {
    
    def load(): js.Promise[ComponentType[Props]] = js.native
    def load(props: Props): js.Promise[ComponentType[Props]] = js.native
    
    def preload(): Unit = js.native
    def preload(props: Props): Unit = js.native
  }
  
  type LoadableLibrary[Module] = ComponentType[Children[Module]] with Module with LoadableComponentMethods[js.Object]
  
  @js.native
  trait LoadableReadyOptions extends StObject {
    
    var namespace: js.UndefOr[String] = js.native
  }
  object LoadableReadyOptions {
    
    @scala.inline
    def apply(): LoadableReadyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadableReadyOptions]
    }
    
    @scala.inline
    implicit class LoadableReadyOptionsMutableBuilder[Self <: LoadableReadyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    }
  }
  
  @js.native
  trait Options[Props, Module] extends OptionsWithoutResolver[Props] {
    
    var resolveComponent: js.UndefOr[ComponentResolver[Props, Module]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[Props, Module](): Options[Props, Module] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Props, Module]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_, _], Props, Module] (val x: Self with (Options[Props, Module])) extends AnyVal {
      
      @scala.inline
      def setResolveComponent(value: (Module, Props) => ComponentType[Props]): Self = StObject.set(x, "resolveComponent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResolveComponentUndefined: Self = StObject.set(x, "resolveComponent", js.undefined)
    }
  }
  
  @js.native
  trait OptionsWithResolver[Props, Module] extends OptionsWithoutResolver[Props] {
    
    var resolveComponent: ComponentResolver[Props, Module] = js.native
  }
  object OptionsWithResolver {
    
    @scala.inline
    def apply[Props, Module](resolveComponent: (Module, Props) => ComponentType[Props]): OptionsWithResolver[Props, Module] = {
      val __obj = js.Dynamic.literal(resolveComponent = js.Any.fromFunction2(resolveComponent))
      __obj.asInstanceOf[OptionsWithResolver[Props, Module]]
    }
    
    @scala.inline
    implicit class OptionsWithResolverMutableBuilder[Self <: OptionsWithResolver[_, _], Props, Module] (val x: Self with (OptionsWithResolver[Props, Module])) extends AnyVal {
      
      @scala.inline
      def setResolveComponent(value: (Module, Props) => ComponentType[Props]): Self = StObject.set(x, "resolveComponent", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait OptionsWithoutResolver[Props] extends StObject {
    
    var cacheKey: js.UndefOr[js.Function1[/* props */ Props, _]] = js.native
    
    var fallback: js.UndefOr[Element] = js.native
    
    var ssr: js.UndefOr[Boolean] = js.native
  }
  object OptionsWithoutResolver {
    
    @scala.inline
    def apply[Props](): OptionsWithoutResolver[Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsWithoutResolver[Props]]
    }
    
    @scala.inline
    implicit class OptionsWithoutResolverMutableBuilder[Self <: OptionsWithoutResolver[_], Props] (val x: Self with OptionsWithoutResolver[Props]) extends AnyVal {
      
      @scala.inline
      def setCacheKey(value: /* props */ Props => _): Self = StObject.set(x, "cacheKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
      
      @scala.inline
      def setFallback(value: Element): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    }
  }
  
  object `lazy` {
    
    @JSImport("@loadable/component", "lazy")
    @js.native
    def apply[Props](loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]]): LoadableComponent[Props] = js.native
    
    @JSImport("@loadable/component", "lazy.lib")
    @js.native
    def lib[Module](loadFn: js.Function1[/* props */ js.Object, js.Promise[Module]]): LoadableLibrary[Module] = js.native
  }
}
