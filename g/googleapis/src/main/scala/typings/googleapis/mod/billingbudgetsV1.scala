package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object billingbudgetsV1 {
  
  @JSImport("googleapis", "billingbudgets_v1.Billingbudgets")
  @js.native
  open class Billingbudgets protected ()
    extends typings.googleapis.billingbudgetsV1Mod.billingbudgetsV1.Billingbudgets {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "billingbudgets_v1.Resource$Billingaccounts")
  @js.native
  open class ResourceBillingaccounts protected ()
    extends typings.googleapis.billingbudgetsV1Mod.billingbudgetsV1.ResourceBillingaccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "billingbudgets_v1.Resource$Billingaccounts$Budgets")
  @js.native
  open class ResourceBillingaccountsBudgets protected ()
    extends typings.googleapis.billingbudgetsV1Mod.billingbudgetsV1.ResourceBillingaccountsBudgets {
    def this(context: APIRequestContext) = this()
  }
}
