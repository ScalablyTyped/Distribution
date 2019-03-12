package typings
package jqueryDashStepsLib.JQueryStepsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuerySteps extends js.Object {
  /**
    * Adds a new step. (chainable)
    */
  def add(step: Step): JQuerySteps
  /**
    * Removes the control functionality completely and transforms the current state to the initial HTML structure.
    */
  def destroy(): scala.Unit
  /**
    * Triggers the onFinishing and onFinished event.
    */
  def finish(): scala.Unit
  /**
    * Gets the current step index.
    */
  def getCurrentIndex(): scala.Double
  /**
    * Gets the current step object.
    */
  def getCurrentStep(): Step
  /**
    * Gets a specific step object by index.
    */
  def getStep(index: scala.Double): Step
  /**
    * Inserts a new step to a specific position. (chainable)
    */
  def insert(index: scala.Double, step: Step): JQuerySteps
  /**
    * Routes to the previous step.
    */
  def next(): scala.Boolean
  /**
    * Routes to the next step.
    */
  def previous(): scala.Boolean
  /**
    * Removes a specific step by an given index.
    */
  def remove(index: scala.Double): scala.Boolean
  /**
    * Skips a certain amount of steps. Not yet implemented!
    */
  def skip(count: scala.Double): scala.Boolean
}

object JQuerySteps {
  @scala.inline
  def apply(
    add: Step => JQuerySteps,
    destroy: () => scala.Unit,
    finish: () => scala.Unit,
    getCurrentIndex: () => scala.Double,
    getCurrentStep: () => Step,
    getStep: scala.Double => Step,
    insert: (scala.Double, Step) => JQuerySteps,
    next: () => scala.Boolean,
    previous: () => scala.Boolean,
    remove: scala.Double => scala.Boolean,
    skip: scala.Double => scala.Boolean
  ): JQuerySteps = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), destroy = js.Any.fromFunction0(destroy), finish = js.Any.fromFunction0(finish), getCurrentIndex = js.Any.fromFunction0(getCurrentIndex), getCurrentStep = js.Any.fromFunction0(getCurrentStep), getStep = js.Any.fromFunction1(getStep), insert = js.Any.fromFunction2(insert), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous), remove = js.Any.fromFunction1(remove), skip = js.Any.fromFunction1(skip))
  
    __obj.asInstanceOf[JQuerySteps]
  }
}

