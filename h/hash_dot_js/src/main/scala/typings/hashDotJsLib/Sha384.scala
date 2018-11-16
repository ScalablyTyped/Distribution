package typings
package hashDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha384
  extends BlockHash[Sha384]
     with MessageDigest[Sha384] {
  @JSName("blockSize")
  var blockSize_Sha384: hashDotJsLib.hashDotJsLibNumbers.`1024` = js.native
  @JSName("endian")
  var endian_Sha384: hashDotJsLib.hashDotJsLibStrings.big = js.native
  @JSName("hmacStrength")
  var hmacStrength_Sha384: hashDotJsLib.hashDotJsLibNumbers.`192` = js.native
  @JSName("outSize")
  var outSize_Sha384: hashDotJsLib.hashDotJsLibNumbers.`384` = js.native
  @JSName("padLength")
  var padLength_Sha384: hashDotJsLib.hashDotJsLibNumbers.`128` = js.native
}

