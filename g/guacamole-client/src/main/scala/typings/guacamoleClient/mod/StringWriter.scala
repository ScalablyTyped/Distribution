package typings.guacamoleClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "StringWriter")
@js.native
class StringWriter protected ()
  extends typings.guacamoleClient.stringWriterMod.StringWriter {
  /**
    * @param stream The stream that data will be written to.
    */
  def this(stream: typings.guacamoleClient.outputStreamMod.OutputStream) = this()
}
