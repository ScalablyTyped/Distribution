package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingValueRequestPlatformTargeting extends js.Object {
  
  var requestPlatforms: js.UndefOr[js.Array[String]] = js.native
}
object TargetingValueRequestPlatformTargeting {
  
  @scala.inline
  def apply(): TargetingValueRequestPlatformTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueRequestPlatformTargeting]
  }
  
  @scala.inline
  implicit class TargetingValueRequestPlatformTargetingOps[Self <: TargetingValueRequestPlatformTargeting] (val x: Self) extends AnyVal {
    
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
    def setRequestPlatformsVarargs(value: String*): Self = this.set("requestPlatforms", js.Array(value :_*))
    
    @scala.inline
    def setRequestPlatforms(value: js.Array[String]): Self = this.set("requestPlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPlatforms: Self = this.set("requestPlatforms", js.undefined)
  }
}
