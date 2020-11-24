package typings.httpsnippet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Data = typings.harFormat.mod.Har | typings.harFormat.mod.Request
  
  type Options = js.Object
  
  type Target[C /* <: java.lang.String */] = typings.httpsnippet.anon.Info[C] with (typings.std.Record[C, typings.httpsnippet.mod.TargetClient])
}
