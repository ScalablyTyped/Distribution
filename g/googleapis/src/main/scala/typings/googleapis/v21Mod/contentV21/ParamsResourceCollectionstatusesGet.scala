package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCollectionstatusesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The collectionId of the collection. CollectionId is the same as the REST ID of the collection.
    */
  var collectionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the account that contains the collection. This account cannot be a multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCollectionstatusesGet {
  
  inline def apply(): ParamsResourceCollectionstatusesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCollectionstatusesGet]
  }
  
  extension [Self <: ParamsResourceCollectionstatusesGet](x: Self) {
    
    inline def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdUndefined: Self = StObject.set(x, "collectionId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
