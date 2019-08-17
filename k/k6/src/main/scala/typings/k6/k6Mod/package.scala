package typings.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object k6Mod {
  import org.scalablytyped.runtime.StringDictionary

  type Checker[VT] = js.Function1[/* val */ VT, Boolean]
  type Checkers[VT] = StringDictionary[Checker[VT]]
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - typings.k6.k6Mod.JSONArray
    - typings.k6.k6Mod.JSONObject
  */
  type JSONValue = _JSONValue | Null | Boolean | Double | String
  type byte = Double
  type bytes = js.Array[byte]
}
