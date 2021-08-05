package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Slide layout reference. This may reference either:  - A predefined layout -
  * One of the layouts in the presentation.
  */
trait SchemaLayoutReference extends StObject {
  
  /**
    * Layout ID: the object ID of one of the layouts in the presentation.
    */
  var layoutId: js.UndefOr[String] = js.undefined
  
  /**
    * Predefined layout.
    */
  var predefinedLayout: js.UndefOr[String] = js.undefined
}
object SchemaLayoutReference {
  
  inline def apply(): SchemaLayoutReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLayoutReference]
  }
  
  extension [Self <: SchemaLayoutReference](x: Self) {
    
    inline def setLayoutId(value: String): Self = StObject.set(x, "layoutId", value.asInstanceOf[js.Any])
    
    inline def setLayoutIdUndefined: Self = StObject.set(x, "layoutId", js.undefined)
    
    inline def setPredefinedLayout(value: String): Self = StObject.set(x, "predefinedLayout", value.asInstanceOf[js.Any])
    
    inline def setPredefinedLayoutUndefined: Self = StObject.set(x, "predefinedLayout", js.undefined)
  }
}
