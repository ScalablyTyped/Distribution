package typings
package lazyDotJsLib.LazyJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncHandle[T] extends js.Object {
  def cancel(): scala.Unit
  def onComplete(callback: Callback): scala.Unit
  def onError(callback: ErrorCallback): scala.Unit
}

