package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLayoutReference extends StObject {
  
  /**
    * Layout ID: the object ID of one of the layouts in the presentation.
    */
  var layoutId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Predefined layout.
    */
  var predefinedLayout: js.UndefOr[String | Null] = js.undefined
}
object SchemaLayoutReference {
  
  inline def apply(): SchemaLayoutReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLayoutReference]
  }
  
  extension [Self <: SchemaLayoutReference](x: Self) {
    
    inline def setLayoutId(value: String): Self = StObject.set(x, "layoutId", value.asInstanceOf[js.Any])
    
    inline def setLayoutIdNull: Self = StObject.set(x, "layoutId", null)
    
    inline def setLayoutIdUndefined: Self = StObject.set(x, "layoutId", js.undefined)
    
    inline def setPredefinedLayout(value: String): Self = StObject.set(x, "predefinedLayout", value.asInstanceOf[js.Any])
    
    inline def setPredefinedLayoutNull: Self = StObject.set(x, "predefinedLayout", null)
    
    inline def setPredefinedLayoutUndefined: Self = StObject.set(x, "predefinedLayout", js.undefined)
  }
}
