package typings.jsonDashFormDashData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonDashFormDashDataMod {
  import typings.std.Blob
  import typings.std.Date
  import typings.std.File
  import typings.std.FormData

  type FormDataFormatter = js.Function2[/* json */ ValidJSON, /* opts */ js.UndefOr[FormatOptions], FormData]
  type ValidJSONValue = js.UndefOr[String | Double | Boolean | File | Blob | Date | Null]
}
