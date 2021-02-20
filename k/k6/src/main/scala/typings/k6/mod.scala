package typings.k6

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("k6", "check")
  @js.native
  def check[VT](`val`: VT, sets: Checkers[VT]): Boolean = js.native
  @JSImport("k6", "check")
  @js.native
  def check[VT](`val`: VT, sets: Checkers[VT], tags: js.Object): Boolean = js.native
  
  @JSImport("k6", "fail")
  @js.native
  def fail(): scala.Nothing = js.native
  @JSImport("k6", "fail")
  @js.native
  def fail(err: String): scala.Nothing = js.native
  
  @JSImport("k6", "group")
  @js.native
  def group[RT](name: String, fn: js.Function0[RT]): RT = js.native
  
  @JSImport("k6", "sleep")
  @js.native
  def sleep(t: Double): Unit = js.native
  
  type Checker[VT] = js.Function1[/* val */ VT, Boolean]
  
  type Checkers[VT] = StringDictionary[Checker[VT]]
  
  @js.native
  trait JSONArray
    extends Array[JSONValue]
       with _JSONValue
  
  @js.native
  trait JSONObject
    extends /* key */ StringDictionary[JSONValue]
       with _JSONValue
  object JSONObject {
    
    @scala.inline
    def apply(): JSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONObject]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - typings.k6.mod.JSONArray
    - typings.k6.mod.JSONObject
  */
  type JSONValue = _JSONValue | Null | Boolean | Double | String
  
  trait _JSONValue extends StObject
  
  type byte = Double
  
  type bytes = js.Array[byte]
}
