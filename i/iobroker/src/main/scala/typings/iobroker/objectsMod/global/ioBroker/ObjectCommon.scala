package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectCommon extends StObject {
  
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
  implicit class ObjectCommonMutableBuilder[Self <: ObjectCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDontDelete(value: `true`): Self = StObject.set(x, "dontDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontDeleteUndefined: Self = StObject.set(x, "dontDelete", js.undefined)
    
    @scala.inline
    def setExpert(value: `true`): Self = StObject.set(x, "expert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpertUndefined: Self = StObject.set(x, "expert", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setName(value: StringOrTranslated): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
