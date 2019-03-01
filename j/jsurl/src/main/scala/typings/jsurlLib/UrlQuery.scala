package typings
package jsurlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlQuery extends js.Object {
  def clear(): scala.Unit
}

object UrlQuery {
  @scala.inline
  def apply(clear: js.Function0[scala.Unit]): UrlQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.asInstanceOf[UrlQuery]
  }
}

