package typings.imap.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imap", JSImport.Namespace)
@js.native
class ^ protected () extends Connection {
  /** @constructor */
  def this(config: Config) = this()
}

@JSImport("imap", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Parses a raw header and returns an object keyed on header fields and the values are Arrays of header field values. Set disableAutoDecode to true to disable automatic decoding of MIME encoded-words that may exist in header field values. */
  def parseHeader(rawHeader: String): StringDictionary[js.Array[String]] = js.native
  def parseHeader(rawHeader: String, disableAutoDecode: Boolean): StringDictionary[js.Array[String]] = js.native
}

