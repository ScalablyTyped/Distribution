package typings
package laddaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  def ladda(action: java.lang.String): JQuery
}

object JQueryStatic {
  @scala.inline
  def apply(ladda: js.Function1[java.lang.String, JQuery]): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ladda")(ladda)
    __obj.asInstanceOf[JQueryStatic]
  }
}

