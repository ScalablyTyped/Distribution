package typings.logkitty

import typings.logkitty.errorsMod.CodeError
import typings.logkitty.typesMod.Entry
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formattersMod {
  
  @JSImport("logkitty/build/formatters", "formatEntry")
  @js.native
  def formatEntry(entry: Entry): String = js.native
  
  @JSImport("logkitty/build/formatters", "formatError")
  @js.native
  def formatError(error: CodeError): String = js.native
  @JSImport("logkitty/build/formatters", "formatError")
  @js.native
  def formatError(error: Error): String = js.native
}
