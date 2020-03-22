package typings.knex.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Promise<T> & knex.knex.ExposedPromiseKeys ]: std.Promise<T>[P]} */ @js.native
trait ChainableInterface[T] extends js.Object {
  def asCallback(callback: js.Function): this.type = js.native
  def connection(connection: js.Any): this.type = js.native
  def debug(enabled: Boolean): this.type = js.native
  def options(options: StringDictionary[js.Any]): this.type = js.native
  def pipe[T /* <: WritableStream */](writable: T): PassThrough = js.native
  def pipe[T /* <: WritableStream */](writable: T, options: StringDictionary[js.Any]): PassThrough = js.native
  def stream(): PassThrough = js.native
  def stream(handler: js.Function1[/* readable */ PassThrough, _]): js.Promise[_] = js.native
  def stream(options: StringDictionary[js.Any]): PassThrough = js.native
  def stream(options: StringDictionary[js.Any], handler: js.Function1[/* readable */ PassThrough, _]): js.Promise[_] = js.native
  def toQuery(): String = js.native
  def transacting(trx: Transaction[_, _]): this.type = js.native
}

