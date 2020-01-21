package typings.lzmaNative.mod

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stream.Transform * / any */ @JSImport("lzma-native", "JSLzmaStream")
@js.native
class JSLzmaStream protected () extends js.Object {
  def this(nativeStream: Stream, options: LzmaOptions) = this()
  def bufsize(): Double = js.native
  def bufsize(size: Double): Unit = js.native
  def cleanUp(): Unit = js.native
  def totalInt(): Double = js.native
  def totalOut(): Double = js.native
}

