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
  def apply(clear: () => scala.Unit): UrlQuery = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
  
    __obj.asInstanceOf[UrlQuery]
  }
}

