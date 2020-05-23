package typings.keccak.mod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keccak", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(algorithm: KeccakAlgorithm): Keccak = js.native
  def apply(algorithm: KeccakAlgorithm, options: TransformOptions): Keccak = js.native
  def apply(algorithm: Sha3Algorithm): Keccak = js.native
  def apply(algorithm: Sha3Algorithm, options: TransformOptions): Keccak = js.native
  def apply(algorithm: ShakeAlgorithm): Shake = js.native
  def apply(algorithm: ShakeAlgorithm, options: TransformOptions): Shake = js.native
}

