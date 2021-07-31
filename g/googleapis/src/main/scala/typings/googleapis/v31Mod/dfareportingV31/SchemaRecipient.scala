package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a recipient.
  */
trait SchemaRecipient extends StObject {
  
  /**
    * The delivery type for the recipient.
    */
  var deliveryType: js.UndefOr[String] = js.undefined
  
  /**
    * The email address of the recipient.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#recipient.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaRecipient {
  
  @scala.inline
  def apply(): SchemaRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecipient]
  }
  
  @scala.inline
  implicit class SchemaRecipientMutableBuilder[Self <: SchemaRecipient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryType(value: String): Self = StObject.set(x, "deliveryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryTypeUndefined: Self = StObject.set(x, "deliveryType", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
