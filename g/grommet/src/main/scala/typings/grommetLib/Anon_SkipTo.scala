package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SkipTo extends js.Object {
  var skipTo: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_SkipTo {
  @scala.inline
  def apply(skipTo: java.lang.String = null): Anon_SkipTo = {
    val __obj = js.Dynamic.literal()
    if (skipTo != null) __obj.updateDynamic("skipTo")(skipTo)
    __obj.asInstanceOf[Anon_SkipTo]
  }
}

