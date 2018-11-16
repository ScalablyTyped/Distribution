package typings
package knockoutDotPunchesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutPunchesFilters extends js.Object {
  // If the value is blank, null, or an empty array, replace it with the given default value
  def default(value: js.Any): js.Any = js.native
  // If the value is blank, null, or an empty array, replace it with the given default value
  def default(value: js.Any, defaultValue: js.Any): js.Any = js.native
  // Trim the value if it’s longer than the given length. The trimmed portion is
  // replaced with ... or the replacement value, if given. By default, the value
  // is trimmed on the right but can be changed to left or middle through the
  // where option. For example: name | fit:10::'middle' will
  // convert Shakespeare to Shak...are.
  def fit(value: java.lang.String): java.lang.String = js.native
  // Trim the value if it’s longer than the given length. The trimmed portion is
  // replaced with ... or the replacement value, if given. By default, the value
  // is trimmed on the right but can be changed to left or middle through the
  // where option. For example: name | fit:10::'middle' will
  // convert Shakespeare to Shak...are.
  def fit(value: java.lang.String, length: scala.Double): java.lang.String = js.native
  // Trim the value if it’s longer than the given length. The trimmed portion is
  // replaced with ... or the replacement value, if given. By default, the value
  // is trimmed on the right but can be changed to left or middle through the
  // where option. For example: name | fit:10::'middle' will
  // convert Shakespeare to Shak...are.
  def fit(value: java.lang.String, length: scala.Double, replacement: java.lang.String): java.lang.String = js.native
  // Trim the value if it’s longer than the given length. The trimmed portion is
  // replaced with ... or the replacement value, if given. By default, the value
  // is trimmed on the right but can be changed to left or middle through the
  // where option. For example: name | fit:10::'middle' will
  // convert Shakespeare to Shak...are.
  def fit(
    value: java.lang.String,
    length: scala.Double,
    replacement: java.lang.String,
    trimWhere: java.lang.String
  ): java.lang.String = js.native
  // Trim the value if it’s longer than the given length. The trimmed portion is
  // replaced with ... or the replacement value, if given. By default, the value
  // is trimmed on the right but can be changed to left or middle through the
  // where option. For example: name | fit:10::'middle' will
  // convert Shakespeare to Shak...are.
  def fit(value: scala.Double): java.lang.String = js.native
  // Trim the value if it’s longer than the given length. The trimmed portion is
  // replaced with ... or the replacement value, if given. By default, the value
  // is trimmed on the right but can be changed to left or middle through the
  // where option. For example: name | fit:10::'middle' will
  // convert Shakespeare to Shak...are.
  def fit(value: scala.Double, length: scala.Double): java.lang.String = js.native
  // Trim the value if it’s longer than the given length. The trimmed portion is
  // replaced with ... or the replacement value, if given. By default, the value
  // is trimmed on the right but can be changed to left or middle through the
  // where option. For example: name | fit:10::'middle' will
  // convert Shakespeare to Shak...are.
  def fit(value: scala.Double, length: scala.Double, replacement: java.lang.String): java.lang.String = js.native
  // Trim the value if it’s longer than the given length. The trimmed portion is
  // replaced with ... or the replacement value, if given. By default, the value
  // is trimmed on the right but can be changed to left or middle through the
  // where option. For example: name | fit:10::'middle' will
  // convert Shakespeare to Shak...are.
  def fit(
    value: scala.Double,
    length: scala.Double,
    replacement: java.lang.String,
    trimWhere: java.lang.String
  ): java.lang.String = js.native
  // Convert the value to a JSON string using ko.toJSON. You can give a space value to format the JSON output.
  def json(rootObject: js.Any): java.lang.String = js.native
  // Convert the value to a JSON string using ko.toJSON. You can give a space value to format the JSON output.
  def json(rootObject: js.Any, space: js.Any): java.lang.String = js.native
  // Convert the value to a JSON string using ko.toJSON. You can give a space value to format the JSON output.
  def json(rootObject: js.Any, space: js.Any, replacer: js.Any): java.lang.String = js.native
  // Convert the value to lowercase.
  def lowercase(value: java.lang.String): java.lang.String = js.native
  // Format the value using toLocaleString.
  def number(value: java.lang.String): java.lang.String = js.native
  // Format the value using toLocaleString.
  def number(value: scala.Double): java.lang.String = js.native
  // Perform a search and replace on the value using String#replace.
  def replace(value: java.lang.String, search: java.lang.String, replace: java.lang.String): java.lang.String = js.native
  // Convert the value to uppercase.
  def uppercase(value: java.lang.String): java.lang.String = js.native
}

