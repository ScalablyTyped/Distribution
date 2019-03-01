package typings
package jqueryDotElangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IELangEditEvents extends js.Object {
  var insert: jqueryLib.JQueryDeferred[_]
  var modify: jqueryLib.JQueryDeferred[_]
  var remove: jqueryLib.JQueryDeferred[_]
  var select: jqueryLib.JQueryDeferred[_]
}

object IELangEditEvents {
  @scala.inline
  def apply(
    insert: jqueryLib.JQueryDeferred[_],
    modify: jqueryLib.JQueryDeferred[_],
    remove: jqueryLib.JQueryDeferred[_],
    select: jqueryLib.JQueryDeferred[_]
  ): IELangEditEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("modify")(modify)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[IELangEditEvents]
  }
}

