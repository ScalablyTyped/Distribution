package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ElemSet[TElement]
  extends jqueryLib.JQueryNs._ValHook[TElement] {
  def set(elem: TElement, value: js.Any): js.Any
}

object Anon_ElemSet {
  @scala.inline
  def apply[TElement](set: js.Function2[TElement, js.Any, js.Any]): Anon_ElemSet[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[Anon_ElemSet[TElement]]
  }
}

