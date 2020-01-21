package typings.jquerySteps.JQuerySteps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuerySteps extends js.Object {
  /**
    * Adds a new step. (chainable)
    */
  def add(step: Step): typings.jquerySteps.JQuerySteps.JQuerySteps
  /**
    * Removes the control functionality completely and transforms the current state to the initial HTML structure.
    */
  def destroy(): Unit
  /**
    * Triggers the onFinishing and onFinished event.
    */
  def finish(): Unit
  /**
    * Gets the current step index.
    */
  def getCurrentIndex(): Double
  /**
    * Gets the current step object.
    */
  def getCurrentStep(): Step
  /**
    * Gets a specific step object by index.
    */
  def getStep(index: Double): Step
  /**
    * Inserts a new step to a specific position. (chainable)
    */
  def insert(index: Double, step: Step): typings.jquerySteps.JQuerySteps.JQuerySteps
  /**
    * Routes to the previous step.
    */
  def next(): Boolean
  /**
    * Routes to the next step.
    */
  def previous(): Boolean
  /**
    * Removes a specific step by an given index.
    */
  def remove(index: Double): Boolean
  /**
    * Skips a certain amount of steps. Not yet implemented!
    */
  def skip(count: Double): Boolean
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
}

