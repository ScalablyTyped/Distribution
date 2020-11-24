package typings.mailparser.mod

import typings.mailparser.mailparserStrings.data
import typings.mailparser.mailparserStrings.headers
import typings.mailparser.mailparserStrings.readable
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mailparser", "MailParser")
@js.native
class MailParser () extends Transform {
  def this(options: TransformOptions) = this()
  
  @JSName("on")
  def on_data(event: data, callback: js.Function1[/* data */ AttachmentStream | MessageText, Unit]): this.type = js.native
  @JSName("on")
  def on_headers(event: headers, callback: js.Function1[/* headers */ Headers, Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, callback: js.Function1[/* data */ AttachmentStream | MessageText, Unit]): this.type = js.native
}
