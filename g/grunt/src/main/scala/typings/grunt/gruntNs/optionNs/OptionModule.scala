package typings.grunt.gruntNs.optionNs

import typings.grunt.gruntNs.IFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/api/grunt.option}
  */
@js.native
trait OptionModule extends js.Object {
  /**
    * Returns the options as an array of command line parameters.
    */
  var flags: js.Array[IFlag] = js.native
  def apply[T](key: java.lang.String): T = js.native
  /**
    * Gets or sets an option.
    * Boolean options can be negated by prepending no- onto the key. For example:
    *
    * grunt.option('staging', false);
    * var isDev = grunt.option('no-staging');
    * assert(isDev === true)
    */
  def apply[T](key: java.lang.String, value: T): Unit = js.native
  /**
    * Initialize grunt.option.
    * If initObject is omitted option will be initialized to an empty object
    * otherwise will be set to initObject.
    */
  def init(): Unit = js.native
  def init(initObject: js.Any): Unit = js.native
}

