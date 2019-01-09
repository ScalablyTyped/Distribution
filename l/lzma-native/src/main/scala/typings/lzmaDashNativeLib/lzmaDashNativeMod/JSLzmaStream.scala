package typings
package lzmaDashNativeLib.lzmaDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("lzma-native", "JSLzmaStream")
@js.native
class JSLzmaStream protected () extends js.Object {
  def this(nativeStream: nodeLib.streamMod.Stream, options: LzmaOptions) = this()
  def bufsize(): scala.Double = js.native
  def bufsize(size: scala.Double): scala.Unit = js.native
  def cleanUp(): scala.Unit = js.native
  def totalInt(): scala.Double = js.native
  def totalOut(): scala.Double = js.native
}

