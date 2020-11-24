package typings.hubot.mod

import typings.std.RegExp
import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hubot", "TextMessage")
@js.native
class TextMessage protected () extends Message {
  def this(user: User, text: String, id: String) = this()
  
  def `match`(regex: RegExp): RegExpMatchArray = js.native
  
  @JSName("text")
  var text_TextMessage: String = js.native
}
