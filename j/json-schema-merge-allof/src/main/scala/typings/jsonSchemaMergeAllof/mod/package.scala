package typings.jsonSchemaMergeAllof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JSONSchema = typings.jsonSchema.mod.JSONSchema4 | typings.jsonSchema.mod.JSONSchema6 | typings.jsonSchema.mod.JSONSchema7
  
  type JSONSchema46 = typings.jsonSchema.mod.JSONSchema4 | typings.jsonSchema.mod.JSONSchema6
  
  type MergeChildSchemas = js.Function2[
    /* schemas */ js.Array[typings.jsonSchemaMergeAllof.mod.JSONSchema], 
    /* childSchemaName */ java.lang.String, 
    typings.jsonSchemaMergeAllof.mod.JSONSchema
  ]
  
  type MergeSchemas = js.Function1[
    /* schemas */ js.Array[typings.jsonSchemaMergeAllof.mod.JSONSchema], 
    typings.jsonSchemaMergeAllof.mod.JSONSchema
  ]
}
