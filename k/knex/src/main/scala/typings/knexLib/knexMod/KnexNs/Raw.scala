package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Raw
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- knexLib.knexMod.KnexNs.ChainableInterface because Inheritance from two classes. Inlined toQuery, options, connection, debug, transacting, stream, stream, stream, stream, pipe, pipe, asCallback */ @js.native
trait Raw
  extends nodeLib.eventsMod.EventEmitter {
  def asCallback(callback: js.Function): this.type = js.native
  def connection(connection: js.Any): this.type = js.native
  def debug(enabled: scala.Boolean): this.type = js.native
  def options(options: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](writable: T): nodeLib.streamMod.PassThrough = js.native
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](writable: T, options: org.scalablytyped.runtime.StringDictionary[js.Any]): nodeLib.streamMod.PassThrough = js.native
  def queryContext(context: js.Any): Raw = js.native
  def stream(): nodeLib.streamMod.PassThrough = js.native
  def stream(handler: js.Function1[/* readable */ nodeLib.streamMod.PassThrough, _]): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def stream(options: org.scalablytyped.runtime.StringDictionary[js.Any]): nodeLib.streamMod.PassThrough = js.native
  def stream(
    options: org.scalablytyped.runtime.StringDictionary[js.Any],
    handler: js.Function1[/* readable */ nodeLib.streamMod.PassThrough, _]
  ): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def toQuery(): java.lang.String = js.native
  def toSQL(): Sql = js.native
  def transacting(trx: Transaction): this.type = js.native
  def wrap(before: java.lang.String, after: java.lang.String): Raw = js.native
}

