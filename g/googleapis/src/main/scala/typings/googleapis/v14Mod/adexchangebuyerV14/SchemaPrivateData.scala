package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPrivateData extends js.Object {
  
  var referenceId: js.UndefOr[String] = js.native
  
  var referencePayload: js.UndefOr[String] = js.native
}
object SchemaPrivateData {
  
  @scala.inline
  def apply(): SchemaPrivateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateData]
  }
  
  @scala.inline
  implicit class SchemaPrivateDataOps[Self <: SchemaPrivateData] (val x: Self) extends AnyVal {
    
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
    def setReferenceId(value: String): Self = this.set("referenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceId: Self = this.set("referenceId", js.undefined)
    
    @scala.inline
    def setReferencePayload(value: String): Self = this.set("referencePayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferencePayload: Self = this.set("referencePayload", js.undefined)
  }
}
