package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about settings changes.
  */
trait SchemaSettingsChange extends StObject {
  
  /**
    * The set of changes made to restrictions.
    */
  var restrictionChanges: js.UndefOr[js.Array[SchemaRestrictionChange]] = js.undefined
}
object SchemaSettingsChange {
  
  inline def apply(): SchemaSettingsChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettingsChange]
  }
  
  extension [Self <: SchemaSettingsChange](x: Self) {
    
    inline def setRestrictionChanges(value: js.Array[SchemaRestrictionChange]): Self = StObject.set(x, "restrictionChanges", value.asInstanceOf[js.Any])
    
    inline def setRestrictionChangesUndefined: Self = StObject.set(x, "restrictionChanges", js.undefined)
    
    inline def setRestrictionChangesVarargs(value: SchemaRestrictionChange*): Self = StObject.set(x, "restrictionChanges", js.Array(value :_*))
  }
}
