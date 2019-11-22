package typings.intlDashMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFormattersMod {
  import typings.std.Date

  type FormatXMLElementFn = js.Function1[/* repeated */ js.Any, String | js.Object]
  type PrimitiveType = js.UndefOr[String | Double | Boolean | Null | Date]
}
