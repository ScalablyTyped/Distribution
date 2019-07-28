package typings.hashDotJs

import typings.hashDotJs.hashDotJsNumbers.`1024`
import typings.hashDotJs.hashDotJsNumbers.`128`
import typings.hashDotJs.hashDotJsNumbers.`192`
import typings.hashDotJs.hashDotJsNumbers.`384`
import typings.hashDotJs.hashDotJsStrings.big
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha384
  extends BlockHash[Sha384]
     with MessageDigest[Sha384] {
  @JSName("blockSize")
  var blockSize_Sha384: `1024` = js.native
  @JSName("endian")
  var endian_Sha384: big = js.native
  @JSName("hmacStrength")
  var hmacStrength_Sha384: `192` = js.native
  @JSName("outSize")
  var outSize_Sha384: `384` = js.native
  @JSName("padLength")
  var padLength_Sha384: `128` = js.native
}

