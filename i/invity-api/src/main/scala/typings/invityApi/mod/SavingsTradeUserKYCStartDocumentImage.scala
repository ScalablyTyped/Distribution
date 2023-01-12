package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradeUserKYCStartDocumentImage extends StObject {
  
  var data: String
  
  var documentSide: SavingsTradeUserKYCStartDocumentImageSide
}
object SavingsTradeUserKYCStartDocumentImage {
  
  inline def apply(data: String, documentSide: SavingsTradeUserKYCStartDocumentImageSide): SavingsTradeUserKYCStartDocumentImage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], documentSide = documentSide.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsTradeUserKYCStartDocumentImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsTradeUserKYCStartDocumentImage] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDocumentSide(value: SavingsTradeUserKYCStartDocumentImageSide): Self = StObject.set(x, "documentSide", value.asInstanceOf[js.Any])
  }
}
