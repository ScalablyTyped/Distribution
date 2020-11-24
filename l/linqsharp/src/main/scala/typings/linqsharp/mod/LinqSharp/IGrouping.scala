package typings.linqsharp.mod.LinqSharp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGrouping[TKey, T] extends js.Object {
  
  var Elements: js.Array[T] = js.native
  
  var Key: TKey = js.native
}
object IGrouping {
  
  @scala.inline
  def apply[TKey, T](Elements: js.Array[T], Key: TKey): IGrouping[TKey, T] = {
    val __obj = js.Dynamic.literal(Elements = Elements.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGrouping[TKey, T]]
  }
  
  @scala.inline
  implicit class IGroupingOps[Self <: IGrouping[_, _], TKey, T] (val x: Self with (IGrouping[TKey, T])) extends AnyVal {
    
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
    def setElementsVarargs(value: T*): Self = this.set("Elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[T]): Self = this.set("Elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: TKey): Self = this.set("Key", value.asInstanceOf[js.Any])
  }
}
