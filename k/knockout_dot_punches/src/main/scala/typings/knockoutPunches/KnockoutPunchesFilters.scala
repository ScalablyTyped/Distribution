package typings.knockoutPunches

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutPunchesFilters extends StObject {
  
  // If the value is blank, null, or an empty array, replace it with the given default value
  def default(value: js.Any): js.Any = js.native
  def default(value: js.Any, defaultValue: js.Any): js.Any = js.native
  
  def fit(value: String): String = js.native
  def fit(
    value: String,
    length: js.UndefOr[scala.Nothing],
    replacement: js.UndefOr[scala.Nothing],
    trimWhere: String
  ): String = js.native
  def fit(value: String, length: js.UndefOr[scala.Nothing], replacement: String): String = js.native
  def fit(value: String, length: js.UndefOr[scala.Nothing], replacement: String, trimWhere: String): String = js.native
  def fit(value: String, length: Double): String = js.native
  def fit(value: String, length: Double, replacement: js.UndefOr[scala.Nothing], trimWhere: String): String = js.native
  def fit(value: String, length: Double, replacement: String): String = js.native
  def fit(value: String, length: Double, replacement: String, trimWhere: String): String = js.native
  // Trim the value if it’s longer than the given length. The trimmed portion is
  // replaced with ... or the replacement value, if given. By default, the value
  // is trimmed on the right but can be changed to left or middle through the
  // where option. For example: name | fit:10::'middle' will
  // convert Shakespeare to Shak...are.
  def fit(value: Double): String = js.native
  def fit(
    value: Double,
    length: js.UndefOr[scala.Nothing],
    replacement: js.UndefOr[scala.Nothing],
    trimWhere: String
  ): String = js.native
  def fit(value: Double, length: js.UndefOr[scala.Nothing], replacement: String): String = js.native
  def fit(value: Double, length: js.UndefOr[scala.Nothing], replacement: String, trimWhere: String): String = js.native
  def fit(value: Double, length: Double): String = js.native
  def fit(value: Double, length: Double, replacement: js.UndefOr[scala.Nothing], trimWhere: String): String = js.native
  def fit(value: Double, length: Double, replacement: String): String = js.native
  def fit(value: Double, length: Double, replacement: String, trimWhere: String): String = js.native
  
  // Convert the value to a JSON string using ko.toJSON. You can give a space value to format the JSON output.
  def json(rootObject: js.Any): String = js.native
  def json(rootObject: js.Any, space: js.UndefOr[scala.Nothing], replacer: js.Any): String = js.native
  def json(rootObject: js.Any, space: js.Any): String = js.native
  def json(rootObject: js.Any, space: js.Any, replacer: js.Any): String = js.native
  
  // Convert the value to lowercase.
  def lowercase(value: String): String = js.native
  
  def number(value: String): String = js.native
  // Format the value using toLocaleString.
  def number(value: Double): String = js.native
  
  // Perform a search and replace on the value using String#replace.
  def replace(value: String, search: String, replace: String): String = js.native
  
  // Convert the value to uppercase.
  def uppercase(value: String): String = js.native
}
