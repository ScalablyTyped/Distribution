package typings.jqueryDashUrlparam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  def urlParam(variable: String): String
}

object JQueryStatic {
  @scala.inline
  def apply(urlParam: String => String): JQueryStatic = {
    val __obj = js.Dynamic.literal(urlParam = js.Any.fromFunction1(urlParam))
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

