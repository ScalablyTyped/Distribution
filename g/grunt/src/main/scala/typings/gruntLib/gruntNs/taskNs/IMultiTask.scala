package typings
package gruntLib.gruntNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/inside-tasks#inside-multi-tasks}
  */
@js.native
trait IMultiTask[T] extends ITask {
  /**
    * In a multi task, this is the actual data stored in the Grunt config object for the given target.
    * For example, if a "sample" multi task was run as grunt sample:foo with the config data
    * {sample: {foo: "bar"}}, inside the task function, this.data would be "bar".
    *
    * @note It is recommended that this.options this.files and this.filesSrc are used instead of this.data,
    *       as their values are normalized.
    */
  var data: T = js.native
  /**
    * In a multi task, all files specified using any Grunt-supported file formats and options,
    * globbing patterns or dynamic mappings will automatically be normalized into a single format:
    * the Files Array file format.
    *
    * What this means is that tasks don't need to contain a ton of boilerplate for explicitly
    * handling custom file formats, globbing patterns, mapping source files to destination files
    * or filtering out files or directories. A task user can just specify files per the Configuring
    * tasks guide, and Grunt will handle all the details.
    *
    * Your task should iterate over the this.files array, utilizing the src and dest properties of
    * each object in that array. The this.files property will always be an array.
    * The src property will also always be an array, in case your task cares about multiple source
    * files per destination file.
    *
    * @note it's possible that nonexistent files might be included in src values,
    *       so you may want to explicitly test that source files exist before using them.
    */
  var files: gruntLib.gruntNs.fileNs.IFilesArray = js.native
  /**
    * In a multi task, all src files files specified via any file format are reduced to a single array.
    * If your task is "read only" and doesn't care about destination filepaths,
    * use this array instead of this.files.
    */
  var filesSrc: js.Array[java.lang.String] = js.native
  /**
    * In a multi task, this property contains the name of the target currently being iterated over.
    * For example, if a "sample" multi task was run as grunt sample:foo with the config data
    * {sample: {foo: "bar"}}, inside the task function, this.target would be "foo".
    */
  var target: java.lang.String = js.native
}

