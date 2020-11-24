package typings.hellosignEmbedded.mod

import typings.hellosignEmbedded.mod.HelloSign.ClassNames
import typings.hellosignEmbedded.mod.HelloSign.Events
import typings.hellosignEmbedded.mod.HelloSign.Locales
import typings.hellosignEmbedded.mod.HelloSign.Messages
import typings.hellosignEmbedded.mod.HelloSign.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hellosign-embedded", JSImport.Default)
@js.native
class default ()
  extends typings.hellosignEmbedded.mod.HelloSign.HelloSign {
  def this(opts: Options) = this()
}
/* static members */
@JSImport("hellosign-embedded", JSImport.Default)
@js.native
object default extends js.Object {
  
  var classNames: ClassNames = js.native
  
  var events: Events = js.native
  
  var locales: Locales = js.native
  
  var messages: Messages = js.native
  
  var version: String = js.native
}
