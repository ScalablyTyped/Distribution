package typings.jssha.jsshaMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jssha", JSImport.Namespace)
@js.native
class ^ protected () extends Hasher[String] {
  /**
    * Create a Hasher object.
    *
    * @param variant - The desired SHA variant (SHA-1, SHA-224, SHA-256,
    *   SHA-384, SHA-512, SHA3-224, SHA3-256, SHA3-384, SHA3-512, SHAKE128, or SHAKE256).
    * @param inputFormat The format of srcString.
    */
  def this(variant: String, inputFormat: StringDataFormat) = this()
  def this(variant: String, inputFormat: StringDataFormat, options: Options) = this()
}

@JSImport("jssha", JSImport.Namespace)
@js.native
object ^ extends TopLevel[jsSHA]

