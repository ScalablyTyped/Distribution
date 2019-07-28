package typings.hashDotJs

import typings.hashDotJs.hashDotJsNumbers.`160`
import typings.hashDotJs.hashDotJsNumbers.`512`
import typings.hashDotJs.hashDotJsNumbers.`64`
import typings.hashDotJs.hashDotJsNumbers.`80`
import typings.hashDotJs.hashDotJsStrings.big
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha1
  extends BlockHash[Sha1]
     with MessageDigest[Sha1] {
  @JSName("blockSize")
  var blockSize_Sha1: `512` = js.native
  @JSName("endian")
  var endian_Sha1: big = js.native
  @JSName("hmacStrength")
  var hmacStrength_Sha1: `80` = js.native
  @JSName("outSize")
  var outSize_Sha1: `160` = js.native
  @JSName("padLength")
  var padLength_Sha1: `64` = js.native
}

