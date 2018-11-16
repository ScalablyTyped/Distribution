package typings
package hashDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha512
  extends BlockHash[Sha512]
     with MessageDigest[Sha512] {
  @JSName("blockSize")
  var blockSize_Sha512: hashDotJsLib.hashDotJsLibNumbers.`1024` = js.native
  @JSName("endian")
  var endian_Sha512: hashDotJsLib.hashDotJsLibStrings.big = js.native
  @JSName("hmacStrength")
  var hmacStrength_Sha512: hashDotJsLib.hashDotJsLibNumbers.`192` = js.native
  @JSName("outSize")
  var outSize_Sha512: hashDotJsLib.hashDotJsLibNumbers.`512` = js.native
  @JSName("padLength")
  var padLength_Sha512: hashDotJsLib.hashDotJsLibNumbers.`128` = js.native
}

