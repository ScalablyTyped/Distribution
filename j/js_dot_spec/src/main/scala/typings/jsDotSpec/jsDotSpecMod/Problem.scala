package typings.jsDotSpec.jsDotSpecMod

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
    * Pth to he Spec that applies.
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
    val __obj = js.Dynamic.literal(path = path, predicate = js.Any.fromFunction1(predicate), value = value, via = via)
  
    __obj.asInstanceOf[Problem]
  }
}

