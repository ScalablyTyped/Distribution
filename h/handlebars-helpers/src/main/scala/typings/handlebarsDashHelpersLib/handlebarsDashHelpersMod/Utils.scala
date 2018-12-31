package typings
package handlebarsDashHelpersLib.handlebarsDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  /**
    * Change casing on the given `string`, optionally
    * passing a delimiter to use between words in the
    * returned string.
    *
    * ```handlebars
    * utils.changecase('fooBarBaz');
    * //=> 'foo bar baz'
    *
    * utils.changecase('fooBarBaz' '-');
    * //=> 'foo-bar-baz'
    * ```
    */
  def changecase(str: java.lang.String, fn: js.Function1[/* str */ java.lang.String, java.lang.String]): java.lang.String
  /**
    * Remove leading and trailing whitespace and non-word
    * characters from the given string.
    */
  def chop(str: java.lang.String): java.lang.String
  /**
    * Returns true if the given value contains the given
    * `object`, optionally passing a starting index.
    */
  def contains[T](`val`: js.Array[T], obj: T, start: scala.Double): scala.Boolean
}

