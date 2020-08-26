package typings.jsonSchemaTraverse.anon

import typings.jsonSchemaTraverse.mod.TraverseCallbackDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Post extends js.Object {
  var post: js.UndefOr[TraverseCallbackDef] = js.native
  var pre: js.UndefOr[TraverseCallbackDef] = js.native
}

object Post {
  @scala.inline
  def apply(): Post = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Post]
  }
  @scala.inline
  implicit class PostOps[Self <: Post] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPost(
      value: (/* schema */ js.Object, /* jsonPtr */ String, /* rootSchema */ js.Object, /* parentJsonPtr */ String, /* parentKeyword */ String, /* parentSchema */ js.Object, /* keyIndex */ String | Double) => Unit
    ): Self = this.set("post", js.Any.fromFunction7(value))
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    @scala.inline
    def setPre(
      value: (/* schema */ js.Object, /* jsonPtr */ String, /* rootSchema */ js.Object, /* parentJsonPtr */ String, /* parentKeyword */ String, /* parentSchema */ js.Object, /* keyIndex */ String | Double) => Unit
    ): Self = this.set("pre", js.Any.fromFunction7(value))
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
  }
  
}

