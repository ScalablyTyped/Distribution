package typings.hellosignEmbedded.mod.HelloSign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Singature extends StObject {
  
  var order: js.UndefOr[Double] = js.undefined
  
  var signer_email_address: String
  
  var signer_name: String
}
object Singature {
  
  inline def apply(signer_email_address: String, signer_name: String): Singature = {
    val __obj = js.Dynamic.literal(signer_email_address = signer_email_address.asInstanceOf[js.Any], signer_name = signer_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Singature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Singature] (val x: Self) extends AnyVal {
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setSigner_email_address(value: String): Self = StObject.set(x, "signer_email_address", value.asInstanceOf[js.Any])
    
    inline def setSigner_name(value: String): Self = StObject.set(x, "signer_name", value.asInstanceOf[js.Any])
  }
}
