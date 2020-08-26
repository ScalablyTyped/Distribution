package typings.jquery.anon

import typings.jquery.JQuery.Tween
import typings.jquery.JQuery._PropHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Get[TElement] extends _PropHook[TElement] {
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def get(tween: Tween[TElement]): js.Any = js.native
}

object Get {
  @scala.inline
  def apply[TElement](get: Tween[TElement] => js.Any): Get[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Get[TElement]]
  }
  @scala.inline
  implicit class GetOps[Self <: Get[_], TElement] (val x: Self with Get[TElement]) extends AnyVal {
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
    def setGet(value: Tween[TElement] => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

