package typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The setting values for a plugin.
  */
@js.native
trait ISettingBundle extends PartialJSONObject {
  
  /**
    * A composite of the user setting values and the plugin schema defaults.
    *
    * #### Notes
    * The `composite` values will always be a superset of the `user` values.
    */
  var composite: PartialJSONObject = js.native
  
  /**
    * The user setting values.
    */
  var user: PartialJSONObject = js.native
}
object ISettingBundle {
  
  @scala.inline
  def apply(composite: PartialJSONObject, user: PartialJSONObject): ISettingBundle = {
    val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettingBundle]
  }
  
  @scala.inline
  implicit class ISettingBundleOps[Self <: ISettingBundle] (val x: Self) extends AnyVal {
    
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
    def setComposite(value: PartialJSONObject): Self = this.set("composite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: PartialJSONObject): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
