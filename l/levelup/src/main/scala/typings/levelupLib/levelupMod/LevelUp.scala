package typings
package levelupLib.levelupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelUp[DB]
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("del")
  var del_Original: levelupLib.InferDBDel[DB] = js.native
  @JSName("get")
  var get_Original: levelupLib.InferDBGet[DB] = js.native
  @JSName("put")
  var put_Original: levelupLib.InferDBPut[DB] = js.native
  def batch(): LevelUpChain[_, _] = js.native
  def batch(array: js.Array[abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractBatch[_, _]]): js.Promise[scala.Unit] = js.native
  def batch(
    array: js.Array[abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractBatch[_, _]],
    callback: js.Function1[/* err */ js.UndefOr[js.Any], _]
  ): scala.Unit = js.native
  def batch(
    array: js.Array[abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractBatch[_, _]],
    options: js.Any
  ): js.Promise[scala.Unit] = js.native
  def batch(
    array: js.Array[abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractBatch[_, _]],
    options: js.Any,
    callback: js.Function1[/* err */ js.UndefOr[js.Any], _]
  ): scala.Unit = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def close(callback: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback): scala.Unit = js.native
  @JSName("close")
  def close_Unit(): scala.Unit = js.native
  def createKeyStream(): nodeLib.NodeJSNs.ReadableStream = js.native
  def createKeyStream(options: abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractIteratorOptions[_]): nodeLib.NodeJSNs.ReadableStream = js.native
  def createReadStream(): nodeLib.NodeJSNs.ReadableStream = js.native
  def createReadStream(options: abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractIteratorOptions[_]): nodeLib.NodeJSNs.ReadableStream = js.native
  def createValueStream(): nodeLib.NodeJSNs.ReadableStream = js.native
  def createValueStream(options: abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractIteratorOptions[_]): nodeLib.NodeJSNs.ReadableStream = js.native
  def del(key: js.Any): js.Promise[scala.Unit] = js.native
  def del(
    key: js.Any,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AbstractOptions */ js.Any
  ): js.Promise[scala.Unit] = js.native
  def del(
    key: js.Any,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AbstractOptions */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ErrorCallback */ js.Any
  ): scala.Unit = js.native
  @JSName("del")
  def del_Unit(
    key: js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ErrorCallback */ js.Any
  ): scala.Unit = js.native
  def get(key: js.Any): js.Promise[_] = js.native
  def get(
    key: js.Any,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AbstractGetOptions */ js.Any
  ): js.Promise[_] = js.native
  def get(
    key: js.Any,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AbstractGetOptions */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ErrorValueCallback<V> */ js.Any
  ): scala.Unit = js.native
  @JSName("get")
  def get_Unit(
    key: js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ErrorValueCallback<V> */ js.Any
  ): scala.Unit = js.native
  def isClosed(): scala.Boolean = js.native
  def isOpen(): scala.Boolean = js.native
  /*
    emitted when a batch operation has executed
    */
  @JSName("on")
  def on_batch(event: levelupLib.levelupLibStrings.batch, cb: js.Function1[/* ary */ js.Array[_], scala.Unit]): this.type = js.native
  @JSName("on")
  def on_closed(event: levelupLib.levelupLibStrings.closed, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_closing(event: levelupLib.levelupLibStrings.closing, cb: js.Function0[scala.Unit]): this.type = js.native
  /*
    emitted when a value is deleted
    */
  @JSName("on")
  def on_del(event: levelupLib.levelupLibStrings.del, cb: js.Function1[/* key */ js.Any, scala.Unit]): this.type = js.native
  /*
    emitted on given event
    */
  @JSName("on")
  def on_open(event: levelupLib.levelupLibStrings.open, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_opening(event: levelupLib.levelupLibStrings.opening, cb: js.Function0[scala.Unit]): this.type = js.native
  /*
    emitted when a new value is 'put'
    */
  @JSName("on")
  def on_put(
    event: levelupLib.levelupLibStrings.put,
    cb: js.Function2[/* key */ js.Any, /* value */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ready(event: levelupLib.levelupLibStrings.ready, cb: js.Function0[scala.Unit]): this.type = js.native
  def open(): js.Promise[scala.Unit] = js.native
  def open(callback: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback): scala.Unit = js.native
  @JSName("open")
  def open_Unit(): scala.Unit = js.native
  def put(key: js.Any, value: js.Any): js.Promise[scala.Unit] = js.native
  def put(
    key: js.Any,
    value: js.Any,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AbstractOptions */ js.Any
  ): js.Promise[scala.Unit] = js.native
  def put(
    key: js.Any,
    value: js.Any,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AbstractOptions */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ErrorCallback */ js.Any
  ): scala.Unit = js.native
  @JSName("put")
  def put_Unit(
    key: js.Any,
    value: js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ErrorCallback */ js.Any
  ): scala.Unit = js.native
}

