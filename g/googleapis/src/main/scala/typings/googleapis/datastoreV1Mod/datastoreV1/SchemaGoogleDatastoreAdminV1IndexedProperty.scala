package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDatastoreAdminV1IndexedProperty extends StObject {
  
  /**
    * Required. The indexed property's direction. Must not be DIRECTION_UNSPECIFIED.
    */
  var direction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The property name to index.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDatastoreAdminV1IndexedProperty {
  
  inline def apply(): SchemaGoogleDatastoreAdminV1IndexedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1IndexedProperty]
  }
  
  extension [Self <: SchemaGoogleDatastoreAdminV1IndexedProperty](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionNull: Self = StObject.set(x, "direction", null)
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
