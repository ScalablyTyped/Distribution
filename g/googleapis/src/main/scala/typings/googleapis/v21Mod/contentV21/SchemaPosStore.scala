package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Store resource.
  */
trait SchemaPosStore extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#posStore&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The street address of the store.
    */
  var storeAddress: js.UndefOr[String] = js.undefined
  
  /**
    * A store identifier that is unique for the given merchant.
    */
  var storeCode: js.UndefOr[String] = js.undefined
}
object SchemaPosStore {
  
  inline def apply(): SchemaPosStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosStore]
  }
  
  extension [Self <: SchemaPosStore](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStoreAddress(value: String): Self = StObject.set(x, "storeAddress", value.asInstanceOf[js.Any])
    
    inline def setStoreAddressUndefined: Self = StObject.set(x, "storeAddress", js.undefined)
    
    inline def setStoreCode(value: String): Self = StObject.set(x, "storeCode", value.asInstanceOf[js.Any])
    
    inline def setStoreCodeUndefined: Self = StObject.set(x, "storeCode", js.undefined)
  }
}
