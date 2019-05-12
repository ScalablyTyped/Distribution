package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Raw
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- knexLib.knexMod.ChainableInterface because Inheritance from two classes. Inlined toQuery, options, connection, debug, transacting, stream, stream, stream, stream, pipe, pipe, asCallback */ @js.native
trait Raw[TResult]
  extends nodeLib.eventsMod.EventEmitter {
  def asCallback(callback: js.Function): this.type = js.native
  def connection(connection: js.Any): this.type = js.native
  def debug(enabled: scala.Boolean): this.type = js.native
  def options(options: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](writable: ResolveResult[TResult]): nodeLib.streamMod.PassThrough = js.native
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](writable: ResolveResult[TResult], options: org.scalablytyped.runtime.StringDictionary[js.Any]): nodeLib.streamMod.PassThrough = js.native
  def queryContext(context: js.Any): Raw[TResult] = js.native
  def stream(): nodeLib.streamMod.PassThrough = js.native
  def stream(handler: js.Function1[/* readable */ nodeLib.streamMod.PassThrough, _]): bluebirdLib.bluebirdMod.^[_] = js.native
  def stream(options: org.scalablytyped.runtime.StringDictionary[js.Any]): nodeLib.streamMod.PassThrough = js.native
  def stream(
    options: org.scalablytyped.runtime.StringDictionary[js.Any],
    handler: js.Function1[/* readable */ nodeLib.streamMod.PassThrough, _]
  ): bluebirdLib.bluebirdMod.^[_] = js.native
  def toQuery(): java.lang.String = js.native
  def toSQL(): Sql = js.native
  def transacting(trx: Transaction[ResolveResult[TResult]]): this.type = js.native
  def wrap[TResult2](before: java.lang.String, after: java.lang.String): Raw[TResult] = js.native
}

