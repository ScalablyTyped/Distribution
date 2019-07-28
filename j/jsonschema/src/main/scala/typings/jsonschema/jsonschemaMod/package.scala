package typings.jsonschema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonschemaMod {
  type CustomFormat = js.Function1[/* input */ js.Any, Boolean]
  type CustomProperty = js.Function4[
    /* instance */ js.Any, 
    /* schema */ Schema, 
    /* options */ Options, 
    /* ctx */ SchemaContext, 
    String | ValidatorResult
  ]
  type RewriteFunction = js.Function4[
    /* instance */ js.Any, 
    /* schema */ Schema, 
    /* options */ Options, 
    /* ctx */ SchemaContext, 
    js.Any
  ]
}
