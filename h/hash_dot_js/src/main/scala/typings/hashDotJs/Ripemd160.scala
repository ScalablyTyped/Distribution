package typings.hashDotJs

import typings.hashDotJs.hashDotJsNumbers.`160`
import typings.hashDotJs.hashDotJsNumbers.`192`
import typings.hashDotJs.hashDotJsNumbers.`512`
import typings.hashDotJs.hashDotJsNumbers.`64`
import typings.hashDotJs.hashDotJsStrings.little
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ripemd160
  extends BlockHash[Ripemd160]
     with MessageDigest[Ripemd160] {
  @JSName("blockSize")
  var blockSize_Ripemd160: `512` = js.native
  @JSName("endian")
  var endian_Ripemd160: little = js.native
  @JSName("hmacStrength")
  var hmacStrength_Ripemd160: `192` = js.native
  @JSName("outSize")
  var outSize_Ripemd160: `160` = js.native
  @JSName("padLength")
  var padLength_Ripemd160: `64` = js.native
}

