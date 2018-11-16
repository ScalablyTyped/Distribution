package typings
package hashDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ripemd160
  extends BlockHash[Ripemd160]
     with MessageDigest[Ripemd160] {
  @JSName("blockSize")
  var blockSize_Ripemd160: hashDotJsLib.hashDotJsLibNumbers.`512` = js.native
  @JSName("endian")
  var endian_Ripemd160: hashDotJsLib.hashDotJsLibStrings.little = js.native
  @JSName("hmacStrength")
  var hmacStrength_Ripemd160: hashDotJsLib.hashDotJsLibNumbers.`192` = js.native
  @JSName("outSize")
  var outSize_Ripemd160: hashDotJsLib.hashDotJsLibNumbers.`160` = js.native
  @JSName("padLength")
  var padLength_Ripemd160: hashDotJsLib.hashDotJsLibNumbers.`64` = js.native
}

