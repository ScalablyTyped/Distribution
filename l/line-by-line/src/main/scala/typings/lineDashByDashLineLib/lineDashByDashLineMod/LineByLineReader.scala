package typings
package lineDashByDashLineLib.lineDashByDashLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineByLineReader
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * Closes the file stream
    */
  def close(): scala.Unit = js.native
  /**
    * Finishes the reader
    */
  def end(): scala.Unit = js.native
  /**
    * subscribe to an event emitted by reader
    * @param listener A void function with one param
    */
  def on(event: LineByLineReaderEvent, listener: js.Function1[/* value */ js.Any, scala.Unit]): this.type = js.native
  /**
    * Pauses the reader
    */
  def pause(): scala.Unit = js.native
  /**
    * Resumes the reader
    */
  def resume(): scala.Unit = js.native
}

