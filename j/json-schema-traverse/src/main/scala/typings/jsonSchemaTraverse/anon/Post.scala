package typings.jsonSchemaTraverse.anon

import typings.jsonSchemaTraverse.mod.TraverseCallbackDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Post extends js.Object {
  var post: js.UndefOr[TraverseCallbackDef] = js.undefined
  var pre: js.UndefOr[TraverseCallbackDef] = js.undefined
}

object Post {
  @scala.inline
  def apply(
    post: (/* schema */ js.Object, /* jsonPtr */ String, /* rootSchema */ js.Object, /* parentJsonPtr */ String, /* parentKeyword */ String, /* parentSchema */ js.Object, /* keyIndex */ String | Double) => Unit = null,
    pre: (/* schema */ js.Object, /* jsonPtr */ String, /* rootSchema */ js.Object, /* parentJsonPtr */ String, /* parentKeyword */ String, /* parentSchema */ js.Object, /* keyIndex */ String | Double) => Unit = null
  ): Post = {
    val __obj = js.Dynamic.literal()
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction7(post))
    if (pre != null) __obj.updateDynamic("pre")(js.Any.fromFunction7(pre))
    __obj.asInstanceOf[Post]
  }
}

