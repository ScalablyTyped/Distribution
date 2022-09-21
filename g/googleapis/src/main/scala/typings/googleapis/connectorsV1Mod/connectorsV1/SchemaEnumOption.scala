package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnumOption extends StObject {
  
  /**
    * Display name of the option.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Id of the option.
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnumOption {
  
  inline def apply(): SchemaEnumOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnumOption]
  }
  
  extension [Self <: SchemaEnumOption](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
