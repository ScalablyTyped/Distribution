package typings.lowdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LowdbBase[SchemaT] extends js.Object {
  
  def getState(): SchemaT = js.native
  
  def setState(state: SchemaT): this.type = js.native
}
object LowdbBase {
  
  @scala.inline
  def apply[SchemaT](getState: () => SchemaT, setState: SchemaT => LowdbBase[SchemaT]): LowdbBase[SchemaT] = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[LowdbBase[SchemaT]]
  }
  
  @scala.inline
  implicit class LowdbBaseOps[Self <: LowdbBase[_], SchemaT] (val x: Self with LowdbBase[SchemaT]) extends AnyVal {
    
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
    def setGetState(value: () => SchemaT): Self = this.set("getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetState(value: SchemaT => LowdbBase[SchemaT]): Self = this.set("setState", js.Any.fromFunction1(value))
  }
}
