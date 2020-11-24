package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly The reason and details for a disapproval.
  */
@js.native
trait SchemaDisapproval extends js.Object {
  
  /**
    * Additional details about the reason for disapproval.
    */
  var details: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The categorized reason for disapproval.
    */
  var reason: js.UndefOr[String] = js.native
}
object SchemaDisapproval {
  
  @scala.inline
  def apply(): SchemaDisapproval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisapproval]
  }
  
  @scala.inline
  implicit class SchemaDisapprovalOps[Self <: SchemaDisapproval] (val x: Self) extends AnyVal {
    
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
    def setDetailsVarargs(value: String*): Self = this.set("details", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: js.Array[String]): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
