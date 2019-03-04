package typings
package jqueryDotElangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IELangDBEvents extends js.Object {
  var insert: jqueryLib.JQueryDeferred[_]
  var modify: jqueryLib.JQueryDeferred[_]
  var remove: jqueryLib.JQueryDeferred[_]
  var select: jqueryLib.JQueryDeferred[_]
}

object IELangDBEvents {
  @scala.inline
  def apply(
    insert: jqueryLib.JQueryDeferred[_],
    modify: jqueryLib.JQueryDeferred[_],
    remove: jqueryLib.JQueryDeferred[_],
    select: jqueryLib.JQueryDeferred[_]
  ): IELangDBEvents = {
    val __obj = js.Dynamic.literal(insert = insert, modify = modify, remove = remove, select = select)
  
    __obj.asInstanceOf[IELangDBEvents]
  }
}

