package typings.kBucket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Arbiter[T /* <: typings.kBucket.mod.Contact */] = js.Function2[/* incumbent */ T, /* candidate */ T, T]
  
  type Distance = js.Function2[
    /* firstId */ typings.std.Uint8Array, 
    /* secondId */ typings.std.Uint8Array, 
    scala.Double
  ]
}
