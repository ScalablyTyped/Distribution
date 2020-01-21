package typings.jsonFormData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormDataFormatter = js.Function2[
    /* json */ typings.jsonFormData.mod.ValidJSON, 
    /* opts */ js.UndefOr[typings.jsonFormData.mod.FormatOptions], 
    typings.std.FormData
  ]
  type ValidJSONValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | typings.std.File | typings.std.Blob | typings.std.Date | scala.Null
  ]
}
