package typings.isArraySorted.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[T] extends js.Object {
  
  /**
  		Same as [`Array#sort(comparator)`](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Array/sort#Description).
  		@default (a, b) => a - b
  		*/
  def comparator(left: T, right: T): Double = js.native
}
object Options {
  
  @scala.inline
  def apply[T](comparator: (T, T) => Double): Options[T] = {
    val __obj = js.Dynamic.literal(comparator = js.Any.fromFunction2(comparator))
    __obj.asInstanceOf[Options[T]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
    
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
    def setComparator(value: (T, T) => Double): Self = this.set("comparator", js.Any.fromFunction2(value))
  }
}
