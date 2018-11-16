package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MatcherUtils extends js.Object {
  val expand: scala.Boolean
  val isNot: scala.Boolean
  var utils: jestLib.Anon_PrintWithType
  /**
           *  This is a deep-equality function that will return true if two objects have the same values (recursively).
           */
  def equals(a: js.Any, b: js.Any): scala.Boolean
}

