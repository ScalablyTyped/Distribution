package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudbillingV1 {
  
  /**
    * Cloud Billing API
    *
    * Allows developers to manage billing for their Google Cloud Platform
    * projects     programmatically.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudbilling = google.cloudbilling('v1');
    *
    * @namespace cloudbilling
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Cloudbilling
    */
  @JSImport("googleapis", "cloudbilling_v1.Cloudbilling")
  @js.native
  class Cloudbilling protected ()
    extends typings.googleapis.cloudbillingV1Mod.cloudbillingV1.Cloudbilling {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudbilling_v1.Resource$Billingaccounts")
  @js.native
  class ResourceBillingaccounts protected ()
    extends typings.googleapis.cloudbillingV1Mod.cloudbillingV1.ResourceBillingaccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudbilling_v1.Resource$Billingaccounts$Projects")
  @js.native
  class ResourceBillingaccountsProjects protected ()
    extends typings.googleapis.cloudbillingV1Mod.cloudbillingV1.ResourceBillingaccountsProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudbilling_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.cloudbillingV1Mod.cloudbillingV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudbilling_v1.Resource$Services")
  @js.native
  class ResourceServices protected ()
    extends typings.googleapis.cloudbillingV1Mod.cloudbillingV1.ResourceServices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudbilling_v1.Resource$Services$Skus")
  @js.native
  class ResourceServicesSkus protected ()
    extends typings.googleapis.cloudbillingV1Mod.cloudbillingV1.ResourceServicesSkus {
    def this(context: APIRequestContext) = this()
  }
}
