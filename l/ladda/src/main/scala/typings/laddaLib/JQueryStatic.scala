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
  def apply(ladda: java.lang.String => JQuery): JQueryStatic = {
    val __obj = js.Dynamic.literal(ladda = js.Any.fromFunction1(ladda))
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

