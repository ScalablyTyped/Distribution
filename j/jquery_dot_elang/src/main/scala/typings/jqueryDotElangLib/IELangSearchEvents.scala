package typings
package jqueryDotElangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IELangSearchEvents extends js.Object {
  var select: jqueryLib.JQueryDeferred[_]
}

object IELangSearchEvents {
  @scala.inline
  def apply(select: jqueryLib.JQueryDeferred[_]): IELangSearchEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[IELangSearchEvents]
  }
}

