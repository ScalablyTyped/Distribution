package typings.jquery.anon

import typings.jquery.JQuery.Tween
import typings.jquery.JQuery._PropHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Set[TElement] extends _PropHook[TElement] {
  
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def set(tween: Tween[TElement]): Unit = js.native
}
object Set {
  
  @scala.inline
  def apply[TElement](set: Tween[TElement] => Unit): Set[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Set[TElement]]
  }
  
  @scala.inline
  implicit class SetMutableBuilder[Self <: Set[_], TElement] (val x: Self with Set[TElement]) extends AnyVal {
    
    @scala.inline
    def setSet(value: Tween[TElement] => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
