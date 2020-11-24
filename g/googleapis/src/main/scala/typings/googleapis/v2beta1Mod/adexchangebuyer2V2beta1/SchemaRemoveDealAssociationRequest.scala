package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request for removing the association between a deal and a creative.
  */
@js.native
trait SchemaRemoveDealAssociationRequest extends js.Object {
  
  /**
    * The association between a creative and a deal that should be removed.
    */
  var association: js.UndefOr[SchemaCreativeDealAssociation] = js.native
}
object SchemaRemoveDealAssociationRequest {
  
  @scala.inline
  def apply(): SchemaRemoveDealAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveDealAssociationRequest]
  }
  
  @scala.inline
  implicit class SchemaRemoveDealAssociationRequestOps[Self <: SchemaRemoveDealAssociationRequest] (val x: Self) extends AnyVal {
    
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
    def setAssociation(value: SchemaCreativeDealAssociation): Self = this.set("association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociation: Self = this.set("association", js.undefined)
  }
}
