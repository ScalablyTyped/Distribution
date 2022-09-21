package typings.googleapis.mod

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bigtableadminV1 {
  
  /**
    * Cloud Bigtable Admin API
    *
    * Administer your Cloud Bigtable tables and instances.
    *
    * @example
    * ```js
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v1');
    * ```
    */
  @JSImport("googleapis", "bigtableadmin_v1.Bigtableadmin")
  @js.native
  open class Bigtableadmin protected ()
    extends typings.googleapis.bigtableadminV1Mod.bigtableadminV1.Bigtableadmin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
