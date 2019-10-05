package typings.mailcheck

import typings.mailcheck.MailcheckModule.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def mailcheck(opts: IOptions): Unit
}

object JQuery {
  @scala.inline
  def apply(mailcheck: IOptions => Unit): JQuery = {
    val __obj = js.Dynamic.literal(mailcheck = js.Any.fromFunction1(mailcheck))
  
    __obj.asInstanceOf[JQuery]
  }
}

