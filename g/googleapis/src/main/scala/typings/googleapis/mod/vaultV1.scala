package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vaultV1 {
  
  @JSImport("googleapis", "vault_v1.Resource$Matters")
  @js.native
  class ResourceMatters protected ()
    extends typings.googleapis.vaultV1Mod.vaultV1.ResourceMatters {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vault_v1.Resource$Matters$Exports")
  @js.native
  class ResourceMattersExports protected ()
    extends typings.googleapis.vaultV1Mod.vaultV1.ResourceMattersExports {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vault_v1.Resource$Matters$Holds")
  @js.native
  class ResourceMattersHolds protected ()
    extends typings.googleapis.vaultV1Mod.vaultV1.ResourceMattersHolds {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vault_v1.Resource$Matters$Holds$Accounts")
  @js.native
  class ResourceMattersHoldsAccounts protected ()
    extends typings.googleapis.vaultV1Mod.vaultV1.ResourceMattersHoldsAccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "vault_v1.Resource$Matters$Savedqueries")
  @js.native
  class ResourceMattersSavedqueries protected ()
    extends typings.googleapis.vaultV1Mod.vaultV1.ResourceMattersSavedqueries {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * G Suite Vault API
    *
    * Archiving and eDiscovery for G Suite.
    *
    * @example
    * const {google} = require('googleapis');
    * const vault = google.vault('v1');
    *
    * @namespace vault
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Vault
    */
  @JSImport("googleapis", "vault_v1.Vault")
  @js.native
  class Vault protected ()
    extends typings.googleapis.vaultV1Mod.vaultV1.Vault {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
