package typings.logkitty

import typings.logkitty.errorsMod.CodeError
import typings.logkitty.typesMod.Entry
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("logkitty/build/formatters", JSImport.Namespace)
@js.native
object formattersMod extends js.Object {
  
  def formatEntry(entry: Entry): String = js.native
  
  def formatError(error: CodeError): String = js.native
  def formatError(error: Error): String = js.native
}
