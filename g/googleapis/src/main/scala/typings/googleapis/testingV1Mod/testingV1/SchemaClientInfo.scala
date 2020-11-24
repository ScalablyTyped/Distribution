package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the client which invoked the test.
  */
@js.native
trait SchemaClientInfo extends js.Object {
  
  /**
    * The list of detailed information about client.
    */
  var clientInfoDetails: js.UndefOr[js.Array[SchemaClientInfoDetail]] = js.native
  
  /**
    * Required. Client name, such as gcloud.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaClientInfo {
  
  @scala.inline
  def apply(): SchemaClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientInfo]
  }
  
  @scala.inline
  implicit class SchemaClientInfoOps[Self <: SchemaClientInfo] (val x: Self) extends AnyVal {
    
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
    def setClientInfoDetailsVarargs(value: SchemaClientInfoDetail*): Self = this.set("clientInfoDetails", js.Array(value :_*))
    
    @scala.inline
    def setClientInfoDetails(value: js.Array[SchemaClientInfoDetail]): Self = this.set("clientInfoDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientInfoDetails: Self = this.set("clientInfoDetails", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
