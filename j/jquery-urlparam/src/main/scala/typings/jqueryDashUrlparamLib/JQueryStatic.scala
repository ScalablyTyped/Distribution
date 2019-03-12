package typings
package jqueryDashUrlparamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  def urlParam(variable: java.lang.String): java.lang.String
}

object JQueryStatic {
  @scala.inline
  def apply(urlParam: java.lang.String => java.lang.String): JQueryStatic = {
    val __obj = js.Dynamic.literal(urlParam = js.Any.fromFunction1(urlParam))
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

