package typings
package knockoutDashPreDashRenderedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clear extends js.Object {
  def clear(node: stdLib.Element): scala.Boolean
  def get(node: stdLib.Element, key: java.lang.String): js.Any
  def getAll(node: stdLib.Element, createIfNotFound: scala.Boolean): js.Any
  def set(node: stdLib.Element, key: java.lang.String, value: js.Any): scala.Unit
}

object Anon_Clear {
  @scala.inline
  def apply(
    clear: js.Function1[stdLib.Element, scala.Boolean],
    get: js.Function2[stdLib.Element, java.lang.String, js.Any],
    getAll: js.Function2[stdLib.Element, scala.Boolean, js.Any],
    set: js.Function3[stdLib.Element, java.lang.String, js.Any, scala.Unit]
  ): Anon_Clear = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getAll")(getAll)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[Anon_Clear]
  }
}

