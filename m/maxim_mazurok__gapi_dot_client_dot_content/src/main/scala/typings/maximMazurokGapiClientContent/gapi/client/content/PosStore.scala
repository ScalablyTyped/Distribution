package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PosStore extends js.Object {
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#posStore`" */
  var kind: js.UndefOr[String] = js.native
  
  /** Required. The street address of the store. */
  var storeAddress: js.UndefOr[String] = js.native
  
  /** Required. A store identifier that is unique for the given merchant. */
  var storeCode: js.UndefOr[String] = js.native
}
object PosStore {
  
  @scala.inline
  def apply(): PosStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PosStore]
  }
  
  @scala.inline
  implicit class PosStoreOps[Self <: PosStore] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setStoreAddress(value: String): Self = this.set("storeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreAddress: Self = this.set("storeAddress", js.undefined)
    
    @scala.inline
    def setStoreCode(value: String): Self = this.set("storeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreCode: Self = this.set("storeCode", js.undefined)
  }
}
