package typings.loopbench.mod

import typings.loopbench.loopbenchStrings.load
import typings.loopbench.loopbenchStrings.unload
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Events:
  * - `load`, emitted when `instance.delay > instance.limit`
  * - `unload`, emitted when `overLimit` goes from `true` and `false`
  */
@js.native
trait LoopBench extends EventEmitter {
  /**
    * The delay in milliseconds (and fractions) from the expected run. It might be negative (in older nodes).
    */
  val delay: Double = js.native
  /**
    * The maximum amount of delay that is tolerated before `overLimit` becomes true,
    * and the `load` event is emitted.
    */
  val limit: Double = js.native
  /**
    * Is `true` if the `instance.delay > instance.limit`.
    */
  val overLimit: Boolean = js.native
  @JSName("addListener")
  def addListener_load(event: load, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unload(event: unload, listener: js.Function0[Unit]): this.type = js.native
  @JSName("emit")
  def emit_load(event: load): Boolean = js.native
  @JSName("emit")
  def emit_unload(event: unload): Boolean = js.native
  @JSName("listenerCount")
  def listenerCount_load(`type`: load): Double = js.native
  @JSName("listenerCount")
  def listenerCount_unload(`type`: unload): Double = js.native
  @JSName("listeners")
  def listeners_load(event: load): js.Array[js.Function0[Unit]] = js.native
  @JSName("listeners")
  def listeners_unload(event: unload): js.Array[js.Function0[Unit]] = js.native
  @JSName("off")
  def off_load(event: load, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_unload(event: unload, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_load(event: load, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_unload(event: unload, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_load(event: load, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_unload(event: unload, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_load(event: load, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_unload(event: unload, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_load(event: load, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unload(event: unload, listener: js.Function0[Unit]): this.type = js.native
  @JSName("rawListeners")
  def rawListeners_load(event: load): js.Array[js.Function0[Unit]] = js.native
  @JSName("rawListeners")
  def rawListeners_unload(event: unload): js.Array[js.Function0[Unit]] = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_load(event: load): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_unload(event: unload): this.type = js.native
  @JSName("removeListener")
  def removeListener_load(event: load, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_unload(event: unload, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Stops the sampling.
    */
  def stop(): Unit = js.native
}

