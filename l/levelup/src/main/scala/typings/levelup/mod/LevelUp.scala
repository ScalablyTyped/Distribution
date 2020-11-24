package typings.levelup.mod

import typings.abstractLeveldown.mod.AbstractBatch
import typings.abstractLeveldown.mod.AbstractIteratorOptions
import typings.abstractLeveldown.mod.ErrorCallback
import typings.levelup.levelupStrings.batch
import typings.levelup.levelupStrings.clear
import typings.levelup.levelupStrings.closed
import typings.levelup.levelupStrings.closing
import typings.levelup.levelupStrings.del
import typings.levelup.levelupStrings.open
import typings.levelup.levelupStrings.opening
import typings.levelup.levelupStrings.put
import typings.levelup.levelupStrings.ready
import typings.node.NodeJS.ReadableStream
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelUp[DB, Iterator] extends EventEmitter {
  
  def batch(): LevelUpChain[_, _] = js.native
  def batch(array: js.Array[AbstractBatch[_, _]]): js.Promise[Unit] = js.native
  def batch(array: js.Array[AbstractBatch[_, _]], callback: js.Function1[/* err */ js.UndefOr[js.Any], _]): Unit = js.native
  def batch(array: js.Array[AbstractBatch[_, _]], options: js.Any): js.Promise[Unit] = js.native
  def batch(
    array: js.Array[AbstractBatch[_, _]],
    options: js.Any,
    callback: js.Function1[/* err */ js.UndefOr[js.Any], _]
  ): Unit = js.native
  
  var clear: InferDBClear[DB] = js.native
  
  def close(): Unit = js.native
  def close(callback: ErrorCallback): Unit = js.native
  @JSName("close")
  def close_Promise(): js.Promise[Unit] = js.native
  
  def createKeyStream(): ReadableStream = js.native
  def createKeyStream(options: AbstractIteratorOptions[_]): ReadableStream = js.native
  
  def createReadStream(): ReadableStream = js.native
  def createReadStream(options: AbstractIteratorOptions[_]): ReadableStream = js.native
  
  def createValueStream(): ReadableStream = js.native
  def createValueStream(options: AbstractIteratorOptions[_]): ReadableStream = js.native
  
  var del: InferDBDel[DB] = js.native
  
  var get: InferDBGet[DB] = js.native
  
  def isClosed(): Boolean = js.native
  
  def isOpen(): Boolean = js.native
  
  def iterator(): Iterator = js.native
  def iterator(options: AbstractIteratorOptions[_]): Iterator = js.native
  
  /*
    emitted when a batch operation has executed
    */
  @JSName("on")
  def on_batch(event: batch, cb: js.Function1[/* ary */ js.Array[_], Unit]): this.type = js.native
  /*
    emitted when clear is called
    */
  @JSName("on")
  def on_clear(event: clear, cb: js.Function1[/* opts */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_closed(event: closed, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_closing(event: closing, cb: js.Function0[Unit]): this.type = js.native
  /*
    emitted when a value is deleted
    */
  @JSName("on")
  def on_del(event: del, cb: js.Function1[/* key */ js.Any, Unit]): this.type = js.native
  /*
    emitted on given event
    */
  @JSName("on")
  def on_open(event: open, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_opening(event: opening, cb: js.Function0[Unit]): this.type = js.native
  /*
    emitted when a new value is 'put'
    */
  @JSName("on")
  def on_put(event: put, cb: js.Function2[/* key */ js.Any, /* value */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, cb: js.Function0[Unit]): this.type = js.native
  
  def open(): Unit = js.native
  def open(callback: ErrorCallback): Unit = js.native
  @JSName("open")
  def open_Promise(): js.Promise[Unit] = js.native
  
  var put: InferDBPut[DB] = js.native
}
