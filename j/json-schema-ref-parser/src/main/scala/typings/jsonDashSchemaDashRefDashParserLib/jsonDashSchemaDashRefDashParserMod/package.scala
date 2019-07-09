package typings
package jsonDashSchemaDashRefDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonDashSchemaDashRefDashParserMod {
  type $RefsCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* $refs */ js.UndefOr[$Refs], js.Any]
  type JSONSchema = jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4 | jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6
  type SchemaCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* schema */ js.UndefOr[JSONSchema], js.Any]
}
