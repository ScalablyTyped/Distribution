package typings
package jqueryDotBootstrapDotWizardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wizard extends js.Object {
  def activeTab(): js.Any
  def currentIndex(): scala.Double
  def first(): scala.Unit
  def firstIndex(): scala.Double
  def getIndex(element: js.Any): scala.Double
  def last(): scala.Unit
  def lastIndex(): scala.Double
  def navigationLength(): scala.Double
  def next(): scala.Unit
  def nextIndex(): scala.Double
  def nextTab(): js.Any
  def previous(): scala.Unit
  def previousIndex(): scala.Double
  def previousTab(): js.Any
  def show(index: scala.Double): js.Any
}

object Wizard {
  @scala.inline
  def apply(
    activeTab: js.Function0[js.Any],
    currentIndex: js.Function0[scala.Double],
    first: js.Function0[scala.Unit],
    firstIndex: js.Function0[scala.Double],
    getIndex: js.Function1[js.Any, scala.Double],
    last: js.Function0[scala.Unit],
    lastIndex: js.Function0[scala.Double],
    navigationLength: js.Function0[scala.Double],
    next: js.Function0[scala.Unit],
    nextIndex: js.Function0[scala.Double],
    nextTab: js.Function0[js.Any],
    previous: js.Function0[scala.Unit],
    previousIndex: js.Function0[scala.Double],
    previousTab: js.Function0[js.Any],
    show: js.Function1[scala.Double, js.Any]
  ): Wizard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activeTab")(activeTab)
    __obj.updateDynamic("currentIndex")(currentIndex)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("firstIndex")(firstIndex)
    __obj.updateDynamic("getIndex")(getIndex)
    __obj.updateDynamic("last")(last)
    __obj.updateDynamic("lastIndex")(lastIndex)
    __obj.updateDynamic("navigationLength")(navigationLength)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("nextIndex")(nextIndex)
    __obj.updateDynamic("nextTab")(nextTab)
    __obj.updateDynamic("previous")(previous)
    __obj.updateDynamic("previousIndex")(previousIndex)
    __obj.updateDynamic("previousTab")(previousTab)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Wizard]
  }
}

