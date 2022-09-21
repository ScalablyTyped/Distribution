package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomListGroup extends StObject {
  
  /**
    * Required. All custom list targeting settings in custom list group. Repeated settings with same id will be ignored.
    */
  var settings: js.UndefOr[js.Array[SchemaCustomListTargetingSetting]] = js.undefined
}
object SchemaCustomListGroup {
  
  inline def apply(): SchemaCustomListGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomListGroup]
  }
  
  extension [Self <: SchemaCustomListGroup](x: Self) {
    
    inline def setSettings(value: js.Array[SchemaCustomListTargetingSetting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: SchemaCustomListTargetingSetting*): Self = StObject.set(x, "settings", js.Array(value*))
  }
}
