package typings.jquerySteps.JQuerySteps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuerySteps extends js.Object {
  
  /**
    * Adds a new step. (chainable)
    */
  def add(step: Step): typings.jquerySteps.JQuerySteps.JQuerySteps = js.native
  
  /**
    * Removes the control functionality completely and transforms the current state to the initial HTML structure.
    */
  def destroy(): Unit = js.native
  
  /**
    * Triggers the onFinishing and onFinished event.
    */
  def finish(): Unit = js.native
  
  /**
    * Gets the current step index.
    */
  def getCurrentIndex(): Double = js.native
  
  /**
    * Gets the current step object.
    */
  def getCurrentStep(): Step = js.native
  
  /**
    * Gets a specific step object by index.
    */
  def getStep(index: Double): Step = js.native
  
  /**
    * Inserts a new step to a specific position. (chainable)
    */
  def insert(index: Double, step: Step): typings.jquerySteps.JQuerySteps.JQuerySteps = js.native
  
  /**
    * Routes to the previous step.
    */
  def next(): Boolean = js.native
  
  /**
    * Routes to the next step.
    */
  def previous(): Boolean = js.native
  
  /**
    * Removes a specific step by an given index.
    */
  def remove(index: Double): Boolean = js.native
  
  /**
    * Skips a certain amount of steps. Not yet implemented!
    */
  def skip(count: Double): Boolean = js.native
}
object JQuerySteps {
  
  @scala.inline
  def apply(
    add: Step => typings.jquerySteps.JQuerySteps.JQuerySteps,
    destroy: () => Unit,
    finish: () => Unit,
    getCurrentIndex: () => Double,
    getCurrentStep: () => Step,
    getStep: Double => Step,
    insert: (Double, Step) => typings.jquerySteps.JQuerySteps.JQuerySteps,
    next: () => Boolean,
    previous: () => Boolean,
    remove: Double => Boolean,
    skip: Double => Boolean
  ): JQuerySteps = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), destroy = js.Any.fromFunction0(destroy), finish = js.Any.fromFunction0(finish), getCurrentIndex = js.Any.fromFunction0(getCurrentIndex), getCurrentStep = js.Any.fromFunction0(getCurrentStep), getStep = js.Any.fromFunction1(getStep), insert = js.Any.fromFunction2(insert), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous), remove = js.Any.fromFunction1(remove), skip = js.Any.fromFunction1(skip))
    __obj.asInstanceOf[JQuerySteps]
  }
  
  @scala.inline
  implicit class JQueryStepsOps[Self <: typings.jquerySteps.JQuerySteps.JQuerySteps] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: Step => typings.jquerySteps.JQuerySteps.JQuerySteps): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinish(value: () => Unit): Self = this.set("finish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentIndex(value: () => Double): Self = this.set("getCurrentIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentStep(value: () => Step): Self = this.set("getCurrentStep", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStep(value: Double => Step): Self = this.set("getStep", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: (Double, Step) => typings.jquerySteps.JQuerySteps.JQuerySteps): Self = this.set("insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNext(value: () => Boolean): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrevious(value: () => Boolean): Self = this.set("previous", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: Double => Boolean): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkip(value: Double => Boolean): Self = this.set("skip", js.Any.fromFunction1(value))
  }
}
