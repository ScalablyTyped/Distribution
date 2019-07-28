package typings.intlDashMessageformat

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFormattersMod {
  type FormatXMLElementFn = js.Function1[/* repeated */ js.Any, String | js.Object]
  type PrimitiveType = js.UndefOr[String | Double | Boolean | Null | Date]
}
