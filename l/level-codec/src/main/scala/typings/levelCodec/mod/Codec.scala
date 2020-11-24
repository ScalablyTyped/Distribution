package typings.levelCodec.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def encodeKey(key: js.Any, opts: js.UndefOr[scala.Nothing], batchOpts: CodecOptions): js.Any = js.native
  def encodeKey(key: js.Any, opts: CodecOptions): js.Any = js.native
  def encodeKey(key: js.Any, opts: CodecOptions, batchOpts: CodecOptions): js.Any = js.native
  
  def encodeLtgt(ltgt: js.Any): js.Any = js.native
  
  def encodeValue(value: js.Any): js.Any = js.native
  def encodeValue(value: js.Any, opts: js.UndefOr[scala.Nothing], batchOpts: CodecOptions): js.Any = js.native
  def encodeValue(value: js.Any, opts: CodecOptions): js.Any = js.native
  def encodeValue(value: js.Any, opts: CodecOptions, batchOpts: CodecOptions): js.Any = js.native
  
  def keyAsBuffer(): js.Any = js.native
  def keyAsBuffer(opts: CodecOptions): js.Any = js.native
  
  def valueAsBuffer(): js.Any = js.native
  def valueAsBuffer(opts: CodecOptions): js.Any = js.native
}
@JSImport("level-codec", "Codec")
@js.native
object Codec extends TopLevel[CodecConstructor]
