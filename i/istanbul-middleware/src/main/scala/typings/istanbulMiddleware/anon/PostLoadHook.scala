package typings.istanbulMiddleware.anon

import typings.istanbulMiddleware.mod.PostLoadHookFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostLoadHook extends js.Object {
  var postLoadHook: js.UndefOr[typings.istanbulMiddleware.mod.PostLoadHook] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PostLoadHook {
  @scala.inline
  def apply(): PostLoadHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostLoadHook]
  }
  @scala.inline
  implicit class PostLoadHookOps[Self <: PostLoadHook] (val x: Self) extends AnyVal {
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
    def setPostLoadHook(
      value: (/* matcherfn */ typings.istanbulMiddleware.mod.Matcher, /* transformer */ js.Any, /* verbose */ Boolean) => PostLoadHookFn
    ): Self = this.set("postLoadHook", js.Any.fromFunction3(value))
    @scala.inline
    def deletePostLoadHook: Self = this.set("postLoadHook", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

