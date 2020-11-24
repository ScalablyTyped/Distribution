package typings.httpsnippet.mod

import typings.harFormat.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetClient extends js.Object {
  
  def apply(source: Request, options: Options): String = js.native
  
  var info: TargetClientInfo = js.native
}
