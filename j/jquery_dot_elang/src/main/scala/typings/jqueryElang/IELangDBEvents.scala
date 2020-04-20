package typings.jqueryElang

import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IELangDBEvents extends js.Object {
  var insert: JQueryDeferred[_]
  var modify: JQueryDeferred[_]
  var remove: JQueryDeferred[_]
  var select: JQueryDeferred[_]
}

object IELangDBEvents {
  @scala.inline
  def apply(
    insert: JQueryDeferred[_],
    modify: JQueryDeferred[_],
    remove: JQueryDeferred[_],
    select: JQueryDeferred[_]
  ): IELangDBEvents = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], modify = modify.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangDBEvents]
  }
}

