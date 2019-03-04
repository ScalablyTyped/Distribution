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
    add: js.Function1[Step, JQuerySteps],
    destroy: js.Function0[scala.Unit],
    finish: js.Function0[scala.Unit],
    getCurrentIndex: js.Function0[scala.Double],
    getCurrentStep: js.Function0[Step],
    getStep: js.Function1[scala.Double, Step],
    insert: js.Function2[scala.Double, Step, JQuerySteps],
    next: js.Function0[scala.Boolean],
    previous: js.Function0[scala.Boolean],
    remove: js.Function1[scala.Double, scala.Boolean],
    skip: js.Function1[scala.Double, scala.Boolean]
  ): JQuerySteps = {
    val __obj = js.Dynamic.literal(add = add, destroy = destroy, finish = finish, getCurrentIndex = getCurrentIndex, getCurrentStep = getCurrentStep, getStep = getStep, insert = insert, next = next, previous = previous, remove = remove, skip = skip)
  
    __obj.asInstanceOf[JQuerySteps]
  }
}

