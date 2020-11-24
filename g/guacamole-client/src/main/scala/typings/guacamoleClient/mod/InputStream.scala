package typings.guacamoleClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "InputStream")
@js.native
class InputStream protected ()
  extends typings.guacamoleClient.inputStreamMod.InputStream {
  /**
    * @param client The client owning this stream.
    * @param index The index of this stream.
    */
  def this(client: typings.guacamoleClient.clientMod.Client, index: Double) = this()
}
