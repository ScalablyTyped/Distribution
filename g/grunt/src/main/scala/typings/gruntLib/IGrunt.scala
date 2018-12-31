package typings
package gruntLib

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
  extends gruntLib.gruntNs.IConfigComponents
     with gruntLib.gruntNs.failNs.FailModule
     with gruntLib.gruntNs.ITaskComponents {
  @JSName("config")
  var config_Original: gruntLib.gruntNs.configNs.ConfigModule = js.native
  var event: gruntLib.gruntNs.eventNs.EventModule = js.native
  var fail: gruntLib.gruntNs.failNs.FailModule = js.native
  var file: gruntLib.gruntNs.fileNs.FileModule = js.native
  var log: gruntLib.gruntNs.logNs.LogModule = js.native
  @JSName("option")
  var option_Original: gruntLib.gruntNs.optionNs.OptionModule = js.native
  /**
    * The current Grunt package.json metadata, as an object.
    */
  var `package`: gruntLib.nodeNs.NodePackage = js.native
  var task: gruntLib.gruntNs.taskNs.TaskModule = js.native
  var template: gruntLib.gruntNs.templateNs.TemplateModule = js.native
  var util: gruntLib.gruntNs.utilNs.UtilModule = js.native
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
  def option[T](key: java.lang.String, value: T): scala.Unit = js.native
}

