package typings.kss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CallbackFn = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* styleguide */ typings.kss.mod.KssStyleguide, 
    scala.Unit
  ]
}
