package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectCommon extends js.Object {
  
  /** When set to true, this object may not be deleted */
  var dontDelete: js.UndefOr[`true`] = js.native
  
  /** When set to true, this object is only visible when expert mode is turned on in admin */
  var expert: js.UndefOr[`true`] = js.native
  
  // Icon and role aren't defined in SCHEMA.md,
  // but they are being used by some adapters
  /** Icon for this object */
  var icon: js.UndefOr[String] = js.native
  
  /** The name of this object as a simple string or an object with translations */
  var name: StringOrTranslated = js.native
  
  /** role of the object */
  var role: js.UndefOr[String] = js.native
}
object ObjectCommon {
  
  @scala.inline
  def apply(name: StringOrTranslated): ObjectCommon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectCommon]
  }
  
  @scala.inline
  implicit class ObjectCommonOps[Self <: ObjectCommon] (val x: Self) extends AnyVal {
    
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
    def setName(value: StringOrTranslated): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontDelete(value: `true`): Self = this.set("dontDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDontDelete: Self = this.set("dontDelete", js.undefined)
    
    @scala.inline
    def setExpert(value: `true`): Self = this.set("expert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpert: Self = this.set("expert", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
