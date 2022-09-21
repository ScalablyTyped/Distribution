package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountImageImprovementsSettings extends StObject {
  
  /**
    * Enables automatic image improvements.
    */
  var allowAutomaticImageImprovements: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAccountImageImprovementsSettings {
  
  inline def apply(): SchemaAccountImageImprovementsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountImageImprovementsSettings]
  }
  
  extension [Self <: SchemaAccountImageImprovementsSettings](x: Self) {
    
    inline def setAllowAutomaticImageImprovements(value: Boolean): Self = StObject.set(x, "allowAutomaticImageImprovements", value.asInstanceOf[js.Any])
    
    inline def setAllowAutomaticImageImprovementsNull: Self = StObject.set(x, "allowAutomaticImageImprovements", null)
    
    inline def setAllowAutomaticImageImprovementsUndefined: Self = StObject.set(x, "allowAutomaticImageImprovements", js.undefined)
  }
}
