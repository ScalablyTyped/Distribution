package typings.logform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Colors = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type FormatWrap = js.Function1[/* opts */ js.UndefOr[js.Any], typings.logform.mod.Format_]
  type TransformFunction = js.Function2[
    /* info */ typings.logform.mod.TransformableInfo, 
    /* opts */ js.UndefOr[js.Any], 
    typings.logform.mod.TransformableInfo | scala.Boolean
  ]
}
