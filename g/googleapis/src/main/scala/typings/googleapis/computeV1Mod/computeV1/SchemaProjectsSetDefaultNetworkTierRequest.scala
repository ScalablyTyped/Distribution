package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaProjectsSetDefaultNetworkTierRequest extends js.Object {
  
  /**
    * Default network tier to be set.
    */
  var networkTier: js.UndefOr[String] = js.native
}
object SchemaProjectsSetDefaultNetworkTierRequest {
  
  @scala.inline
  def apply(): SchemaProjectsSetDefaultNetworkTierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsSetDefaultNetworkTierRequest]
  }
  
  @scala.inline
  implicit class SchemaProjectsSetDefaultNetworkTierRequestOps[Self <: SchemaProjectsSetDefaultNetworkTierRequest] (val x: Self) extends AnyVal {
    
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
    def setNetworkTier(value: String): Self = this.set("networkTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkTier: Self = this.set("networkTier", js.undefined)
  }
}
