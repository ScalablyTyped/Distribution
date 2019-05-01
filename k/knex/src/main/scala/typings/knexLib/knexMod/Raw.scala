package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Raw
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- knexLib.knexMod.ChainableInterface because Inheritance from two classes. Inlined toQuery, options, connection, debug, transacting, stream, stream, stream, stream, pipe, pipe, asCallback */ @js.native
trait Raw
  extends nodeLib.eventsMod.EventEmitter
     with _ColumnName
     with _TableName {
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def asCallback(callback: js.Function): this.type = js.native
  def connection(connection: js.Any): this.type = js.native
  def debug(enabled: scala.Boolean): this.type = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def options(options: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](writable: T): nodeLib.streamMod.PassThrough = js.native
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](writable: T, options: org.scalablytyped.runtime.StringDictionary[js.Any]): nodeLib.streamMod.PassThrough = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def queryContext(context: js.Any): Raw = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  def stream(): nodeLib.streamMod.PassThrough = js.native
  def stream(handler: js.Function1[/* readable */ nodeLib.streamMod.PassThrough, _]): bluebirdLib.bluebirdMod.^[_] = js.native
  def stream(options: org.scalablytyped.runtime.StringDictionary[js.Any]): nodeLib.streamMod.PassThrough = js.native
  def stream(
    options: org.scalablytyped.runtime.StringDictionary[js.Any],
    handler: js.Function1[/* readable */ nodeLib.streamMod.PassThrough, _]
  ): bluebirdLib.bluebirdMod.^[_] = js.native
  def toQuery(): java.lang.String = js.native
  def toSQL(): Sql = js.native
  def transacting(trx: Transaction): this.type = js.native
  def wrap(before: java.lang.String, after: java.lang.String): Raw = js.native
}

