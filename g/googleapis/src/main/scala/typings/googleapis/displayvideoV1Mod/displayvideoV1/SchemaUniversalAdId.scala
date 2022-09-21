package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUniversalAdId extends StObject {
  
  /**
    * The unique creative identifier.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The registry provides unique creative identifiers.
    */
  var registry: js.UndefOr[String | Null] = js.undefined
}
object SchemaUniversalAdId {
  
  inline def apply(): SchemaUniversalAdId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUniversalAdId]
  }
  
  extension [Self <: SchemaUniversalAdId](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryNull: Self = StObject.set(x, "registry", null)
    
    inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
  }
}
