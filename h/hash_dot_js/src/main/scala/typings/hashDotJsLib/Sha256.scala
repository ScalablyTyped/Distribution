package typings
package hashDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha256
  extends BlockHash[Sha256]
     with MessageDigest[Sha256] {
  @JSName("blockSize")
  var blockSize_Sha256: hashDotJsLib.hashDotJsLibNumbers.`512` = js.native
  @JSName("endian")
  var endian_Sha256: hashDotJsLib.hashDotJsLibStrings.big = js.native
  @JSName("hmacStrength")
  var hmacStrength_Sha256: hashDotJsLib.hashDotJsLibNumbers.`192` = js.native
  @JSName("outSize")
  var outSize_Sha256: hashDotJsLib.hashDotJsLibNumbers.`256` = js.native
  @JSName("padLength")
  var padLength_Sha256: hashDotJsLib.hashDotJsLibNumbers.`64` = js.native
}

