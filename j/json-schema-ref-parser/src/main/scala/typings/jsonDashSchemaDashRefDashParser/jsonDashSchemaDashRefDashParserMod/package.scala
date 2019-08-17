package typings.jsonDashSchemaDashRefDashParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonDashSchemaDashRefDashParserMod {
  import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema4
  import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
  import typings.std.Error

  type $RefsCallback = js.Function2[/* err */ Error | Null, /* $refs */ js.UndefOr[$Refs], js.Any]
  type JSONSchema = JSONSchema4 | JSONSchema6
  type SchemaCallback = js.Function2[/* err */ Error | Null, /* schema */ js.UndefOr[JSONSchema], js.Any]
}
