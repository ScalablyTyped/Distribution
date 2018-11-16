package typings
package hashDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha224
  extends BlockHash[Sha224]
     with MessageDigest[Sha224] {
  @JSName("blockSize")
  var blockSize_Sha224: hashDotJsLib.hashDotJsLibNumbers.`512` = js.native
  @JSName("endian")
  var endian_Sha224: hashDotJsLib.hashDotJsLibStrings.big = js.native
  @JSName("hmacStrength")
  var hmacStrength_Sha224: hashDotJsLib.hashDotJsLibNumbers.`192` = js.native
  @JSName("outSize")
  var outSize_Sha224: hashDotJsLib.hashDotJsLibNumbers.`224` = js.native
  @JSName("padLength")
  var padLength_Sha224: hashDotJsLib.hashDotJsLibNumbers.`64` = js.native
}

