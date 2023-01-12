package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductId extends StObject {
  
  /** The Content API ID of the product, in the form `channel:contentLanguage:targetCountry:offerId`. */
  var productId: js.UndefOr[String] = js.undefined
}
object ProductId {
  
  inline def apply(): ProductId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductId] (val x: Self) extends AnyVal {
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
