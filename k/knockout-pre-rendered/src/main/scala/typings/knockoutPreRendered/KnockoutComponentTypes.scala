package typings.knockoutPreRendered

import typings.knockoutPreRendered.anon.Element
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
    
    inline def apply(require: String): AMDModule = {
      val __obj = js.Dynamic.literal(require = require.asInstanceOf[js.Any])
      __obj.asInstanceOf[AMDModule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AMDModule] (val x: Self) extends AnyVal {
      
      inline def setRequire(value: String): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentConfig extends StObject {
    
    var createViewModel: js.UndefOr[Any] = js.undefined
    
    var template: Any
  }
  object ComponentConfig {
    
    inline def apply(template: Any): ComponentConfig = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentConfig] (val x: Self) extends AnyVal {
      
      inline def setCreateViewModel(value: Any): Self = StObject.set(x, "createViewModel", value.asInstanceOf[js.Any])
      
      inline def setCreateViewModelUndefined: Self = StObject.set(x, "createViewModel", js.undefined)
      
      inline def setTemplate(value: Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentInfo extends StObject {
    
    var element: Node
    
    var templateNodes: js.Array[Node]
  }
  object ComponentInfo {
    
    inline def apply(element: Node, templateNodes: js.Array[Node]): ComponentInfo = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], templateNodes = templateNodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentInfo] (val x: Self) extends AnyVal {
      
      inline def setElement(value: Node): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setTemplateNodes(value: js.Array[Node]): Self = StObject.set(x, "templateNodes", value.asInstanceOf[js.Any])
      
      inline def setTemplateNodesVarargs(value: Node*): Self = StObject.set(x, "templateNodes", js.Array(value*))
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
    
    inline def apply(template: String | js.Array[Node] | DocumentFragment | TemplateElement | AMDModule): Config = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
      
      inline def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
      
      inline def setTemplate(value: String | js.Array[Node] | DocumentFragment | TemplateElement | AMDModule): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateVarargs(value: Node*): Self = StObject.set(x, "template", js.Array(value*))
      
      inline def setViewModel(value: ViewModelFunction | ViewModelSharedInstance | ViewModelFactoryFunction | AMDModule): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
      
      inline def setViewModelFunction1(value: /* params */ js.UndefOr[Any] => Any): Self = StObject.set(x, "viewModel", js.Any.fromFunction1(value))
      
      inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    }
  }
  
  trait Definition extends StObject {
    
    var createViewModel: js.UndefOr[js.Function2[/* params */ Any, /* options */ Element, Any]] = js.undefined
    
    var template: js.Array[Node]
  }
  object Definition {
    
    inline def apply(template: js.Array[Node]): Definition = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Definition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
      
      inline def setCreateViewModel(value: (/* params */ Any, /* options */ Element) => Any): Self = StObject.set(x, "createViewModel", js.Any.fromFunction2(value))
      
      inline def setCreateViewModelUndefined: Self = StObject.set(x, "createViewModel", js.undefined)
      
      inline def setTemplate(value: js.Array[Node]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateVarargs(value: Node*): Self = StObject.set(x, "template", js.Array(value*))
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
          /* templateConfig */ Any, 
          /* callback */ js.Function1[/* result */ js.Array[Node], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var loadViewModel: js.UndefOr[
        js.Function3[
          /* componentName */ String, 
          /* viewModelConfig */ Any, 
          /* callback */ js.Function1[/* result */ Any, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var suppressLoaderExceptions: js.UndefOr[Boolean] = js.undefined
  }
  object Loader {
    
    inline def apply(): Loader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Loader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Loader] (val x: Self) extends AnyVal {
      
      inline def setGetConfig(
        value: (/* componentName */ String, /* callback */ js.Function1[/* result */ ComponentConfig, Unit]) => Unit
      ): Self = StObject.set(x, "getConfig", js.Any.fromFunction2(value))
      
      inline def setGetConfigUndefined: Self = StObject.set(x, "getConfig", js.undefined)
      
      inline def setLoadComponent(
        value: (/* componentName */ String, /* config */ ComponentConfig, /* callback */ js.Function1[/* result */ Definition, Unit]) => Unit
      ): Self = StObject.set(x, "loadComponent", js.Any.fromFunction3(value))
      
      inline def setLoadComponentUndefined: Self = StObject.set(x, "loadComponent", js.undefined)
      
      inline def setLoadTemplate(
        value: (/* componentName */ String, /* templateConfig */ Any, /* callback */ js.Function1[/* result */ js.Array[Node], Unit]) => Unit
      ): Self = StObject.set(x, "loadTemplate", js.Any.fromFunction3(value))
      
      inline def setLoadTemplateUndefined: Self = StObject.set(x, "loadTemplate", js.undefined)
      
      inline def setLoadViewModel(
        value: (/* componentName */ String, /* viewModelConfig */ Any, /* callback */ js.Function1[/* result */ Any, Unit]) => Unit
      ): Self = StObject.set(x, "loadViewModel", js.Any.fromFunction3(value))
      
      inline def setLoadViewModelUndefined: Self = StObject.set(x, "loadViewModel", js.undefined)
      
      inline def setSuppressLoaderExceptions(value: Boolean): Self = StObject.set(x, "suppressLoaderExceptions", value.asInstanceOf[js.Any])
      
      inline def setSuppressLoaderExceptionsUndefined: Self = StObject.set(x, "suppressLoaderExceptions", js.undefined)
    }
  }
  
  trait TemplateElement extends StObject {
    
    var element: String | Node
  }
  object TemplateElement {
    
    inline def apply(element: String | Node): TemplateElement = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateElement] (val x: Self) extends AnyVal {
      
      inline def setElement(value: String | Node): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ViewModelFactoryFunction extends StObject {
    
    def createViewModel(): Any = js.native
    def createViewModel(params: Any): Any = js.native
    def createViewModel(params: Any, componentInfo: ComponentInfo): Any = js.native
    def createViewModel(params: Unit, componentInfo: ComponentInfo): Any = js.native
  }
  
  // viewmodel types
  type ViewModelFunction = js.Function1[/* params */ js.UndefOr[Any], Any]
  
  trait ViewModelSharedInstance extends StObject {
    
    var instance: Any
  }
  object ViewModelSharedInstance {
    
    inline def apply(instance: Any): ViewModelSharedInstance = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewModelSharedInstance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewModelSharedInstance] (val x: Self) extends AnyVal {
      
      inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
}
