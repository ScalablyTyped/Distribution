package typings
package httpDashLinkDashHeaderLib.httpDashLinkDashHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var refs: js.Array[Reference]
  def get(attribute: java.lang.String, value: java.lang.String): Reference
  def has(attribute: java.lang.String, value: java.lang.String): scala.Boolean
  def rel(value: java.lang.String): Reference
  def set(ref: Reference): Reference
}

