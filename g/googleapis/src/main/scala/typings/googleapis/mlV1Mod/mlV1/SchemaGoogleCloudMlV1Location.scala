package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGoogleCloudMlV1Location extends js.Object {
  
  /**
    * Capabilities available in the location.
    */
  var capabilities: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Capability]] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudMlV1Location {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Location]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1LocationOps[Self <: SchemaGoogleCloudMlV1Location] (val x: Self) extends AnyVal {
    
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
    def setCapabilitiesVarargs(value: SchemaGoogleCloudMlV1Capability*): Self = this.set("capabilities", js.Array(value :_*))
    
    @scala.inline
    def setCapabilities(value: js.Array[SchemaGoogleCloudMlV1Capability]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
