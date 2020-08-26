package typings.guacamoleClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client", "JSONReader")
@js.native
class JSONReader protected ()
  extends typings.guacamoleClient.jsonreaderMod.JSONReader {
  /**
    * @param stream The stream that JSON will be read from.
    */
  def this(stream: typings.guacamoleClient.inputStreamMod.InputStream) = this()
}

