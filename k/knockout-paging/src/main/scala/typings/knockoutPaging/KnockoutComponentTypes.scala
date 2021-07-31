package typings.knockoutPaging

import typings.knockoutPaging.anon.Element
import typings.std.DocumentFragment
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// refactored types into a namespace to reduce global pollution
// and used Union Types to simplify overloads (requires TypeScript 1.4)
//
object KnockoutComponentTypes {
  
  // common AMD type
  trait AMDModule extends StObject {
    
    var require: String
  }
  object AMDModule {
    
    @scala.inline
    def apply(require: String): AMDModule = {
      val __obj = js.Dynamic.literal(require = require.asInstanceOf[js.Any])
      __obj.asInstanceOf[AMDModule]
    }
    
    @scala.inline
    implicit class AMDModuleMutableBuilder[Self <: AMDModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequire(value: String): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentConfig extends StObject {
    
    var createViewModel: js.UndefOr[js.Any] = js.undefined
    
    var template: js.Any
  }
  object ComponentConfig {
    
    @scala.inline
    def apply(template: js.Any): ComponentConfig = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentConfig]
    }
    
    @scala.inline
    implicit class ComponentConfigMutableBuilder[Self <: ComponentConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateViewModel(value: js.Any): Self = StObject.set(x, "createViewModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateViewModelUndefined: Self = StObject.set(x, "createViewModel", js.undefined)
      
      @scala.inline
      def setTemplate(value: js.Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentInfo extends StObject {
    
    var element: Node
    
    var templateNodes: js.Array[Node]
  }
  object ComponentInfo {
    
    @scala.inline
    def apply(element: Node, templateNodes: js.Array[Node]): ComponentInfo = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], templateNodes = templateNodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentInfo]
    }
    
    @scala.inline
    implicit class ComponentInfoMutableBuilder[Self <: ComponentInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: Node): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateNodes(value: js.Array[Node]): Self = StObject.set(x, "templateNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateNodesVarargs(value: Node*): Self = StObject.set(x, "templateNodes", js.Array(value :_*))
    }
  }
  
  trait Config extends StObject {
    
    var synchronous: js.UndefOr[Boolean] = js.undefined
    
    var template: String | js.Array[Node] | DocumentFragment | TemplateElement | AMDModule
    
    var viewModel: js.UndefOr[
        ViewModelFunction | ViewModelSharedInstance | ViewModelFactoryFunction | AMDModule
      ] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(template: String | js.Array[Node] | DocumentFragment | TemplateElement | AMDModule): Config = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
      
      @scala.inline
      def setTemplate(value: String | js.Array[Node] | DocumentFragment | TemplateElement | AMDModule): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateVarargs(value: Node*): Self = StObject.set(x, "template", js.Array(value :_*))
      
      @scala.inline
      def setViewModel(value: ViewModelFunction | ViewModelSharedInstance | ViewModelFactoryFunction | AMDModule): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewModelFunction1(value: /* params */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "viewModel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    }
  }
  
  trait Definition extends StObject {
    
    var createViewModel: js.UndefOr[js.Function2[/* params */ js.Any, /* options */ Element, js.Any]] = js.undefined
    
    var template: js.Array[Node]
  }
  object Definition {
    
    @scala.inline
    def apply(template: js.Array[Node]): Definition = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Definition]
    }
    
    @scala.inline
    implicit class DefinitionMutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateViewModel(value: (/* params */ js.Any, /* options */ Element) => js.Any): Self = StObject.set(x, "createViewModel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateViewModelUndefined: Self = StObject.set(x, "createViewModel", js.undefined)
      
      @scala.inline
      def setTemplate(value: js.Array[Node]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateVarargs(value: Node*): Self = StObject.set(x, "template", js.Array(value :_*))
    }
  }
  
  trait EmptyConfig extends StObject
  
  trait Loader extends StObject {
    
    var getConfig: js.UndefOr[
        js.Function2[
          /* componentName */ String, 
          /* callback */ js.Function1[/* result */ ComponentConfig, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var loadComponent: js.UndefOr[
        js.Function3[
          /* componentName */ String, 
          /* config */ ComponentConfig, 
          /* callback */ js.Function1[/* result */ Definition, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var loadTemplate: js.UndefOr[
        js.Function3[
          /* componentName */ String, 
          /* templateConfig */ js.Any, 
          /* callback */ js.Function1[/* result */ js.Array[Node], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var loadViewModel: js.UndefOr[
        js.Function3[
          /* componentName */ String, 
          /* viewModelConfig */ js.Any, 
          /* callback */ js.Function1[/* result */ js.Any, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var suppressLoaderExceptions: js.UndefOr[Boolean] = js.undefined
  }
  object Loader {
    
    @scala.inline
    def apply(): Loader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Loader]
    }
    
    @scala.inline
    implicit class LoaderMutableBuilder[Self <: Loader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetConfig(
        value: (/* componentName */ String, /* callback */ js.Function1[/* result */ ComponentConfig, Unit]) => Unit
      ): Self = StObject.set(x, "getConfig", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetConfigUndefined: Self = StObject.set(x, "getConfig", js.undefined)
      
      @scala.inline
      def setLoadComponent(
        value: (/* componentName */ String, /* config */ ComponentConfig, /* callback */ js.Function1[/* result */ Definition, Unit]) => Unit
      ): Self = StObject.set(x, "loadComponent", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLoadComponentUndefined: Self = StObject.set(x, "loadComponent", js.undefined)
      
      @scala.inline
      def setLoadTemplate(
        value: (/* componentName */ String, /* templateConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Array[Node], Unit]) => Unit
      ): Self = StObject.set(x, "loadTemplate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLoadTemplateUndefined: Self = StObject.set(x, "loadTemplate", js.undefined)
      
      @scala.inline
      def setLoadViewModel(
        value: (/* componentName */ String, /* viewModelConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Any, Unit]) => Unit
      ): Self = StObject.set(x, "loadViewModel", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLoadViewModelUndefined: Self = StObject.set(x, "loadViewModel", js.undefined)
      
      @scala.inline
      def setSuppressLoaderExceptions(value: Boolean): Self = StObject.set(x, "suppressLoaderExceptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressLoaderExceptionsUndefined: Self = StObject.set(x, "suppressLoaderExceptions", js.undefined)
    }
  }
  
  trait TemplateElement extends StObject {
    
    var element: String | Node
  }
  object TemplateElement {
    
    @scala.inline
    def apply(element: String | Node): TemplateElement = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateElement]
    }
    
    @scala.inline
    implicit class TemplateElementMutableBuilder[Self <: TemplateElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: String | Node): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ViewModelFactoryFunction extends StObject {
    
    def createViewModel(): js.Any = js.native
    def createViewModel(params: js.Any): js.Any = js.native
    def createViewModel(params: js.Any, componentInfo: ComponentInfo): js.Any = js.native
    def createViewModel(params: Unit, componentInfo: ComponentInfo): js.Any = js.native
  }
  
  // viewmodel types
  type ViewModelFunction = js.Function1[/* params */ js.UndefOr[js.Any], js.Any]
  
  trait ViewModelSharedInstance extends StObject {
    
    var instance: js.Any
  }
  object ViewModelSharedInstance {
    
    @scala.inline
    def apply(instance: js.Any): ViewModelSharedInstance = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewModelSharedInstance]
    }
    
    @scala.inline
    implicit class ViewModelSharedInstanceMutableBuilder[Self <: ViewModelSharedInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
}
