package typings.googleapis.plusV1Mod.plusV1

import typings.googleapis.anon.Latitude
import typings.googleapis.anon.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlace extends StObject {
  
  /**
    * The physical address of the place.
    */
  var address: js.UndefOr[`8`] = js.undefined
  
  /**
    * The display name of the place.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the place.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies this resource as a place. Value: &quot;plus#place&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The position of the place.
    */
  var position: js.UndefOr[Latitude] = js.undefined
}
object SchemaPlace {
  
  inline def apply(): SchemaPlace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlace]
  }
  
  extension [Self <: SchemaPlace](x: Self) {
    
    inline def setAddress(value: `8`): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPosition(value: Latitude): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
