package typings.kolite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutUtils extends js.Object {
  def wrapAccessor(accessor: js.Any): js.Function
}

object KnockoutUtils {
  @scala.inline
  def apply(wrapAccessor: js.Any => js.Function): KnockoutUtils = {
    val __obj = js.Dynamic.literal(wrapAccessor = js.Any.fromFunction1(wrapAccessor))
    __obj.asInstanceOf[KnockoutUtils]
  }
}

