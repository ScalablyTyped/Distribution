package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneratePrimaryKeyValueEventUIParam extends js.Object {
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the auto-generated primary key (the number of records in the data source + 1) or set a custom unique primary key for the new row.
    */
  var value: js.UndefOr[js.Any] = js.native
}
object GeneratePrimaryKeyValueEventUIParam {
  
  @scala.inline
  def apply(): GeneratePrimaryKeyValueEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratePrimaryKeyValueEventUIParam]
  }
  
  @scala.inline
  implicit class GeneratePrimaryKeyValueEventUIParamOps[Self <: GeneratePrimaryKeyValueEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
