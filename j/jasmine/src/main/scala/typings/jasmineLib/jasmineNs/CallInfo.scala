package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallInfo extends js.Object {
  /** All arguments passed to the call */
  var args: js.Array[_]
  /** The context (the this) for the call */
  var `object`: js.Any
  /** The return value of the call */
  var returnValue: js.Any
}

