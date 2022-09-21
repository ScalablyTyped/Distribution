package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSuggestion extends StObject {
  
  /**
    * The sub-type of this event.
    */
  var subtype: js.UndefOr[String | Null] = js.undefined
}
object SchemaSuggestion {
  
  inline def apply(): SchemaSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestion]
  }
  
  extension [Self <: SchemaSuggestion](x: Self) {
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeNull: Self = StObject.set(x, "subtype", null)
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
  }
}
