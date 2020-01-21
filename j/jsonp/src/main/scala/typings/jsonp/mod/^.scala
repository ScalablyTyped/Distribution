package typings.jsonp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(url: String): CancelFn = js.native
  def apply(url: String, callback: RequestCallback): CancelFn = js.native
  def apply(url: String, options: Options): CancelFn = js.native
  def apply(url: String, options: Options, cb: RequestCallback): CancelFn = js.native
}

