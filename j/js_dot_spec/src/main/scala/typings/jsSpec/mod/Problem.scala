package typings.jsSpec.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Problem extends js.Object {
  /**
    * The path to the value.
    */
  val path: js.Array[String]
  /**
    * The value associated with the problem.
    */
  val value: js.Any
  /**
    * Path to the Spec that applies.
    */
  val via: js.Array[String]
  /**
    * A predicate function to test new values for conformance.
    */
  def predicate(value: js.Any): Boolean
}

object Problem {
  @scala.inline
  def apply(path: js.Array[String], predicate: js.Any => Boolean, value: js.Any, via: js.Array[String]): Problem = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate), value = value.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    __obj.asInstanceOf[Problem]
  }
}

