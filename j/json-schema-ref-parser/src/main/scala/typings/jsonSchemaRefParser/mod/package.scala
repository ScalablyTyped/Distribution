package typings.jsonSchemaRefParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JSONSchema = typings.jsonSchema.mod.JSONSchema4 | typings.jsonSchema.mod.JSONSchema6
  type RefsCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* $refs */ js.UndefOr[typings.jsonSchemaRefParser.mod.Refs], 
    js.Any
  ]
  type SchemaCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* schema */ js.UndefOr[typings.jsonSchemaRefParser.mod.JSONSchema], 
    js.Any
  ]
}
