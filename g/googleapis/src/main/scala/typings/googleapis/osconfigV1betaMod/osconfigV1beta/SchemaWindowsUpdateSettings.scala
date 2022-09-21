package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWindowsUpdateSettings extends StObject {
  
  /**
    * Only apply updates of these windows update classifications. If empty, all updates are applied.
    */
  var classifications: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * List of KBs to exclude from update.
    */
  var excludes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * An exclusive list of kbs to be updated. These are the only patches that will be updated. This field must not be used with other patch configurations.
    */
  var exclusivePatches: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaWindowsUpdateSettings {
  
  inline def apply(): SchemaWindowsUpdateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWindowsUpdateSettings]
  }
  
  extension [Self <: SchemaWindowsUpdateSettings](x: Self) {
    
    inline def setClassifications(value: js.Array[String]): Self = StObject.set(x, "classifications", value.asInstanceOf[js.Any])
    
    inline def setClassificationsNull: Self = StObject.set(x, "classifications", null)
    
    inline def setClassificationsUndefined: Self = StObject.set(x, "classifications", js.undefined)
    
    inline def setClassificationsVarargs(value: String*): Self = StObject.set(x, "classifications", js.Array(value*))
    
    inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesNull: Self = StObject.set(x, "excludes", null)
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value*))
    
    inline def setExclusivePatches(value: js.Array[String]): Self = StObject.set(x, "exclusivePatches", value.asInstanceOf[js.Any])
    
    inline def setExclusivePatchesNull: Self = StObject.set(x, "exclusivePatches", null)
    
    inline def setExclusivePatchesUndefined: Self = StObject.set(x, "exclusivePatches", js.undefined)
    
    inline def setExclusivePatchesVarargs(value: String*): Self = StObject.set(x, "exclusivePatches", js.Array(value*))
  }
}
