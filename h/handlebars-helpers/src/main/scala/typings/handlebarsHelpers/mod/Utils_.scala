package typings.handlebarsHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils_ extends js.Object {
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
  def changecase(str: String, fn: js.Function1[/* str */ String, String]): String
  /**
    * Remove leading and trailing whitespace and non-word
    * characters from the given string.
    */
  def chop(str: String): String
  /**
    * Returns true if the given value contains the given
    * `object`, optionally passing a starting index.
    */
  def contains[T](`val`: js.Array[T], obj: T, start: Double): Boolean
}

object Utils_ {
  @scala.inline
  def apply(
    changecase: (String, js.Function1[/* str */ String, String]) => String,
    chop: String => String,
    contains: (js.Array[js.Any], js.Any, Double) => Boolean
  ): Utils_ = {
    val __obj = js.Dynamic.literal(changecase = js.Any.fromFunction2(changecase), chop = js.Any.fromFunction1(chop), contains = js.Any.fromFunction3(contains))
  
    __obj.asInstanceOf[Utils_]
  }
}

