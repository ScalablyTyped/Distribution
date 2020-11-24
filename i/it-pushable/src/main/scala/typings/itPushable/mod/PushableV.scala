package typings.itPushable.mod

import typings.std.AsyncIterable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushableV[T]
  extends AsyncIterable[js.Array[T]] {
  
  def end(): this.type = js.native
  def end(err: Error): this.type = js.native
  
  def push(value: T): this.type = js.native
}
