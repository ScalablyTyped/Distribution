package typings.knockout.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.DocumentFragment
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object components {
  
  @JSImport("knockout", "components.clearCachedDefinition")
  @js.native
  def clearCachedDefinition(componentName: String): Unit = js.native
  
  @JSImport("knockout", "components.defaultLoader")
  @js.native
  val defaultLoader: DefaultLoader_ = js.native
  
  @JSImport("knockout", "components.get")
  @js.native
  def get(
    componentName: String,
    callback: js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ /* definition */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Config */ /* config */ js.Any, 
      Unit
    ]
  ): String = js.native
  
  @JSImport("knockout", "components.getComponentNameForNode")
  @js.native
  def getComponentNameForNode(node: Node): String = js.native
  
  @JSImport("knockout", "components.isRegistered")
  @js.native
  def isRegistered(componentName: String): Boolean = js.native
  
  @JSImport("knockout", "components.loaders")
  @js.native
  val loaders: js.Array[Loader] = js.native
  
  @JSImport("knockout", "components.register")
  @js.native
  def register(componentName: String, config: js.Object): Unit = js.native
  @JSImport("knockout", "components.register")
  @js.native
  def register(componentName: String, config: Config): Unit = js.native
  
  @JSImport("knockout", "components.unregister")
  @js.native
  def unregister(componentName: String): Unit = js.native
  
  @js.native
  trait Component extends StObject {
    
    var createViewModel: js.UndefOr[CreateViewModel] = js.native
    
    var template: js.Array[Node] = js.native
  }
  object Component {
    
    @scala.inline
    def apply(template: js.Array[Node]): Component = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateViewModel(value: (/* params */ ViewModelParams, /* componentInfo */ ComponentInfo) => ViewModel): Self = StObject.set(x, "createViewModel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateViewModelUndefined: Self = StObject.set(x, "createViewModel", js.undefined)
      
      @scala.inline
      def setTemplate(value: js.Array[Node]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateVarargs(value: Node*): Self = StObject.set(x, "template", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ComponentInfo extends StObject {
    
    var element: Node = js.native
    
    var templateNodes: js.Array[Node] = js.native
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
  
  @js.native
  trait Config extends StObject {
    
    var require: js.UndefOr[String] = js.native
    
    var synchronous: js.UndefOr[Boolean] = js.native
    
    var template: js.UndefOr[RequireConfig | TemplateConfig | js.Any] = js.native
    
    var viewModel: js.UndefOr[RequireConfig | ViewModelConfig | js.Any] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequire(value: String): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      @scala.inline
      def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
      
      @scala.inline
      def setTemplate(value: RequireConfig | TemplateConfig | js.Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTemplateVarargs(value: Node*): Self = StObject.set(x, "template", js.Array(value :_*))
      
      @scala.inline
      def setViewModel(value: RequireConfig | ViewModelConfig | js.Any): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    }
  }
  
  type CreateViewModel = js.Function2[/* params */ ViewModelParams, /* componentInfo */ ComponentInfo, ViewModel]
  
  @js.native
  trait DefaultLoader_ extends Loader {
    
    @JSName("getConfig")
    def getConfig_MDefaultLoader_(componentName: String, callback: js.Function1[/* config */ Config | js.Object, Unit]): Unit = js.native
    
    @JSName("loadComponent")
    def loadComponent_MDefaultLoader_(componentName: String, config: Config, callback: js.Function1[/* component */ Component, Unit]): Unit = js.native
    
    @JSName("loadTemplate")
    def loadTemplate_MDefaultLoader_(
      componentName: String,
      config: TemplateConfig,
      callback: js.Function1[/* resolvedTemplate */ js.Array[Node], Unit]
    ): Unit = js.native
    
    @JSName("loadViewModel")
    def loadViewModel_MDefaultLoader_(
      componentName: String,
      config: ViewModelConfig,
      callback: js.Function1[/* resolvedViewModel */ CreateViewModel, Unit]
    ): Unit = js.native
  }
  object DefaultLoader_ {
    
    @scala.inline
    def apply(
      getConfig: (String, js.Function1[/* config */ Config | js.Object, Unit]) => Unit,
      loadComponent: (String, Config, js.Function1[/* component */ Component, Unit]) => Unit,
      loadTemplate: (String, TemplateConfig, js.Function1[/* resolvedTemplate */ js.Array[Node], Unit]) => Unit,
      loadViewModel: (String, ViewModelConfig, js.Function1[/* resolvedViewModel */ CreateViewModel, Unit]) => Unit
    ): DefaultLoader_ = {
      val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction2(getConfig), loadComponent = js.Any.fromFunction3(loadComponent), loadTemplate = js.Any.fromFunction3(loadTemplate), loadViewModel = js.Any.fromFunction3(loadViewModel))
      __obj.asInstanceOf[DefaultLoader_]
    }
    
    @scala.inline
    implicit class DefaultLoader_MutableBuilder[Self <: DefaultLoader_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetConfig(value: (String, js.Function1[/* config */ Config | js.Object, Unit]) => Unit): Self = StObject.set(x, "getConfig", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadComponent(value: (String, Config, js.Function1[/* component */ Component, Unit]) => Unit): Self = StObject.set(x, "loadComponent", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLoadTemplate(value: (String, TemplateConfig, js.Function1[/* resolvedTemplate */ js.Array[Node], Unit]) => Unit): Self = StObject.set(x, "loadTemplate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLoadViewModel(
        value: (String, ViewModelConfig, js.Function1[/* resolvedViewModel */ CreateViewModel, Unit]) => Unit
      ): Self = StObject.set(x, "loadViewModel", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait Loader extends StObject {
    
    var getConfig: js.UndefOr[
        js.Function2[
          /* componentName */ String, 
          /* callback */ js.Function1[/* config */ Config | js.Object, Unit], 
          Unit
        ]
      ] = js.native
    
    var loadComponent: js.UndefOr[
        js.Function3[
          /* componentName */ String, 
          /* config */ Config | js.Object, 
          /* callback */ js.Function1[/* component */ Component | Null, Unit], 
          Unit
        ]
      ] = js.native
    
    var loadTemplate: js.UndefOr[
        js.Function3[
          /* componentName */ String, 
          /* config */ TemplateConfig | js.Any, 
          /* callback */ js.Function1[/* resolvedTemplate */ js.Array[Node] | Null, Unit], 
          Unit
        ]
      ] = js.native
    
    var loadViewModel: js.UndefOr[
        js.Function3[
          /* componentName */ String, 
          /* config */ ViewModelConfig | js.Any, 
          /* callback */ js.Function1[/* resolvedViewModel */ CreateViewModel | Null, Unit], 
          Unit
        ]
      ] = js.native
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
        value: (/* componentName */ String, /* callback */ js.Function1[/* config */ Config | js.Object, Unit]) => Unit
      ): Self = StObject.set(x, "getConfig", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetConfigUndefined: Self = StObject.set(x, "getConfig", js.undefined)
      
      @scala.inline
      def setLoadComponent(
        value: (/* componentName */ String, /* config */ Config | js.Object, /* callback */ js.Function1[/* component */ Component | Null, Unit]) => Unit
      ): Self = StObject.set(x, "loadComponent", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLoadComponentUndefined: Self = StObject.set(x, "loadComponent", js.undefined)
      
      @scala.inline
      def setLoadTemplate(
        value: (/* componentName */ String, /* config */ TemplateConfig | js.Any, /* callback */ js.Function1[/* resolvedTemplate */ js.Array[Node] | Null, Unit]) => Unit
      ): Self = StObject.set(x, "loadTemplate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLoadTemplateUndefined: Self = StObject.set(x, "loadTemplate", js.undefined)
      
      @scala.inline
      def setLoadViewModel(
        value: (/* componentName */ String, /* config */ ViewModelConfig | js.Any, /* callback */ js.Function1[/* resolvedViewModel */ CreateViewModel | Null, Unit]) => Unit
      ): Self = StObject.set(x, "loadViewModel", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLoadViewModelUndefined: Self = StObject.set(x, "loadViewModel", js.undefined)
    }
  }
  
  @js.native
  trait RequireConfig extends StObject {
    
    var require: String = js.native
  }
  object RequireConfig {
    
    @scala.inline
    def apply(require: String): RequireConfig = {
      val __obj = js.Dynamic.literal(require = require.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequireConfig]
    }
    
    @scala.inline
    implicit class RequireConfigMutableBuilder[Self <: RequireConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequire(value: String): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    }
  }
  
  type TemplateConfig = String | js.Array[Node] | DocumentFragment | TemplateElement
  
  @js.native
  trait TemplateElement extends StObject {
    
    var element: String | Node = js.native
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
  trait ViewModel extends StObject {
    
    var dispose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var koDescendantsComplete: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  }
  object ViewModel {
    
    @scala.inline
    def apply(): ViewModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewModel]
    }
    
    @scala.inline
    implicit class ViewModelMutableBuilder[Self <: ViewModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
      
      @scala.inline
      def setKoDescendantsComplete(value: /* node */ Node => Unit): Self = StObject.set(x, "koDescendantsComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKoDescendantsCompleteUndefined: Self = StObject.set(x, "koDescendantsComplete", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.knockout.mod.components.ViewModelConstructor
    - typings.knockout.mod.components.ViewModelStatic
    - typings.knockout.mod.components.ViewModelFactory
  */
  trait ViewModelConfig extends StObject
  
  @js.native
  trait ViewModelConstructor
    extends ViewModelConfig
       with Instantiable0[ViewModel]
       with Instantiable1[/* params */ ViewModelParams, ViewModel]
  
  @js.native
  trait ViewModelFactory extends ViewModelConfig {
    
    def createViewModel(params: ViewModelParams, componentInfo: ComponentInfo): ViewModel = js.native
    @JSName("createViewModel")
    var createViewModel_Original: CreateViewModel = js.native
  }
  
  type ViewModelParams = StringDictionary[js.Any]
  
  @js.native
  trait ViewModelStatic extends ViewModelConfig {
    
    var instance: js.Any = js.native
  }
  object ViewModelStatic {
    
    @scala.inline
    def apply(instance: js.Any): ViewModelStatic = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewModelStatic]
    }
    
    @scala.inline
    implicit class ViewModelStaticMutableBuilder[Self <: ViewModelStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
}
