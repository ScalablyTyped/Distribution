package typings.mangopay2NodejsSdk.mod.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformCategorization extends js.Object {
  
  var BusinessType: typings.mangopay2NodejsSdk.mod.client.BusinessType = js.native
  
  var Sector: typings.mangopay2NodejsSdk.mod.client.Sector = js.native
}
object PlatformCategorization {
  
  @scala.inline
  def apply(BusinessType: BusinessType, Sector: Sector): PlatformCategorization = {
    val __obj = js.Dynamic.literal(BusinessType = BusinessType.asInstanceOf[js.Any], Sector = Sector.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformCategorization]
  }
  
  @scala.inline
  implicit class PlatformCategorizationOps[Self <: PlatformCategorization] (val x: Self) extends AnyVal {
    
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
    def setBusinessType(value: BusinessType): Self = this.set("BusinessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSector(value: Sector): Self = this.set("Sector", value.asInstanceOf[js.Any])
  }
}
