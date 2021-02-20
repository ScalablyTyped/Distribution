package typings.loopbackBoot

import typings.loopback.mod.LoopBackApplication
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Use this API in the app.js file of your server-side Node.js application.
    * ```
    * var loopback= require('loopback');
    * var boot = require('loopback-boot');
    *
    * var app = module.exports = loopback();
    *
    * boot(app, __dirname);
    *
    * ```
    *
    * Initialize an application from an options object or a set of JSON and JavaScript files.
    *
    * NOTE: This module is primarily intended for use with LoopBack 2.0. It does work with LoopBack 1.x applications,
    * but none of the LoopBack 1.x examples or generated code (scaffolding) use it.
    *
    * This function takes an optional argument that is either a string or an object.
    *
    * If the argument is a string, then it sets the application root directory based on the string value. Then it:
    *    Creates DataSources from the datasources.json file in the application root directory.
    *
    *    Configures Models from the model-config.json file in the application root directory.
    *
    *    Configures the LoopBack Application object from the config.json file in the application root directory.
    * These properties can be accessed using app.get('propname').
    *
    *    If the argument is an object, then it looks for models, dataSources, 'config', modelsRootDir, dsRootDir,
    *  appConfigRootDir and appRootDir properties of the object.
    *
    * If the object has no appRootDir property then it sets the current working directory as the application root directory.
    *
    * The execution environment, {env}, is established from, in order,
    *
    * options.env
    * process.env.NODE_ENV,
    * the literal development.
    * Then it:
    * Creates DataSources from the options.dataSources object, if provided; otherwise, it searches for the files
    * datasources.json,
    * datasources.local.js or datasources.local.json (only one),
    * datasources.{env}.js or datasources.{env}.json (only one)
    * in the directory designated by 'options.dsRootDir', if present, or the application root directory. It merges the data source definitions from the files found.
    * Creates Models from the options.models object, if provided; otherwise, it searches for the files
    * model-config.json,
    * model-config.local.js or model-config.local.json (only one),
    * model-config.{env}.js or model-config.{env}.json (only one)
    * in the directory designated by 'options.modelsRootDir', if present, or the application root directory. It merges the model definitions from the files found.
    * Configures the Application object from the options.config object, if provided; otherwise, it searches for the files
    * config.json,
    * config.local.js or config.local.json (only one),
    * config.{env}.js or config.{env}.json (only one)
    *
    * in the directory designated by 'options.appConfigRootDir', if present, or the application root directory.
    *  It merges the properties from the files found.
    *
    * In both cases, the function loads JavaScript files in the /boot subdirectory of the application root directory
    * with require().
    *
    * NOTE: The version 2.0 of loopback-boot changed the way how models are created.
    *  The model-config.json file contains only configuration options like dataSource and extra relations.
    * To define a model, create a per-model JSON file in models/ directory.
    *
    * NOTE: Mixing bootLoopBackApp(app, bootConfig) and app.model(name, modelConfig) in multiple files may result in models being undefined due to race conditions.
    * To avoid this when using bootLoopBackApp() make sure all models are passed as part of the models definition.
    * Throws an error if the config object is not valid or if boot fails.
    *
    * @param app LoopBack application created by loopback().
    * @param options Boot options; If String, this is the application root directory; if object, has below properties.
    */
  @JSImport("loopback-boot", JSImport.Namespace)
  @js.native
  def apply(app: LoopBackApplication, options: String): Unit = js.native
  @JSImport("loopback-boot", JSImport.Namespace)
  @js.native
  def apply(app: LoopBackApplication, options: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("loopback-boot", JSImport.Namespace)
  @js.native
  def apply(app: LoopBackApplication, options: OptionsLB): Unit = js.native
  @JSImport("loopback-boot", JSImport.Namespace)
  @js.native
  def apply(app: LoopBackApplication, options: OptionsLB, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * compileToBrowserify
    *
    * Compile boot instructions and add them to a browserify bundler.
    * @param options as described in bootLoopBackApp above.
    * @param bundler A browserify bundler created by browserify().
    */
  @JSImport("loopback-boot", "compileToBrowserify")
  @js.native
  class compileToBrowserify protected () extends StObject {
    def this(options: String, bundler: js.Any) = this()
    def this(options: js.Any, bundler: js.Any) = this()
    
    /**
      * Application identifier used to load the correct boot configuration when
      * building multiple applications using browserify.
      */
    var appId: String = js.native
  }
  
  @js.native
  trait OptionsLB extends StObject {
    
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
    implicit class OptionsLBMutableBuilder[Self <: OptionsLB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppConfigRootDir(value: String): Self = StObject.set(x, "appConfigRootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppRootDir(value: String): Self = StObject.set(x, "appRootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootDirs(value: js.Array[String]): Self = StObject.set(x, "bootDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootDirsVarargs(value: String*): Self = StObject.set(x, "bootDirs", js.Array(value :_*))
      
      @scala.inline
      def setBootScripts(value: js.Array[String]): Self = StObject.set(x, "bootScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootScriptsVarargs(value: String*): Self = StObject.set(x, "bootScripts", js.Array(value :_*))
      
      @scala.inline
      def setComponentRootDir(value: String): Self = StObject.set(x, "componentRootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponents(value: js.Any): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSources(value: js.Any): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDsRootDir(value: String): Self = StObject.set(x, "dsRootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddleware(value: js.Any): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddlewareRootDir(value: String): Self = StObject.set(x, "middlewareRootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinDirs(value: js.Array[String]): Self = StObject.set(x, "mixinDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinDirsVarargs(value: String*): Self = StObject.set(x, "mixinDirs", js.Array(value :_*))
      
      @scala.inline
      def setMixinSources(value: js.Array[String]): Self = StObject.set(x, "mixinSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinSourcesVarargs(value: String*): Self = StObject.set(x, "mixinSources", js.Array(value :_*))
      
      @scala.inline
      def setModelDefinitions(value: js.Array[_]): Self = StObject.set(x, "modelDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelDefinitionsVarargs(value: js.Any*): Self = StObject.set(x, "modelDefinitions", js.Array(value :_*))
      
      @scala.inline
      def setModelSources(value: js.Array[String]): Self = StObject.set(x, "modelSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelSourcesVarargs(value: String*): Self = StObject.set(x, "modelSources", js.Array(value :_*))
      
      @scala.inline
      def setModels(value: js.Any): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelsRootDir(value: String): Self = StObject.set(x, "modelsRootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalization(value: String | Boolean | js.Any): Self = StObject.set(x, "normalization", value.asInstanceOf[js.Any])
    }
  }
}
