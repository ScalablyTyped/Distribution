package typings.logform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object logformMod {
  import org.scalablytyped.runtime.StringDictionary

  type Colors = StringDictionary[String | js.Array[String]]
  type FormatWrap = js.Function1[/* opts */ js.UndefOr[js.Any], Format]
  type TransformFunction = js.Function2[
    /* info */ TransformableInfo, 
    /* opts */ js.UndefOr[js.Any], 
    TransformableInfo | Boolean
  ]
}
