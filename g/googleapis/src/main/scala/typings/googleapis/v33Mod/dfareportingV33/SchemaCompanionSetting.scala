package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Companion Settings
  */
@js.native
trait SchemaCompanionSetting extends js.Object {
  
  /**
    * Whether companions are disabled for this placement.
    */
  var companionsDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whitelist of companion sizes to be served to this placement. Set this
    * list to null or empty to serve all companion sizes.
    */
  var enabledSizes: js.UndefOr[js.Array[SchemaSize]] = js.native
  
  /**
    * Whether to serve only static images as companions.
    */
  var imageOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#companionSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaCompanionSetting {
  
  @scala.inline
  def apply(): SchemaCompanionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompanionSetting]
  }
  
  @scala.inline
  implicit class SchemaCompanionSettingOps[Self <: SchemaCompanionSetting] (val x: Self) extends AnyVal {
    
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
    def setCompanionsDisabled(value: Boolean): Self = this.set("companionsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanionsDisabled: Self = this.set("companionsDisabled", js.undefined)
    
    @scala.inline
    def setEnabledSizesVarargs(value: SchemaSize*): Self = this.set("enabledSizes", js.Array(value :_*))
    
    @scala.inline
    def setEnabledSizes(value: js.Array[SchemaSize]): Self = this.set("enabledSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledSizes: Self = this.set("enabledSizes", js.undefined)
    
    @scala.inline
    def setImageOnly(value: Boolean): Self = this.set("imageOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageOnly: Self = this.set("imageOnly", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
