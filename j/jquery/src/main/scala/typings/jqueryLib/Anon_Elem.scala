package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Elem[TElement]
  extends jqueryLib.JQueryNs._ValHook[TElement] {
  def get(elem: TElement): js.Any
}

object Anon_Elem {
  @scala.inline
  def apply[TElement](get: js.Function1[TElement, js.Any]): Anon_Elem[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[Anon_Elem[TElement]]
  }
}

