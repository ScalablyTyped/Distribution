package typings.ignore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ignore_ extends js.Object {
  /**
    * Adds a rule rules to the current manager.
    * @param  {string | Ignore} pattern
    * @returns IgnoreBase
    */
  def add(pattern: String): this.type = js.native
  /**
    * Adds several rules to the current manager.
    * @param  {string[]} patterns
    * @returns IgnoreBase
    */
  def add(patterns: js.Array[String | Ignore_]): this.type = js.native
  def add(pattern: Ignore_): this.type = js.native
  /**
    * Creates a filter function which could filter
    * an array of paths with Array.prototype.filter.
    */
  def createFilter(): js.Function1[/* pathname */ Pathname, Boolean] = js.native
  /**
    * Filters the given array of pathnames, and returns the filtered array.
    * NOTICE that each path here should be a relative path to the root of your repository.
    * @param paths the array of paths to be filtered.
    * @returns The filtered array of paths
    */
  def filter(pathnames: js.Array[Pathname]): js.Array[Pathname] = js.native
  /**
    * Returns Boolean whether pathname should be ignored.
    * @param  {string} pathname a path to check
    * @returns boolean
    */
  def ignores(pathname: Pathname): Boolean = js.native
  /**
    * Returns whether pathname should be ignored or unignored
    * @param  {string} pathname a path to check
    * @returns TestResult
    */
  def test(pathname: Pathname): TestResult = js.native
}

