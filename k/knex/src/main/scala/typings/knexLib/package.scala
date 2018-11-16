package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object knexLib {
  type Callback = js.Function1[/* repeated */js.Any, scala.Unit]
  type Client = js.Function1[/* repeated */js.Any, scala.Unit]
  type ColumnName = java.lang.String | js.Any | ScalablyTyped.runtime.StringDictionary[java.lang.String]
  type TableName = java.lang.String | js.Any
  type Value = java.lang.String | scala.Double | scala.Boolean | stdLib.Date | js.Array[java.lang.String] | js.Array[scala.Double] | js.Array[stdLib.Date] | js.Array[scala.Boolean] | nodeLib.Buffer | js.Any
}
