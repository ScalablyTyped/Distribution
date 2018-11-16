package typings
package jsDotSpecLib.jsDotSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Problem extends js.Object {
  /**
       * The path to the value.
       */
  val path: js.Array[java.lang.String]
  /**
       * The value associated with the problem.
       */
  val value: js.Any
  /**
       * Pth to he Spec that applies.
       */
  val via: js.Array[java.lang.String]
  /**
       * A predicate function to test new values for conformance.
       */
  def predicate(value: js.Any): scala.Boolean
}

