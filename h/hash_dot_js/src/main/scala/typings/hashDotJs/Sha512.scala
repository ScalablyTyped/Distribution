package typings.hashDotJs

import typings.hashDotJs.hashDotJsNumbers.`1024`
import typings.hashDotJs.hashDotJsNumbers.`128`
import typings.hashDotJs.hashDotJsNumbers.`192`
import typings.hashDotJs.hashDotJsNumbers.`512`
import typings.hashDotJs.hashDotJsStrings.big
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha512
  extends BlockHash[Sha512]
     with MessageDigest[Sha512] {
  @JSName("blockSize")
  var blockSize_Sha512: `1024` = js.native
  @JSName("endian")
  var endian_Sha512: big = js.native
  @JSName("hmacStrength")
  var hmacStrength_Sha512: `192` = js.native
  @JSName("outSize")
  var outSize_Sha512: `512` = js.native
  @JSName("padLength")
  var padLength_Sha512: `128` = js.native
}

