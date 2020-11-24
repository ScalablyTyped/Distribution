package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dynamic and Image Tag Settings.
  */
@js.native
trait SchemaTagSettings extends js.Object {
  
  /**
    * Whether dynamic floodlight tags are enabled.
    */
  var dynamicTagEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether image tags are enabled.
    */
  var imageTagEnabled: js.UndefOr[Boolean] = js.native
}
object SchemaTagSettings {
  
  @scala.inline
  def apply(): SchemaTagSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagSettings]
  }
  
  @scala.inline
  implicit class SchemaTagSettingsOps[Self <: SchemaTagSettings] (val x: Self) extends AnyVal {
    
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
    def setDynamicTagEnabled(value: Boolean): Self = this.set("dynamicTagEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicTagEnabled: Self = this.set("dynamicTagEnabled", js.undefined)
    
    @scala.inline
    def setImageTagEnabled(value: Boolean): Self = this.set("imageTagEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageTagEnabled: Self = this.set("imageTagEnabled", js.undefined)
  }
}
