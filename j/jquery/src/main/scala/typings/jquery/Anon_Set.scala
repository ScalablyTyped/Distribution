package typings.jquery

import typings.jquery.JQuery.Tween
import typings.jquery.JQuery._PropHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Set[TElement] extends _PropHook[TElement] {
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def set(tween: Tween[TElement]): Unit
}

object Anon_Set {
  @scala.inline
  def apply[TElement](set: Tween[TElement] => Unit): Anon_Set[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[Anon_Set[TElement]]
  }
}

