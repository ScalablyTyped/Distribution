package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupDetails extends js.Object {
  
  /** The name of the relationship column associated with the lookup. */
  var relationshipColumn: js.UndefOr[String] = js.native
  
  /** The id of the relationship column. */
  var relationshipColumnId: js.UndefOr[String] = js.native
}
object LookupDetails {
  
  @scala.inline
  def apply(): LookupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupDetails]
  }
  
  @scala.inline
  implicit class LookupDetailsOps[Self <: LookupDetails] (val x: Self) extends AnyVal {
    
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
    def setRelationshipColumn(value: String): Self = this.set("relationshipColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationshipColumn: Self = this.set("relationshipColumn", js.undefined)
    
    @scala.inline
    def setRelationshipColumnId(value: String): Self = this.set("relationshipColumnId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationshipColumnId: Self = this.set("relationshipColumnId", js.undefined)
  }
}
