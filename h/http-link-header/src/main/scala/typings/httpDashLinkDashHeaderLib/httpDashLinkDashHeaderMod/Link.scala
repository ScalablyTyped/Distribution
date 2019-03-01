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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("refs")(refs)
    __obj.updateDynamic("rel")(rel)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[Link]
  }
}

