package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutObservableFunctions[T] extends js.Object {
  def equalityComparer(a: js.Any, b: js.Any): scala.Boolean
}

object KnockoutObservableFunctions {
  @scala.inline
  def apply[T](equalityComparer: (js.Any, js.Any) => scala.Boolean): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(equalityComparer = js.Any.fromFunction2(equalityComparer))
  
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
}

