package typings.grunt

import typings.grunt.gruntNs.IConfigComponents
import typings.grunt.gruntNs.ITaskComponents
import typings.grunt.gruntNs.configNs.ConfigModule
import typings.grunt.gruntNs.eventNs.EventModule
import typings.grunt.gruntNs.failNs.FailModule
import typings.grunt.gruntNs.fileNs.FileModule
import typings.grunt.gruntNs.logNs.LogModule
import typings.grunt.gruntNs.optionNs.OptionModule
import typings.grunt.gruntNs.taskNs.TaskModule
import typings.grunt.gruntNs.templateNs.TemplateModule
import typings.grunt.gruntNs.utilNs.UtilModule
import typings.grunt.nodeNs.NodePackage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* GRUNT MODULE
  **************/
/**
  * The main Grunt module.
  *
  * {@link http://gruntjs.com/api/grunt}
  */
@js.native
trait IGrunt
  extends IConfigComponents
     with FailModule
     with ITaskComponents {
  @JSName("config")
  var config_Original: ConfigModule = js.native
  var event: EventModule = js.native
  var fail: FailModule = js.native
  var file: FileModule = js.native
  var log: LogModule = js.native
  @JSName("option")
  var option_Original: OptionModule = js.native
  /**
    * The current Grunt package.json metadata, as an object.
    */
  var `package`: NodePackage = js.native
  var task: TaskModule = js.native
  var template: TemplateModule = js.native
  var util: UtilModule = js.native
  /**
    * The current Grunt version, as a string. This is just a shortcut to the grunt.package.version property.
    */
  var version: java.lang.String = js.native
  def config(prop: java.lang.String): js.Any = js.native
  /**
    * Get or set a value from the project's Grunt configuration.
    * This method serves as an alias to other methods;
    * if two arguments are passed, grunt.config.set is called,
    * otherwise grunt.config.get is called.
    */
  def config(prop: java.lang.String, value: js.Any): js.Any = js.native
  def option[T](key: java.lang.String): T = js.native
  /**
    * Gets or sets an option.
    * Boolean options can be negated by prepending no- onto the key. For example:
    *
    * grunt.option('staging', false);
    * var isDev = grunt.option('no-staging');
    * assert(isDev === true)
    */
  def option[T](key: java.lang.String, value: T): Unit = js.native
}

