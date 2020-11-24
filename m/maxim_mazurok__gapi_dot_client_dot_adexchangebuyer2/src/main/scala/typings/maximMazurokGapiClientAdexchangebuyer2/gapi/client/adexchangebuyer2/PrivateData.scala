package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateData extends js.Object {
  
  /** A buyer or seller specified reference ID. This can be queried in the list operations (max-length: 1024 unicode code units). */
  var referenceId: js.UndefOr[String] = js.native
}
object PrivateData {
  
  @scala.inline
  def apply(): PrivateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateData]
  }
  
  @scala.inline
  implicit class PrivateDataOps[Self <: PrivateData] (val x: Self) extends AnyVal {
    
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
  }
}
