package typings.jsonParseBetterErrors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Converts a JavaScript Object Notation (JSON) string into an object.
    * @param text A valid JSON string.
    * @param reviver A function that transforms the results. This function is called for each member of the object.
    *               If a member contains nested objects, the nested objects are transformed before the parent object is.
    * @param context The number of characters to display in each direction around the position of an error.
    */
  inline def apply(txt: String): js.Any = ^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def apply(txt: String, reviver: js.Function2[/* key */ String, /* value */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(txt: String, reviver: js.Function2[/* key */ String, /* value */ js.Any, js.Any], context: Double): js.Any = (^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(txt: String, reviver: Unit, context: Double): js.Any = (^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("json-parse-better-errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
