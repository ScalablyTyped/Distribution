package typings.hashDotJs

import typings.hashDotJs.hashDotJsNumbers.`192`
import typings.hashDotJs.hashDotJsNumbers.`256`
import typings.hashDotJs.hashDotJsNumbers.`512`
import typings.hashDotJs.hashDotJsNumbers.`64`
import typings.hashDotJs.hashDotJsStrings.big
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha256
  extends BlockHash[Sha256]
     with MessageDigest[Sha256] {
  @JSName("blockSize")
  var blockSize_Sha256: `512` = js.native
  @JSName("endian")
  var endian_Sha256: big = js.native
  @JSName("hmacStrength")
  var hmacStrength_Sha256: `192` = js.native
  @JSName("outSize")
  var outSize_Sha256: `256` = js.native
  @JSName("padLength")
  var padLength_Sha256: `64` = js.native
}

