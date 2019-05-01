package typings
package json5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object json5Mod {
  type JSONReplacer = js.Function2[
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    js.Any | (js.Array[scala.Double | java.lang.String]) | scala.Null
  ]
}
