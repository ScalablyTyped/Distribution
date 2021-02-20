package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetAssociation extends StObject {
  
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
  implicit class AssetAssociationMutableBuilder[Self <: AssetAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
