package typings.jake.jakeMod._Global_.jake

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jake.FileList")
@js.native
class FileList () extends js.Object {
  /**
  	 	 * Get rid of any current exclusion rules
    	 */
  def clearExclude(): Unit = js.native
  def exclude(file: (FileFilter | RegExp | String)*): Unit = js.native
  /**
  		 * Excludes file-patterns from the FileList. Should be called with one or more
  		 * pattern for finding file to include in the list. Arguments can be:
  		 * 1. Strings for either a glob-pattern or a specific file-name
  		 * 2. Regular expression literals
  		 * 3. Functions to be run on the filename that return a true/false
  		 */
  def exclude(file: js.Array[FileFilter | RegExp | String]): Unit = js.native
  def include(files: String*): Unit = js.native
  /**
  	     * Includes file-patterns in the FileList. Should be called with one or more
  		 * pattern for finding file to include in the list. Arguments should be strings
  		 * for either a glob-pattern or a specific file-name, or an array of them
  		 */
  def include(files: js.Array[String]): Unit = js.native
  /**
  		 * Populates the FileList from the include/exclude rules with a list of
  		 * actual files
  		 */
  def resolve(): Unit = js.native
  /**
  		 * Indicates whether a particular file would be filtered out by the current
  		 * exclusion rules for this FileList.
  		 * @param name The filename to check
    * @return Whether or not the file should be excluded
    */
  def shouldExclude(name: String): Boolean = js.native
  /**
  		 * Convert to a plain-jane array
  		 */
  def toArray(): js.Array[String] = js.native
}

