package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDefaultClickThroughEventTagProperties extends StObject {
  
  /**
    * ID of the click-through event tag to apply to all ads in this entity's scope.
    */
  var defaultClickThroughEventTagId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this entity should override the inherited default click-through event tag with its own defined value.
    */
  var overrideInheritedEventTag: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDefaultClickThroughEventTagProperties {
  
  inline def apply(): SchemaDefaultClickThroughEventTagProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDefaultClickThroughEventTagProperties]
  }
  
  extension [Self <: SchemaDefaultClickThroughEventTagProperties](x: Self) {
    
    inline def setDefaultClickThroughEventTagId(value: String): Self = StObject.set(x, "defaultClickThroughEventTagId", value.asInstanceOf[js.Any])
    
    inline def setDefaultClickThroughEventTagIdNull: Self = StObject.set(x, "defaultClickThroughEventTagId", null)
    
    inline def setDefaultClickThroughEventTagIdUndefined: Self = StObject.set(x, "defaultClickThroughEventTagId", js.undefined)
    
    inline def setOverrideInheritedEventTag(value: Boolean): Self = StObject.set(x, "overrideInheritedEventTag", value.asInstanceOf[js.Any])
    
    inline def setOverrideInheritedEventTagNull: Self = StObject.set(x, "overrideInheritedEventTag", null)
    
    inline def setOverrideInheritedEventTagUndefined: Self = StObject.set(x, "overrideInheritedEventTag", js.undefined)
  }
}
