package typings.k6

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("k6", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def check[VT](`val`: VT, sets: Checkers[VT]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(`val`.asInstanceOf[js.Any], sets.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def check[VT](`val`: VT, sets: Checkers[VT], tags: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(`val`.asInstanceOf[js.Any], sets.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def fail(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")().asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(err: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(err.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def group[RT](name: String, fn: js.Function0[RT]): RT = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[RT]
  
  @scala.inline
  def sleep(t: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Checker[VT] = js.Function1[/* val */ VT, Boolean]
  
  type Checkers[VT] = StringDictionary[Checker[VT]]
  
  @js.native
  trait JSONArray
    extends StObject
       with Array[JSONValue]
       with _JSONValue
  
  trait JSONObject
    extends StObject
       with /* key */ StringDictionary[JSONValue]
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
