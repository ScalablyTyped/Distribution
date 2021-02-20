package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters of merchant provided shipping option. If
  * paymentDataRequest#shippingOptionRequired is set then the request must
  * also provide ShippingOptionParameters with at least one option.
  * Developer can set a shipping option labeled "PENDING" if there's
  * nothing to show at initial request time.
  */
@js.native
trait ShippingOptionParameters extends StObject {
  
  /**
    * Identifier to the default selected shipping option. If this field is
    * not provided the first option will be the default option.
    *
    * This field is optional.
    */
  var defaultSelectedOptionId: js.UndefOr[String] = js.native
  
  /**
    * All the shipping options available for the current request. Will be
    * rendered in the UI with given order.
    *
    * This field is required.
    */
  var shippingOptions: js.Array[SelectionOption] = js.native
}
object ShippingOptionParameters {
  
  @scala.inline
  def apply(shippingOptions: js.Array[SelectionOption]): ShippingOptionParameters = {
    val __obj = js.Dynamic.literal(shippingOptions = shippingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingOptionParameters]
  }
  
  @scala.inline
  implicit class ShippingOptionParametersMutableBuilder[Self <: ShippingOptionParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultSelectedOptionId(value: String): Self = StObject.set(x, "defaultSelectedOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSelectedOptionIdUndefined: Self = StObject.set(x, "defaultSelectedOptionId", js.undefined)
    
    @scala.inline
    def setShippingOptions(value: js.Array[SelectionOption]): Self = StObject.set(x, "shippingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingOptionsVarargs(value: SelectionOption*): Self = StObject.set(x, "shippingOptions", js.Array(value :_*))
  }
}
