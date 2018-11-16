package typings
package hashDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hmac extends MessageDigest[Hmac] {
  @JSName("blockSize")
  var blockSize_Hmac: hashDotJsLib.hashDotJsLibNumbers.`512` = js.native
  @JSName("outSize")
  var outSize_Hmac: hashDotJsLib.hashDotJsLibNumbers.`160` = js.native
}

