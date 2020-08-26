package typings.guacamoleClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client", "StringReader")
@js.native
class StringReader protected ()
  extends typings.guacamoleClient.stringReaderMod.StringReader {
  /**
    * @param stream The stream that data will be read from.
    */
  def this(stream: typings.guacamoleClient.inputStreamMod.InputStream) = this()
}

