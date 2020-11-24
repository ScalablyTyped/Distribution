package typings.logkitty.apiMod

import typings.logkitty.errorsMod.CodeError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("logkitty/build/api", "formatError")
@js.native
object formatError extends js.Object {
  
  def apply(error: CodeError): String = js.native
  def apply(error: Error): String = js.native
}
