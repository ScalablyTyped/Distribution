package typings.jqueryBootstrapWizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wizard extends js.Object {
  def activeTab(): js.Any = js.native
  def currentIndex(): Double = js.native
  def first(): Unit = js.native
  def firstIndex(): Double = js.native
  def getIndex(element: js.Any): Double = js.native
  def last(): Unit = js.native
  def lastIndex(): Double = js.native
  def navigationLength(): Double = js.native
  def next(): Unit = js.native
  def nextIndex(): Double = js.native
  def nextTab(): js.Any = js.native
  def previous(): Unit = js.native
  def previousIndex(): Double = js.native
  def previousTab(): js.Any = js.native
  def show(index: Double): js.Any = js.native
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
  @scala.inline
  implicit class WizardOps[Self <: Wizard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveTab(value: () => js.Any): Self = this.set("activeTab", js.Any.fromFunction0(value))
    @scala.inline
    def setCurrentIndex(value: () => Double): Self = this.set("currentIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setFirst(value: () => Unit): Self = this.set("first", js.Any.fromFunction0(value))
    @scala.inline
    def setFirstIndex(value: () => Double): Self = this.set("firstIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIndex(value: js.Any => Double): Self = this.set("getIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setLast(value: () => Unit): Self = this.set("last", js.Any.fromFunction0(value))
    @scala.inline
    def setLastIndex(value: () => Double): Self = this.set("lastIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setNavigationLength(value: () => Double): Self = this.set("navigationLength", js.Any.fromFunction0(value))
    @scala.inline
    def setNext(value: () => Unit): Self = this.set("next", js.Any.fromFunction0(value))
    @scala.inline
    def setNextIndex(value: () => Double): Self = this.set("nextIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setNextTab(value: () => js.Any): Self = this.set("nextTab", js.Any.fromFunction0(value))
    @scala.inline
    def setPrevious(value: () => Unit): Self = this.set("previous", js.Any.fromFunction0(value))
    @scala.inline
    def setPreviousIndex(value: () => Double): Self = this.set("previousIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setPreviousTab(value: () => js.Any): Self = this.set("previousTab", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: Double => js.Any): Self = this.set("show", js.Any.fromFunction1(value))
  }
  
}

