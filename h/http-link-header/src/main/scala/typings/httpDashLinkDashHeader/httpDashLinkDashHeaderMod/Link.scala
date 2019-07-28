package typings.httpDashLinkDashHeader.httpDashLinkDashHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var refs: js.Array[Reference]
  def get(attribute: String, value: String): js.Array[Reference]
  def has(attribute: String, value: String): Boolean
  def rel(value: String): js.Array[Reference]
  def set(ref: Reference): js.Array[Reference]
}

object Link {
  @scala.inline
  def apply(
    get: (String, String) => js.Array[Reference],
    has: (String, String) => Boolean,
    refs: js.Array[Reference],
    rel: String => js.Array[Reference],
    set: Reference => js.Array[Reference]
  ): Link = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), has = js.Any.fromFunction2(has), refs = refs, rel = js.Any.fromFunction1(rel), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[Link]
  }
}

