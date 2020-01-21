package typings.libraCore

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("futoin-hkdf", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default(ikm: BuffString, outputLen: Double, options: js.Object): Buffer = js.native
  def expand(hashAlgo: String, hashLen: Double, prk: BuffString, outputLen: Double, info: BuffString): Buffer = js.native
  def extract(hashAlgo: String, hashLen: Double, ikm: BuffString): Buffer = js.native
  def extract(hashAlgo: String, hashLen: Double, ikm: BuffString, salt: BuffString): Buffer = js.native
  @JSName("hash_length")
  def hashLength(hash: String): Double = js.native
}

