package typings
package hardDashRejectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Make unhandled promise rejections fail hard right away instead of the default [silent fail](https://gist.github.com/benjamingr/0237932cee84712951a2).
  	@param log - Custom logging function to print the rejected promise. Receives the error stack. Default: `console.error`.
  	*/
  def apply(): scala.Unit = js.native
  def apply(log: js.Function1[/* stack */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
}

