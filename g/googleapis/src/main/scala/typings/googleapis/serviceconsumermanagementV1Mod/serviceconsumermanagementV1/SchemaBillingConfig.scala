package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the billing configuration for a new tenant project.
  */
trait SchemaBillingConfig extends StObject {
  
  /**
    * Name of the billing account. For example
    * `billingAccounts/012345-567890-ABCDEF`.
    */
  var billingAccount: js.UndefOr[String] = js.undefined
}
object SchemaBillingConfig {
  
  @scala.inline
  def apply(): SchemaBillingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingConfig]
  }
  
  @scala.inline
  implicit class SchemaBillingConfigMutableBuilder[Self <: SchemaBillingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingAccount(value: String): Self = StObject.set(x, "billingAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAccountUndefined: Self = StObject.set(x, "billingAccount", js.undefined)
  }
}
