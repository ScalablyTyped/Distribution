package typings.ladda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  def ladda(action: String): JQuery
}

object JQueryStatic {
  @scala.inline
  def apply(ladda: String => JQuery): JQueryStatic = {
    val __obj = js.Dynamic.literal(ladda = js.Any.fromFunction1(ladda))
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

