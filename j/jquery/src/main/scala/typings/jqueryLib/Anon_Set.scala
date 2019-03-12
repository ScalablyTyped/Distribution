package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Set[TElement]
  extends jqueryLib.JQueryNs._PropHook[TElement] {
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def set(tween: jqueryLib.JQueryNs.Tween[TElement]): scala.Unit
}

object Anon_Set {
  @scala.inline
  def apply[TElement](set: jqueryLib.JQueryNs.Tween[TElement] => scala.Unit): Anon_Set[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[Anon_Set[TElement]]
  }
}

