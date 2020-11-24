package typings.jsonschema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CustomFormat = js.Function1[/* input */ js.Any, scala.Boolean]
  
  type CustomProperty = js.Function4[
    /* instance */ js.Any, 
    /* schema */ typings.jsonschema.mod.Schema, 
    /* options */ typings.jsonschema.mod.Options, 
    /* ctx */ typings.jsonschema.mod.SchemaContext, 
    java.lang.String | typings.jsonschema.mod.ValidatorResult
  ]
  
  type PreValidatePropertyFunction = js.Function5[
    /* instance */ js.Any, 
    /* key */ java.lang.String, 
    /* schema */ typings.jsonschema.mod.Schema, 
    /* options */ typings.jsonschema.mod.Options, 
    /* ctx */ typings.jsonschema.mod.SchemaContext, 
    js.Any
  ]
  
  type RewriteFunction = js.Function4[
    /* instance */ js.Any, 
    /* schema */ typings.jsonschema.mod.Schema, 
    /* options */ typings.jsonschema.mod.Options, 
    /* ctx */ typings.jsonschema.mod.SchemaContext, 
    js.Any
  ]
}
