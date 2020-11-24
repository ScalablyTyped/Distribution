package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipDetails extends js.Object {
  
  /** The name of the table this relationship is linked to. */
  var linkedTable: js.UndefOr[String] = js.native
}
object RelationshipDetails {
  
  @scala.inline
  def apply(): RelationshipDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipDetails]
  }
  
  @scala.inline
  implicit class RelationshipDetailsOps[Self <: RelationshipDetails] (val x: Self) extends AnyVal {
    
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
    def setLinkedTable(value: String): Self = this.set("linkedTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedTable: Self = this.set("linkedTable", js.undefined)
  }
}
