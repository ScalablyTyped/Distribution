package typings.loaderUtils.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loader-utils", "getHashDigest")
@js.native
object getHashDigest extends js.Object {
  def apply(buffer: Buffer, hashType: HashType, digestType: DigestType, maxLength: Double): String = js.native
}

