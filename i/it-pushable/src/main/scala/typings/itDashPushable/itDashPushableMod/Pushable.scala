package typings.itDashPushable.itDashPushableMod

import typings.std.AsyncIterable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pushable[T, R] extends AsyncIterable[R] {
  def end(): this.type = js.native
  def end(err: Error): this.type = js.native
  def push(value: T): this.type = js.native
}

