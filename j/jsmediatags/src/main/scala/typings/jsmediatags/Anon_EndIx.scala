package typings.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndIx extends js.Object {
  var endIx: Double
  var insertIx: js.UndefOr[Double] = js.undefined
  var startIx: Double
}

object Anon_EndIx {
  @scala.inline
  def apply(endIx: Double, startIx: Double, insertIx: Int | Double = null): Anon_EndIx = {
    val __obj = js.Dynamic.literal(endIx = endIx, startIx = startIx)
    if (insertIx != null) __obj.updateDynamic("insertIx")(insertIx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndIx]
  }
}

