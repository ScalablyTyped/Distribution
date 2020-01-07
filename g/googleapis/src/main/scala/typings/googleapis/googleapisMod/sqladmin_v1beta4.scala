package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "sqladmin_v1beta4")
@js.native
object sqladmin_v1beta4 extends js.Object {
  @js.native
  class Resource$Backupruns protected ()
    extends typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4.Resource$Backupruns {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Databases protected ()
    extends typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4.Resource$Databases {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Flags protected ()
    extends typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4.Resource$Flags {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Instances protected ()
    extends typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4.Resource$Instances {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Operations protected ()
    extends typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4.Resource$Operations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Sslcerts protected ()
    extends typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4.Resource$Sslcerts {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Tiers protected ()
    extends typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4.Resource$Tiers {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Users protected ()
    extends typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4.Resource$Users {
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
  @js.native
  class Sqladmin protected ()
    extends typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4.Sqladmin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

