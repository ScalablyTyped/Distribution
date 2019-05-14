package typings
package lineDashByDashLineLib.lineDashByDashLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineByLineReader
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * Stops emitting "line" events, closes the file or stream, and emits the "end" event.
    */
  def close(): scala.Unit = js.native
  /**
    * Emitted if all lines are read.
    * @param event
    * @param listener
    */
  @JSName("on")
  def on_end(event: lineDashByDashLineLib.lineDashByDashLineLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted if an error occured.
    * @param event
    * @param listener A listener that receives the error object.
    */
  @JSName("on")
  def on_error(
    event: lineDashByDashLineLib.lineDashByDashLineLibStrings.error,
    listener: js.Function1[/* err */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted on every line read.
    * @param event
    * @param listener A listener that receives the line without the line terminator.
    */
  @JSName("on")
  def on_line(
    event: lineDashByDashLineLib.lineDashByDashLineLibStrings.line,
    listener: js.Function1[/* line */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * Call this method to stop emitting "line" events.
    */
  def pause(): scala.Unit = js.native
  /**
    * After calling this method, "line" events get emitted again.
    */
  def resume(): scala.Unit = js.native
}

