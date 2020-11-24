package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetAssociation extends js.Object {
  
  /** The associated asset. */
  var asset: js.UndefOr[Asset] = js.native
  
  /** The role of this asset for the creative. */
  var role: js.UndefOr[String] = js.native
}
object AssetAssociation {
  
  @scala.inline
  def apply(): AssetAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetAssociation]
  }
  
  @scala.inline
  implicit class AssetAssociationOps[Self <: AssetAssociation] (val x: Self) extends AnyVal {
    
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
    def setAsset(value: Asset): Self = this.set("asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsset: Self = this.set("asset", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
