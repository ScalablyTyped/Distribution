package typings.knockoutPreRendered

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutObservableFunctions[T] extends // Ko specific
/* key */ StringDictionary[KnockoutBindingHandler] {
  
  def equalityComparer(a: js.Any, b: js.Any): Boolean = js.native
}
object KnockoutObservableFunctions {
  
  @scala.inline
  def apply[T](equalityComparer: (js.Any, js.Any) => Boolean): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(equalityComparer = js.Any.fromFunction2(equalityComparer))
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
  
  @scala.inline
  implicit class KnockoutObservableFunctionsOps[Self <: KnockoutObservableFunctions[_], T] (val x: Self with KnockoutObservableFunctions[T]) extends AnyVal {
    
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
    def setEqualityComparer(value: (js.Any, js.Any) => Boolean): Self = this.set("equalityComparer", js.Any.fromFunction2(value))
  }
}
