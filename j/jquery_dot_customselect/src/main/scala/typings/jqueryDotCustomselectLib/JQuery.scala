package typings
package jqueryDotCustomselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def customSelect(`val`: JQueryCustomSelectOption): JQuery
}

object JQuery {
  @scala.inline
  def apply(customSelect: js.Function1[JQueryCustomSelectOption, JQuery]): JQuery = {
    val __obj = js.Dynamic.literal(customSelect = customSelect)
  
    __obj.asInstanceOf[JQuery]
  }
}

