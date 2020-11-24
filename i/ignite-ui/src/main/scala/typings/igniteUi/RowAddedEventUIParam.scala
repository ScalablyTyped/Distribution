package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowAddedEventUIParam extends js.Object {
  
  /**
    * Gets the default value (before editing) for the column with the specified key.
    */
  var oldValues: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the value for the column with the specified key.
    */
  var values: js.UndefOr[js.Any] = js.native
}
object RowAddedEventUIParam {
  
  @scala.inline
  def apply(): RowAddedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowAddedEventUIParam]
  }
  
  @scala.inline
  implicit class RowAddedEventUIParamOps[Self <: RowAddedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setOldValues(value: js.Any): Self = this.set("oldValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValues: Self = this.set("oldValues", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
