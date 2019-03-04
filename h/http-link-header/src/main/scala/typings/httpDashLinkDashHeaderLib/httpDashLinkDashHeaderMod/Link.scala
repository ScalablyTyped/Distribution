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
    get: js.Function2[java.lang.String, java.lang.String, Reference],
    has: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    refs: js.Array[Reference],
    rel: js.Function1[java.lang.String, Reference],
    set: js.Function1[Reference, Reference]
  ): Link = {
    val __obj = js.Dynamic.literal(get = get, has = has, refs = refs, rel = rel, set = set)
  
    __obj.asInstanceOf[Link]
  }
}

