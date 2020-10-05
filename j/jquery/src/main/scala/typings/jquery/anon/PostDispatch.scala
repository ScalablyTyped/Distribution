package typings.jquery.anon

import typings.jquery.JQuery.Event
import typings.jquery.JQuery._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def postDispatch(event: Event): Unit = js.native
}

object PostDispatch {
  @scala.inline
  def apply[TTarget](postDispatch: Event => Unit): PostDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction1(postDispatch))
    __obj.asInstanceOf[PostDispatch[TTarget]]
  }
  @scala.inline
  implicit class PostDispatchOps[Self <: PostDispatch[_], TTarget] (val x: Self with PostDispatch[TTarget]) extends AnyVal {
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
    def setPostDispatch(value: Event => Unit): Self = this.set("postDispatch", js.Any.fromFunction1(value))
  }
  
}

