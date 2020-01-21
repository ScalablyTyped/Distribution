package typings.got.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GotBodyFn[T /* <: String | Null */] extends js.Object {
  def apply(url: GotUrl): GotPromise[String | Buffer] = js.native
  def apply(url: GotUrl, options: GotBodyOptions[T]): GotPromise[String | Buffer] = js.native
}

