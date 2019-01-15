package typings
package loopbenchLib.loopbenchMod.loopbenchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Events:
  * - `load`, emitted when `instance.delay > instance.limit`
  * - `unload`, emitted when `overLimit` goes from `true` and `false`
  */
@js.native
trait LoopBench
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * The delay in milliseconds (and fractions) from the expected run. It might be negative (in older nodes).
    */
  val delay: scala.Double = js.native
  /**
    * The maximum amount of delay that is tolerated before `overLimit` becomes true,
    * and the `load` event is emitted.
    */
  val limit: scala.Double = js.native
  /**
    * Is `true` if the `instance.delay > instance.limit`.
    */
  val overLimit: scala.Boolean = js.native
  @JSName("addListener")
  def addListener_load(event: loopbenchLib.loopbenchLibStrings.load, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unload(event: loopbenchLib.loopbenchLibStrings.unload, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("emit")
  def emit_load(event: loopbenchLib.loopbenchLibStrings.load): scala.Boolean = js.native
  @JSName("emit")
  def emit_unload(event: loopbenchLib.loopbenchLibStrings.unload): scala.Boolean = js.native
  @JSName("listenerCount")
  def listenerCount_load(`type`: loopbenchLib.loopbenchLibStrings.load): scala.Double = js.native
  @JSName("listenerCount")
  def listenerCount_unload(`type`: loopbenchLib.loopbenchLibStrings.unload): scala.Double = js.native
  @JSName("listeners")
  def listeners_load(event: loopbenchLib.loopbenchLibStrings.load): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("listeners")
  def listeners_unload(event: loopbenchLib.loopbenchLibStrings.unload): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("off")
  def off_load(event: loopbenchLib.loopbenchLibStrings.load, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("off")
  def off_unload(event: loopbenchLib.loopbenchLibStrings.unload, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_load(event: loopbenchLib.loopbenchLibStrings.load, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_unload(event: loopbenchLib.loopbenchLibStrings.unload, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_load(event: loopbenchLib.loopbenchLibStrings.load, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_unload(event: loopbenchLib.loopbenchLibStrings.unload, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_load(event: loopbenchLib.loopbenchLibStrings.load, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_unload(event: loopbenchLib.loopbenchLibStrings.unload, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_load(event: loopbenchLib.loopbenchLibStrings.load, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unload(event: loopbenchLib.loopbenchLibStrings.unload, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("rawListeners")
  def rawListeners_load(event: loopbenchLib.loopbenchLibStrings.load): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("rawListeners")
  def rawListeners_unload(event: loopbenchLib.loopbenchLibStrings.unload): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_load(event: loopbenchLib.loopbenchLibStrings.load): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_unload(event: loopbenchLib.loopbenchLibStrings.unload): this.type = js.native
  @JSName("removeListener")
  def removeListener_load(event: loopbenchLib.loopbenchLibStrings.load, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_unload(event: loopbenchLib.loopbenchLibStrings.unload, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Stops the sampling.
    */
  def stop(): scala.Unit = js.native
}

