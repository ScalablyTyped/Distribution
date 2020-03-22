package typings.knex.mod

import typings.node.NodeJS.WritableStream
import typings.node.streamMod.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Promise<T> & knex.knex.ExposedPromiseKeys ]: std.Promise<T>[P]} */ @js.native
trait ChainableInterface[T] extends js.Object {
  def asCallback(callback: js.Function): js.Promise[T] = js.native
  def connection(connection: js.Any): this.type = js.native
  def debug(enabled: Boolean): this.type = js.native
  def options(options: js.Object): this.type = js.native
  def pipe[T /* <: WritableStream */](writable: T): PassThrough = js.native
  def pipe[T /* <: WritableStream */](writable: T, options: js.Object): PassThrough = js.native
  def stream(): PassThrough = js.native
  def stream(handler: js.Function1[/* readable */ PassThrough, _]): js.Promise[_] = js.native
  def stream(options: js.Object): PassThrough = js.native
  def stream(options: js.Object, handler: js.Function1[/* readable */ PassThrough, _]): js.Promise[_] = js.native
  def toQuery(): String = js.native
  def transacting(trx: Transaction[_, _]): this.type = js.native
}

