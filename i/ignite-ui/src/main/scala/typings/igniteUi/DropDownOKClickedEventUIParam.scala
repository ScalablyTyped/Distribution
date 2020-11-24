package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDownOKClickedEventUIParam extends js.Object {
  
  /**
    * Gets the column key for which OK button is clicked.
    */
  var columnKey: js.UndefOr[String] = js.native
  
  /**
    * Gets data for summary methods. Format of event data is {type: "min", active: false};
    */
  var eventData: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the igGridSummaries widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object DropDownOKClickedEventUIParam {
  
  @scala.inline
  def apply(): DropDownOKClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownOKClickedEventUIParam]
  }
  
  @scala.inline
  implicit class DropDownOKClickedEventUIParamOps[Self <: DropDownOKClickedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    
    @scala.inline
    def setEventData(value: js.Any): Self = this.set("eventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventData: Self = this.set("eventData", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
