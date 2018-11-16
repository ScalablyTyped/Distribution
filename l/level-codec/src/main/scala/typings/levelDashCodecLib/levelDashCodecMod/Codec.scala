package typings
package levelDashCodecLib.levelDashCodecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Codec extends js.Object {
  def createStreamDecoder(opts: CodecOptions): js.Any = js.native
  def decodeKey(key: js.Any): js.Any = js.native
  def decodeKey(key: js.Any, opts: CodecOptions): js.Any = js.native
  def decodeValue(value: js.Any): js.Any = js.native
  def decodeValue(value: js.Any, opts: CodecOptions): js.Any = js.native
  def encodeBatch(ops: js.Any): js.Any = js.native
  def encodeBatch(ops: js.Any, opts: CodecOptions): js.Any = js.native
  def encodeKey(key: js.Any): js.Any = js.native
  def encodeKey(key: js.Any, opts: CodecOptions): js.Any = js.native
  def encodeKey(key: js.Any, opts: CodecOptions, batchOpts: CodecOptions): js.Any = js.native
  def encodeLtgt(ltgt: js.Any): js.Any = js.native
  def encodeValue(value: js.Any): js.Any = js.native
  def encodeValue(value: js.Any, opts: CodecOptions): js.Any = js.native
  def encodeValue(value: js.Any, opts: CodecOptions, batchOpts: CodecOptions): js.Any = js.native
  def keyAsBuffer(): js.Any = js.native
  def keyAsBuffer(opts: CodecOptions): js.Any = js.native
  def valueAsBuffer(): js.Any = js.native
  def valueAsBuffer(opts: CodecOptions): js.Any = js.native
}

