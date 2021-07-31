package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPayments extends StObject {
  
  /**
    * The list of Payments for the account. One or both of a) the account&#39;s
    * most recent payment; and b) the account&#39;s upcoming payment.
    */
  var items: js.UndefOr[js.Array[SchemaPayment]] = js.undefined
  
  /**
    * Kind of list this is, in this case adsense#payments.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaPayments {
  
  @scala.inline
  def apply(): SchemaPayments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPayments]
  }
  
  @scala.inline
  implicit class SchemaPaymentsMutableBuilder[Self <: SchemaPayments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaPayment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaPayment*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
