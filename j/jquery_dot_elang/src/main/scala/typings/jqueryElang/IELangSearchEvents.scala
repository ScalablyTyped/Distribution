package typings.jqueryElang

import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IELangSearchEvents extends js.Object {
  var select: JQueryDeferred[_]
}

object IELangSearchEvents {
  @scala.inline
  def apply(select: JQueryDeferred[_]): IELangSearchEvents = {
    val __obj = js.Dynamic.literal(select = select.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IELangSearchEvents]
  }
}

