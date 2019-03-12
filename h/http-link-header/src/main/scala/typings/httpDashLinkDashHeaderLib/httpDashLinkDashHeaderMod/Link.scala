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

object Link {
  @scala.inline
  def apply(
    get: (java.lang.String, java.lang.String) => Reference,
    has: (java.lang.String, java.lang.String) => scala.Boolean,
    refs: js.Array[Reference],
    rel: java.lang.String => Reference,
    set: Reference => Reference
  ): Link = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), has = js.Any.fromFunction2(has), refs = refs, rel = js.Any.fromFunction1(rel), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[Link]
  }
}

