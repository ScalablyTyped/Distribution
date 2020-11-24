package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GuestOsFeature extends js.Object {
  
  /** The ID of a supported feature. Read  Enabling guest operating system features to see a list of available options. */
  var `type`: js.UndefOr[String] = js.native
}
object GuestOsFeature {
  
  @scala.inline
  def apply(): GuestOsFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuestOsFeature]
  }
  
  @scala.inline
  implicit class GuestOsFeatureOps[Self <: GuestOsFeature] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
