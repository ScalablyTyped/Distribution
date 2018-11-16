package typings
package maquetteLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CalculationCache[Result] extends js.Object {
  /**
       * Manually invalidates the cached outcome.
       */
  def invalidate(): scala.Unit
  /**
       * If the inputs array matches the inputs array from the previous invocation, this method returns the result of the previous invocation.
       * Otherwise, the calculation function is invoked and its result is cached and returned.
       * Objects in the inputs array are compared using ===.
       * @param inputs - Array of objects that are to be compared using === with the inputs from the previous invocation.
       * These objects are assumed to be immutable primitive values.
       * @param calculation - Function that takes zero arguments and returns an object (A [[VNode]] presumably) that can be cached.
       */
  def result(inputs: js.Array[js.Object], calculation: js.Function0[Result]): Result
}

