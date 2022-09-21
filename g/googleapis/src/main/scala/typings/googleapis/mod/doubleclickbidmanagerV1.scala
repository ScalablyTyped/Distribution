package typings.googleapis.mod

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doubleclickbidmanagerV1 {
  
  /**
    * DoubleClick Bid Manager API
    *
    * DoubleClick Bid Manager API allows users to manage and create campaigns and reports.
    *
    * @example
    * ```js
    * const {google} = require('googleapis');
    * const doubleclickbidmanager = google.doubleclickbidmanager('v1');
    * ```
    */
  @JSImport("googleapis", "doubleclickbidmanager_v1.Doubleclickbidmanager")
  @js.native
  open class Doubleclickbidmanager protected ()
    extends typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1.Doubleclickbidmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
