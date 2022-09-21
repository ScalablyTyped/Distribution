package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductId extends StObject {
  
  /**
    * The Content API ID of the product, in the form `channel:contentLanguage:targetCountry:offerId`.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductId {
  
  inline def apply(): SchemaProductId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductId]
  }
  
  extension [Self <: SchemaProductId](x: Self) {
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
