package typings
package ignoreLib.ignoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ignore extends js.Object {
  /**
     * Adds a rule rules to the current manager.
     * @param  {string | Ignore} pattern
     * @returns IgnoreBase
     */
  def add(pattern: Ignore): Ignore = js.native
  /**
     * Adds a rule rules to the current manager.
     * @param  {string | Ignore} pattern
     * @returns IgnoreBase
     */
  def add(pattern: java.lang.String): Ignore = js.native
  /**
     * Adds several rules to the current manager.
     * @param  {string[]} patterns
     * @returns IgnoreBase
     */
  def add(patterns: js.Array[java.lang.String | Ignore]): Ignore = js.native
  /**
     * Creates a filter function which could filter
     * an array of paths with Array.prototype.filter.
     */
  def createFilter(): js.Function1[/* path */ java.lang.String, scala.Boolean] = js.native
  /**
     * Filters the given array of pathnames, and returns the filtered array.
     * NOTICE that each path here should be a relative path to the root of your repository.
     * @param paths the array of paths to be filtered.
     * @returns The filtered array of paths
     */
  def filter(paths: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  /**
     * Returns Boolean whether pathname should be ignored.
     * @param  {string} pathname a path to check
     * @returns boolean
     */
  def ignores(pathname: java.lang.String): scala.Boolean = js.native
}

