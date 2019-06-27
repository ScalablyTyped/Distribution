package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object k6Mod {
  type Checker[T] = js.Function1[/* val */ T, scala.Boolean]
  type Checkers[T] = org.scalablytyped.runtime.StringDictionary[Checker[T]]
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - JSONArray
    - JSONObject
  */
  type JSON = _JSON | scala.Null | scala.Boolean | scala.Double | java.lang.String
  type byte = scala.Double
  type bytes = js.Array[byte]
}
