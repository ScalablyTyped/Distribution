package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestrictionChange extends StObject {
  
  /**
    * The feature which had a change in restriction policy.
    */
  var feature: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The restriction in place after the change.
    */
  var newRestriction: js.UndefOr[String | Null] = js.undefined
}
object SchemaRestrictionChange {
  
  inline def apply(): SchemaRestrictionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestrictionChange]
  }
  
  extension [Self <: SchemaRestrictionChange](x: Self) {
    
    inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureNull: Self = StObject.set(x, "feature", null)
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setNewRestriction(value: String): Self = StObject.set(x, "newRestriction", value.asInstanceOf[js.Any])
    
    inline def setNewRestrictionNull: Self = StObject.set(x, "newRestriction", null)
    
    inline def setNewRestrictionUndefined: Self = StObject.set(x, "newRestriction", js.undefined)
  }
}
