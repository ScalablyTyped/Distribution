package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectCommon extends StObject {
  
  /** When set to true, this object may not be deleted */
  var dontDelete: js.UndefOr[`true`] = js.undefined
  
  /** When set to true, this object is only visible when expert mode is turned on in admin */
  var expert: js.UndefOr[`true`] = js.undefined
  
  // Icon and role aren't defined in SCHEMA.md,
  // but they are being used by some adapters
  /** Icon for this object */
  var icon: js.UndefOr[String] = js.undefined
  
  /** The name of this object as a simple string or an object with translations */
  var name: StringOrTranslated
  
  /** role of the object */
  var role: js.UndefOr[String] = js.undefined
}
object ObjectCommon {
  
  inline def apply(name: StringOrTranslated): ObjectCommon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectCommon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectCommon] (val x: Self) extends AnyVal {
    
    inline def setDontDelete(value: `true`): Self = StObject.set(x, "dontDelete", value.asInstanceOf[js.Any])
    
    inline def setDontDeleteUndefined: Self = StObject.set(x, "dontDelete", js.undefined)
    
    inline def setExpert(value: `true`): Self = StObject.set(x, "expert", value.asInstanceOf[js.Any])
    
    inline def setExpertUndefined: Self = StObject.set(x, "expert", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setName(value: StringOrTranslated): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
