package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupExpandedEventUIParam extends js.Object {
  
  /**
    * Gets a reference to the jQuery object for the column being expanded (th).
    */
  var element: js.UndefOr[String] = js.native
  
  /**
    * Gets the reference to the GridMultiColumnHeaders widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object GroupExpandedEventUIParam {
  
  @scala.inline
  def apply(): GroupExpandedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupExpandedEventUIParam]
  }
  
  @scala.inline
  implicit class GroupExpandedEventUIParamOps[Self <: GroupExpandedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
