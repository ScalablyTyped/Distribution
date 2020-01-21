package typings.jsonschema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomFormat = js.Function1[/* input */ js.Any, scala.Boolean]
  type CustomProperty = js.Function4[
    /* instance */ js.Any, 
    /* schema */ typings.jsonschema.mod.Schema, 
    /* options */ typings.jsonschema.mod.Options, 
    /* ctx */ typings.jsonschema.mod.SchemaContext, 
    java.lang.String | typings.jsonschema.mod.ValidatorResult
  ]
  type RewriteFunction = js.Function4[
    /* instance */ js.Any, 
    /* schema */ typings.jsonschema.mod.Schema, 
    /* options */ typings.jsonschema.mod.Options, 
    /* ctx */ typings.jsonschema.mod.SchemaContext, 
    js.Any
  ]
}
