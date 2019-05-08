package typings
package jsrenderLib.JsViewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagCtxParams extends js.Object {
  /* tagCtx.params object */
  var args: js.Array[java.lang.String]
  var ctx: Hash[java.lang.String]
  var props: Hash[java.lang.String]
}

object TagCtxParams {
  @scala.inline
  def apply(args: js.Array[java.lang.String], ctx: Hash[java.lang.String], props: Hash[java.lang.String]): TagCtxParams = {
    val __obj = js.Dynamic.literal(args = args, ctx = ctx, props = props)
  
    __obj.asInstanceOf[TagCtxParams]
  }
}

