package typings.keccak.mod

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keccak", "Shake")
@js.native
class Shake protected () extends Transform {
  def this(rate: Double, capacity: Double, delimitedSuffix: Double, options: TransformOptions) = this()
  def this(rate: Double, capacity: Double, delimitedSuffix: Null, options: TransformOptions) = this()
  def squeeze(dataByteLength: Double): Buffer = js.native
  def squeeze(dataByteLength: Double, encoding: BufferEncoding): String = js.native
  def update(data: String): Shake = js.native
  def update(data: String, encoding: BufferEncoding): Shake = js.native
  def update(data: Buffer): Shake = js.native
  def update(data: Buffer, encoding: BufferEncoding): Shake = js.native
}

