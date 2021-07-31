package typings.jqueryBootstrapWizard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wizard extends StObject {
  
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
  
  @scala.inline
  implicit class WizardMutableBuilder[Self <: Wizard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTab(value: () => js.Any): Self = StObject.set(x, "activeTab", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCurrentIndex(value: () => Double): Self = StObject.set(x, "currentIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFirst(value: () => Unit): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFirstIndex(value: () => Double): Self = StObject.set(x, "firstIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: js.Any => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLast(value: () => Unit): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastIndex(value: () => Double): Self = StObject.set(x, "lastIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNavigationLength(value: () => Double): Self = StObject.set(x, "navigationLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextIndex(value: () => Double): Self = StObject.set(x, "nextIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextTab(value: () => js.Any): Self = StObject.set(x, "nextTab", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrevious(value: () => Unit): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreviousIndex(value: () => Double): Self = StObject.set(x, "previousIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreviousTab(value: () => js.Any): Self = StObject.set(x, "previousTab", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: Double => js.Any): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
