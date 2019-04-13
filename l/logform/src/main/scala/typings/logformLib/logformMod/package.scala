package typings
package logformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object logformMod {
  type Colors = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type FormatWrap = js.Function1[/* opts */ js.UndefOr[js.Any], Format]
  type TransformFunction = js.Function2[
    /* info */ TransformableInfo, 
    /* opts */ js.UndefOr[js.Any], 
    TransformableInfo | scala.Boolean
  ]
}
