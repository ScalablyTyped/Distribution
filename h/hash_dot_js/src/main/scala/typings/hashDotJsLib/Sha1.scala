package typings
package hashDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha1
  extends BlockHash[Sha1]
     with MessageDigest[Sha1] {
  @JSName("blockSize")
  var blockSize_Sha1: hashDotJsLib.hashDotJsLibNumbers.`512` = js.native
  @JSName("endian")
  var endian_Sha1: hashDotJsLib.hashDotJsLibStrings.big = js.native
  @JSName("hmacStrength")
  var hmacStrength_Sha1: hashDotJsLib.hashDotJsLibNumbers.`80` = js.native
  @JSName("outSize")
  var outSize_Sha1: hashDotJsLib.hashDotJsLibNumbers.`160` = js.native
  @JSName("padLength")
  var padLength_Sha1: hashDotJsLib.hashDotJsLibNumbers.`64` = js.native
}

