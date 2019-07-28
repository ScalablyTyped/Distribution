package typings.got.gotMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GotJSONFn extends js.Object {
  def apply(url: GotUrl): GotPromise[_] = js.native
  def apply(url: GotUrl, options: Partial[GotJSONOptions]): GotPromise[_] = js.native
}

