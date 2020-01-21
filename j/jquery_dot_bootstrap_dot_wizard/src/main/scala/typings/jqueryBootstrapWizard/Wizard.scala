package typings.jqueryBootstrapWizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wizard extends js.Object {
  def activeTab(): js.Any
  def currentIndex(): Double
  def first(): Unit
  def firstIndex(): Double
  def getIndex(element: js.Any): Double
  def last(): Unit
  def lastIndex(): Double
  def navigationLength(): Double
  def next(): Unit
  def nextIndex(): Double
  def nextTab(): js.Any
  def previous(): Unit
  def previousIndex(): Double
  def previousTab(): js.Any
  def show(index: Double): js.Any
}

object Wizard {
  @scala.inline
  def apply(
    activeTab: () => js.Any,
    currentIndex: () => Double,
    first: () => Unit,
    firstIndex: () => Double,
    getIndex: js.Any => Double,
    last: () => Unit,
    lastIndex: () => Double,
    navigationLength: () => Double,
    next: () => Unit,
    nextIndex: () => Double,
    nextTab: () => js.Any,
    previous: () => Unit,
    previousIndex: () => Double,
    previousTab: () => js.Any,
    show: Double => js.Any
  ): Wizard = {
    val __obj = js.Dynamic.literal(activeTab = js.Any.fromFunction0(activeTab), currentIndex = js.Any.fromFunction0(currentIndex), first = js.Any.fromFunction0(first), firstIndex = js.Any.fromFunction0(firstIndex), getIndex = js.Any.fromFunction1(getIndex), last = js.Any.fromFunction0(last), lastIndex = js.Any.fromFunction0(lastIndex), navigationLength = js.Any.fromFunction0(navigationLength), next = js.Any.fromFunction0(next), nextIndex = js.Any.fromFunction0(nextIndex), nextTab = js.Any.fromFunction0(nextTab), previous = js.Any.fromFunction0(previous), previousIndex = js.Any.fromFunction0(previousIndex), previousTab = js.Any.fromFunction0(previousTab), show = js.Any.fromFunction1(show))
  
    __obj.asInstanceOf[Wizard]
  }
}

