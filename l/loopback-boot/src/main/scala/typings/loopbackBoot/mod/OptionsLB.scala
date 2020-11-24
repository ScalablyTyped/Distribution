package typings.loopbackBoot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsLB extends js.Object {
  
  /**
    * Directory to use when loading config.json. Defaults to appRootDir.
    */
  var appConfigRootDir: String = js.native
  
  /**
    * Directory to use when loading JSON and JavaScript files.
    * Defaults to the current directory (process.cwd()).
    */
  var appRootDir: String = js.native
  
  /**
    * List of directories where to look for boot scripts.
    */
  var bootDirs: js.Array[String] = js.native
  
  /**
    * List of script files to execute on boot.
    */
  var bootScripts: js.Array[String] = js.native
  
  /**
    * Directory to use when loading component-config.json. Defaults to appRootDir.
    */
  var componentRootDir: String = js.native
  
  /**
    * Component configuration to use instead of {appRootDir}/component-config.json
    */
  var components: js.Any = js.native
  
  /**
    * Object containing DataSource definitions.
    */
  var dataSources: js.Any = js.native
  
  /**
    * Directory to use when loading datasources.json. Defaults to appRootDir.
    */
  var dsRootDir: String = js.native
  
  /**
    * Environment type, defaults to process.env.NODE_ENV or development.
    * Common values are development, staging and production;
    * however the applications are free to use any names.
    */
  var env: String = js.native
  
  /**
    * Middleware configuration to use instead of {appRootDir}/middleware.json
    */
  var middleware: js.Any = js.native
  
  /**
    * Directory to use when loading middleware.json. Defaults to appRootDir.
    */
  var middlewareRootDir: String = js.native
  
  /**
    * List of directories where to look for files containing model mixin definitions.
    * All files (mixins) found in these directory are loaded.
    */
  var mixinDirs: js.Array[String] = js.native
  
  /**
    * List of directories where to look for files containing model mixin definitions.
    *  Only mixins used by application models are loaded from these directories.
    */
  var mixinSources: js.Array[String] = js.native
  
  /**
    * List of model definitions to use. When options.modelDefinitions is provided,
    * loopback-boot does not search filesystem and use only the models provided in this argument.
    */
  var modelDefinitions: js.Array[_] = js.native
  
  /**
    * List of directories where to look for files containing model definitions.
    */
  var modelSources: js.Array[String] = js.native
  
  /**
    * Object containing Model configurations.
    */
  var models: js.Any = js.native
  
  /**
    * Directory to use when loading model-config.json. Defaults to appRootDir.
    */
  var modelsRootDir: String = js.native
  
  /**
    * Mixin normalization format: false, 'none', 'classify', 'dasherize' - defaults to 'classify'.
    */
  var normalization: String | Boolean | js.Any = js.native
}
object OptionsLB {
  
  @scala.inline
  def apply(
    appConfigRootDir: String,
    appRootDir: String,
    bootDirs: js.Array[String],
    bootScripts: js.Array[String],
    componentRootDir: String,
    components: js.Any,
    dataSources: js.Any,
    dsRootDir: String,
    env: String,
    middleware: js.Any,
    middlewareRootDir: String,
    mixinDirs: js.Array[String],
    mixinSources: js.Array[String],
    modelDefinitions: js.Array[_],
    modelSources: js.Array[String],
    models: js.Any,
    modelsRootDir: String,
    normalization: String | Boolean | js.Any
  ): OptionsLB = {
    val __obj = js.Dynamic.literal(appConfigRootDir = appConfigRootDir.asInstanceOf[js.Any], appRootDir = appRootDir.asInstanceOf[js.Any], bootDirs = bootDirs.asInstanceOf[js.Any], bootScripts = bootScripts.asInstanceOf[js.Any], componentRootDir = componentRootDir.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], dataSources = dataSources.asInstanceOf[js.Any], dsRootDir = dsRootDir.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], middlewareRootDir = middlewareRootDir.asInstanceOf[js.Any], mixinDirs = mixinDirs.asInstanceOf[js.Any], mixinSources = mixinSources.asInstanceOf[js.Any], modelDefinitions = modelDefinitions.asInstanceOf[js.Any], modelSources = modelSources.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any], modelsRootDir = modelsRootDir.asInstanceOf[js.Any], normalization = normalization.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsLB]
  }
  
  @scala.inline
  implicit class OptionsLBOps[Self <: OptionsLB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppConfigRootDir(value: String): Self = this.set("appConfigRootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppRootDir(value: String): Self = this.set("appRootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootDirsVarargs(value: String*): Self = this.set("bootDirs", js.Array(value :_*))
    
    @scala.inline
    def setBootDirs(value: js.Array[String]): Self = this.set("bootDirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootScriptsVarargs(value: String*): Self = this.set("bootScripts", js.Array(value :_*))
    
    @scala.inline
    def setBootScripts(value: js.Array[String]): Self = this.set("bootScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRootDir(value: String): Self = this.set("componentRootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponents(value: js.Any): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSources(value: js.Any): Self = this.set("dataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDsRootDir(value: String): Self = this.set("dsRootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleware(value: js.Any): Self = this.set("middleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddlewareRootDir(value: String): Self = this.set("middlewareRootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixinDirsVarargs(value: String*): Self = this.set("mixinDirs", js.Array(value :_*))
    
    @scala.inline
    def setMixinDirs(value: js.Array[String]): Self = this.set("mixinDirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixinSourcesVarargs(value: String*): Self = this.set("mixinSources", js.Array(value :_*))
    
    @scala.inline
    def setMixinSources(value: js.Array[String]): Self = this.set("mixinSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelDefinitionsVarargs(value: js.Any*): Self = this.set("modelDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setModelDefinitions(value: js.Array[_]): Self = this.set("modelDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelSourcesVarargs(value: String*): Self = this.set("modelSources", js.Array(value :_*))
    
    @scala.inline
    def setModelSources(value: js.Array[String]): Self = this.set("modelSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModels(value: js.Any): Self = this.set("models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsRootDir(value: String): Self = this.set("modelsRootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalization(value: String | Boolean | js.Any): Self = this.set("normalization", value.asInstanceOf[js.Any])
  }
}
