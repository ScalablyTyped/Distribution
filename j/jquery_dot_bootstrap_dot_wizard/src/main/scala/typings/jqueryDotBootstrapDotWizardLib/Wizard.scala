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
    activeTab: () => js.Any,
    currentIndex: () => scala.Double,
    first: () => scala.Unit,
    firstIndex: () => scala.Double,
    getIndex: js.Any => scala.Double,
    last: () => scala.Unit,
    lastIndex: () => scala.Double,
    navigationLength: () => scala.Double,
    next: () => scala.Unit,
    nextIndex: () => scala.Double,
    nextTab: () => js.Any,
    previous: () => scala.Unit,
    previousIndex: () => scala.Double,
    previousTab: () => js.Any,
    show: scala.Double => js.Any
  ): Wizard = {
    val __obj = js.Dynamic.literal(activeTab = js.Any.fromFunction0(activeTab), currentIndex = js.Any.fromFunction0(currentIndex), first = js.Any.fromFunction0(first), firstIndex = js.Any.fromFunction0(firstIndex), getIndex = js.Any.fromFunction1(getIndex), last = js.Any.fromFunction0(last), lastIndex = js.Any.fromFunction0(lastIndex), navigationLength = js.Any.fromFunction0(navigationLength), next = js.Any.fromFunction0(next), nextIndex = js.Any.fromFunction0(nextIndex), nextTab = js.Any.fromFunction0(nextTab), previous = js.Any.fromFunction0(previous), previousIndex = js.Any.fromFunction0(previousIndex), previousTab = js.Any.fromFunction0(previousTab), show = js.Any.fromFunction1(show))
  
    __obj.asInstanceOf[Wizard]
  }
}

