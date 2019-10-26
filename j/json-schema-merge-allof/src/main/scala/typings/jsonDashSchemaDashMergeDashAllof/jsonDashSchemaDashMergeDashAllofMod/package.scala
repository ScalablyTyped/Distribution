package typings.jsonDashSchemaDashMergeDashAllof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonDashSchemaDashMergeDashAllofMod {
  import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema4
  import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
  import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema7

  type JSONSchema = JSONSchema4 | JSONSchema6 | JSONSchema7
  type JSONSchema46 = JSONSchema4 | JSONSchema6
  type MergeChildSchemas = js.Function2[/* schemas */ js.Array[JSONSchema], /* childSchemaName */ String, JSONSchema]
  type MergeSchemas = js.Function1[/* schemas */ js.Array[JSONSchema], JSONSchema]
}
