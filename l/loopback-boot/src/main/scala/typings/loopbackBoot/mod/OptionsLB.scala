package typings.loopbackBoot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsLB extends js.Object {
  /**
    * Directory to use when loading config.json. Defaults to appRootDir.
    */
  var appConfigRootDir: String
  /**
    * Directory to use when loading JSON and JavaScript files.
    * Defaults to the current directory (process.cwd()).
    */
  var appRootDir: String
  /**
    * List of directories where to look for boot scripts.
    */
  var bootDirs: js.Array[String]
  /**
    * List of script files to execute on boot.
    */
  var bootScripts: js.Array[String]
  /**
    * Directory to use when loading component-config.json. Defaults to appRootDir.
    */
  var componentRootDir: String
  /**
    * Component configuration to use instead of {appRootDir}/component-config.json
    */
  var components: js.Any
  /**
    * Object containing DataSource definitions.
    */
  var dataSources: js.Any
  /**
    * Directory to use when loading datasources.json. Defaults to appRootDir.
    */
  var dsRootDir: String
  /**
    * Environment type, defaults to process.env.NODE_ENV or development.
    * Common values are development, staging and production;
    * however the applications are free to use any names.
    */
  var env: String
  /**
    * Middleware configuration to use instead of {appRootDir}/middleware.json
    */
  var middleware: js.Any
  /**
    * Directory to use when loading middleware.json. Defaults to appRootDir.
    */
  var middlewareRootDir: String
  /**
    * List of directories where to look for files containing model mixin definitions.
    * All files (mixins) found in these directory are loaded.
    */
  var mixinDirs: js.Array[String]
  /**
    * List of directories where to look for files containing model mixin definitions.
    *  Only mixins used by application models are loaded from these directories.
    */
  var mixinSources: js.Array[String]
  /**
    * List of model definitions to use. When options.modelDefinitions is provided,
    * loopback-boot does not search filesystem and use only the models provided in this argument.
    */
  var modelDefinitions: js.Array[_]
  /**
    * List of directories where to look for files containing model definitions.
    */
  var modelSources: js.Array[String]
  /**
    * Object containing Model configurations.
    */
  var models: js.Any
  /**
    * Directory to use when loading model-config.json. Defaults to appRootDir.
    */
  var modelsRootDir: String
  /**
    * Mixin normalization format: false, 'none', 'classify', 'dasherize' - defaults to 'classify'.
    */
  var normalization: String | Boolean | js.Any
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
}

