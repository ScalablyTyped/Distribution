package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for profile settings
  */
@js.native
trait SchemaProfileSettings extends js.Object {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#profileSettings.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The player&#39;s current profile visibility. This field is visible to
    * both 1P and 3P APIs.
    */
  var profileVisible: js.UndefOr[Boolean] = js.native
}
object SchemaProfileSettings {
  
  @scala.inline
  def apply(): SchemaProfileSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfileSettings]
  }
  
  @scala.inline
  implicit class SchemaProfileSettingsOps[Self <: SchemaProfileSettings] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setProfileVisible(value: Boolean): Self = this.set("profileVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileVisible: Self = this.set("profileVisible", js.undefined)
  }
}
