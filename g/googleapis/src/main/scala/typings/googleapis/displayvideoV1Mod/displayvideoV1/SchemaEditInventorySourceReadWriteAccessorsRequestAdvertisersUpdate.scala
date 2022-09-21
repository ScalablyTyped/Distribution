package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate extends StObject {
  
  /**
    * The advertisers to add.
    */
  var addedAdvertisers: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The advertisers to remove.
    */
  var removedAdvertisers: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaEditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate {
  
  inline def apply(): SchemaEditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate]
  }
  
  extension [Self <: SchemaEditInventorySourceReadWriteAccessorsRequestAdvertisersUpdate](x: Self) {
    
    inline def setAddedAdvertisers(value: js.Array[String]): Self = StObject.set(x, "addedAdvertisers", value.asInstanceOf[js.Any])
    
    inline def setAddedAdvertisersNull: Self = StObject.set(x, "addedAdvertisers", null)
    
    inline def setAddedAdvertisersUndefined: Self = StObject.set(x, "addedAdvertisers", js.undefined)
    
    inline def setAddedAdvertisersVarargs(value: String*): Self = StObject.set(x, "addedAdvertisers", js.Array(value*))
    
    inline def setRemovedAdvertisers(value: js.Array[String]): Self = StObject.set(x, "removedAdvertisers", value.asInstanceOf[js.Any])
    
    inline def setRemovedAdvertisersNull: Self = StObject.set(x, "removedAdvertisers", null)
    
    inline def setRemovedAdvertisersUndefined: Self = StObject.set(x, "removedAdvertisers", js.undefined)
    
    inline def setRemovedAdvertisersVarargs(value: String*): Self = StObject.set(x, "removedAdvertisers", js.Array(value*))
  }
}
