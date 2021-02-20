package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result containing the Asset and its State.
  */
@js.native
trait SchemaListAssetsResult extends StObject {
  
  /**
    * Asset matching the search request.
    */
  var asset: js.UndefOr[SchemaAsset] = js.native
  
  /**
    * State of the asset.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaListAssetsResult {
  
  @scala.inline
  def apply(): SchemaListAssetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAssetsResult]
  }
  
  @scala.inline
  implicit class SchemaListAssetsResultMutableBuilder[Self <: SchemaListAssetsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset(value: SchemaAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
