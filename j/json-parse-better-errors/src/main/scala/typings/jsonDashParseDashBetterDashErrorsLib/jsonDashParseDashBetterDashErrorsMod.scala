package typings
package jsonDashParseDashBetterDashErrorsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-parse-better-errors", JSImport.Namespace)
@js.native
object jsonDashParseDashBetterDashErrorsMod extends js.Object {
  /**
   * Converts a JavaScript Object Notation (JSON) string into an object.
   * @param text A valid JSON string.
   * @param reviver A function that transforms the results. This function is called for each member of the object.
   *               If a member contains nested objects, the nested objects are transformed before the parent object is.
   * @param context The number of characters to display in each direction around the position of an error.
   */
  def apply(txt: java.lang.String): js.Any = js.native
  /**
   * Converts a JavaScript Object Notation (JSON) string into an object.
   * @param text A valid JSON string.
   * @param reviver A function that transforms the results. This function is called for each member of the object.
   *               If a member contains nested objects, the nested objects are transformed before the parent object is.
   * @param context The number of characters to display in each direction around the position of an error.
   */
  def apply(txt: java.lang.String, reviver: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]): js.Any = js.native
  /**
   * Converts a JavaScript Object Notation (JSON) string into an object.
   * @param text A valid JSON string.
   * @param reviver A function that transforms the results. This function is called for each member of the object.
   *               If a member contains nested objects, the nested objects are transformed before the parent object is.
   * @param context The number of characters to display in each direction around the position of an error.
   */
  def apply(
    txt: java.lang.String,
    reviver: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    context: scala.Double
  ): js.Any = js.native
}

