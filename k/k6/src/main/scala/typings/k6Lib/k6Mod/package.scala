package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object k6Mod {
  type Checker[VT] = js.Function1[/* val */ VT, scala.Boolean]
  type Checkers[VT] = org.scalablytyped.runtime.StringDictionary[Checker[VT]]
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - JSONArray
    - JSONObject
  */
  type JSONValue = _JSONValue | scala.Null | scala.Boolean | scala.Double | java.lang.String
  type byte = scala.Double
  type bytes = js.Array[byte]
}
