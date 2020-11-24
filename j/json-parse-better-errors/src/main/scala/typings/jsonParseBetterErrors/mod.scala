package typings.jsonParseBetterErrors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-parse-better-errors", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Converts a JavaScript Object Notation (JSON) string into an object.
    * @param text A valid JSON string.
    * @param reviver A function that transforms the results. This function is called for each member of the object.
    *               If a member contains nested objects, the nested objects are transformed before the parent object is.
    * @param context The number of characters to display in each direction around the position of an error.
    */
  def apply(txt: String): js.Any = js.native
  def apply(txt: String, reviver: js.UndefOr[scala.Nothing], context: Double): js.Any = js.native
  def apply(txt: String, reviver: js.Function2[/* key */ String, /* value */ js.Any, _]): js.Any = js.native
  def apply(txt: String, reviver: js.Function2[/* key */ String, /* value */ js.Any, _], context: Double): js.Any = js.native
}
