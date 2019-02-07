package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockContext[T, Y /* <: js.Array[_] */] extends js.Object {
  var calls: js.Array[Y]
  var instances: js.Array[T]
  var invocationCallOrder: js.Array[scala.Double]
  /**
    * List of results of calls to the mock function.
    */
  var results: js.Array[MockResult]
}

