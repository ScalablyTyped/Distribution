package typings.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result containing the Asset and its State.
  */
@js.native
trait SchemaListAssetsResult extends js.Object {
  
  /**
    * Asset matching the search request.
    */
  var asset: js.UndefOr[SchemaAsset] = js.native
  
  /**
    * State change of the asset between the points in time.
    */
  var stateChange: js.UndefOr[String] = js.native
}
object SchemaListAssetsResult {
  
  @scala.inline
  def apply(): SchemaListAssetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAssetsResult]
  }
  
  @scala.inline
  implicit class SchemaListAssetsResultOps[Self <: SchemaListAssetsResult] (val x: Self) extends AnyVal {
    
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
    def setAsset(value: SchemaAsset): Self = this.set("asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsset: Self = this.set("asset", js.undefined)
    
    @scala.inline
    def setStateChange(value: String): Self = this.set("stateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateChange: Self = this.set("stateChange", js.undefined)
  }
}
