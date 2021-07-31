package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqladminV1beta4 {
  
  @JSImport("googleapis", "sqladmin_v1beta4.Resource$Backupruns")
  @js.native
  class ResourceBackupruns protected ()
    extends typings.googleapis.v1beta4Mod.sqladminV1beta4.ResourceBackupruns {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "sqladmin_v1beta4.Resource$Databases")
  @js.native
  class ResourceDatabases protected ()
    extends typings.googleapis.v1beta4Mod.sqladminV1beta4.ResourceDatabases {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "sqladmin_v1beta4.Resource$Flags")
  @js.native
  class ResourceFlags protected ()
    extends typings.googleapis.v1beta4Mod.sqladminV1beta4.ResourceFlags {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "sqladmin_v1beta4.Resource$Instances")
  @js.native
  class ResourceInstances protected ()
    extends typings.googleapis.v1beta4Mod.sqladminV1beta4.ResourceInstances {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "sqladmin_v1beta4.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.v1beta4Mod.sqladminV1beta4.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "sqladmin_v1beta4.Resource$Sslcerts")
  @js.native
  class ResourceSslcerts protected ()
    extends typings.googleapis.v1beta4Mod.sqladminV1beta4.ResourceSslcerts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "sqladmin_v1beta4.Resource$Tiers")
  @js.native
  class ResourceTiers protected ()
    extends typings.googleapis.v1beta4Mod.sqladminV1beta4.ResourceTiers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "sqladmin_v1beta4.Resource$Users")
  @js.native
  class ResourceUsers protected ()
    extends typings.googleapis.v1beta4Mod.sqladminV1beta4.ResourceUsers {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud SQL Admin API
    *
    * Creates and manages Cloud SQL instances, which provide fully managed MySQL
    * or PostgreSQL databases.
    *
    * @example
    * const {google} = require('googleapis');
    * const sqladmin = google.sqladmin('v1beta4');
    *
    * @namespace sqladmin
    * @type {Function}
    * @version v1beta4
    * @variation v1beta4
    * @param {object=} options Options for Sqladmin
    */
  @JSImport("googleapis", "sqladmin_v1beta4.Sqladmin")
  @js.native
  class Sqladmin protected ()
    extends typings.googleapis.v1beta4Mod.sqladminV1beta4.Sqladmin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
