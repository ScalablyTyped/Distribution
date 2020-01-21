package typings.intlMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formattersMod {
  type FormatXMLElementFn = js.Function1[/* repeated */ js.Any, java.lang.String | js.Object]
  type PrimitiveType = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null | typings.std.Date]
}
