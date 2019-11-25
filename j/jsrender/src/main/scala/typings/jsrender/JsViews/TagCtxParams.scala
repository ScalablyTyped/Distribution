package typings.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagCtxParams extends js.Object {
  /* tagCtx.params object */
  var args: js.Array[String]
  var ctx: Hash[String]
  var props: Hash[String]
}

object TagCtxParams {
  @scala.inline
  def apply(args: js.Array[String], ctx: Hash[String], props: Hash[String]): TagCtxParams = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagCtxParams]
  }
}

