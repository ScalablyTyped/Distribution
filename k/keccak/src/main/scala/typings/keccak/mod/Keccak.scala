package typings.keccak.mod

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("keccak", "Keccak")
@js.native
class Keccak protected () extends Transform {
  def this(
    rate: Double,
    capacity: Double,
    delimitedSuffix: Double,
    hashBitLength: Double,
    options: TransformOptions
  ) = this()
  def this(
    rate: Double,
    capacity: Double,
    delimitedSuffix: Null,
    hashBitLength: Double,
    options: TransformOptions
  ) = this()
  
  def digest(): Buffer = js.native
  def digest(encoding: BufferEncoding): String = js.native
  
  def update(data: String): Keccak = js.native
  def update(data: String, encoding: BufferEncoding): Keccak = js.native
  def update(data: Buffer): Keccak = js.native
  def update(data: Buffer, encoding: BufferEncoding): Keccak = js.native
}
