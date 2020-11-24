package typings.linq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILookup[TKey, TElement] extends js.Object {
  
  def contains(key: TKey): Boolean = js.native
  
  def count(): Double = js.native
  
  def get(key: TKey): IEnumerable[TElement] = js.native
  
  def toEnumerable(): IEnumerable[IGrouping[TKey, TElement]] = js.native
}
object ILookup {
  
  @scala.inline
  def apply[TKey, TElement](
    contains: TKey => Boolean,
    count: () => Double,
    get: TKey => IEnumerable[TElement],
    toEnumerable: () => IEnumerable[IGrouping[TKey, TElement]]
  ): ILookup[TKey, TElement] = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), count = js.Any.fromFunction0(count), get = js.Any.fromFunction1(get), toEnumerable = js.Any.fromFunction0(toEnumerable))
    __obj.asInstanceOf[ILookup[TKey, TElement]]
  }
  
  @scala.inline
  implicit class ILookupOps[Self <: ILookup[_, _], TKey, TElement] (val x: Self with (ILookup[TKey, TElement])) extends AnyVal {
    
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
    def setContains(value: TKey => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: () => Double): Self = this.set("count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: TKey => IEnumerable[TElement]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToEnumerable(value: () => IEnumerable[IGrouping[TKey, TElement]]): Self = this.set("toEnumerable", js.Any.fromFunction0(value))
  }
}
