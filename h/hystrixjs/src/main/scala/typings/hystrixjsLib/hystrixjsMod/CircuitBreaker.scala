package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircuitBreaker extends js.Object {
  def allowRequest(): scala.Boolean
  def allowSingleTest(): scala.Boolean
  def isOpen(): scala.Boolean
  def markSuccess(): scala.Unit
}

