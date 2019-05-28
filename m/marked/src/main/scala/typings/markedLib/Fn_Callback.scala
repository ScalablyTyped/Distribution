package typings
package markedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Callback extends js.Object {
  def apply(src: java.lang.String): java.lang.String = js.native
  def apply(
    src: java.lang.String,
    callback: js.Function2[/* error */ js.UndefOr[_], /* parseResult */ java.lang.String, scala.Unit]
  ): java.lang.String = js.native
  def apply(src: java.lang.String, options: markedLib.markedMod.MarkedOptions): java.lang.String = js.native
  def apply(
    src: java.lang.String,
    options: markedLib.markedMod.MarkedOptions,
    callback: js.Function2[/* error */ js.UndefOr[_], /* parseResult */ java.lang.String, scala.Unit]
  ): java.lang.String = js.native
}

