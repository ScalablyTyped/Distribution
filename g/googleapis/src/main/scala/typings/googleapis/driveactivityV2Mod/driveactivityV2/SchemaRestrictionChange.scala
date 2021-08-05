package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about restriction policy changes to a feature.
  */
trait SchemaRestrictionChange extends StObject {
  
  /**
    * The feature which had a change in restriction policy.
    */
  var feature: js.UndefOr[String] = js.undefined
  
  /**
    * The restriction in place after the change.
    */
  var newRestriction: js.UndefOr[String] = js.undefined
}
object SchemaRestrictionChange {
  
  inline def apply(): SchemaRestrictionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestrictionChange]
  }
  
  extension [Self <: SchemaRestrictionChange](x: Self) {
    
    inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setNewRestriction(value: String): Self = StObject.set(x, "newRestriction", value.asInstanceOf[js.Any])
    
    inline def setNewRestrictionUndefined: Self = StObject.set(x, "newRestriction", js.undefined)
  }
}
