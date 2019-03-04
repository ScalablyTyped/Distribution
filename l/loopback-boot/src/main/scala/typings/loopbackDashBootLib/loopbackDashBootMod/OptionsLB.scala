package typings
package loopbackDashBootLib.loopbackDashBootMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsLB extends js.Object {
  /**
    * Directory to use when loading config.json. Defaults to appRootDir.
    */
  var appConfigRootDir: java.lang.String
  /**
    * Directory to use when loading JSON and JavaScript files.
    * Defaults to the current directory (process.cwd()).
    */
  var appRootDir: java.lang.String
  /**
    * List of directories where to look for boot scripts.
    */
  var bootDirs: js.Array[java.lang.String]
  /**
    * List of script files to execute on boot.
    */
  var bootScripts: js.Array[java.lang.String]
  /**
    * Directory to use when loading component-config.json. Defaults to appRootDir.
    */
  var componentRootDir: java.lang.String
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
  var dsRootDir: java.lang.String
  /**
    * Environment type, defaults to process.env.NODE_ENV or development.
    * Common values are development, staging and production;
    * however the applications are free to use any names.
    */
  var env: java.lang.String
  /**
    * Middleware configuration to use instead of {appRootDir}/middleware.json
    */
  var middleware: js.Any
  /**
    * Directory to use when loading middleware.json. Defaults to appRootDir.
    */
  var middlewareRootDir: java.lang.String
  /**
    * List of directories where to look for files containing model mixin definitions.
    * All files (mixins) found in these directory are loaded.
    */
  var mixinDirs: js.Array[java.lang.String]
  /**
    * List of directories where to look for files containing model mixin definitions.
    *  Only mixins used by application models are loaded from these directories.
    */
  var mixinSources: js.Array[java.lang.String]
  /**
    * List of model definitions to use. When options.modelDefinitions is provided,
    * loopback-boot does not search filesystem and use only the models provided in this argument.
    */
  var modelDefinitions: js.Array[_]
  /**
    * List of directories where to look for files containing model definitions.
    */
  var modelSources: js.Array[java.lang.String]
  /**
    * Object containing Model configurations.
    */
  var models: js.Any
  /**
    * Directory to use when loading model-config.json. Defaults to appRootDir.
    */
  var modelsRootDir: java.lang.String
  /**
    * Mixin normalization format: false, 'none', 'classify', 'dasherize' - defaults to 'classify'.
    */
  var normalization: java.lang.String | scala.Boolean | js.Any
}

object OptionsLB {
  @scala.inline
  def apply(
    appConfigRootDir: java.lang.String,
    appRootDir: java.lang.String,
    bootDirs: js.Array[java.lang.String],
    bootScripts: js.Array[java.lang.String],
    componentRootDir: java.lang.String,
    components: js.Any,
    dataSources: js.Any,
    dsRootDir: java.lang.String,
    env: java.lang.String,
    middleware: js.Any,
    middlewareRootDir: java.lang.String,
    mixinDirs: js.Array[java.lang.String],
    mixinSources: js.Array[java.lang.String],
    modelDefinitions: js.Array[_],
    modelSources: js.Array[java.lang.String],
    models: js.Any,
    modelsRootDir: java.lang.String,
    normalization: java.lang.String | scala.Boolean | js.Any
  ): OptionsLB = {
    val __obj = js.Dynamic.literal(appConfigRootDir = appConfigRootDir, appRootDir = appRootDir, bootDirs = bootDirs, bootScripts = bootScripts, componentRootDir = componentRootDir, components = components, dataSources = dataSources, dsRootDir = dsRootDir, env = env, middleware = middleware, middlewareRootDir = middlewareRootDir, mixinDirs = mixinDirs, mixinSources = mixinSources, modelDefinitions = modelDefinitions, modelSources = modelSources, models = models, modelsRootDir = modelsRootDir, normalization = normalization.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OptionsLB]
  }
}

