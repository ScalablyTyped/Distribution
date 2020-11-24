package typings.gun.anon

import typings.gun.mod.Gun.DisallowArray
import typings.gun.mod.Gun.Saveable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Put[DataType] extends js.Object {
  
  def put(data: DisallowArray[Saveable[DataType]]): Unit = js.native
}
object Put {
  
  @scala.inline
  def apply[DataType](put: DisallowArray[Saveable[DataType]] => Unit): Put[DataType] = {
    val __obj = js.Dynamic.literal(put = js.Any.fromFunction1(put))
    __obj.asInstanceOf[Put[DataType]]
  }
  
  @scala.inline
  implicit class PutOps[Self <: Put[_], DataType] (val x: Self with Put[DataType]) extends AnyVal {
    
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
    def setPut(value: DisallowArray[Saveable[DataType]] => Unit): Self = this.set("put", js.Any.fromFunction1(value))
  }
}
