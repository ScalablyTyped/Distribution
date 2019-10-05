package typings.grunt

import typings.grunt.grunt.IConfigComponents
import typings.grunt.grunt.ITaskComponents
import typings.grunt.grunt.config.ConfigModule
import typings.grunt.grunt.event.EventModule
import typings.grunt.grunt.fail.FailModule
import typings.grunt.grunt.file.FileModule
import typings.grunt.grunt.log.LogModule
import typings.grunt.grunt.option.OptionModule
import typings.grunt.grunt.task.TaskModule
import typings.grunt.grunt.template.TemplateModule
import typings.grunt.grunt.util.UtilModule
import typings.grunt.node.NodePackage
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

